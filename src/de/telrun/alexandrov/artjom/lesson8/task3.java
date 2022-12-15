package de.telrun.alexandrov.artjom.lesson8;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        String str = null;
        if (num > 50) {
            str = "больше 50";
        }else {
            str = "меньше или равно";
        }

        str = num > 50 ? "больше 50" : "меньше или рано 50";
    }

    public static String getStrValue (int num) {
//        if(num > 50){
//            return "больше";
//        }else {
//            return "меньше или равно 50";
//        }
        return num > 50 ? "больше 50" : "меньше или рано 50";
    }
}
