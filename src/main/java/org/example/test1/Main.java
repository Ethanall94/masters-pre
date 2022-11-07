package org.example.test1;

public class Main {
    public static void main(String[] args) {
        char[] AtoZ = new char[26];

//        int Alpha = 'A';
//        System.out.println(Alpha);

        for (int i = 0; i < AtoZ.length; i++) {
            AtoZ[i] = (char)(65 + i);
        }

        for (int i = 0; i < AtoZ.length; i++) {
            System.out.printf("%c ", AtoZ[i]);
        }
    }
}