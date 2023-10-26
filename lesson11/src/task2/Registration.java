package task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Registration {
    public static void main(String[] args) {
        registration("Kristina", "1234", "1234");

    }

    public static void registration(String login, String password, String confirmPassword) {
        try {
            isValid(login, password, confirmPassword);
            System.out.println("Пользователь " + login + " успешно зарегистрирован.");
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void isValid(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        Pattern pattern = Pattern.compile("^[a-zA-Z\\d_]{1,20}$");
        Matcher matcherLogin = pattern.matcher(login);
        Matcher matcherPassword = pattern.matcher(password);

        if (!matcherLogin.matches()) {
            throw new WrongLoginException("Логин не соответсвует требованиям!");
        }
        if (!matcherPassword.matches()) {
            throw new WrongPasswordException("Пароль не соответсвует требованиям!");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не идентичны!");
        }
    }
}