package app;

import java.awt.*;

import javax.swing.*;

public class Formulario extends JFrame {

 public Formulario() {
     super();
     setTitle("Prueba Layout");
     setBounds(600,350,600,300);
     PanelPracticaLayout lamina =  new PanelPracticaLayout();
     PanelPracticaLayout2 lamina2 = new PanelPracticaLayout2();

     add(lamina,BorderLayout.NORTH);
     add(lamina2,BorderLayout.CENTER);
 }

}