package Registro;

import Dados.Livro;

public class Livraria {

	private Livro[] livros;
	private int quantidade;

	public Livraria(int capacidade) {
		livros = new Livro[capacidade];
		quantidade = 0;
	}

	public boolean adicionarLivro(Livro livro) {
		if (quantidade < livros.length) {
			livros[quantidade] = livro;
			quantidade++;
			return true;
		} else {
			System.out.println("Capacidade máxima atingida!");
			return false;
		}
	}

	public void listarLivros() {
		if (quantidade == 0) {
			System.out.println("Nenhum livro cadastrado.");
		} else {
			for (int i = 0; i < quantidade; i++) {
				System.out.println(livros[i]);
			}
		}
	}


	public void ordenarPorTitulo() {
		for (int i = 0; i < quantidade - 1; i++) {
			for (int j = 0; j < quantidade - 1 - i; j++) {
				if (livros[j].getTitulo().compareToIgnoreCase(livros[j + 1].getTitulo()) > 0) {

					Livro temp = livros[j];
					livros[j] = livros[j + 1];
					livros[j + 1] = temp;
				}
			}
		}
	}


	public void ordenarPorAutor() {
		for (int i = 0; i < quantidade - 1; i++) {
			for (int j = 0; j < quantidade - 1 - i; j++) {
				if (livros[j].getAutor().compareToIgnoreCase(livros[j + 1].getAutor()) > 0) {

					Livro temp = livros[j];
					livros[j] = livros[j + 1];
					livros[j + 1] = temp;
				}
			}
		}
	}


	public void ordenarPorAno() {
		for (int i = 0; i < quantidade - 1; i++) {
			for (int j = 0; j < quantidade - 1 - i; j++) {
				if (livros[j].getAnoPublicacao() > livros[j + 1].getAnoPublicacao()) {

					Livro temp = livros[j];
					livros[j] = livros[j + 1];
					livros[j + 1] = temp;
				}
			}
		}
	}

	public Livro pesquisarPorTitulo(String titulo) {
		for (int i = 0; i < quantidade; i++) {
			if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
				return livros[i];
			}
		}
		return null;
	}

	public Livro pesquisarPorAutor(String autor) {
		for (int i = 0; i < quantidade; i++) {
			if (livros[i].getAutor().equalsIgnoreCase(autor)) {
				return livros[i];
			}
		}
		return null;
	}

	public Livro pesquisarPorAno(int anoPublicacao) {
		for (int i = 0; i < quantidade; i++) {
			if (livros[i].getAnoPublicacao() == anoPublicacao) {
				return livros[i];
			}
		}
		return null;
	}
}



