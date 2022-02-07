package com.company.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        for (int i = 1; i <= 5; i++){
            for (int j = 0; j < str.length(); j++){
                int digit = str.charAt(j) - '0';
                switch (digit){
                    case 0: zero(i);
                        break;
                    case 1: one(i);
                        break;
                    case 2: two(i);
                        break;
                    case 3: three(i);
                        break;
                    case 4: four(i);
                        break;
                    case 5: five(i);
                        break;
                    case 6: six(i);
                        break;
                    case 7: seven(i);
                        break;
                    case 8: eight(i);
                        break;
                    case 9: nine(i);
                        break;
                }
            }
            System.out.println();
        }

    }
    static void one(int i){
        switch (i){
            case 1:
            case 3:
            case 4:
                System.out.print(" *  ");
                    break;
            case 2: System.out.print("**  ");
                    break;
            case 5: System.out.print("*** ");
                    break;
        }
    }
    static void two(int i){
        switch (i){
            case 1: System.out.print("**  ");
                break;
            case 2: System.out.print("  * ");
                break;
            case 3: System.out.print(" *  ");
                break;
            case 4: System.out.print("*   ");
                break;
            case 5: System.out.print("*** ");
                break;
        }
    }
    static void three(int i){
        switch (i){
            case 1:
            case 5:
                System.out.print("*** ");
                break;
            case 2:
            case 4:
                System.out.print("  * ");
                break;
            case 3: System.out.print(" ** ");
                break;
        }
    }
    static void four(int i){
        switch (i){
            case 1:
            case 2:
                System.out.print("* * ");
                break;
            case 3: System.out.print("*** ");
                break;
            case 4:
            case 5:
                System.out.print("  * ");
                break;
        }
    }
    static void five(int i){
        switch (i){
            case 1: System.out.print("*** ");
                break;
            case 2: System.out.print("*   ");
                break;
            case 3: System.out.print("*** ");
                break;
            case 4: System.out.print("  * ");
                break;
            case 5: System.out.print("*** ");
                break;
        }
    }
    static void six(int i){
        switch (i){
            case 1:
            case 3:
            case 5:
                System.out.print("*** ");
                break;
            case 2: System.out.print("*   ");
                break;
            case 4: System.out.print("* * ");
                break;
        }
    }
    static void seven(int i){
        switch (i){
            case 1: System.out.print("*** ");
                break;
            case 2: System.out.print("  * ");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print(" *  ");
                break;
        }
    }
    static void eight(int i){
        switch (i){
            case 1:
            case 3:
            case 5:
                System.out.print("*** ");
                break;
            case 2:
            case 4:
                System.out.print("* * ");
                break;
        }
    }
    static void nine(int i){
        switch (i){
            case 1:
            case 3:
            case 5:
                System.out.print("*** ");
                break;
            case 2: System.out.print("* * ");
                break;
            case 4: System.out.print("  * ");
                break;
        }
    }
    static void zero(int i){
        switch (i){
            case 1:
            case 5:
                System.out.print("*** ");
                break;
            case 2:
            case 3:
            case 4:
                System.out.print("* * ");
                break;
        }
    }

}
