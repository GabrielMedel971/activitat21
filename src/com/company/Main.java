package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclat = new Scanner(System.in);
        int codi = teclat.nextInt();
        int quant = teclat.nextInt();
        int preu = teclat.nextInt();

        if (quant >= 100){
            int perc = preu*40/100;

        }
        if ( quant >= 25 && quant<=100){
            int perc = preu*20/100;
        }

    }
}
