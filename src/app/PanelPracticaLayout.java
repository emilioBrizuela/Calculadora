package app;

import java.awt.*;

import javax.swing.*;

public class PanelPracticaLayout extends JPanel {

    private JButton btnRojo;
    private JButton btnAmarillo;
    // private JButton btnAzul;
    // private JButton btnVerde;
    // private JButton btnNegro;

    public PanelPracticaLayout() {
        super();

        setLayout(new FlowLayout(FlowLayout.LEFT));
        btnRojo = new JButton("btnRojo");
        add(btnRojo);
        btnAmarillo = new JButton("btnAmarillo");
        add(btnAmarillo);


        //#region FLOW LAYOUT
        
        //setLayout(new FlowLayout(FlowLayout.LEFT, 75, 200));
        // setLayout(new FlowLayout(FlowLayout.LEFT));
        // btnRojo = new JButton("btnRojo");
        // add(btnRojo);
        // btnAmarillo = new JButton("btnAmarillo");
        // add(btnAmarillo);
        // btnAzul = new JButton("btnAzul");
        // add(btnAzul);
        
        //#endregion

        //#region BORDERLAYOUT
        // setLayout(new BorderLayout(10,10));
        // btnRojo = new JButton("btnRojo");
        // add(btnRojo,BorderLayout.NORTH);
        // btnAmarillo = new JButton("btnAmarillo");
        // add(btnAmarillo,BorderLayout.WEST);
        // btnAzul = new JButton("btnAzul");
        // add(btnAzul, BorderLayout.SOUTH);
        // btnVerde = new JButton("btnVerde");
        // add(btnVerde, BorderLayout.EAST);
        // btnNegro = new JButton("btnNegro");
        // add(btnNegro, BorderLayout.CENTER);
       //#endregion
    }

}