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
    private JLabel resultadoSubtracao;
    private JLabel resultadoSoma;

    public AcaoBotao(JTextField primeiro, JTextField segundo ,JLabel resultadoMultiplicacao, JLabel resultadoDivisao,
                     JLabel resultadoSubtracao, JLabel resultadoSoma){
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultadoMultiplicacao = resultadoMultiplicacao;
        this.resultadoDivisao = resultadoDivisao;
        this.resultadoSoma = resultadoSoma;
        this.resultadoSubtracao = resultadoSubtracao;
    }

    public void actionPerformed(ActionEvent e){
        TarefaMultiplicacao tarefaMultiplicacao = new TarefaMultiplicacao(primeiro, segundo, resultadoMultiplicacao);
        TarefaDivisao tarefaDivisao = new TarefaDivisao(primeiro, segundo, resultadoDivisao);
        TarefaSubtracao tarefaSubtracao = new TarefaSubtracao(primeiro, segundo, resultadoSubtracao);
        TarefaSoma tarefaSoma = new TarefaSoma(primeiro, segundo, resultadoSoma);
        (new Thread(tarefaMultiplicacao)).start();
        (new Thread(tarefaDivisao)).start();
        (new Thread(tarefaSubtracao)).start();
        (new Thread(tarefaSoma)).start();
    }


}