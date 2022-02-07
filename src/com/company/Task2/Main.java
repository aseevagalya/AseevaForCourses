package com.company.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.print("Введите целое число: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()){
            int n = scan.nextInt();
            System.out.print(n + " = ");
            eratosfen(n);
        } else {
            System.out.print("Число не является целым");
        }
    }
    static void eratosfen(int n){
        int x = 2;
        while (n > 1){
            while ((n % x) == 0){
                System.out.print(x + " * ");
                n = n/x;
            }
            x++;
        }
        x = 1;
        System.out.print(1);
    }
}
