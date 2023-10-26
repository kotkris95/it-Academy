package task1;

public class AssertionError {
    public static void main(String[] args) {
        assertionError(10, 8);
    }

    public static void assertionError(int a, int b) {
        assert a % b == 0;
    }
}
