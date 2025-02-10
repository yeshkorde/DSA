package arrays;

public class binerySearch {

    public static int binery(int num[], int key) {

        int start = 0;
        int end = num.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (num[mid] == key) {
                return mid;
            }

            if (num[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] evenNumbers = {
                2, 4, 6, 8, 10, 12, 14, 16, 18, 20,
                22, 24, 26, 28, 30, 32, 34, 36, 38, 40,
                42, 44, 46, 48, 50, 52, 54, 56, 58, 60,
                62, 64, 66, 68, 70, 72, 74, 76, 78, 80,
                82, 84, 86, 88, 90, 92, 94, 96, 98, 100
        };

        int val = binery(evenNumbers, 40);
        System.out.print(val);
    }
}
