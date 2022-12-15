package homework.homework6;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int flat = scanner.nextInt();
            if (flat >= 49 && flat <= 90) {
                System.out.println("третий подъезд");
            }
            else if (flat>=21 && flat <= 48) {
                System.out.println("второй подъезд");
            } else if (flat <= 20 && flat >= 1) {
                System.out.println("первый подъезд");
            } else {
                System.out.println("невалидная квартира: " +  flat);
            }
    }
}

