package model;

public class Cliente {
    private String nome;
    private String telefone;
    private double limiteCredito;
    private int idade;
    private Pais pais;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if (nome.length() < 5) {
            throw new Exception("Nome muito curto!");
        }
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) throws Exception {
        if (pais.getNome() == null || pais.getNome().equals("")) {
            throw new Exception("Pais nao pode ficar em branco!");
        }
        this.pais = pais;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        if (getIdade() < 18) {
            setLimiteCredito(100);
        } else if (getIdade() <= 35) {
            setLimiteCredito(300);
        } else {
            setLimiteCredito(500);
        }

        if (getPais().getNome().equalsIgnoreCase("Brasil") ) {
            setLimiteCredito(getLimiteCredito() + 100);
        }
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    private void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        
        if (object == null)
            return false;
        
        if (getClass() != object.getClass())
            return false;
        
        if (!nome.equals(((Cliente)object).nome))
            return false;
        
        return true;
    }

    @Override
    public String toString() {
        return getNome() + ", " + getTelefone() + ", " + getIdade()
                + ", " + getLimiteCredito() + ", " + getPais();
    }
    
    
}
