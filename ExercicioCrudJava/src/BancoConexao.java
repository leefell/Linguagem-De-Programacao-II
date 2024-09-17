import java.sql.*;

public class BancoConexao {
	
    public static void CriaBD() {
        String url = "jdbc:postgresql://localhost:5432/";
        String user = "postgres";
        String password = "1508";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sql = "CREATE DATABASE Ex2BancoDeDados";
            statement.executeUpdate(sql);
            System.out.println("Banco de dados criado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao criar banco de dados.");
            e.printStackTrace();
        }
    }

    public static void CriaTabelaPessoa() {
        String url = "jdbc:postgresql://localhost:5432/ex2bancodedados";
        String user = "postgres";
        String password = "1508";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sql = "CREATE TABLE ALUNO ("
                    + "pessoa_Id SERIAL, "
                    + "nome VARCHAR(30), "
                    + "idade INTEGER, "
                    + "CONSTRAINT pk_pessoa PRIMARY KEY(pessoa_Id))";

            statement.executeUpdate(sql);
            System.out.println("Tabela ALUNO criada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela.");
            e.printStackTrace();
        }
    }

    public static void InsereDadosNaTabelaAluno() {
        String url = "jdbc:postgresql://localhost:5432/ex2bancodedados";
        String user = "postgres";
        String password = "1508";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sql = "INSERT INTO ALUNO (nome, idade) VALUES "
                    + "('Rafael', 21), "
                    + "('Alexandre', 19), "
                    + "('Gabriel', 18), "
                    + "('Marcelo', 20), "
                    + "('Ravi', 22), "
                    + "('Bizo', 24), "
                    + "('Josue', 17)";

            statement.executeUpdate(sql);
            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir os dados.");
            e.printStackTrace();
        }
    }

    public static void RemoveAlunoID5() {
        String url = "jdbc:postgresql://localhost:5432/ex2bancodedados";
        String user = "postgres";
        String password = "1508";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sql = "DELETE FROM ALUNO WHERE pessoa_id = 5";

            statement.executeUpdate(sql);
            System.out.println("Aluno removido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao remover aluno.");
            e.printStackTrace();
        }
    }
    
    public static void DeletaTabelaAlunos() {
        String url = "jdbc:postgresql://localhost:5432/ex2bancodedados";
        String user = "postgres";
        String password = "1508";

        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {

            String sql = "DROP TABLE ALUNO";

            statement.executeUpdate(sql);
            System.out.println("Tabela Apagada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao Apagar tabela	.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        //CriaBD();                  // Criar o banco de dados
        //CriaTabelaPessoa();         // Criar a tabela ALUNO
        //InsereDadosNaTabelaAluno(); // Inserir dados na tabela ALUNO
    	//RemoveAlunoID5();			  // Remove o aluno de ID 5
    	//DeletaTabelaAlunos();  	  // Dropa a tabela alunos
    }
}
