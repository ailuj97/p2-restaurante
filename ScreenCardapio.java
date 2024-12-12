package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ScreenCardapio extends JFrame {
    public ScreenCardapio() {

        setVisible(true);
        setSize(800, 500);
        setTitle("Cardápio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(null);


        JButton voltar = new JButton("voltar");
        voltar.setBounds(0,0,65,24);
        voltar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        voltar.setForeground(new Color(0, 0, 0));
        voltar.setBackground(Color.WHITE);

        voltar.addActionListener(this:: voltar);

        add(voltar);

    }
    private void voltar(ActionEvent actionEvent) {
        new ScreenMenu();
        dispose();
    }
    }


