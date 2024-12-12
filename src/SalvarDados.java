package metodos;
import entidades.Mesa;
import java.io.*;

public class SalvarDados {
    public static void salvarMesas(Mesa[] mesas) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("mesas.txt"))) {
            for (Mesa mesa : mesas) {
                if(mesa.getPreco() != 0.0){
                    mesa.setPreco(mesa.getPreco() + mesa.getPreco());
                }
                writer.write(mesa.getNumero() + ";" + mesa.getPedidos() + ";" + mesa.getPreco() + ";" + mesa.getDisponibilidade());
                writer.newLine();
            }
        }
    }

    public static Mesa[] carregarMesas() throws IOException {
        File file = new File("mesas.txt");
        Mesa[] mesas = new Mesa[10];
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String linha;
                int i = 0;
                while ((linha = reader.readLine()) != null) {
                    String[] partes = linha.split(";");
                    int numero = Integer.parseInt(partes[0]);
                    String pedidos = partes[1];
                    double preco = Double.parseDouble(partes[2]);
                    boolean disponibilidade = Boolean.parseBoolean(partes[3]);
                    mesas[i++] = new Mesa(disponibilidade, pedidos, numero, preco);
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
                mesas[i] = new Mesa(true, "Nenhum", i + 1, 0.0);
            }
        }
        return mesas;
    }
}