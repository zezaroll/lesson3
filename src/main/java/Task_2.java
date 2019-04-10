public class Task_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 4, 0, 5, 0, 1, 0};
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                result += i;
            }
        }
        System.out.println(result);
    }
}
