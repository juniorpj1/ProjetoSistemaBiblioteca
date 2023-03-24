package program;
import entities.Usuario;
import entities.DVD;
import entities.Livro;
import entities.Revista;
import entities.Item;

public class BibliotecaMain {

    public static void main(String[] args) {
        
        Usuario usuario1 = new Usuario("João", "joao@gmail.com", "Rua A, 123");
        Usuario usuario2 = new Usuario("Maria", "maria@gmail.com", "Rua B, 456");
        Usuario usuario3 = new Usuario("Pedro", "pedro@gmail.com", "Rua C, 789");
       
        Livro livro1 = new Livro("Livro 1", "Autor 1", 2000, 300, "Editora A");
        Revista revista1 = new Revista("Revista01","Autora02",125,"Editora01");
        DVD dvd1 = new DVD("DVD 1", "Autor1", "Ação", 120);
        usuario1.emprestarItem(livro1);
        usuario1.emprestarItem(revista1);
        usuario1.emprestarItem(dvd1);
        
        Livro livro2 = new Livro("Livro 2", "Autor 2", 2005, 250, "Editora C");
        Revista revista2 = new Revista("Revista02","Autora03",125,"Editora03");
        DVD dvd2 = new DVD("DVD 2", "Autor05", "Suspense", 160);
        usuario2.emprestarItem(livro2);
        usuario2.emprestarItem(revista2);
        usuario2.emprestarItem(dvd2);
        
        Livro livro3 = new Livro("Livro 3", "Autor 3", 2010, 400, "Editora D");
        Revista revista3 = new Revista("Revista06","Autora13",100,"Editora08");
        DVD dvd3 = new DVD("DVD 03", "Autor06", "Terror", 190);
        usuario3.emprestarItem(livro3);
        usuario3.emprestarItem(revista3);
        usuario3.emprestarItem(dvd3);
   
        usuario1.removerItem(livro1);
        usuario1.removerItem(dvd1);
        
        usuario2.removerItem(revista2);
        usuario2.removerItem(dvd2);
        
        usuario3.removerItem(livro3);
        usuario3.removerItem(revista3);
      
        System.out.println("Empréstimos do usuário 1:");
        for(Item item : usuario1.getItensEmprestados()) {
            System.out.println(item.getTitulo());
        }
        
        System.out.println("Empréstimos do usuário 2:");
        for(Item item : usuario2.getItensEmprestados()) {
            System.out.println(item.getTitulo());
        }
        
        System.out.println("Empréstimos do usuário 3:");
        for(Item item : usuario3.getItensEmprestados()) {
            System.out.println(item.getTitulo());
        }
        
        System.out.println("Devoluções do usuário 1:");
        for(Item item : usuario1.getItensEmprestados()) {
            System.out.println(item.getTitulo());
        }
        
        System.out.println("Devoluções do usuário 2:");
        for(Item item : usuario2.getItensEmprestados()) {
            System.out.println(item.getTitulo());
        }
    }
}
