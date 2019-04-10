public class Task_6 {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 9, 12, 35, 22};
        int min = arr[0], max = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > arr[i -1]) {
                max = arr[i];
            }
            System.out.println("min: " + min + " " + max);
        }
    }
}
