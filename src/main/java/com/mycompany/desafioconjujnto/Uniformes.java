package com.mycompany.desafioconjujnto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Uniformes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Uniformes> alunos = new ArrayList<>();
        while (true) {
            int quantListas = Integer.parseInt(sc.nextLine());
            if (quantListas == 0) break;
            for (int i = 0; i < quantListas; i++) {
                Uniformes aluno = new Uniformes();
                aluno.setNome(sc.nextLine().trim());
                String corTamanho = sc.nextLine().trim();
                int comprimentoString = corTamanho.length();
                aluno.setCor(corTamanho.substring(0, comprimentoString-1));
                aluno.setTamanho(corTamanho.substring(comprimentoString-1));
                alunos.add(aluno);
            }
            alunos.sort(Comparator.comparing(Uniformes::getCor)
                .thenComparing(Comparator.comparing(Uniformes::getTamanho)
                .reversed()
                .thenComparing(Comparator.comparing(Uniformes::getNome))
                ));
            for (int j = 0; j < alunos.size(); j++) {
                System.out.println(alunos.get(j).getCor() + " " + alunos.get(j).getTamanho()+ " " + alunos.get(j).getNome());
            }
        }
    }
    
    private String nome;
    private String cor;
    private String tamanho;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
/*
9
Maria Jose
branco P
Mangojata Mancuda
vermelho P
Cezar Torres Mo
branco P
Baka Lhau
vermelho P
JuJu Mentina
branco M
Amaro Dinha
vermelho P
Adabi Finho
branco G
Severina Rigudinha
branco G
Carlos Chade Losna
vermelho P
0
*/