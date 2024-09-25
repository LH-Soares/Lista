package Dados;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String tema; // Novo campo

    public Livro(String titulo, String autor, int anoPublicacao, String tema) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.tema = tema;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getTema() {
        return tema;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao + ", Tema: " + tema;
    }
}
