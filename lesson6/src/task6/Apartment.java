package task6;

public class Apartment {
    static Newspaper[] newspapers = new Newspaper[(int) (Math.random() * 6)];

    public Newspaper[] newspaperSubscription() {
        for (int i = 0; i < newspapers.length; i++) {
            int indexOFNewspaper = (int) (Math.random() * 5);
            newspapers[i] = Newspaper.allNewspapers[indexOFNewspaper];
        }
        return newspapers;
    }

}
