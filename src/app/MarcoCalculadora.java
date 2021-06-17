package app;

import javax.swing.*;
import java.awt.event.*;

import java.awt.*;

public class MarcoCalculadora extends JFrame {

    public MarcoCalculadora() {
        super();
        setTitle("Calculadora");
        setBounds(500, 300, 450, 300);
        final LaminaCalculadora lamina = new LaminaCalculadora();
        add(lamina);
        // pack(); // ajusta el tamaño por DEFECTO.
    }
}

class LaminaCalculadora extends JPanel {

    private JPanel lamina2;
    private JButton pantalla;
    private boolean principio;
    private double resultado;
    private String ultimaOperaciones;

    public LaminaCalculadora() {

        setLayout(new BorderLayout());

        pantalla = new JButton("0");
        principio=true;
        pantalla.setEnabled(false);
        pantalla.setBackground(Color.WHITE);
        add(pantalla, BorderLayout.NORTH);

        lamina2 = new JPanel();
        lamina2.setLayout(new GridLayout(4, 4));

        ActionListener insertar = new  InsertaNumero();
        ActionListener orden = new AccionOrden();

        agregarBoton("1",insertar);
        agregarBoton("2",insertar);
        agregarBoton("3",insertar);
        agregarBoton("+",orden);
        agregarBoton("4",insertar);
        agregarBoton("5",insertar);
        agregarBoton("6",insertar);
        agregarBoton("-",orden);
        agregarBoton("7",insertar);
        agregarBoton("8",insertar);
        agregarBoton("9",insertar);
        agregarBoton("*",orden);
        agregarBoton("0",insertar);
        agregarBoton(".",insertar);
        agregarBoton("/",orden);
        agregarBoton("=",orden);

        add(lamina2, BorderLayout.CENTER);
        ultimaOperaciones = "=";
    }

    private class InsertaNumero implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String entrada = e.getActionCommand();
            if(principio){
                pantalla.setText("");
                principio =false;
            }
            pantalla.setText(pantalla.getText()+entrada);
        }

    }


    private class AccionOrden implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
            String operacion = e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperaciones = operacion;

            principio = true;

        }

    }

    public void calcular(double numero){

        if(ultimaOperaciones.equals("+")){
            resultado+=numero;
            System.out.println(resultado);
        }
        else if(ultimaOperaciones.equals("-")){
            resultado-=numero;
        }
        else if(ultimaOperaciones.equals("*")){
            resultado*=numero;
        }
        else if(ultimaOperaciones.equals("/")){
            resultado/=numero;
        }
        else if(ultimaOperaciones.equals("=")){
            resultado = numero;
        }
        pantalla.setText(""+resultado);
        

    }

    private void agregarBoton(String numero, ActionListener oyente) {
        final JButton btn = new JButton(numero);
        btn.addActionListener(oyente);
        lamina2.add(btn);
    }

}