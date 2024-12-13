package interfaces;

import javax.swing.*;

import controladores.RestauranteController;

import java.awt.*;
import java.awt.event.ActionEvent;

public class ScreenMesaIndividual extends JFrame {
    RestauranteController controller = new RestauranteController();
    private final int numeroMesa;

    public ScreenMesaIndividual(int num) {

        this.numeroMesa = num;

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
        resumoDoPedido.setBounds(400, 430, 160, 20);
        resumoDoPedido.setFont(new Font("Times New Roman", Font.BOLD, 15));
        resumoDoPedido.setForeground(new Color(0, 0, 0));
        resumoDoPedido.setBackground(Color.WHITE);
        resumoDoPedido.addActionListener(this:: notaFiscal);

        JLabel operacaoDeSoma = new JLabel("add");
        operacaoDeSoma.setBounds(450, 0, 500, 100);
        operacaoDeSoma.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add(operacaoDeSoma);

        JLabel operacaoDeSub = new JLabel("sub");
        operacaoDeSub.setBounds(415, 0, 500, 100);
        operacaoDeSub.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        add(operacaoDeSub);



        JButton somarProdutoUm = new JButton("+");
        somarProdutoUm.setBounds(450, 55, 20, 20);
        somarProdutoUm.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoUm.setForeground(new Color(0, 0, 0));
        somarProdutoUm.setBackground(Color.WHITE);
        somarProdutoUm.setActionCommand("1");
        somarProdutoUm.addActionListener(this::somar);

        JButton subtrairProdutoUm = new JButton("-");
        subtrairProdutoUm.setBounds(420, 55, 20, 20);
        subtrairProdutoUm.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoUm.setForeground(new Color(0, 0, 0));
        subtrairProdutoUm.setBackground(Color.WHITE);
        subtrairProdutoUm.addActionListener(this::subtrair);

        JButton somarProdutoDois = new JButton("+");
        somarProdutoDois.setBounds(450, 75, 20, 20);
        somarProdutoDois.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoDois.setForeground(new Color(0, 0, 0));
        somarProdutoDois.setBackground(Color.WHITE);
        somarProdutoDois.setActionCommand("2");
        somarProdutoDois.addActionListener(this::somar);

        JButton subtrairProdutoDois = new JButton("-");
        subtrairProdutoDois.setBounds(420, 75, 20, 20);
        subtrairProdutoDois.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoDois.setForeground(new Color(0, 0, 0));
        subtrairProdutoDois.setBackground(Color.WHITE);
        subtrairProdutoDois.addActionListener(this::subtrair);

        JButton somarProdutoTres = new JButton("+");
        somarProdutoTres.setBounds(450, 95, 20, 20);
        somarProdutoTres.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoTres.setForeground(new Color(0, 0, 0));
        somarProdutoTres.setBackground(Color.WHITE);
        somarProdutoTres.setActionCommand("3");
        somarProdutoTres.addActionListener(this::somar);

        JButton subtrairProdutoTres = new JButton("-");
        subtrairProdutoTres.setBounds(420, 95, 20, 20);
        subtrairProdutoTres.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoTres.setForeground(new Color(0, 0, 0));
        subtrairProdutoTres.setBackground(Color.WHITE);
        subtrairProdutoTres.addActionListener(this::subtrair);

        JButton somarProdutoQuatro = new JButton("+");
        somarProdutoQuatro.setBounds(450, 115, 20, 20);
        somarProdutoQuatro.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoQuatro.setForeground(new Color(0, 0, 0));
        somarProdutoQuatro.setBackground(Color.WHITE);
        somarProdutoQuatro.setActionCommand("4");
        somarProdutoQuatro.addActionListener(this::somar);

        JButton subtrairProdutoQuatro = new JButton("-");
        subtrairProdutoQuatro.setBounds(420, 115, 20, 20);
        subtrairProdutoQuatro.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoQuatro.setForeground(new Color(0, 0, 0));
        subtrairProdutoQuatro.setBackground(Color.WHITE);
        subtrairProdutoQuatro.addActionListener(this::subtrair);

        JButton somarProdutoCinco = new JButton("+");
        somarProdutoCinco.setBounds(450, 135, 20, 20);
        somarProdutoCinco.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoCinco.setForeground(new Color(0, 0, 0));
        somarProdutoCinco.setBackground(Color.WHITE);
        somarProdutoCinco.setActionCommand("5");
        somarProdutoCinco.addActionListener(this::somar);

        JButton subtrairProdutoCinco = new JButton("-");
        subtrairProdutoCinco.setBounds(420, 135, 20, 20);
        subtrairProdutoCinco.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoCinco.setForeground(new Color(0, 0, 0));
        subtrairProdutoCinco.setBackground(Color.WHITE);
        subtrairProdutoCinco.addActionListener(this::subtrair);

        JButton somarProdutoSeis = new JButton("+");
        somarProdutoSeis.setBounds(450, 205, 20, 20);
        somarProdutoSeis.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoSeis.setForeground(new Color(0, 0, 0));
        somarProdutoSeis.setBackground(Color.WHITE);
        somarProdutoSeis.setActionCommand("6");
        somarProdutoSeis.addActionListener(this::somar);

        JButton subtrairProdutoSeis = new JButton("-");
        subtrairProdutoSeis.setBounds(420, 205, 20, 20);
        subtrairProdutoSeis.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoSeis.setForeground(new Color(0, 0, 0));
        subtrairProdutoSeis.setBackground(Color.WHITE);
        subtrairProdutoSeis.addActionListener(this::subtrair);

        JButton somarProdutoSete = new JButton("+");
        somarProdutoSete.setBounds(450, 225, 20, 20);
        somarProdutoSete.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoSete.setForeground(new Color(0, 0, 0));
        somarProdutoSete.setBackground(Color.WHITE);
        somarProdutoSete.setActionCommand("7");
        somarProdutoSete.addActionListener(this::somar);

        JButton subtrairProdutoSete = new JButton("-");
        subtrairProdutoSete.setBounds(420, 225, 20, 20);
        subtrairProdutoSete.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoSete.setForeground(new Color(0, 0, 0));
        subtrairProdutoSete.setBackground(Color.WHITE);
        subtrairProdutoSete.addActionListener(this::subtrair);

        JButton somarProdutoOito = new JButton("+");
        somarProdutoOito.setBounds(450, 245, 20, 20);
        somarProdutoOito.setFont(new Font("Times New Roman", Font.BOLD, 4));
        somarProdutoOito.setForeground(new Color(0, 0, 0));
        somarProdutoOito.setBackground(Color.WHITE);
        somarProdutoOito.setActionCommand("8");
        somarProdutoOito.addActionListener(this::somar);

        JButton subtrairProdutoOito = new JButton("-");
        subtrairProdutoOito.setBounds(420, 245, 20, 20);
        subtrairProdutoOito.setFont(new Font("Times New Roman", Font.BOLD, 4));
        subtrairProdutoOito.setForeground(new Color(0, 0, 0));
        subtrairProdutoOito.setBackground(Color.WHITE);
        subtrairProdutoOito.addActionListener(this::subtrair);

        add(subtrairProdutoUm);
        add(somarProdutoUm);

        add(subtrairProdutoDois);
        add(somarProdutoDois);

        add(subtrairProdutoTres);
        add(somarProdutoTres);

        add(subtrairProdutoQuatro);
        add(somarProdutoQuatro);

        add(subtrairProdutoCinco);
        add(somarProdutoCinco);

        add(subtrairProdutoSeis);
        add(somarProdutoSeis);

        add(subtrairProdutoSete);
        add(somarProdutoSete);

        add(subtrairProdutoOito);
        add(somarProdutoOito);

        add(resumoDoPedido);

        add(fecharMesa);

        add(resumoDoPedido);

        //BOTOES COM OS METODOS DE ADICIONAR E RETIRAR PRODUTOS
    }

    private void voltar(ActionEvent actionEvent) {
        new ScreenMesas();
        dispose();
    }

    private void finalizarPedido(ActionEvent actionEvent) {

    }

    private void fecharMesa(ActionEvent actionEvent) {
        //AQUI VAI O CÓDIGO QUE FECHA A MESA
    }

    private void notaFiscal(ActionEvent actionEvent) {
        double totalConta = controller.visualizarContaMesa(numeroMesa);
        String mensagem = String.format("Total da conta:\nR$ %.2f", totalConta);
        JOptionPane.showMessageDialog(null, mensagem);

    }

    private void somar(ActionEvent actionEvent){
        String actionCommand = actionEvent.getActionCommand();
        int numeroProduto = Integer.parseInt(actionCommand);

        controller.adicionarComidaMesa(numeroMesa, numeroProduto);
    }

    private void subtrair(ActionEvent actionEvent){
        //AQUI VAI O CODIGO PRA ADICIONAR PEDIDOS
    }
    }
