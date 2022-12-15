package de.telrun.alexandrov.artjom.lesson8;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("какую фигуру будем считать?");
        String figureType = scanner.nextLine();
        switch (figureType){
            case "Квадрат" -> {
                System.out.println("введите сторону квадрата");
                int size = scanner.nextInt();
                System.out.println(size * 4);
            }
            case "Круг" -> {
                System.out.println("введите радиус");
                int r = scanner.nextInt();
                System.out.println(2 * r * Math.PI);
            }
            case "Треугольник" -> {
                System.out.println("введите 1 сторону треугольника");
                int first = scanner.nextInt();
                System.out.println("введите 2 сторону треугольника");
                int second = scanner.nextInt();
                System.out.println("введите 3 сторону треугольника");
                int third = scanner.nextInt();
                System.out.println(first + second + third);
            }
            default -> System.out.println("эту фигуру я не знаю");
        }
    }
}
