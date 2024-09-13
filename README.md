# Sistema de Livraria

Este projeto implementa um sistema simples de livraria em Java, utilizando uma lista sequencial para armazenar os livros e o algoritmo de ordenação Bubble Sort para organizar os livros com base no título, autor ou ano de publicação.

## Estrutura de Dados e Algoritmo de Ordenação

O sistema de livraria utiliza uma **lista sequencial**, implementada como um array estático para armazenar os livros. A escolha dessa estrutura de dados se deve à sua simplicidade e eficiência no acesso direto aos elementos, ideal para um número limitado de itens. O array facilita a organização dos livros e permite controle fácil do número de elementos.

O algoritmo de ordenação implementado é o **Bubble Sort**, escolhido pela sua simplicidade e fácil implementação. Embora tenha uma complexidade de **O(n²)**, é adequado para conjuntos pequenos de dados, como neste sistema. O Bubble Sort também é um algoritmo estável, preservando a ordem relativa dos livros com critérios iguais, garantindo uma ordenação clara e eficiente dentro da proposta do sistema.
