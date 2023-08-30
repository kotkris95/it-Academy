public class Task5 {
    public static void main(String[] args) {
        int shiftNumber = 'a' - 'A';
        char h = 'H';
        char e = 'E';
        char l = 'L';
        char o = 'O';

        int uniH= h + shiftNumber;
        int uniE= e + shiftNumber;
        int uniL= l + shiftNumber;
        int uniO= o + shiftNumber;

        System.out.println("" + (char)uniH + (char)uniE + (char)uniL + (char)uniL + (char)uniO);

    }
}
