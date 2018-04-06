package dao;

import connection.Conexao;
import model.Cliente;
import model.Pais;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static connection.Conexao.getPreparedStatement;

public class ClienteDAO {

    public void criar(Cliente cliente) throws Exception {
        PreparedStatement ps = getPreparedStatement("INSERT INTO clientes VALUES ?, ?, ?, ?, ?;");
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getTelefone());
        ps.setDouble(3, cliente.getLimiteCredito());
        ps.setInt(4, cliente.getIdade());
        ps.setInt(5, cliente.getPais().getId());
        ps.executeUpdate();
    }

    public void alterar(Cliente cliente, int id) throws Exception {
        PreparedStatement ps = getPreparedStatement("UPDATE clientes SET nome = ?, telefone = ?," +
                "limite_credito = ?, idade = ?, pais_id = ? WHERE id = ?;");
        ps.setString(1, cliente.getNome());
        ps.setString(2, cliente.getTelefone());
        ps.setDouble(3, cliente.getLimiteCredito());
        ps.setInt(4, cliente.getIdade());
        ps.setInt(5, cliente.getPais().getId());
        ps.setInt(6, id);
        ps.executeUpdate();
    }

    public void excluir(int id) throws Exception {
        PreparedStatement ps = getPreparedStatement("DELETE FROM clientes WHERE id = ?;");
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    private Cliente buildCliente(ResultSet rs) throws SQLException {
        PaisDAO paisDAO = new PaisDAO();
        return new Cliente(rs.getInt("id"), rs.getString("nome"),
                rs.getString("telefone"), rs.getDouble("limite_credito"),
                rs.getInt("idade"), paisDAO.ler(rs.getInt("pais_id")));
    }

    public Cliente ler(int id) {
        try {
            PreparedStatement ps = Conexao.getPreparedStatement("SELECT * FROM clientes WHERE id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return buildCliente(rs);
        } catch (SQLException e) {
            e.printStackTrace();
            return new Cliente();
        }
    }

    public List<Cliente> ler() {
        try {
            PreparedStatement ps = Conexao.getPreparedStatement("SELECT * FROM paises;");
            ResultSet rs = ps.executeQuery();
            List<Cliente> clientes = new ArrayList<>();
            while (rs.next()) {
                clientes.add(buildCliente(rs));
            }
            return clientes;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
