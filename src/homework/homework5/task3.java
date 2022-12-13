package homework.homework5;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Сколько денег у вас?");
        Scanner scanner = new Scanner(System.in);
        double cookie = 0.5;
        int money = scanner.nextInt();
        double amount = money / cookie;
        System.out.println("вы можете купить "+ amount + " печенья");
    }
}
