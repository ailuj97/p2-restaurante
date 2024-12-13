package interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ScreenMenu extends JFrame {
    public ScreenMenu() {
        setVisible(true);
        setSize(800, 500);
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(null);

        JButton botaomesas = new JButton("Mesas");
        botaomesas.setBounds(270, 200, 200, 20);
        botaomesas.setFont(new Font("Times New Roman", Font.BOLD, 20));
        botaomesas.setForeground(new Color(0, 0, 0));
        botaomesas.setBackground(Color.WHITE);

        botaomesas.addActionListener(this::mapa);

        JButton botaocardapio = new JButton("Cardápio");
        botaocardapio.setBounds(270, 230, 200, 20);
        botaocardapio.setFont(new Font("Times New Roman", Font.BOLD, 20));
        botaocardapio.setForeground(new Color(0, 0, 0));
        botaocardapio.setBackground(Color.WHITE);

        botaocardapio.addActionListener(this::cardapio);

        JButton criadores = new JButton("Criadores");
        criadores.setBounds(270, 260, 200, 20);
        criadores.setFont(new Font("Times New Roman", Font.BOLD, 20));
        criadores.setForeground(new Color(0, 0, 0));
        criadores.setBackground(Color.WHITE);
        criadores.addActionListener(this::criadoresDoPrograma);

        add(criadores);
        add(botaomesas);
        add(botaocardapio);

        JLabel titulo = new JLabel("Restaurante");
        titulo.setBounds(240, 50, 400, 100);
        titulo.setFont(new Font("Times New Roman", Font.BOLD, 50));
        add(titulo);
    }

    private void mapa(ActionEvent actionEvent) {
        new ScreenMesas();
        dispose();
    }

    private void cardapio(ActionEvent actionEvent) {
        new ScreenCardapio();
        dispose();
    }

    public void criadoresDoPrograma(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Criadores\n" +
                "Glauco Siqueira\n" +
                "Ana Julia\n" +
                "Pedro Vinicius\n");
    }
}
