package entidades;

public class Mesa {

    private Boolean disponibilidade;
    private String pedidos;
    private int numero;
    private double preco;

    public Mesa(Boolean disponibilidade, String pedidos, int numero, double preco) {
        this.disponibilidade = disponibilidade;
        this.pedidos = pedidos;
        this.numero = numero;
        this.preco = preco;
    }

    public Boolean getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(Boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public String getPedidos() {
        return pedidos;
    }

    public void setPedidos(String pedidos) {
        this.pedidos = pedidos;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Função para mostrar as informações da mesa
    public void mostrarMesa() {
        System.out.println("Número da mesa: " + numero + ", disponibilidade: " + disponibilidade + ", pedidos: " + pedidos + ", preco: " + preco);
    }
}
