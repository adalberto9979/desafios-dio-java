package com.mycompany.desafioconjujnto;

import java.io.IOException;
import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) throws IOException {
        //insira sua resolução aqui
        Scanner br = new Scanner(System.in);
        String maiuscula = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minuscula = maiuscula.toLowerCase();
        String numeros = "0123456789";
        String conjuntoValido = maiuscula + minuscula + numeros;
        
        while (br.hasNext()) {
            String linha = br.nextLine();
            int tamanho = linha.length();
            if (tamanho >= 6 && tamanho <= 32) {
                int contemMaiusculo = 0;
                int contemMinusculo = 0;
                int contemNumero = 0;
                int caracterInvalido = 0;
                for (int i = 0; i < tamanho; i++) {
                    String auxiliar = linha.substring(i, i+1);
                    if (maiuscula.contains(auxiliar)) contemMaiusculo++;
                    if (minuscula.contains(auxiliar)) contemMinusculo++;
                    if (numeros.contains(auxiliar)) contemNumero++;
                    if (!conjuntoValido.contains(auxiliar)) caracterInvalido++;
                }
                if(contemMaiusculo > 0 && contemMinusculo > 0 && contemNumero > 0 && caracterInvalido == 0) {
                    System.out.println("Senha valida.");
                } else {
                    System.out.println("Senha invalida.");
                }
            } else {
                System.out.println("Senha invalida.");
            }
        }
        br.close();
    }
}

/*
Digital Innovation One
AbcdEfgh99
DigitalInnovationOne123
Digital Innovation One 123
Aass9
Aassd9
*/