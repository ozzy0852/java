package de.telrun.alexandrov.artjom.lesson7;

public class task1 {
    public static void main(String[] args) {
        System.out.println(smartConcat("привет","цветочек"));
    }
    public static String smartConcat(String str1, String str2){
        String f = str1.substring(0, str1.length() / 2);
        String s = str2.substring(str2.length()/2, str2.length());
        return f + s;
    }
}
