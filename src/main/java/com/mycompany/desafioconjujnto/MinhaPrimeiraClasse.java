package com.mycompany.desafioconjujnto;

import java.io.IOException;
import java.util.Scanner;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int quantPalavras = Integer.parseInt(sc.nextLine());
            if (quantPalavras == 0) {
                break;
            }
            
            String[] palavras = new String[quantPalavras];
            for (int i = 0; i < quantPalavras; i++ ) {
                palavras[i] = sc.nextLine().trim();
            }
            System.out.println(tipoConjunto(palavras)? "Conjunto Bom" : "Conjunto Ruim");
        }
        sc.close();
    }
  
    public static boolean tipoConjunto(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].equals(array[j]) || array[i].startsWith(array[j]) || array[j].startsWith(array[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}

/*
3
abc
dae
abcde
2
abc
def
3
adalberto
adauto
adalgisa
3
ab
abc
htht
4
a
f
c
f
2
abcdef
abc
3
arroz
feijao
macarrao
2
abacate
abelha
0
*/