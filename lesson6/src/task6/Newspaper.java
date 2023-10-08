package task6;

public class Newspaper {
    public static final Newspaper newspaper1 = new Newspaper();
    public static final Newspaper newspaper2 = new Newspaper();
    public static final Newspaper newspaper3 = new Newspaper();
    public static final Newspaper newspaper4 = new Newspaper();
    public static final Newspaper newspaper5 = new Newspaper();
    public static Newspaper[] allNewspapers = new Newspaper[]{
            newspaper1, newspaper2, newspaper3, newspaper4, newspaper5
    };

    private Newspaper(){}
}
