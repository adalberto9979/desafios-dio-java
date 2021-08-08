package com.mycompany.desafioconjujnto;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class Tartaruga {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m;
        int velocidade;
	while (true) {
            String linha = br.readLine();
            if (linha.isEmpty()) break;
            String str = br.readLine();
            List<String> sLista = Arrays.asList(str.split(" "));

            List<Integer> lista = transform(sLista, Integer::parseInt);
            List<Integer> listaOrdenada = (List<Integer>) lista.stream().sorted(Comparator.reverseOrder()).distinct().collect(Collectors.toList());
            velocidade = listaOrdenada.get(0);
            if (velocidade < 10) {
                m = 1;
            } else if (velocidade < 20) {
                m = 2;
            } else {
                m = 3;
            }
            System.out.println(m);
	}
    }
    
    public static <T, U> List<U> transform(List<T> list, Function<T, U> function) {
        return list.stream().map(function).collect(Collectors.toList());
    }    
}
/*
10
10 10 10 10 15 18 20 15 11 10
10
1 5 2 9 5 5 8 4 4 3
10
19 9 1 4 5 8 6 11 9 7
*/