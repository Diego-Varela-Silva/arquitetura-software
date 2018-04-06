package model;

public class Pais {
    private String nome;
    private String sigla;
    private int tamanhoTelefone;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public int getTamanhoTelefone() {
        return tamanhoTelefone;
    }

    public void setTamanhoTelefone(int tamanhoTelefone) {
        this.tamanhoTelefone = tamanhoTelefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pais(int id, String nome, String sigla, int tamanhoTelefone) {
        this();
        this.nome = nome;
        this.sigla = sigla;
        this.tamanhoTelefone = tamanhoTelefone;
        this.id = id;
    }

    public Pais() { }

    @Override
    public String toString() {
        return getNome() + "(" + this.getSigla() + ")\n";
    }
    
}
