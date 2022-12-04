package homework.homework4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Fahrenheit to Celsius");
    double Celsius = ((scanner.nextInt() - 32)/ 1.8);
    System.out.println(Celsius);
    System.out.println("Fahrenheit to Celsius");
    double Fahrengeit = ((scanner.nextInt()* 1.8)+ 32);
    System.out.println(Fahrengeit);
    }
}
