package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kek = new Scanner(System.in);

        int b = kek.nextInt();
        int c = 1;
        int v = 1;
        switch (b) {
            case (1), (2) -> System.out.println(c); //подсказала IDE :D
            default -> {
                for (int a = b - 1; a > 0; a--) {
                    c = c + v;
                    int n = v;
                    v = c;
                    c = n;
                }
                System.out.println(c);
            }
        }

    }
}
