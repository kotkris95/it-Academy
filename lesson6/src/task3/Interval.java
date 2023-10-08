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
        String s1 = isIncludeStart ? "[" : "(";
        String s2 = isIncludeEnd ? "]": ")";
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
        int x = Math.max(getStart(), interval.getStart());
        int y = Math.min(getEnd(), interval.getEnd());
        return x <= y;
    }
}
