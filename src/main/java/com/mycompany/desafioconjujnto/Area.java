package com.mycompany.desafioconjujnto;

import java.util.Scanner;
public class Area {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

		 //declare suas variaveis do tipo double
        double raio = Double.parseDouble(scan.nextLine());

	double area = 3.14159 * (Math.pow(raio, 2));

	System.out.printf("A=%.4f\n", area);
	}
}