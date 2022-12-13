package de.telrun.alexandrov.artjom.lesson7;

public class task3 {
    public static void main(String[] args) {
        int num = 9;
        boolean DivBy5 = num % 5 == 0;
        boolean DivBy3 = num % 3 == 0;
        boolean isDiv3andNot5 = DivBy3 && !DivBy5;
        boolean notDivBy5 = num % 5 != 0;
        System.out.println(isDiv3andNot5);

        boolean isWindy = false;
        boolean isSunny = false;
        boolean canWalk = isSunny && !isWindy;


    }
}

