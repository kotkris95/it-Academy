package task6;


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 71; i++) {
            System.out.print("В квартире " + i + " ");
            new Apartment().newspaperSubscription();
            new Postbox().addNewspaper();

        }
    }
}
