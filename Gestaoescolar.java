package com.costa.gestaoescolar;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Gestaoescolar {

    public static void main(String[] args) {
        List<Aluno> listaDeAlunos = new ArrayList<>();
        System.out.println("Sistema de gestão escolar");
        System.out.println("Cadastro de aluno");
        
        String nome = obterEntrada("Digite o nome do aluno:");       
        int idade = Integer.parseInt(obterEntrada("Digite a idade do aluno:"));               
       
        String curso = obterEntrada("Digite o curso do aluno: ");
        
        // Exibir informações do aluno
        System.out.println("Verifique se os dados do aluno estão corretos.");
        System.out.println("Aluno: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso);       
        
        cadastrarAluno(nome, idade, curso);

        System.out.println("Aluno cadastrado com sucesso!");
               
        }
        
    private static String obterEntrada(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextLine();    
    }
    
    private static void cadastrarAluno(String nome, int idade, String curso) {
        Connection conexao = null;
        PreparedStatement preparedStatement = null;
        try {
            // Obter conexão com o banco de dados
            conexao = ConexaoSQLite.obterConexao();

            // Preparar a consulta SQL para inserir o aluno
            String sql = "INSERT INTO aluno (nome, idade, curso) VALUES (?, ?, ?)";
            preparedStatement = conexao.prepareStatement(sql);
            preparedStatement.setString(1, nome);
            preparedStatement.setInt(2, idade);
            preparedStatement.setString(3, curso);

            // Executar a consulta SQL
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar aluno no banco de dados.");
            e.printStackTrace();
        } finally {
            // Fechar recursos
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conexao != null) {
                try {
                    conexao.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}