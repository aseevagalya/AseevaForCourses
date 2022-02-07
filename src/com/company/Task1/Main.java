package com.company.Task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        System.out.print("Введите строку: ");
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();

        for(int i = 0; i < str.length(); i++){
	        if (Character.isDigit(str.charAt(i))){
	            sum+=(str.charAt(i))-'0';
            }
        }
        System.out.print("Сумма цифр, присутствующих в данной строке: " + sum);
    }
}