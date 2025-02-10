package arrays;

public class largestValue {

    public static int findLargestvalue(int numaers[]) {
        int largestValue = Integer.MIN_VALUE;
        for (int i = 0; i < numaers.length; i++) {
            if (largestValue < numaers[i]) {
                largestValue = numaers[i];
            }
        }
        return largestValue;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 5, 6, 6, 4, 4, 5, 5, 4, 445, 544453, 53534 };
        int lag = findLargestvalue(arr);
        System.err.println(lag);
    }
}
