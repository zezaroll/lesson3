public class Task_73 {
    public static void main(String[] args) {
        System.out.println(getZeroNumbers(1, 0, 0, 3, 0, 0, 0, 14, 5, 6, 0, 0, 0, 0, 1));
    }

    public static int getZeroNumbers(int... numbers) {

        int counter = 0;
        int totalMaxLength = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                counter++;
            } else if (counter > totalMaxLength) {
                totalMaxLength = counter;
                counter = 0;
            }
            if (i == numbers.length - 1 && totalMaxLength < counter) {
                totalMaxLength = counter;
            }
        }
        return totalMaxLength;
    }
}
