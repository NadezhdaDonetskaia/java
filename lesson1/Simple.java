// 2) Вывести все простые числа от 1 до 1000

package lesson1;

public class Simple {
    public static void main(String[] args) {
        System.out.println("Простые числа от 1 до 1000:");
        printPrimeNumbers(1, 1000);
    }

    public static void printPrimeNumbers(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
