package br.com.cod3r.exerciciossb.Model;

public class Cliente {

    private int id;
    private String nome;
    private String cpf;

    public Cliente(int id, String nome, String cpf) {
        super();
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }


}
