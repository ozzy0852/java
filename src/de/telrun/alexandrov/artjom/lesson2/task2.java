package de.telrun.alexandrov.artjom.lesson2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int money = 1200;
        int pizzaPrice = 230;
        int gymPrice = 26;
        double candyPrice = 2.5;
        int howManyPizza = money / pizzaPrice;
        int moneyAfterPizza = money % pizzaPrice;
        int howManyGym = moneyAfterPizza / gymPrice;
        int moneyAfterGym = moneyAfterPizza % gymPrice;
        double howManyCandy = (int) (moneyAfterGym / candyPrice);
        double moneyResult = moneyAfterGym % candyPrice;
        System.out.println("Пиццы купили: " + howManyPizza);
        System.out.println("Жевачки купили: " + howManyGym);
        System.out.println("Конфет купили: " + howManyCandy);
        System.out.println("Денег осталось: " + moneyResult);


    }
}
