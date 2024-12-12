import entidades.Comida;
import entidades.Mesa;
import java.util.Scanner;


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
            mesas [i] = new Mesa(true,"Nenhum", i + 1, 0.0);
        }


        // fazer preço
        System.out.println("-----Menu-----");
        System.out.println("1 - Visualizar Mesas");
        System.out.println("2 - Visualizar Comidas");
        System.out.println("3 - Adcionar comida à mesa");
        System.out.println("4 - Mesas ocupadas");
        System.out.println("5 - Visualizar mesa específica");
        System.out.println("6 - Alterar mesa específica"); // Ocupar mesa, Colocar comida
        System.out.print("Digite sua opção aqui: ");


        int entradaMenu = sc.nextInt();

        if (entradaMenu == 1) {
            for(Mesa mesa : mesas) {
            mesa.mostrarMesa();
             }
        }

        System.out.println("Deseja ocupar alguma mesa? (1-sim, 2-não)");
        int ocuparmesa = sc.nextInt();
        if (ocuparmesa == 1) {
            System.out.print("Qual mesa deseja ocupar? ");
            int num = sc.nextInt();
            mesas[num].setDisponibilidade(false);
        }

        }

    }
