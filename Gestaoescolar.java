package com.costa.gestaoescolar;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Gestaoescolar {

    public static void main(String[] args) {
        List<Aluno> listaDeAlunos = new ArrayList<>();
        System.out.println("Sistema de gestão escolar");
        System.out.println("1. Cadastrar aluno");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();
        
        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt(); // O metodo nextInt() le apenas valores inteiros deixando um "\n"
        
        // Limpeza do buffer
        scanner.nextLine(); // Essa linha recolhe esse "\n".
        
        System.out.println("Digite o curso do aluno: ");
        String curso = scanner.nextLine();
        
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);
        
        scanner.close();
        
        
        Aluno aluno = Aluno.criarAluno(nome, idade, curso);
        listaDeAlunos.add(aluno);

        
        System.out.println("Aluno cadastrado com sucesso!");
        
        
        
        
    }
}
