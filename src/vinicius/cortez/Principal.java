
package vinicius.cortez;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Principal {

    public static void main(String[] args) {
        
        JFrame janela = new JFrame("Calculadora");
        
        JTextField primeiro = new JTextField(10);
        JTextField segundo = new JTextField(10);
        JButton botao = new JButton(" = ");
        JLabel resultadoMultiplicacao = new JLabel(" Resultado Múltiplicação");
        JLabel resultadoDivisao = new JLabel(" Resultado Divisão");
        JLabel resultadoSoma = new JLabel("Resultado Soma");
        JLabel resultadoSubtracao = new JLabel(" Resultado Subtração ");

        botao.addActionListener(new AcaoBotao(primeiro, segundo, resultadoMultiplicacao, resultadoDivisao,
                resultadoSubtracao,
                resultadoSoma));
        
        JPanel painel = new JPanel();
        painel.add(primeiro);
        painel.add(new JLabel("all"));
        painel.add(segundo);
        painel.add(botao);
        painel.add(resultadoMultiplicacao);
        painel.add(resultadoDivisao);
        painel.add(resultadoSoma);
        painel.add(resultadoSubtracao);
        janela.add(painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.pack();
        janela.setVisible(true);
                
                
    }
}
