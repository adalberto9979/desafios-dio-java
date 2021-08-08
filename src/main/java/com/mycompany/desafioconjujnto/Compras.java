package com.mycompany.desafioconjujnto;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import static java.util.stream.Collectors.toList;
import java.util.stream.Stream;

public class Compras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantListas = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < quantListas; i++ ) {
            String listaCompleta = sc.nextLine().trim();

            List<String> listaOrdenada = Stream.of(listaCompleta.split(" "))
                .sorted()
                .map(String::trim)
                .collect(toList());
            
            Set<String> listaUnica = new LinkedHashSet<>(listaOrdenada);

            System.out.print(String.join(" ", listaUnica));
            System.out.println("");
        }
        sc.close();
    }
}    
/*
2
carne laranja suco picles laranja picles
laranja pera laranja pera pera
for (var i = 0; i < totalItems; i++) {
  let itens = gets();
  let itensOrdenados = itens.split(" ").sort();
  let itensUnicos = itensOrdenados.filter(function(parametro1, parametro2) {return itensOrdenados.indexOf(parametro1) === parametro2;}); // Implemente aqui a lógica para ter os itens unicos
  let resposta = [...itensUnicos].join(" ");
  console.log(resposta);
}
*/