package vinicius.cortez;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AcaoBotao implements ActionListener{

    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public AcaoBotao(JTextField primeiro, JTextField segundo ,JLabel resultado){
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;

    }

    public void actionPerformed(ActionEvent e){
        TarefaMultiplicacao tarefaMultiplicacao = new TarefaMultiplicacao(primeiro, segundo, resultado);

        (new Thread(tarefaMultiplicacao)).start();
    }


}