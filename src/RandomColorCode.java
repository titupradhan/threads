import com.google.common.base.Stopwatch;
import com.google.common.collect.ObjectArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class RandomColorCode {

    private static  final String[] TEN_COLORS = {"#8bc24a", "#9467bd", "#01b8b3", "#eec460", "#ee696a", "#8bc24a", "#9467bd", "#01b8b3", "#eec460", "#ee696a"};
    private static final Random RANDOM = new Random();
    private static final String[] LETTERS = "0123456789ABCDEF".split("");

    public static String[] getColorCodes(int size) {
        if (size <= 10) {
            return TEN_COLORS;
        } else {
            Set<String> colorSet = new HashSet<>();
            while (colorSet.size() != size - 10) {
                StringBuilder code = new StringBuilder("#");
                for (int j = 0; j < 6; j++) {
                    code.append(LETTERS[RANDOM.nextInt(16)]);
                }
                colorSet.add(code.toString().toLowerCase());
            }
            final String[] colors = colorSet.toArray(new String[]{});
            return ObjectArrays.concat(TEN_COLORS, colors, String.class);
        }
    }

    public static void main(String[] args) {
        Stopwatch stopwatch = Stopwatch.createStarted();
        final String[] colorCodes = getColorCodes(100);
        System.out.println("Color size "+colorCodes.length);
        System.out.println(stopwatch.elapsed(TimeUnit.MILLISECONDS));
        System.out.println(Arrays.toString(colorCodes));

    }
}
