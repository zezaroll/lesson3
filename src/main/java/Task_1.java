public class Task_1 {
    public static void main(String[] args) {
        int k = 6;
        int result = 0;
        int[] arr = new int[]{2, 4, 6, 1, 8, 4, 3, 5, 12, 22,};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
               result += arr[i];
            }
        }
        System.out.println(result);
    }
}

