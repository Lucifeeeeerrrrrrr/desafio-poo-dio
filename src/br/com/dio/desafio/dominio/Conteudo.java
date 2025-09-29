package br.com.dio.desafio.dominio;

public abstract class Conteudo {

    // Constante que define o valor padrão de experiência (XP)
    protected static final double XP_PADRAO = 10.0;

    // Título do conteúdo (ex.: nome de um curso, artigo, etc.)
    private String titulo;

    // Descrição do conteúdo (ex.: resumo ou detalhes adicionais)
    private String descricao;

    /**
     * Método abstrato que deve ser implementado nas subclasses.
     * Calcula a quantidade de experiência (XP) associada ao conteúdo.
     *
     * @return valor de experiência (double)
     */
    public abstract double calcularXp();

    /**
     * Retorna o título do conteúdo.
     *
     * @return título em formato String
     */
    public String getTitulo() { 
        return titulo; 
    }

    /**
     * Define o título do conteúdo.
     *
     * @param titulo texto que será atribuído como título
     */
    public void setTitulo(String titulo) { 
        this.titulo = titulo; 
    }

    /**
     * Retorna a descrição do conteúdo.
     *
     * @return descrição em formato String
     */
    public String getDescricao() { 
        return descricao; 
    }

    /**
     * Define a descrição do conteúdo.
     *
     * @param descricao texto que será atribuído como descrição
     */
    public void setDescricao(String descricao) { 
        this.descricao = descricao; 
    }
}
