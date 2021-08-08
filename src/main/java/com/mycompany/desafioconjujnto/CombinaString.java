package com.mycompany.desafioconjujnto;

import java.util.Scanner;
public class CombinaString {
    public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int N = leitor.nextInt();
	for (int i = 0; i < N; i++) {
            String primeira = leitor.next();
            String segunda = leitor.next();
            String sobra;
            String resultado = "";
            int tamanho;
            if (primeira.length() > segunda.length()) {
		tamanho = segunda.length();
                sobra = primeira.substring(tamanho);
            } else {
		tamanho = primeira.length();
                sobra = segunda.substring(tamanho);
            }
            for (int j=0; j < tamanho ; j++) {
		resultado += primeira.substring(j, j+1) + segunda.substring(j, j+1);
            }
            System.out.println(resultado+sobra);
	}
    }
}
/*
2
aA Bb
aa bb

3
AoQeaeAADeNtaehchec DguMksuuosoMkNeN
CouLdaaMrde aQearNoo
nWOVQJKKabhiBrPnYvPAwByBmtCPtlrBEovbBMbPtaxraYIIzA PyzAniqSbUBQLxGKacruKWYDIJzxJCKUBNteUdXDoplmnOIYo
*/