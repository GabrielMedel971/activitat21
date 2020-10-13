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
            System.out.println("Article   Quantitat   Preu   Descompte   total");
            System.out.println(codi+"         "+quant+"        "+(+preu*quant)+"       "+perc+"       "+((preu*quant)-perc));

        }
        if ( quant >= 25 && quant<=100){
            int perc = preu*20/100;
            System.out.println("Article   Quantitat   Preu   Descompte   total");
            System.out.println(codi+"         "+quant+"        "+(+preu*quant)+"       "+perc+"       "+((preu*quant)-perc));
        }

        if ( quant >= 10 && quant<=24){
            int perc = preu*10/100;
            System.out.println("Article   Quantitat   Preu   Descompte   total");
            System.out.println(codi+"         "+quant+"        "+(+preu*quant)+"       "+perc+"       "+((preu*quant)-perc));
        }
        if (quant <=10){
            System.out.println("Article   Quantitat   Preu   Descompte   total");
            System.out.println(codi+"           "+quant+"         "+(+preu*quant)+"       "+"          "+((preu*quant)));

        }


    }
}
