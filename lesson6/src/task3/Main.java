package task3;


public class Main {
    public static void main(String[] args) {
        Interval[] intervals = new Interval[4];
        intervals[0] = new Interval(1, 3, true, true);
        intervals[1] = new Interval(2, 5, true, true);
        intervals[2] = new Interval(4, 6, true, true);
        intervals[3] = new Interval(8, 9, true, true);


        System.out.println("Интервал " + intervals[0]
                + " пересекается с интервалом " + intervals[2]
                + "? - " + intervals[0].hasIntersections(intervals[2]));

        System.out.println(getIntersectionInter(intervals));

        Interval[] inter = combine(intervals);
        for (int i = 0; i < inter.length; i++) {
            if(inter[i] != null){
                System.out.print(inter[i] + " ");
            }

        }
    }
    public static Interval getIntersectionInter(Interval[] inter) {
        int x = inter[0].getStart();
        int y = inter[0].getEnd();
        for (int i = 1; i < inter.length; i++) {
            if (inter[i].getStart() <= inter[i - 1].getStart() && inter[i].getEnd() > inter[i - 1].getStart()) {
                x = inter[i - 1].getStart();
            } else if (inter[i].getStart() >= inter[i - 1].getStart() && inter[i].getStart() < inter[i - 1].getEnd()){
                x = inter[i].getStart();
            } else return null;
            if (inter[i].getEnd() < y) {
                y = inter[i].getEnd();
            }
        }
        Interval interval = new Interval(x, y);
        System.out.print("Пересечение всех интервалов на протяжении ");
        return interval;
    }


    public static Interval[] combine(Interval[] inter) {
        System.out.println("Объединение пересекающихся интервалов: ");
        int count = 0;
        Interval[] interOut = new Interval[inter.length];
        int countX = 0;

        for (int i = 0; i < inter.length-1; i++) {
            if(inter[i+1].getStart() > inter[i].getEnd()) {
                interOut[count] = new Interval(inter[countX].getStart(), inter[i].getEnd());
                count++;
                countX = i+1;
            }
        }
        interOut[count] = new Interval(inter[countX].getStart(), inter[inter.length-1].getEnd());
        return interOut;
    }
}
