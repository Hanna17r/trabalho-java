public class Produtos {

    public void createTable() {
        Connection connection;
        try (Statement statement = BancoDeDados.connection.createStatement()) {
            statement.execute("CREATE TABLE IF NOT EXISTS Produtos (Nome VARCHAR, valor INTEGER, quantidade INTEGER) ");
            System.out.println("Tabela criada ou já existe.");
        } catch (SQLException e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }

    public void inserirProdutos(List<String[]>String Blusa;
    Blusa) {
        try (PreparedStatement insertStatement = BancoDeDados.connection.prepareStatement("INSERT INTO produtos (nome, valor, quantidade) VALUES(?, ?, ?)")) {

            insertStatement.setString(1, s[0]);
            insertStatement.setString(2, s[1]);
            insertStatement.setString(3, s[2]);
            insertStatement.executeUpdate();
        }
        BancoDeDados.connection.commit();
        System.out.println("Produto inserido.");
    } catch (SQLException e) {
        System.out.println("Erro ao inserir produto: " + e.getMessage());
    }
}

public void lerProduto(){
    try (PreparedStatement selectStatement = BancoDeDados.connection.prepareStatement("SELECT * FROM produtos WHERE nome, valor, quantidade  ")) {
        selectStatement.setString(1, nomeQuery);
        ResultSet resultSet = selectStatement.executeQuery();
        System.out.println("Produto");
        String formacao = resultSet.getString("Nome");
        String nome = resultSet.getString("Valor");
        String aula = resultSet.getString("Quantidade");
        System.out.println("Nome: " + nome + ", Valor: "+ valor + " , Quantidade: "+ quantidade);
    } catch (SQLException e) {
        System.out.println("Erro ao ler Produto: " + e.getMessage());
    }
}

public void deleteProduto(String nome) {
    try (PreparedStatement deleteStatement = BancoDeDados.connection.prepareStatement("DELETE FROM Produto WHERE nome, valor, quantidade ")) {
        deleteStatement.setString(1, produto);
        deleteStatement.executeUpdate();
        BancoDeDados.connection.commit();
        System.out.println("Produto deletado.");
    } catch (SQLException e) {
        System.out.println("Erro ao deletar produto: " + e.getMessage());
    }
}
        }