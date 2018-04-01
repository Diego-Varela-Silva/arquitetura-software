package model;

public class Pais {
    private String nome;
    private String sigla;
    private int tamanhoTelefone;

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
    
    @Override
    public String toString() {
        return getNome() + "(" + this.getSigla() + ")\n";
    }
    
}
