import entidades.Comida;
import entidades.Mesa;
import metodos.SalvarDados;
import java.util.Scanner;
import java.io.*;

public class Restaurante {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        Comida[] comidas = new Comida[8];
        comidas[0] = new Comida(25.50, "Pizza");
        comidas[1] = new Comida(15.75, "Hambúrguer");
        comidas[2] = new Comida(12.00, "Batata Frita");
        comidas[3] = new Comida(20.00, "Balde de Frango");
        comidas[4] = new Comida(18.25, "Pizza doce");
        comidas[5] = new Comida(5.00, "Coca-Cola");
        comidas[6] = new Comida(6.50, "Suco de Laranja");
        comidas[7] = new Comida(2.00, "Água Mineral");

        // Carregando as mesas
        Mesa [] mesas = SalvarDados.carregarMesas();

        /*Mesa[] mesas = new Mesa[10];
        for (int i = 0; i <= 9; i++) {
            mesas[i] = new Mesa(true, "Nenhum", i + 1, 0.0);
        }
        */

        System.out.println("-----Menu-----");
        System.out.println("1 - Visualizar Mesas");
        System.out.println("2 - Visualizar Comidas");
        System.out.println("3 - Adcionar comida à mesa");
        System.out.println("4 - Mesas ocupadas");
        System.out.println("5 - Visualizar mesa específica");
        System.out.println("6 - Ocupar mesa");
        System.out.println("7 - Tornar todas as mesas descocupadas");
        System.out.println("8 - Zerar os pedidos de todas as mesas");
        System.out.println("9 - Zerar os pedidos de uma mesa");
       // Ver se deixa ou tira  System.out.println("10 - Salvar os dados"); // tentar salvar com txt , salvar mesas e carregar mesas
        System.out.print("Digite sua opção aqui: ");


        int entradaMenu = sc.nextInt();


        while (true) {
            switch (entradaMenu) {
                case 1: // Visualizar mesas
                    for (Mesa mesa : mesas) {
                        mesa.mostrarMesa();
                    }
                    break;

                case 2: // Visualizar comidas
                    for (Comida comida : comidas) {
                        comida.mostrarComida();
                    }
                    break;

                case 3:// Adcionar comida na mesa
                    System.out.println("Digite o número da mesa: ");
                    int mesaAdcionarComida = sc.nextInt() - 1;
                    System.out.println("Digite o nome da comida: ");
                    sc.nextLine();
                    String comida = sc.nextLine();


                    String pedidosAtuais = mesas[mesaAdcionarComida].getPedidos();

                    if(pedidosAtuais.equals("Nenhum")) {
                        pedidosAtuais = comida;
                    } else {
                        pedidosAtuais += ", ";
                    } // Funcionando

                    mesas[mesaAdcionarComida].setPedidos(pedidosAtuais);

                    // Ajeitar essas linhas para calcular o preço
                    for(Comida comida1 : comidas) {
                        if(comida1.getNome().equals(comida)) {
                            double precoAtual = mesas[mesaAdcionarComida].getPreco();
                            mesas[mesaAdcionarComida].setPreco(precoAtual + comida1.getPreco());
                        }
                    }

                    /*for (Comida comidaAdcionarMesa : comidas) {
                        if (comidaAdcionarMesa.getNome().equals(comida)) {
                            mesas[mesaAdcionarComida].setPedidos(comida);
                            mesas[mesaAdcionarComida].setPreco(comidaAdcionarMesa.getPreco());
                            mesas[mesaAdcionarComida].mostrarMesa();
                        }
                    }*/

                    SalvarDados.salvarMesas(mesas);

                    break;

                case 4:// Mostrar mesas ocupadas
                    System.out.println("Mesas Ocupadas: ");

                    for (Mesa mesa : mesas) {
                        if (mesa.getDisponibilidade().equals(false)) {
                            mesa.mostrarMesa();
                        }
                    }
                    break;

                case 5:// Visualizar mesa escolhida
                    System.out.println("Digite a mesa escolhida: ");
                    int mesaEscolha = sc.nextInt() - 1;
                    mesas[mesaEscolha].mostrarMesa();
                    break;

                case 6: // Ocupar mesa
                    System.out.println("Digite a mesa escolhida: ");
                    int mesaOcupar = sc.nextInt() - 1;
                    mesas[mesaOcupar].setDisponibilidade(false);
                    SalvarDados.salvarMesas(mesas);
                    break;

                case 7: // Tornar todas as mesas descocupadas
                    System.out.println("Desocupando as mesas...");
                    for (Mesa mesa : mesas) {
                        mesa.setDisponibilidade(true);
                    }
                    SalvarDados.salvarMesas(mesas);
                    break;

                case 8:// Zerar os pedidos de todas as mesas
                    System.out.println("Zerando todos os pedidos");
                    for (Mesa mesa : mesas) {
                        mesa.setPedidos("Nenhum");
                        mesa.setPreco(0.0);
                    }
                    SalvarDados.salvarMesas(mesas);
                    break;

                case 9: // Zerar os pedidos de uma mesa
                    System.out.println("Digite a mesa escolhida: ");
                    int mesaEscolhida = sc.nextInt() - 1;
                    mesas[mesaEscolhida].setPedidos("Nenhum");
                    mesas[mesaEscolhida].setPreco(0.0);
                    SalvarDados.salvarMesas(mesas);
                    break;

                case 10:// salvar mesas em um txt
                    SalvarDados.salvarMesas(mesas);
                    System.out.println("Dados salvos, saindo.");
                    return;
                default:
                    System.out.println("Opção Inválida");
            }
            break;
        }
    }
}