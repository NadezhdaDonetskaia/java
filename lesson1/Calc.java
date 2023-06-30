package lesson1;

import java.util.Scanner;

// 3) Реализовать простой калькулятор

public class Calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        
        double result = calculate(num1, num2, operator);
        System.out.println("Результат: " + result);

        scanner.close();
    }
    
    public static double calculate(double num1, double num2, char operator) {
        double result = 0.0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль");
                }
                break;
            default:
                System.out.println("Ошибка: неверный оператор");
                break;
        }
        
        return result;
    }
}
