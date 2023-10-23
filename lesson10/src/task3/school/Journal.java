package task3.school;


import java.util.*;


public class Journal {
    public static List<Pupil> pupils;

    public Journal(List<Pupil> pupils) {
        Journal.pupils = pupils;
    }


    public List<Pupil> sortAscending(Subject subject) {
        pupils.sort(new Comparator<>() {
            @Override
            public int compare(Pupil o1, Pupil o2) {
                return Double.compare(o1.average(subject), o2.average(subject));
            }
        });
        return pupils;
    }

    public List<Pupil> sortDescending(Subject subject) {
        Collections.reverse(sortAscending(subject));
        return pupils;
    }

    public void sortAverage() {
        pupils.sort(new Comparator<>() {
            @Override
            public int compare(Pupil o1, Pupil o2) {
                return Double.compare(o1.average(), o2.average());
            }
        });
    }

    public List<Pupil> getWorstPupils() {
        sortAverage();
        List<Pupil> worstPupils = new ArrayList<>();
        worstPupils.add(pupils.get(0));
        for (int i = 1; i < pupils.size(); i++) {
            if (pupils.get(i).average() == worstPupils.get(0).average()) {
                worstPupils.add(pupils.get(i));
            }
        }
        return worstPupils;
    }

    public List<Pupil> getBestPupils() {
        sortAverage();
        List<Pupil> bestPupils = new ArrayList<>();
        bestPupils.add(pupils.get(pupils.size() - 1));
        for (int i = 0; i < pupils.size() - 1; i++) {
            if (pupils.get(i).average() == bestPupils.get(0).average()) {
                bestPupils.add(pupils.get(i));
            }
        }
        return bestPupils;
    }
}
