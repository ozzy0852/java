package de.telrun.alexandrov.artjom.lesson5;

import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int first = scanner.nextInt();
        System.out.println("Введите второе число ");
        int second = scanner.nextInt();
        int sum = first + second;
        System.out.println(first + " прибавить " + second + " равно "  + sum);
    }
}
