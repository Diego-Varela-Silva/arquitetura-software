package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {

    private static Connection conexao = null;

    static {
        try {
            conexao = DriverManager
                    .getConnection(
                            "jdbc:postgresql://localhost:5432/arquitetura-software",
                            "arquitetura-software",
                            "arquitetura-software");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PreparedStatement getPreparedStatement(String sql) throws SQLException {
        return conexao.prepareStatement(sql);
    }

    static void closeConnection() throws SQLException {
        conexao.close();
    }
}

