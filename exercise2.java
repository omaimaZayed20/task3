package com.company;

import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {

        System.out.println("program 2 : FileIo");
        System.out.println("input string");
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        String strng = input.nextLine();
        int len = strng.length();
        System.out.println("input your name");
        String chr = input2.nextLine();
        char ccc = chr.charAt(0);
        int num = 0;
        for (int i = 0; i < len; i++) {
            char cc = strng.charAt(i);
            if (cc == ccc) {
                num++;
            }
        }
        System.out.println("number of "+ ccc +" is : "+ num);

    }

}
