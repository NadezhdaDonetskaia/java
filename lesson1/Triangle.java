package lesson1;

import java.util.Scanner;

// 1) Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

/**
 * triangle
 */
public class Triangle {

    /**
     * main
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите значение n: ");
        int n = scanner.nextInt();
        
        int triangularNumber = calculateTriangularNumber(n);
        System.out.println("Треугольное число для " + n + ": " + triangularNumber);
        
        int factorial = calculateFactorial(n);
        System.out.println("Факториал для " + n + ": " + factorial);

        scanner.close();
    }
    
    public static int calculateTriangularNumber(int n) {
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        
        return sum;
    }
    
    public static int calculateFactorial(int n) {
        int factorial = 1;
        
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        
        return factorial;
    }
}




// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69. 
// Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.

