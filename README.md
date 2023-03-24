# ProjetoSistemaBiblioteca

Esse projeto foi feito para a disciplina POO02, no terceiro período de Sistemas para Internet - Campus Uberlândia Centro.

Implemente um sistema de gerenciamento de uma biblioteca.

O sistema será composto por várias classes que usam a herança para organizar os dados da biblioteca. 

A seguir temos como as classes serão estruturadas:

Classe Item: é uma superclasse para outras classes que representam diferentes tipos de itens de biblioteca, como livros, revistas e DVDs. A classe Item inclui os atributos título, autor e se está disponível ou não.
Classe Livro: é uma subclasse de Item. Contém informações sobre cada livro da biblioteca, como título, autor, ano de publicação, número de páginas e editora.
Classe Revista: é uma subclasse de Item que representa revistas na biblioteca. Ela inclui informações como número da edição e editora.
Classe DVD: é uma subclasse de Item que representa DVDs na biblioteca. Ela inclui informações como o gênero e a duração.
Classe Usuario: os usuários são definidos com nome, email e endereço, além de uma lista de itens emprestados. A classe tem métodos para emprestar e devolver itens. O método emprestar acrescenta um item na lista de itens emprestados. O método devolver retirar o item da lista de itens emprestados.
Deve-se utilizar encapsulamento, logo os métodos getters e setters são definidos para cada atributo em todas as classes.

No main, crie 3 usuários, onde cada um desses usuários realize três empréstimos (um livro, uma revista e um DVD) e registre duas devoluções para cada usuário.
Mostre os títulos dos itens emprestados dos usuários a cada empréstimo/devolução.
