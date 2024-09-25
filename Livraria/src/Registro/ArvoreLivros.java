package Registro;

import Dados.Livro;

public class ArvoreLivros {
    private class Node {
        Livro livro;
        Node esquerda, direita;

        public Node(Livro livro) {
            this.livro = livro;
            esquerda = direita = null;
        }
    }

    private Node raiz;

    public ArvoreLivros() {
        raiz = null;
    }

    public void adicionarLivro(Livro livro) {
        raiz = adicionarRecursivo(raiz, livro);
    }

    private Node adicionarRecursivo(Node atual, Livro livro) {
        if (atual == null) {
            return new Node(livro);
        }

        if (livro.getTitulo().compareToIgnoreCase(atual.livro.getTitulo()) < 0) {
            atual.esquerda = adicionarRecursivo(atual.esquerda, livro);
        } else if (livro.getTitulo().compareToIgnoreCase(atual.livro.getTitulo()) > 0) {
            atual.direita = adicionarRecursivo(atual.direita, livro);
        }

        return atual;
    }

    public void listarLivros() {
        if (raiz == null) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            listarLivrosRecursivo(raiz);
        }
    }

    private void listarLivrosRecursivo(Node atual) {
        if (atual != null) {
            listarLivrosRecursivo(atual.esquerda);
            System.out.println(atual.livro);
            listarLivrosRecursivo(atual.direita);
        }
    }

    public Livro pesquisarPorTitulo(String titulo) {
        return pesquisarTituloRecursivo(raiz, titulo);
    }

    private Livro pesquisarTituloRecursivo(Node atual, String titulo) {
        if (atual == null) {
            return null;
        }

        if (titulo.equalsIgnoreCase(atual.livro.getTitulo())) {
            return atual.livro;
        }

        if (titulo.compareToIgnoreCase(atual.livro.getTitulo()) < 0) {
            return pesquisarTituloRecursivo(atual.esquerda, titulo);
        } else {
            return pesquisarTituloRecursivo(atual.direita, titulo);
        }
    }

    public Livro pesquisarPorAutor(String autor) {
        return pesquisarAutorRecursivo(raiz, autor);
    }

    private Livro pesquisarAutorRecursivo(Node atual, String autor) {
        if (atual == null) {
            return null;
        }

        if (autor.equalsIgnoreCase(atual.livro.getAutor())) {
            return atual.livro;
        }

        Livro encontrado = pesquisarAutorRecursivo(atual.esquerda, autor);
        if (encontrado == null) {
            encontrado = pesquisarAutorRecursivo(atual.direita, autor);
        }

        return encontrado;
    }

    public Livro pesquisarPorAno(int anoPublicacao) {
        return pesquisarAnoRecursivo(raiz, anoPublicacao);
    }

    private Livro pesquisarAnoRecursivo(Node atual, int anoPublicacao) {
        if (atual == null) {
            return null;
        }

        if (atual.livro.getAnoPublicacao() == anoPublicacao) {
            return atual.livro;
        }

        Livro encontrado = pesquisarAnoRecursivo(atual.esquerda, anoPublicacao);
        if (encontrado == null) {
            encontrado = pesquisarAnoRecursivo(atual.direita, anoPublicacao);
        }

        return encontrado;
    }

    public void recomendarPorAutor(String autor) {
        System.out.println("Recomendações de livros do autor " + autor + ":");
        recomendarAutorRecursivamente(raiz, autor);
    }

    private void recomendarAutorRecursivamente(Node atual, String autor) {
        if (atual != null) {
            recomendarAutorRecursivamente(atual.esquerda, autor);
            if (atual.livro.getAutor().equalsIgnoreCase(autor)) {
                System.out.println(atual.livro);
            }
            recomendarAutorRecursivamente(atual.direita, autor);
        }
    }

  
    public void recomendarPorTema(String tema) {
        System.out.println("Recomendações de livros com o tema " + tema + ":");
        recomendarTemaRecursivamente(raiz, tema);
    }

    private void recomendarTemaRecursivamente(Node atual, String tema) {
        if (atual != null) {
            recomendarTemaRecursivamente(atual.esquerda, tema);
            if (atual.livro.getTema().equalsIgnoreCase(tema)) {
                System.out.println(atual.livro);
            }
            recomendarTemaRecursivamente(atual.direita, tema);
        }
    }
}