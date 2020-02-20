package vinicius.cortez;

import javax.swing.*;

public class TarefaSoma implements Runnable{
    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    public TarefaSoma(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }


    @Override
    public void run() {
        long valor1 = Long.parseLong(primeiro.getText());
        long valor2 = Long.parseLong(segundo.getText());
        Long calculo = valor1  + valor2;
        resultado.setText(calculo.toString());
    }
}
