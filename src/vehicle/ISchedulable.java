package vehicle;

import java.time.LocalTime;

public interface ISchedulable {
    public boolean isAvailable(LocalTime start, LocalTime end);
}
