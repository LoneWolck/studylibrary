package com.company;

import java.util.Scanner;

public class second {

    public static void main(String[] args){
        Scanner kek = new Scanner(System.in);
        int k = 11;
        int v = 2;
        int n = 0;
        int a = kek.nextInt();

        for(int b=1; b <= a;b++){
            if (b%2 == 0){
                if(k-10<0){
                    v--;
                }
                else{
                    k = k-10;
                    n++;
                    if(n%7==0){
                        v++;
                    }
                }
            }
            else if(b%2 == 1){
                if(k<19000000)
                k = k*3;
            }
        }
        System.out.println(k+ " " + v);
    }
}
