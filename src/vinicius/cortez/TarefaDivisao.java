package vinicius.cortez;

import javax.swing.*;
import java.math.BigInteger;

public class TarefaDivisao implements Runnable {
    private JTextField primeiro;
    private JTextField segundo;
    private JLabel resultado;

    //CONSTRUTOR:
    public TarefaDivisao(JTextField primeiro, JTextField segundo, JLabel resultado) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.resultado = resultado;
    }
    
    
@Override
    public void run() {
        long valor1 = Long.parseLong(primeiro.getText());
        long valor2 = Long.parseLong(segundo.getText());
        double calculo = valor1 / valor2;

        resultado.setText(Double.toString(calculo));
   
        }

    }

