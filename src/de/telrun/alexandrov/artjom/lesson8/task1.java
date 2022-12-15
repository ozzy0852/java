package de.telrun.alexandrov.artjom.lesson8;

import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        String lang = "EN";
        if (lang.equals("EN")) {
            System.out.println("Hello");
        } else if (lang.equals("GE")) {
            System.out.println("Halo");
        } else if (lang.equals("SP")) {
            System.out.println("Hola");
        } else {
            System.out.println("not supported");
        }
        int month = 6;

        switch (lang) {
            case "EN" -> {
                switch (month) {
                    case 1-> System.out.println(1);
                }
                System.out.println("Hello");
            }
            case "GE" -> System.out.println("Halo");
            case "SP"-> System.out.println("Hola");
            default -> System.out.println("not supported");
        }

        switch (month) {
            case 3,4,5: {
                if (lang.equals("EN")) {
                    System.out.println("Spring");
                } else {
                    System.out.println("Весна");
                }
            }
        }
        if (month > 7) {
            ///
        }

    }
}
