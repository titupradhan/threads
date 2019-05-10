import org.joda.time.DateTime;

import java.time.Instant;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Test {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("a", 45);

    }

    static class Employee {
        private final int[] arrays = {1, 2, 3, 4, 5, 6};

        public int[] getArrays() {
            return arrays;
        }
    }
}
