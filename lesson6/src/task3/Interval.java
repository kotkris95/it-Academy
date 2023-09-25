package task3;

public class Interval {
    int start;
    int end;
    boolean isIncludeStart;
    boolean isIncludeEnd;

    public Interval(int start, int end, boolean isIncludeStart, boolean isIncludeEnd) {
        this.start = start;
        this.end = end;
        this.isIncludeStart = isIncludeStart;
        this.isIncludeEnd = isIncludeEnd;
    }

    public Interval(int start, int end) {
        this(start, end, true, true);
    }

    public String toString() {
        String s1, s2;
        if (isIncludeStart) {
            s1 = "[";
        } else {
            s1 = "(";
        }
        if (isIncludeEnd) {
            s2 = "]";
        } else {
            s2 = ")";
        }
        return s1 + start + "; " + end + s2;
    }

    public int getStart() {
        if (!this.isIncludeStart) {
            this.start += 1;
        }
        return this.start;
    }

    public int getEnd() {
        if (!this.isIncludeEnd) {
            this.end -= 1;
        }
        return this.end;
    }


    public boolean hasIntersections(Interval interval) {
        System.out.print("Интервал " + this + " пересекается с интервалом " + interval + "? - ");
        int x = Math.max(getStart(), interval.getStart());
        int y = Math.min(getEnd(), interval.getEnd());
        return x <= y;
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
