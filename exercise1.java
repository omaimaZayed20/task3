package com.company;
import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {

        System.out.println("program 1 : Strings");
        System.out.println("input your name");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String upper = name.toUpperCase();
        char c = upper.charAt(0);
        System.out.print(c);
        int len = upper.length();
        for (int i = 1; i < len; i++) {
            char c2 = upper.charAt(i);
            if (c2 == ' ') {
                System.out.print(" . " + upper.charAt(i + 1));
            }
        }
    }
}
