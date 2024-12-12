import entidades.Comida;
import entidades.Mesa;
import java.util.Scanner;
import java.io.*;

public class Restaurante {
    public static void main(String[] args) {
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

        Mesa[] mesas = new Mesa[10];
        for (int i = 0; i <= 9; i++) {
            mesas[i] = new Mesa(true, "Nenhum", i + 1, 0.0);
        }

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
        System.out.println("10 - Salvar os dados"); // tentar salvar com txt
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
                    int mesaAdcionarComida = sc.nextInt();
                    System.out.println("Digite o nome da comida: ");
                    sc.nextLine();
                    String comida = sc.nextLine();


                    for (Comida comidaAdcionarMesa : comidas) {
                        if (comidaAdcionarMesa.getNome().equals(comida)) {
                            mesas[mesaAdcionarComida].setPedidos(comida);
                            mesas[mesaAdcionarComida].setPreco(comidaAdcionarMesa.getPreco());
                            mesas[mesaAdcionarComida].mostrarMesa();
                        }
                    }
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
                    int mesaOcupar = sc.nextInt();
                    mesas[mesaOcupar].mostrarMesa();
                    break;

                case 6: // Ocupar mesa
                    System.out.println("Digite a mesa escolhida: ");
                    int mesaEscolha = sc.nextInt();
                    mesas[mesaEscolha].setDisponibilidade(false);
                    break;

                case 7: // Tornar todas as mesas descocupadas
                    System.out.println("Desocupando as mesas...");
                    for (Mesa mesa : mesas) {
                        mesa.setDisponibilidade(true);
                    }
                    break;

                case 8:// Zerar os pedidos de todas as mesas
                    System.out.println("Zerando todos os pedidos");
                    for (Mesa mesa : mesas) {
                        mesa.setPedidos("Nenhum");
                    }
                    break;

                case 9:
                    System.out.println("Digite a mesa escolhida: ");
                    int mesaEscolhida = sc.nextInt();
                    mesas[mesaEscolhida].setPedidos("Nenhum");
                    break;

                default:
                    System.out.println("Opção Inválida");
            }
            break;
        }
    }
}