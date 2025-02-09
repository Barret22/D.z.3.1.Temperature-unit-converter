package app;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Проект: Converter");
        System.out.println("Версия: 1.0");
        System.out.println("Автор: Виктор Клюев");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите тип конвертации:");
        System.out.println("1 - Фаренгейты в Цельсии");
        System.out.println("2 - Цельсии в Фаренгейты");
        System.out.print("Ваш выбор: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Введите температуру в Фаренгейтах: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("Температура в Цельсиях: %.2f°C\n", celsius);
        } else if (choice == 2) {
            System.out.print("Введите температуру в Цельсиях: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("Температура в Фаренгейтах: %.2f°F\n", fahrenheit);
        } else {
            System.out.println("Ошибка: Неверный выбор.");
        }
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}