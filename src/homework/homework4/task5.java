package homework.homework4;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите три числа");
    double first = scanner.nextInt();
    double second = scanner.nextInt();
    double thirth = scanner.nextInt();
    double sum = (first + second + thirth);
    System.out.println(sum);
    }
}
