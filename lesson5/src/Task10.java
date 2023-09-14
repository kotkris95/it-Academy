import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
         char [][] field = new char[3][3];
         char selectLiteral1;
         char selectLiteral2;
         int moveI;
         int moveJ;

        for (char[] chars : field) {
            Arrays.fill(chars, '\'');
        }

        System.out.println("Игрок №1, выберите, чем будете играть: Х или О.");
        selectLiteral1 = 'X';
        System.out.println("Вы выбрали: " + selectLiteral1);
        selectLiteral2 = 'O';
        System.out.println("Для игрока №2: " + selectLiteral2);

         while(true) {
            System.out.println("Ход игрока №1! Поставьте " + selectLiteral1 + " на выбранную позицию.");
            moveI = (int) (Math.random()*3);
            moveJ =(int) (Math.random()*3);
            field = makeMove(field, moveI, moveJ, selectLiteral1);
            if (isGameOver(field, selectLiteral1)){
                System.out.println("Победил игрок №1!");
                break;
            }
            if(isFriendshipWon(field)){
                System.out.println("Победила дружба!");
                break;
            }
            System.out.println("Ход игрока №2! Поставьте " + selectLiteral2 + " на выбранную позицию.");
             moveI = (int) (Math.random()*3);
             moveJ =(int) (Math.random()*3);
            field = makeMove(field, moveI, moveJ, selectLiteral2);
            if (isGameOver(field, selectLiteral2)){
                System.out.println("Победил игрок №2!");
                break;
            }
            if(isFriendshipWon(field)){
                System.out.println("Победила дружба!");
                break;
            }
        }
    }
    static boolean isEmpty(char [][] array, int i, int j){
        return array[i][j] == '\'';
    }

    static char[][] makeMove(char [][] array, int i, int j, char lit){
        if(isEmpty(array, i, j)) {
            array[i][j] = lit;
        }else{
            System.out.println("Выбранная позиция занята!");
        }
        print(array);
        return array;
    }

    static void print (char[][] array) {
        for (char[] chars : array) {
            for (char aChar : chars) {
                System.out.print(aChar + " ");
            }
            System.out.println();
        }
    }

    static boolean isGameOver(char[][] array, char lit){
        boolean isGameOver = false;
        for(int i = 0; i<3; i++){
            if((array[i][0] == lit && array[i][1] == lit && array[i][2] == lit)
                    || (array[0][i] == lit && array[1][i] == lit && array[2][i] == lit)
            ) isGameOver = true;
            if(array[0][0] == lit && array[1][1] == lit && array[2][2] == lit
                     || array[0][2] == lit && array[1][1] == lit && array[2][0] == lit
            ) isGameOver = true;
        }
        return isGameOver;
    }

    static boolean isFriendshipWon(char[][] array){
        for (char[] chars : array) {
            for (char aChar : chars) {
                if (aChar == '\'')
                    return false;
            }
        }
        return true;
    }

}
