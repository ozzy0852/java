package homework.homework6;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month =scanner.nextInt();;

        switch (month) {
            case 1,2,3,4: {
                if (month == 1) {
                    System.out.println("Зима");
                } else if(month == 2){
                    System.out.println("Весна");
                }
                else if(month == 3){
                    System.out.println("Лето");
                }
                else if(month == 4){
                    System.out.println("Осень");
                }
            }
        }
    }
}
