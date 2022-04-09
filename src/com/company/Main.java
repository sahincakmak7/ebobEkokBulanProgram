package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        int i = 1;
        int k = 1;
        int ebob = 1;

        System.out.print("n1 sayısını giriniz :");
        n1 = input.nextInt();

        System.out.print("n2 sayısını giriniz :");
        n2 = input.nextInt();


        while (n1 >= i) {
            i++;
            if (n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }System.out.println("Ebob :"+ebob);


        while (n1 * n2 >= i) {
            i++;
            if (i % n1 == 0 && i % n2 == 0) {
                System.out.println("Ekok :"+i);
                break;
            }
        }
    }
}
