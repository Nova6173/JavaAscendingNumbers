package se.JavaLexicon;

public class AscendingNumbers {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 3, 4, 7};
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {

                    numbers[i] = numbers[i] + numbers[j];
                    numbers[j] = numbers[i] - numbers[j];
                    numbers[i] = numbers[i] - numbers[j];
                }
            }
        }
        for (int number : numbers)
            System.out.println(number + " ");
    }
}
