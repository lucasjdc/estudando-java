package com.costa.gestaoescolar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoSQLite {
    /*
    public static void main(String[] args) {
        Connection conexao = null;
        try {
            // Carrega o driver JDBC do SQLite
            Class.forName("org.sqlite.JDBC");

            // Estabelece a conexão com o banco de dados
            String url = "jdbc:sqlite:/home/lucas/banco-dados/gestao.db"; // Substitua pelo caminho do seu arquivo SQLite
            conexao = DriverManager.getConnection(url);

            if (conexao != null) {
                System.out.println("Conexão com o banco de dados SQLite estabelecida.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver SQLite não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados SQLite.");
            e.printStackTrace();
        } finally {
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão com o banco de dados SQLite.");
                e.printStackTrace();
            }
        }
    }
    */
    public static Connection obterConexao() {
        Connection conexao = null;
        try {
            // Carrega o driver JDBC do SQLite
            Class.forName("org.sqlite.JDBC");

            // Estabelece a conexão com o banco de dados
            String url = "jdbc:sqlite:/home/lucas/banco-dados/gestao.db"; // Substitua pelo caminho do seu arquivo SQLite
            conexao = DriverManager.getConnection(url);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver SQLite não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco de dados SQLite.");
            e.printStackTrace();
        }
        return conexao;
    }
}
