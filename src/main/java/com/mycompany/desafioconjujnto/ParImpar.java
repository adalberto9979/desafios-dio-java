package com.mycompany.desafioconjujnto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class ParImpar {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int tamamho = leitor.nextInt();
    List lista = new ArrayList();
    for (int i = 0; i < tamamho; i++) {
    	lista.add(leitor.nextInt());
    }
    //Pares
    Predicate<Integer> pares = (n -> n % 2 == 0);
    lista.stream().sorted().filter(pares).forEach(System.out::println);

    //Impares
    Predicate<Integer> impares = (n -> n % 2 != 0);
    lista.stream().sorted(Comparator.reverseOrder()).filter(impares).forEach(System.out::println);
  }
}
/*
10
4
32
34
543
3456
654
567
87
6789
98
*/