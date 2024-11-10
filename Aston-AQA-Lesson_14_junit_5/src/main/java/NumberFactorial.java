public class NumberFactorial {
    public int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Факториал не может быть рассчитан для отрицательных чисел");
        }
        if (number == 0 || number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
