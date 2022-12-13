package de.telrun.alexandrov.artjom.lesson7;

public class task2 {
    public static void main(String[] args) {
        boolean isEven = 8 % 2 == 0;
        boolean isNotDivBy3 = 9 % 3 == 0;
        System.out.println(isEven);
        int i = 7;
        boolean isDiv2or3 = (i % 2 == 0) | (i % 3 == 0);
        boolean isDiv2and3 = (i % 2 == 0) && (i % 3 == 0);

        int num = 11;
        int num2 = 12;
        System.out.println(num | num2);
    }
}
