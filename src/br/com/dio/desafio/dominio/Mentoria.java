package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    // Data em que a mentoria será realizada
    private LocalDate data;

    /**
     * Calcula o XP (experiência) para uma mentoria.
     * Nesse caso, o valor base é o XP padrão acrescido de 20 pontos.
     *
     * @return valor de experiência da mentoria (double)
     */
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0;
    }

    // Construtor padrão
    public Mentoria() { }

    /**
     * Retorna a data da mentoria.
     *
     * @return data em formato LocalDate
     */
    public LocalDate getData() { 
        return data; 
    }

    /**
     * Define a data da mentoria.
     *
     * @param data objeto LocalDate que representa a data da mentoria
     */
    public void setData(LocalDate data) { 
        this.data = data; 
    }

    /**
     * Representação textual da mentoria, exibindo:
     * título, descrição e data.
     *
     * @return string formatada com os dados da mentoria
     */
    @Override
    public String toString() {
        return "Mentoria{" +
               "titulo='" + getTitulo() + '\'' +
               ", descricao='" + getDescricao() + '\'' +
               ", data=" + data +
               '}';
    }
}
