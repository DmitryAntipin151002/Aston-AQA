package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1:");
        printThreeWords();

        System.out.println("Task 2:");
        checkSumSign(5, -6);

        System.out.println("Task 3:");
        printColor(101);

        System.out.println("Task 4:");
        compareNumbers(3, 2);

        System.out.println("Task 5:");
        System.out.println(fromTenToTwenty(19, 1));

        System.out.println("Task 6:");
        positiveOrNegative(-1);

        System.out.println("Task 7:");
        System.out.println(isPositive(-7));

        System.out.println("Task 8:");
        printLines("i love Java and Aston!", 3);

        System.out.println("Task 9:");
        System.out.println(isLeapYear(404));

        System.out.println("Task 10:");
        int[] array = new int[] {0, 0, 0, 1, 0, 1, 0, 1, 1};
        int[] newArray = bitInversion(array);
        for (int number : newArray) System.out.print(number + " ");
        System.out.println();

        System.out.println("Task 11:");
        array = createFullArray();
        for (int number : array) System.out.print(number + " ");
        System.out.println();

        System.out.println("Task 12:");
        array = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        newArray = arrayChanges(array);
        for (int number : newArray) System.out.print(number + " ");
        System.out.println();

        System.out.println("Task 13:");
        matrixDiagonals();

        System.out.println("Task 14:");
        newArray = arrayInit(12, 3);
        for (int number : newArray) System.out.print(number + " ");
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(int num1, int num2) {
        System.out.println(num1 + num2 >= 0 ? "Сумма положительная" : "Сумма отрицательная");
    }

    public static void printColor(int value) {
        if (value <= 0) System.out.println("Красный");
        else if (value <= 100) System.out.println("Жёлтый");
        else System.out.println("Зелёный");
    }

    public static void compareNumbers(int a, int b) {
        System.out.println(a >= b ? "a >= b" : "a < b");
    }

    public static boolean fromTenToTwenty(int num1, int num2) {
       return num1 + num2 >= 10 && num1 + num2 <= 20;
    }

    public static void positiveOrNegative(int number) {
        System.out.println(number >= 0 ? "Положительное" : "Отрицательное");
    }

    public static boolean isPositive(int number) {
        return number < 0;
    }

    //Реализация данного метода подразумевает то, что параметр
    //times будет положительным
    public static void printLines(String line, int times) {
        for (int i = 0; i < times; i++) System.out.println(line);
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    //Реализация данного метода подразумевает то, что в данном
    //массиве не будит содержаться ничего кроме 1 и 0
    public static int[] bitInversion(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) array[i] = 1;
            else array[i] = 0;
        }
        return array;
    }

    public static int[] createFullArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) array[i] = i + 1;
        return array;
    }

    public static int[] arrayChanges(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] *= 2;
        }
        return array;
    }

    public static void matrixDiagonals() {
        int[][] matrix = new int[][] {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}};
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            matrix[i][j] = 1;
        }
        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            matrix[i][j] = 1;
        }
        for(int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] arrayInit(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) array[i] = initialValue;
        return array;
    }
}