package array;

public class NoOfWaysToReachEnd {

    static int total = 0;

    public static void main(String[] args) {

        int[] steps = {1, 2, 3};


        totalWays(5,0,steps);
        System.out.println("Total Ways "+total);

    }

    static void totalWays(int maxSteps, int sum, int[] steps) {
        if (maxSteps == 0 || steps == null || steps.length == 0) {
            return;
        }
        if (maxSteps == sum) {
            total++;
        }
        for (int i = 0; i < steps.length; i++) {
            if (sum + steps[i] <= maxSteps) {
                totalWays(maxSteps, sum + steps[i], steps);
            }
        }
    }
}
