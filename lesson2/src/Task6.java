public class Task6 {
    public static void main(String[] args) {
        int i0 = 0;
        int i1 = 1;
        int i2 = 2;
        int i3 = 3;
        int i4 = 4;
        int i5 = 5;
        int i6 = 6;
        int i7 = 7;
        int i8 = 8;
        int i9 = 9;

        int averageInt = (i0 + i1 + i2 + i3 + i4 + i5 + i6 + i7 + i8 + i9) /10;
        System.out.println(averageInt);

        double d0 = 0;
        double d1 = 1;
        double d2 = 2;
        double d3 = 3;
        double d4 = 4;
        double d5 = 5;
        double d6 = 6;
        double d7 = 7;
        double d8 = 8;
        double d9 = 9;

        double averageDouble = (d0 + d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9) /10;
        System.out.println(averageDouble);

        /*
        в данном примере корректнее использовать double, т.к. при использовании int,
        результат не округляется, а просто отбрасывается часть после точки
         */
    }
}
