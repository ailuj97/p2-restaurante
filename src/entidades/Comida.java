package entidades;

public class Comida {
    private String nome;
    private double preco;

    public Comida(double preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void mostrarComida() {
        System.out.println("Nome: " + nome + " Preco: " + preco);
    }
}
