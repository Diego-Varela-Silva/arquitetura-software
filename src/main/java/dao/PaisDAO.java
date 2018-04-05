package dao;

import model.Pais;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import static connection.Conexao.getPreparedStatement;


public class PaisDAO {
    public void criar(Pais pais) throws Exception {
        PreparedStatement ps = getPreparedStatement("INSERT INTO paises VALUES ?, ?, ? ");
        ps.setString(1, pais.getNome());
        ps.setString(2, pais.getSigla());
        ps.setInt(3, pais.getTamanhoTelefone());
        ps.executeUpdate();
    }

    public void alterar(Pais pais, int id) throws Exception {
        PreparedStatement ps = getPreparedStatement("UPDATE paises SET nome = ?, sigla = ?," +
                                                         "tamanho_telefone = ? WHERE id = ? ");
        ps.setString(1, pais.getNome());
        ps.setString(2, pais.getSigla());
        ps.setInt(3, pais.getTamanhoTelefone());
        ps.setInt(4, id);
        ps.executeUpdate();
    }

    public void excluir(int id) throws Exception {
//        getPaisRepository().remove(id);
    }

    public Pais ler(int id) {
//        return getPaisRepository().read(id);
        return new Pais();
    }

    public List<Pais> ler() {
//        return getPaisRepository().read();
        return new ArrayList<Pais>();
    }


}
