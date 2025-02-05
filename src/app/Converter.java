package app;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        System.out.println("Проект: Converter");
        System.out.println("Версия: 1.0");
        System.out.println("Автор: Виктор Клюев");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите температуру в" +
                " Фаренгейтах: ");
        double fahrenheit = scanner.nextDouble();
        double celsius =
                fahrenheitToCelsius(fahrenheit);
        System.out.printf("Температура в " +
                "Цельсиях: %.2f°C. ", celsius);
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5 / 9;
    }
}