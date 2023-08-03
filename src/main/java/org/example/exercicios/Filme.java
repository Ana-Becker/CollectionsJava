package org.example.exercicios;

import java.util.Objects;

public class Filme implements Comparable<Filme>{

    private String nome;
    private int anoLancamento;
    private String genero;

    public Filme() {
    }

    public Filme(String nome, int anoLancamento, String genero) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return
                 nome + ", " + anoLancamento + ", " + genero + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Filme filme = (Filme) o;
        return anoLancamento == filme.anoLancamento && Objects.equals(nome, filme.nome) && Objects.equals(genero, filme.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoLancamento, genero);
    }


    @Override
    public int compareTo(Filme o) {
        return this.getNome().compareToIgnoreCase(o.getNome());
    }
}
