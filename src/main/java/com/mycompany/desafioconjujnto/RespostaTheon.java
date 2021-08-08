package com.mycompany.desafioconjujnto;

import java.io.IOException;
import java.util.Scanner;
public class RespostaTheon {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
	int T, menor = 21, posMenor = 0;
	for (int i = 1; i <= N; i++) {
            T = leitor.nextInt();
            if (T < menor) {
                menor = T;
                posMenor = i;
            }
	}
	System.out.println(posMenor);
    }
}
/*
3
8 0 7



    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		int T, menor = 0, posMenor = 0;
		for (               ) {
			T = leitor.nextInt();
			if (     ) {
				
			} else if (    ) {
				
			}
		}
		System.out.println(posMenor);
    }
*/