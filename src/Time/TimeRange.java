package Time;

import java.time.LocalTime;

public class TimeRange {
    private final LocalTime start;
    private final LocalTime end;

    public TimeRange(LocalTime start, LocalTime end){
        this.start = start;
        this.end = end;
    }

    public boolean isInRange(LocalTime time){
        return start.isBefore(end) ? !start.isBefore(time) && !end.isAfter(time) : !start.isBefore(time) || !end.isAfter(time);
    }

    public LocalTime getEnd() {
        return end;
    }

    public LocalTime getStart() {
        return start;
    }

    public String toString(){
        return "start: " + start +"\nend: " + end;
    }
}
