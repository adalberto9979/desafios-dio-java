package com.mycompany.desafioconjujnto;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Entrevista {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        //insira sua solução aqui
        String linha;
        while ((linha = br.readLine()) != null) {
            int contar = 0;
            for (int i = 1; i < linha.length(); i++) {
                String auxiliar = (String) linha.substring(0, i);
                if (auxiliar.endsWith(linha.substring(i))) {
                    System.out.println(auxiliar);
                    contar++;
                }
            }
            if (contar == 0) {
                System.out.println(linha);
            }
        }
        br.close();
    }
}

/*
sanduicheiche
barrilarril
ratoato
sol
coliseueu
queijoijo
astroastro
a
*/