public class Task_5 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result += arr[i];
            }
        }
        System.out.println(result);
        if (result == 0)
            System.out.println(result);

    }
}

