package connection;

import java.sql.SQLException;

public class Migrate {
    public static void main(String[] args) throws SQLException {
        System.out.println("Criando tabela paises");

        Conexao.getPreparedStatement("CREATE TABLE paises (\n" +
                "  id INTEGER,\n" +
                "  nome VARCHAR,\n" +
                "  sigla VARCHAR,\n" +
                "  tamanhoTelefone INTEGER,\n" +
                "  PRIMARY KEY (id)\n" +
                ");").executeUpdate();

        System.out.println("Criando tabela clientes");
        Conexao.getPreparedStatement("CREATE TABLE clientes (\n" +
                "  id INTEGER,\n" +
                "  nome VARCHAR,\n" +
                "  telefone VARCHAR,\n" +
                "  limite_credito NUMERIC,\n" +
                "  idade INTEGER,\n" +
                "  pais_id INTEGER,\n" +
                "  PRIMARY KEY (id)\n" +
                ");").executeUpdate();
    }
}
