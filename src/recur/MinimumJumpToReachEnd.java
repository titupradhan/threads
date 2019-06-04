package recur;

public class MinimumJumpToReachEnd {

    public static void main(String[] args) {
        int[] array = {1, 1, 3, 6, 9, 3, 0, 1, 3};
        System.out.println(minJump(array, 0));
    }

    public static int minJump(int[] array, int currentIndex) {
        if (currentIndex == array.length - 1) {
            return 0;
        }
        if (array[currentIndex] == 0) {
            return Integer.MAX_VALUE;
        }

        int minJumps = Integer.MAX_VALUE;
        int maxReach = array[currentIndex] + currentIndex;
        int start = currentIndex + 1;

        while (start < array.length && start <= maxReach) {
            int min = minJump(array, start++);
            if (min != Integer.MAX_VALUE) {
                minJumps = Math.min(minJumps, min + 1);
            }
        }
        return minJumps;
    }
}
