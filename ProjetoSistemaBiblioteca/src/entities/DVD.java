package entities;

public class DVD extends Item {
    private String genero;
    private int duracao;

    public DVD(String titulo, String autor, String genero, int duracao) {
        super(titulo, autor);
        this.genero = genero;
        this.duracao = duracao;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
