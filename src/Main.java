import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача №1
        System.out.println("Задача №1");

        int[] numbers = new int[3];   //Целочисленный массив, заполненный тремя цифрами
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        double[] threeFractionalNumbers = {1.57, 7.654, 9.986};   // Объявление и инициализация массива с дробными числами
        for (int i = 0; i < threeFractionalNumbers.length; i++) {
            System.out.print(threeFractionalNumbers[i] + " ");
        }
        System.out.println();

        String[] fruits = {"Apple", "Banana", "Cherry"};   // Произвольный массив. Cразу заполненный элементами
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i] + " ");
        }
        System.out.println();

        // Задача №2
        System.out.println("Задача №2");

        int[] numbersTwo = new int[3];
        numbersTwo[0] = 1;
        numbersTwo[1] = 2;
        numbersTwo[2] = 3;
        System.out.print(Arrays.toString(numbersTwo));
        System.out.println();

        double[] threeFractionalNumbersTwo = {1.57, 7.654, 9.986};
        System.out.print(Arrays.toString(threeFractionalNumbersTwo));
        System.out.println();

        String[] fruitsTwo = {"Apple", "Banana", "Cherry"};
        System.out.print(Arrays.toString(fruitsTwo));
        System.out.println();

        // Задача №3
        System.out.println("Задача №3");

        int[] numbersThree = new int[3];
        numbersThree[0] = 1;
        numbersThree[1] = 2;
        numbersThree[2] = 3;
        for (int i = numbersThree.length - 1; i >= 0; i--) {
            System.out.print(numbersThree[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
                System.out.println();

        double[] threeFractionalNumbersThree = {1.57, 7.654, 9.986};
        for (int i = threeFractionalNumbersThree.length - 1; i >= 0; i--) {
            System.out.print(threeFractionalNumbersThree[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        String[] fruitsThree = {"Apple", "Banana", "Cherry"};
        for (int i = fruitsThree.length - 1; i >= 0; i--) {
            System.out.print(fruitsThree[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задача №4
        System.out.println("Задача №4");

        int[] numbersFour = new int[3];
        numbersFour[0] = 1;
        numbersFour[1] = 2;
        numbersFour[2] = 3;
        for (int i = 0; i < numbersFour.length; i++) {
            if (numbersFour[i] % 2 != 0) {
                numbersFour[i] = numbersFour[i] + 1;
                    System.out.print(numbersFour[i] + " ");
                }
            }
    }
}