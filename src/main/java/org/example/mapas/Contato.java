package org.example.mapas;

public class Contato {

    private String nome;
    private int numero;

    public Contato() {
    }

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "{" +
                "nome = " + nome +
                ", numero = " + numero +
                '}';
    }
}
