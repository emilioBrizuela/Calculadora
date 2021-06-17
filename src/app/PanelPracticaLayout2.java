package app;

import javax.swing.*;
import java.awt.*;


public class PanelPracticaLayout2 extends JPanel {

    private JButton btnAzul;
    private JButton btnVerde;
    private JButton btnNegro;

    public PanelPracticaLayout2() {

        super();

        setLayout(new BorderLayout());
        btnAzul = new JButton("btnAzul");
        add(btnAzul, BorderLayout.WEST);
        btnVerde = new JButton("btnVerde");
        add(btnVerde, BorderLayout.EAST);
        btnNegro = new JButton("btnNegro");
        add(btnNegro, BorderLayout.CENTER);
    }
}