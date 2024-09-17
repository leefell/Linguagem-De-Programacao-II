import java.sql.*;
public class AlunoDAO {

    public void criaTabelaPessoa() {
        String sql = "CREATE TABLE IF NOT EXISTS ALUNO (" 
                   + "pessoa_Id SERIAL PRIMARY KEY, " 
                   + "nome VARCHAR(30), "
                   + "idade INTEGER)";

        try (Connection connection = BancoConexao.getConnection(); 
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
            System.out.println("Tabela ALUNO criada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela ALUNO.");
            e.printStackTrace();
        }
    }

    public void insereDadosNaTabelaAluno() {
        String sql = "INSERT INTO ALUNO (nome, idade) VALUES "
                   + "('Rafael', 21), ('Alexandre', 19), "
                   + "('Gabriel', 18), ('Marcelo', 20), "
                   + "('Ravi', 22), ('Bizo', 24), ('Josue', 17)";

        try (Connection connection = BancoConexao.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
            System.out.println("Dados inseridos com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao inserir os dados na tabela ALUNO.");
            e.printStackTrace();
        }
    }

    public void removeAlunoPorID(int id) {
        String sql = "DELETE FROM ALUNO WHERE pessoa_id = " + id;

        try (Connection connection = BancoConexao.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
            System.out.println("Aluno com ID " + id + " removido com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao remover o aluno de ID " + id);
            e.printStackTrace();
        }
    }

    public void deletaTabelaAlunos() {
        String sql = "DROP TABLE IF EXISTS ALUNO";

        try (Connection connection = BancoConexao.getConnection();
             Statement statement = connection.createStatement()) {

            statement.executeUpdate(sql);
            System.out.println("Tabela ALUNO deletada com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao deletar a tabela ALUNO.");
            e.printStackTrace();
        }
    }
}
