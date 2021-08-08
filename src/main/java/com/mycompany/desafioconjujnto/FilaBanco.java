package com.mycompany.desafioconjujnto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantTestes = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantTestes; i++ ) {
            int quantNaoModou = 0;
            int quantSenha = Integer.parseInt(sc.nextLine());
            String[] auxiliar = sc.nextLine().split(" ");
            List<Integer> listaOriginal = new ArrayList();
            for (int f = 0; f < quantSenha; f++){
                listaOriginal.add(Integer.parseInt(auxiliar[f]));
            }
            List<Integer> listaOrdenada = (List<Integer>) listaOriginal.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
            for (int g = 0; g < quantSenha; g++) {
                if (listaOrdenada.get(g).equals(listaOriginal.get(g))) {
                    quantNaoModou++;
                }
            }
            System.out.println(quantNaoModou);
        }
        sc.close();
    }
}
/*
3
3
100 80 90
4
100 120 30 50
4
100 90 30 25
*/