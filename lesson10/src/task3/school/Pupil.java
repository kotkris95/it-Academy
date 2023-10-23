package task3.school;

import java.util.*;

public class Pupil {
    private final String name;

    private final Map<Subject, List<Integer>> marks;

    public Pupil(String name) {
        this.name = name;
        marks = new EnumMap<>(Subject.class);
        marks.put(Subject.PHYS, new LinkedList<>());
        marks.put(Subject.MATH, new LinkedList<>());
        marks.put(Subject.LANG, new LinkedList<>());
    }

    public Map<Subject, List<Integer>> getMarks() {
        return marks;
    }

    public double average() {
        double average = average(Subject.MATH) + average(Subject.PHYS) + average(Subject.LANG);
        return average / 3;
    }

    public double average(Subject subject) {
        double average = 0;

        List<Integer> values = marks.get(subject);
        for (Integer mark : values) {
            average += mark;
        }
        return average / values.size();
    }

    public Map<Subject, Map<Integer, Integer>> getStatistics() {
        Map<Subject, Map<Integer, Integer>> statistics = new HashMap<>();
        for (Map.Entry<Subject, List<Integer>> entry : marks.entrySet()) {
            Subject subject = entry.getKey();
            List<Integer> grades = entry.getValue();
            Map<Integer, Integer> gradeCount = new HashMap<>();

            for (Integer grade : grades) {
                gradeCount.put(grade, gradeCount.getOrDefault(grade, 0) + 1);
            }
            statistics.put(subject, gradeCount);
        }
        return statistics;
    }

    @Override
    public String toString() {
        return "Ученик{" +
                "имя='" + name + '\'' +
                ", оценки=" + marks +
                '}';
    }

}
