package Interfaces;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class ScreenMesaIndividual extends JFrame {
    public ScreenMesaIndividual() {

        setVisible(true);
        setSize(800, 500);
        setTitle("Mesa Individual");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        setLayout(null);

        JButton voltar = new JButton("<");
        voltar.setBounds(0, 0, 65, 24);
        voltar.setFont(new Font("Times New Roman", Font.BOLD, 15));
        voltar.setForeground(new Color(0, 0, 0));
        voltar.setBackground(Color.WHITE);
        voltar.addActionListener(this::voltar);

        add(voltar);

        //PRODUTOS NO CARDAPIO

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

        JLabel produtoSeis = new JLabel("Coca-Cola .............................................. R$ 5,00");
        produtoSeis.setBounds(30, 170, 500, 100);
        produtoSeis.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoSeis);

        JLabel produtoSete = new JLabel("Suco de Laranja ..................................... R$ 6,50");
        produtoSete.setBounds(30, 190, 500, 100);
        produtoSete.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoSete);

        JLabel produtoOito = new JLabel("Água Mineral.......................................... R$ 2,00");
        produtoOito.setBounds(30, 210, 500, 100);
        produtoOito.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        add(produtoOito);

        JButton finalizarPedido = new JButton("Finalizar Pedido");
        finalizarPedido.setBounds(30, 430, 160, 20);
        finalizarPedido.setFont(new Font("Times New Roman", Font.BOLD, 15));
        finalizarPedido.setForeground(new Color(0, 0, 0));
        finalizarPedido.setBackground(Color.WHITE);
        finalizarPedido.addActionListener(this:: finalizarPedido);

        add(finalizarPedido);

        JButton fecharMesa = new JButton("Fechar Mesa");
        fecharMesa.setBounds(200, 430, 160, 20);
        fecharMesa.setFont(new Font("Times New Roman", Font.BOLD, 15));
        fecharMesa.setForeground(new Color(0, 0, 0));
        fecharMesa.setBackground(Color.WHITE);
        fecharMesa.addActionListener(this:: fecharMesa);

        JButton resumoDoPedido = new JButton("Nota Fiscal");
        resumoDoPedido.setBounds(30, 430, 160, 20);
        resumoDoPedido.setFont(new Font("Times New Roman", Font.BOLD, 15));
        resumoDoPedido.setForeground(new Color(0, 0, 0));
        resumoDoPedido.setBackground(Color.WHITE);
        resumoDoPedido.addActionListener(this:: notaFiscal);

        JButton somarProdutoUm = new JButton("+");
        somarProdutoUm.setBounds(450, 60, 20, 20);
        somarProdutoUm.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoUm.setForeground(new Color(0, 0, 0));
        somarProdutoUm.setBackground(Color.WHITE);
        somarProdutoUm.addActionListener(this::somar);

        JButton subtrairProdutoUm = new JButton("-");
        subtrairProdutoUm.setBounds(420, 60, 20, 20);
        subtrairProdutoUm.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoUm.setForeground(new Color(0, 0, 0));
        subtrairProdutoUm.setBackground(Color.WHITE);
        subtrairProdutoUm.addActionListener(this::subtrair);




        add(resumoDoPedido);

        add(fecharMesa);





        //BOTOES COM OS METODOS DE ADICIONAR E RETIRAR PRODUTOS

    }

    private void voltar(ActionEvent actionEvent) {
        new ScreenMesas();
        dispose();
    }

    private void finalizarPedido(ActionEvent actionEvent) {
        //AQUI VAI O CÓDIGO QUE FINALIZA OS PEDIDOS INDIVIDUALMENTE
    }

    private void fecharMesa(ActionEvent actionEvent) {
        //AQUI VAI O CÓDIGO QUE FECHA A MESA
    }

    private void notaFiscal(ActionEvent actionEvent) {
        //AQUI VAI O CÓDIGO DO TOSTRING DOS PEDIDOS, FAZENDO UMA ESPECIE DE NOTA FISCAL
    }

    private void somar(ActionEvent actionEvent){
        //AQUI VAI O CODIGO PRA ADICIONAR PEDIDOS
    }

    private void subtrair(ActionEvent actionEvent){
        //AQUI VAI O CODIGO PRA ADICIONAR PEDIDOS
    }
    }
