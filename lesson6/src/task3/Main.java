package task3;

import java.util.Arrays;

import static task3.Interval.getIntersectionInter;

public class Main {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[4];

        intervals[0] = new Interval(1, 3, true, true);
        intervals[1] = new Interval(2, 5, true, true);
        intervals[2] = new Interval(4, 6, true, true);
        intervals[3] = new Interval(8, 9, true, true);


        System.out.println(intervals[0].hasIntersections(intervals[2]));
        System.out.println(getIntersectionInter(intervals));
        Interval[] inter = intervals[0].combine(intervals);
        for (int i = 0; i < inter.length; i++) {
            if(inter[i] != null){
                System.out.print(inter[i] + " ");
            }

        }



    }
}
