package homework.homework5;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
 int age = scanner.nextInt();
  System.out.println(age);
    if (age >= 18) {
        System.out.println("Можно идти смотреть кино");
    } else if (age <= 17) {
        System.out.println("Нельзя идти смотреть кино");
    }
}
}