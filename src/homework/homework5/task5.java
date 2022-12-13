package homework.homework5;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Country = scanner.nextInt();
        boolean isLorry = scanner.nextBoolean();
        boolean num = Country % 2 == 0;
        System.out.println(num);
        if (num) {
            System.out.println("можно заезжать машине в город");
        }
        else {
            System.out.println("нельзя заезжать на машине в город");
        }

    }
}
