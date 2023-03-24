package entities;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private String endereco;
    private ArrayList<Item> itensEmprestados;

    public Usuario(String nome, String email, String endereco) {
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.itensEmprestados = new ArrayList<Item>();
    }

   

    public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public ArrayList<Item> getItensEmprestados() {
		return itensEmprestados;
	}



	public void setItensEmprestados(ArrayList<Item> itensEmprestados) {
		this.itensEmprestados = itensEmprestados;
	}



	public void emprestarItem(Item item) {
        // Verifica se o item está disponível
        if (!item.isDisponivel()) {
            System.out.println("O item não está disponível para empréstimo.");
            return;
        }

        // Adiciona o item na lista de itens emprestados
        itensEmprestados.add(item);
        // Define o item como indisponível
        item.setDisponivel(false);
        System.out.println("Item " + item.getTitulo() + " emprestado para " + nome);
    }

    public void removerItem(Item item) {
        // Verifica se o item está na lista de itens emprestados
        if (!itensEmprestados.contains(item)) {
            System.out.println("O item não está na lista de itens emprestados.");
            return;
        }

        // Remove o item da lista de itens emprestados
        itensEmprestados.remove(item);
        // Define o item como disponível
        item.setDisponivel(true);
        System.out.println("Item " + item.getTitulo() + " devolvido por " + nome);
    }
}
