package dao;

import connection.Conexao;
import model.Pais;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static connection.Conexao.getPreparedStatement;


public class PaisDAO {
    public void criar(Pais pais) throws Exception {
        PreparedStatement ps = getPreparedStatement("INSERT INTO paises VALUES ?, ?, ?;");
        ps.setString(1, pais.getNome());
        ps.setString(2, pais.getSigla());
        ps.setInt(3, pais.getTamanhoTelefone());
        ps.executeUpdate();
    }

    public void alterar(Pais pais, int id) throws Exception {
        PreparedStatement ps = getPreparedStatement("UPDATE paises SET nome = ?, sigla = ?," +
                "tamanho_telefone = ? WHERE id = ?;");
        ps.setString(1, pais.getNome());
        ps.setString(2, pais.getSigla());
        ps.setInt(3, pais.getTamanhoTelefone());
        ps.setInt(4, id);
        ps.executeUpdate();
    }

    public void excluir(int id) throws Exception {
        PreparedStatement ps = getPreparedStatement("DELETE FROM paises WHERE id = ?;");
        ps.setInt(1, id);
        ps.executeUpdate();
    }

    private Pais buildPais(ResultSet rs) throws SQLException {
        return new Pais(rs.getInt("id"), rs.getString("nome"),
                rs.getString("sigla"), rs.getInt("tamanho_telefone"));
    }

    public Pais ler(int id) {
        try {
            PreparedStatement ps = Conexao.getPreparedStatement("SELECT * FROM paises WHERE id = ?;");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            rs.next();
            return buildPais(rs);
        } catch (SQLException e) {
            e.printStackTrace();
            return new Pais();
        }
    }

    public List<Pais> ler() {
        try {
            PreparedStatement ps = Conexao.getPreparedStatement("SELECT * FROM paises;");
            ResultSet rs = ps.executeQuery();
            List<Pais> paises = new ArrayList<>();
            while (rs.next()) {
                paises.add(buildPais(rs));
            }
            return paises;
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }


}
