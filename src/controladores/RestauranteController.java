package controladores;
import entidades.Comida;
import entidades.Mesa;
import metodos.SalvarDados;
import java.io.IOException;

public class RestauranteController {
    private Comida[] comidas;
    private Mesa[] mesas;

    public RestauranteController() {
        inicializarComidas();
        carregarMesas();
    }

    private void inicializarComidas() {
        comidas = new Comida[]{
            new Comida(25.50, "Pizza"),
            new Comida(15.75, "Hambúrguer"),
            new Comida(12.00, "Batata Frita"),
            new Comida(20.00, "Balde de Frango"),
            new Comida(18.25, "Pizza doce"),
            new Comida(5.00, "Coca-Cola"),
            new Comida(6.50, "Suco de Laranja"),
            new Comida(2.00, "Água Mineral")
        };
    }

    private void carregarMesas() {
        try {
            mesas = SalvarDados.carregarMesas();
        } catch (IOException e) {
            System.out.println("Erro ao carregar as mesas: " + e.getMessage());
            mesas = new Mesa[10];
            for (int i = 0; i < mesas.length; i++) {
                mesas[i] = new Mesa(true, "Nenhum", i + 1, 0.0);
            }
        }
    }

    public void visualizarMesas() {
        for (Mesa mesa : mesas) {
            mesa.mostrarMesa();
        }
    }

    public void visualizarComidas() {
        for (Comida comida : comidas) {
            comida.mostrarComida();
        }
    }

    public void adicionarComidaMesa(int numMesa, int numComida) {
        int mesaIndex = numMesa - 1;
        int comidaIndex = numComida -1 ;

        for (Comida comida : comidas) {
            if (comida == comidas[comidaIndex]) {
                String pedidosAtuais = mesas[mesaIndex].getPedidos();
                if (pedidosAtuais.equals("Nenhum")) {
                    pedidosAtuais = comida.getNome();
                } else {
                    pedidosAtuais += ", " + comida.getNome();
                }
                mesas[mesaIndex].setPedidos(pedidosAtuais);

                double precoAtual = mesas[mesaIndex].getPreco();
                mesas[mesaIndex].setPreco(precoAtual + comida.getPreco());
                mesas[mesaIndex].setDisponibilidade(false);
                break;
            }
        }
    }

    public void visualizarMesaEspecifica(int num) {
        int mesaIndex = num - 1;
        mesas[mesaIndex].mostrarMesa();
        
    }

    public double visualizarContaMesa(int num) {
        int mesaIndex = num -1;
        return mesas[mesaIndex].getPreco();
    }

    public void zerarPedidosTodasMesas() {
        for (Mesa mesa : mesas) {
            mesa.setPedidos("Nenhum");
            mesa.setPreco(0.0);
        }
        salvarMesas();
    }

    public void zerarPedidosMesa(int num) {
        int mesaIndex = num - 1;

        mesas[mesaIndex].setPedidos("Nenhum");
        mesas[mesaIndex].setPreco(0.0);
        salvarMesas();
    }

    public void salvarMesas() {
        try {
            SalvarDados.salvarMesas(mesas);
            System.out.println("Dados salvos com sucesso.");
        } catch (IOException e) {
            System.out.println("Erro ao salvar os dados: " + e.getMessage());
        }
    }
}
