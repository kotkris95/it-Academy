import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        char[][] field = new char[3][3];
        char selectLiteral1;
        char selectLiteral2;
        int moveI;
        int moveJ;

        for (char[] chars : field) {
            Arrays.fill(chars, '\'');
        }

        selectLiteral1 = 'X';
        selectLiteral2 = 'O';
        boolean isSet;
        char currentLiteral = selectLiteral1;

        while (true) {
            do {
                System.out.println("Поставьте " + currentLiteral + " на свободную позицию.");
                moveI = (int) (Math.random() * 3);
                moveJ = (int) (Math.random() * 3);
                isSet = makeMove(field, moveI, moveJ, currentLiteral);
            } while (!isSet);
            if (isGameOver(field, currentLiteral)) {
                System.out.println("Победил " + currentLiteral);
                break;
            }
            if (isFriendshipWon(field)) {
                System.out.println("Победила дружба!");
                break;
            }
            currentLiteral = currentLiteral == selectLiteral1 ? selectLiteral2 : selectLiteral1;
        }
    }

    static boolean isEmpty(char[][] array, int i, int j) {
        return array[i][j] == '\'';
    }

    static boolean makeMove(char[][] array, int i, int j, char lit) {
        if (isEmpty(array, i, j)) {
            array[i][j] = lit;
            print(array);
            return true;
        }
        return false;
    }

    static void print(char[][] array) {
        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    static boolean isGameOver(char[][] array, char lit) {
        boolean isGameOver = false;
        if ((array[0][0] == lit && array[0][1] == lit && array[0][2] == lit)
                || (array[0][0] == lit && array[1][0] == lit && array[2][0] == lit)
        ) isGameOver = true;
        if (array[0][0] == lit && array[1][1] == lit && array[2][2] == lit
                || array[0][2] == lit && array[1][1] == lit && array[2][0] == lit
        ) isGameOver = true;

        return isGameOver;
    }

    static boolean isFriendshipWon(char[][] array) {
        for (char[] chars : array) {
            for (char aChar : chars) {
                if (aChar == '\'')
                    return false;
            }
        }
        return true;
    }
}
