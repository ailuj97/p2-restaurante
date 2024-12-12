package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ScreenMesas extends JFrame{
    public ScreenMesas() {

        setVisible(true);
        setSize(800, 500);
        setTitle("Mesas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(null);

        JLabel mesasDoRestaurante = new JLabel("Mesas");
        mesasDoRestaurante.setBounds(310, 170, 400, 100);
        mesasDoRestaurante.setFont(new Font("Times New Roman", Font.BOLD, 50));
        add(mesasDoRestaurante);

        JButton fecharRestaurante = new JButton("Fechar Todos os pedidos");
        fecharRestaurante.setBounds(260, 271, 240, 20);
        fecharRestaurante.setFont(new Font("Times New Roman", Font.BOLD, 15));
        fecharRestaurante.setForeground(new Color(0, 0, 0));
        fecharRestaurante .setBackground(Color.WHITE);

        fecharRestaurante.addActionListener(this::zerarMesas);

        add(fecharRestaurante);

        JButton voltar = new JButton("Voltar");
        voltar.setBounds(0,0,65,24);
        voltar.setFont(new Font("Times New Roman", Font.BOLD, 15));
        voltar.setForeground(new Color(0, 0, 0));
        voltar.setBackground(Color.WHITE);

        JButton mesaUm = new JButton("Mesa 1");
        mesaUm.setBounds(25, 25, 100, 100);
        mesaUm.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaUm.setForeground(new Color(0, 0, 0));
        mesaUm.setBackground(Color.WHITE);

        add(mesaUm);

        mesaUm.addActionListener(this::mesaIndividual);

        JButton mesaDois = new JButton("Mesa 2");
        mesaDois.setBounds(650, 25, 100, 100);
        mesaDois.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaDois.setForeground(new Color(0, 0, 0));
        mesaDois.setBackground(Color.WHITE);

        add(mesaDois);

        mesaDois.addActionListener(this::mesaIndividual);

        JButton mesaTres = new JButton("Mesa 3");
        mesaTres.setBounds(650, 340, 100, 100);
        mesaTres.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaTres.setForeground(new Color(0, 0, 0));
        mesaTres.setBackground(Color.WHITE);

        add(mesaTres);

        mesaTres.addActionListener(this::mesaIndividual);

        JButton mesaQuatro = new JButton("Mesa 4");
        mesaQuatro.setBounds(25, 340, 100, 100);
        mesaQuatro.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaQuatro.setForeground(new Color(0, 0, 0));
        mesaQuatro.setBackground(Color.WHITE);

        add(mesaQuatro);

        mesaQuatro.addActionListener(this::mesaIndividual);

        JButton mesaCinco = new JButton("Mesa 5");
        mesaCinco.setBounds(25, 180, 100, 100);
        mesaCinco.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaCinco.setForeground(new Color(0, 0, 0));
        mesaCinco.setBackground(Color.WHITE);

        add(mesaCinco);

        mesaCinco.addActionListener(this::mesaIndividual);

        JButton mesaSeis = new JButton("Mesa 6");
        mesaSeis.setBounds(650, 180, 100, 100);
        mesaSeis.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaSeis.setForeground(new Color(0, 0, 0));
        mesaSeis.setBackground(Color.WHITE);

        add(mesaSeis);

        mesaSeis.addActionListener(this::mesaIndividual);

        JButton mesaSete = new JButton("Mesa 7");
        mesaSete.setBounds(230, 25, 100, 100);
        mesaSete.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaSete.setForeground(new Color(0, 0, 0));
        mesaSete.setBackground(Color.WHITE);

        add(mesaSete);

        mesaSete.addActionListener(this::mesaIndividual);

        JButton mesaOito = new JButton("Mesa 8");
        mesaOito.setBounds(440, 25, 100, 100);
        mesaOito.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaOito.setForeground(new Color(0, 0, 0));
        mesaOito.setBackground(Color.WHITE);

        add(mesaOito);

        mesaOito.addActionListener(this::mesaIndividual);

        JButton mesaNove = new JButton("Mesa 9");
        mesaNove.setBounds(230, 340, 100, 100);
        mesaNove.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaNove.setForeground(new Color(0, 0, 0));
        mesaNove.setBackground(Color.WHITE);

        add(mesaNove);

        mesaNove.addActionListener(this::mesaIndividual);

        JButton mesaDez = new JButton("Mesa 10");
        mesaDez.setBounds(440, 340, 100, 100);
        mesaDez.setFont(new Font("Times New Roman", Font.BOLD, 15));
        mesaDez.setForeground(new Color(0, 0, 0));
        mesaDez.setBackground(Color.WHITE);

        add(mesaDez);


        mesaDez.addActionListener(this::mesaIndividual);



        voltar.addActionListener(this:: voltar);

        add(voltar);


    }

    public void actionPerformed(ActionEvent e) {

    }

    private void voltar(ActionEvent actionEvent) {
        new ScreenMenu();
        dispose();
    }

    private void mesaIndividual(ActionEvent actionEvent) {
        new ScreenMesaIndividual();
        dispose();
    }

    private void zerarMesas(ActionEvent actionEvent) {
        //AQUI VAI O CÓDIGO QUE FECHA TODAS AS MESAS
    }




}
