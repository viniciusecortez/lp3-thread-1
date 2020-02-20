package vinicius.cortez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener{

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultadoMultiplicacao;
    private JLabel resultadoDivisao;

    public AcaoBotao(JTextField primeiro, JTextField segundo ,JLabel resultadoMultiplicacao, JLabel resultadoDivisao){
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultadoMultiplicacao = resultadoMultiplicacao;
        this.resultadoDivisao = resultadoDivisao;
    }

    public void actionPerformed(ActionEvent e){
        TarefaMultiplicacao tarefaMultiplicacao = new TarefaMultiplicacao(primeiro, segundo, resultadoMultiplicacao);
        TarefaDivisao tarefaDivisao = new TarefaDivisao(primeiro, segundo, resultadoDivisao);
        (new Thread(tarefaMultiplicacao)).start();
        (new Thread(tarefaDivisao)).start();

    }


}