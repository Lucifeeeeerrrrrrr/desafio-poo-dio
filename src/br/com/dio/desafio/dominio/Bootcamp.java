package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();  // Data de início do bootcamp (data atual)
    private final LocalDate dataFinal = dataInicial.plusDays(45);  // Data de término (45 dias após o início)
    private final Set<Dev> devsInscritos = new HashSet<>();  // Conjunto de desenvolvedores inscritos
    private final Set<Conteudo> conteudos = new LinkedHashSet<>();  // Conjunto de conteúdos do bootcamp

    // --- MÉTODOS GET/SET ---

    /**
     * Retorna o nome do bootcamp.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do bootcamp.
     * @param nome nome a ser atribuído
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna a descrição do bootcamp.
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Define a descrição do bootcamp.
     * @param descricao texto descritivo
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Retorna a data inicial (fixada na criação do objeto).
     */
    public LocalDate getDataInicial() {
        return dataInicial;
    }

    /**
     * Retorna a data final (45 dias após a inicial).
     */
    public LocalDate getDataFinal() {
        return dataFinal;
    }

    /**
     * Retorna o conjunto de desenvolvedores inscritos no bootcamp.
     */
    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    /**
     * Retorna o conjunto de conteúdos oferecidos no bootcamp.
     */
    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    // --- MÉTODOS DE COMPARAÇÃO ---

    /**
     * Compara dois objetos Bootcamp verificando se possuem
     * o mesmo nome e descrição.
     * @param o objeto a ser comparado
     * @return true se forem iguais, false caso contrário
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp)) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome)
                && Objects.equals(descricao, bootcamp.descricao);
    }

    /**
     * Gera o código hash baseado no nome e descrição.
     * Necessário para uso em coleções como HashSet/HashMap.
     */
    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao);
    }
}
