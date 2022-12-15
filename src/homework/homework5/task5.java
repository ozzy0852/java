package homework.homework5;

import java.util.Random;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(1, 10000);
        boolean isLorry = random.nextBoolean();
        System.out.printf("номер %s грузовик? %s\n", number, isLorry);
        // машина легковая = не грузовая и номер машины четный
        if (!isLorry && number % 2 == 0) {
            System.out.println("можно");
        } else {
            System.out.println("нельзя");
        }
    }
}
