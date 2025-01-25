package gr.aueb.cf.practice;

public class GetMaxPosition {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, -1, 15, 6, 25};
        int maxPos = 0;

        maxPos = getMaxPosition(arr, 0, arr.length - 1);

        if (maxPos == -1) {
            System.out.println("No such element");
            System.exit(1);
        }
        System.out.println(arr[maxPos]);



    }

    public static int getMaxPosition (int[] arr, int low, int high) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int maxValue = arr[maxPosition];

        for (int i = low; i <= high; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
