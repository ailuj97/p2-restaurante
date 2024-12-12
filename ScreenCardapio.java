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


        JButton voltar = new JButton("<");
        voltar.setBounds(0,0,65,24);
        voltar.setFont(new Font("Times New Roman", Font.BOLD, 20));
        voltar.setForeground(new Color(0, 0, 0));
        voltar.setBackground(Color.WHITE);

        voltar.addActionListener(this:: voltar);

        add(voltar);
        JLabel cabecalhoUm = new JLabel("Refeições");
        cabecalhoUm.setBounds(30, -10, 500, 100);
        cabecalhoUm.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        add(cabecalhoUm);

        JLabel produtoUm = new JLabel("Pizza ...................................................... R$ 25,50");
        produtoUm.setBounds(30, 20, 500, 100);
        produtoUm.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoUm);

        JLabel produtoDois = new JLabel("Hambúrguer .......................................... R$ 15,75");
        produtoDois.setBounds(30, 40, 500, 100);
        produtoDois.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoDois);

        JLabel produtoTres = new JLabel("Batata Frita ............................................ R$ 12,00");
        produtoTres.setBounds(30, 60, 500, 100);
        produtoTres.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoTres);

        JLabel produtoQuatro = new JLabel("Balde de Frango .................................... R$ 20,00");
        produtoQuatro.setBounds(30, 80, 500, 100);
        produtoQuatro.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoQuatro);

        JLabel produtoCinco = new JLabel("Pizza Doce ............................................. R$ 18,25");
        produtoCinco.setBounds(30, 100, 500, 100);
        produtoCinco.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoCinco);

        JLabel cabecalhoDois = new JLabel("Bebidas");
        cabecalhoDois.setBounds(30, 140, 500, 100);
        cabecalhoDois.setFont(new Font("Times New Roman", Font.ITALIC, 30));
        add(cabecalhoDois);

        JLabel produtoSeis = new JLabel("Coca-Cola .............................................. R$ 18,25");
        produtoSeis.setBounds(30, 170, 500, 100);
        produtoSeis.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoSeis);

        JLabel produtoSete = new JLabel("Suco de Laranja ..................................... R$ 18,25");
        produtoSete.setBounds(30, 190, 500, 100);
        produtoSete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoSete);

        JLabel produtoOito = new JLabel("Água Mineral.......................................... R$ 18,25");
        produtoOito.setBounds(30, 210, 500, 100);
        produtoOito.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoOito);

    }
    private void voltar(ActionEvent actionEvent) {
        new ScreenMenu();
        dispose();
    }
    }


