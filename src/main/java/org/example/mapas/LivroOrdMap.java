package org.example.mapas;

import java.util.Objects;

public class LivroOrdMap {

    private String nomeAutor;
    private Integer numPaginas;

    public LivroOrdMap() {
    }

    public LivroOrdMap(String nomeAutor, Integer numPaginas) {
        this.nomeAutor = nomeAutor;
        this.numPaginas = numPaginas;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LivroOrdMap livro = (LivroOrdMap) o;
        return Objects.equals(nomeAutor, livro.nomeAutor) && Objects.equals(numPaginas, livro.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeAutor, numPaginas);
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return
                "Autor = " + nomeAutor +
                " num Paginas = " + numPaginas +
                '.';
    }
}
