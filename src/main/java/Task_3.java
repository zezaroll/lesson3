public class Task_3 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, -2, -1, 5, 2, 6};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println("положительное");
            } else {
                System.out.println("отрицательное");
            }
        }
    }
}
