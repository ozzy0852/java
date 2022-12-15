package de.telrun.alexandrov.artjom.lesson8;

import java.util.Random;

public class task2 {
    public static int MAX_HIGH = 10;

    public static void main(String[] args) {
        Random random = new Random();
        boolean isHasRoof = random.nextBoolean();
        boolean isHasWall = random.nextBoolean();
        int high = random.nextInt(15);
        System.out.printf("Крыша есть? %b, Стены есть? %b, высота : %d%n", isHasRoof, isHasWall, high);
        // мы принимаем объект если есть крыша, есть стены и высота меньше 10
//        if (isHasRoof && isHasWall && high <= MAX_HIGH) {
//            System.out.println("принимаем");
//        } else if (!isHasRoof) {
//            System.out.println("нет крыши");
//        }else if (!isHasWall) {
//            System.out.println("нет стены");
//        }else if (high > MAX_HIGH) {
//            System.out.println("не соответсвует высота");
//        } else{
//            System.out.println("Everything is ok");
//        }
        if (isHasWall) {
            if (isHasRoof) {
                if (high <= MAX_HIGH) {
                    //все ок
                } else {
                    //высота не ок
                }
                //
            } else {
                if (high <= MAX_HIGH) {
                    //крыша не ок
                } else {
                    //крыша и высота не ок
                }
            }
        } else {
            if (isHasRoof) {
                if (high <= MAX_HIGH) {
                    //стена не ок
                } else {
                    //стена и высота не ок
                }
                //
            } else {
                if (high <= MAX_HIGH) {
                    //стена и крыша не ок
                } else {
                    //стена и крыша и высота не ок
                }
            }
        }

    }
}