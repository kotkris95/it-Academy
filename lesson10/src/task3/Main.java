package task3;

import task3.school.Journal;
import task3.school.Pupil;
import task3.school.Subject;
import task3.school.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pupil> pupilList = new ArrayList<>();
        Teacher teacher = new Teacher();
        Journal journal = new Journal(pupilList);

        for (int i = 0; i < 10; i++) {
            pupilList.add(new Pupil("Ученик " + (i + 1)));
            teacher.addMark(pupilList.get(i));
        }

        System.out.println(pupilList);

        System.out.println("Cписок учащихся в порядке возрастания средней оценки по МАТЕМАТИКЕ : ");
        System.out.println(journal.sortAscending(Subject.MATH));

        System.out.println("Cписок учащихся в порядке убывания средней оценки по МАТЕМАТИКЕ : ");
        System.out.println(journal.sortDescending(Subject.MATH));

        System.out.println("Лучший(ие) ученик(и): " + journal.getBestPupils());
        System.out.println("Худший(ие) ученик(и): " + journal.getWorstPupils());
        System.out.println(pupilList.get(0));
        System.out.println("Статистика оценок: " + pupilList.get(0).getStatistics());
    }
}
