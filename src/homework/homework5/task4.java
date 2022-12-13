package homework.homework5;

import java.util.Random;

public class task4 {
    public static void main(String[] args) {
        Random rn = new Random();
        Boolean answer = rn.nextBoolean();
        if (answer) {
            System.out.println("орел");
        } else {
        System.out.println("решка");
        }
    }
}
