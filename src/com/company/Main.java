package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while (true){
//            int x = System.in.read();
//            System.out.println(x);
//        }
        Scanner s = new Scanner(System.in);
        System.out.println("введите что - нибудь");
        String str = s.nextLine();
        System.out.println("вы ввели: " + str);

        Scanner xInt = new Scanner(System.in);
        System.out.println("введите число ");
        int x = xInt.nextInt();
        System.out.println("вы ввели число :" + x);
    }
}
