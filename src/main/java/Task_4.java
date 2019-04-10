public class Task_4 {
    public static void main(String[] args) {
        double[] arr = new double[]{1, 2, 3, 4, 5, 6};

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                System.out.println("da");
            }
        }
    }
}
