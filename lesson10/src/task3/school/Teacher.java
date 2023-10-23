package task3.school;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teacher {
    public boolean addMark(Pupil pupil) {
        List<Integer> marks;
        if (pupil != null && Journal.pupils.contains(pupil)) {
            marks = addRandomMarks();
            pupil.getMarks().get(Subject.MATH).addAll(marks);
            marks = addRandomMarks();
            pupil.getMarks().get(Subject.PHYS).addAll(marks);
            marks = addRandomMarks();
            pupil.getMarks().get(Subject.LANG).addAll(marks);
            return true;
        }
        return false;
    }

    public List<Integer> addRandomMarks() {
        Random random = new Random();
        List<Integer> randomMarks = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            randomMarks.add(random.nextInt(10));
        }
        return randomMarks;
    }
}
