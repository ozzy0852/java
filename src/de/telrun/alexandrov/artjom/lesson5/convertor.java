package de.telrun.alexandrov.artjom.lesson5;

import java.util.Scanner;

public class convertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("eur to usd");
        double first = scanner.nextInt() * 1.02;
        System.out.println(first + ":usd ");
        System.out.println("usd to eur");
        double second = scanner.nextInt() / 1.02;
        System.out.println(second + ":eur ");
    }
}
