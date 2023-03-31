package Interfas;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

      Panel panel1;

    public Ventana(){
        this.setSize(600,400);
        this.setLocationRelativeTo(null);
        this.setBackground(Color.white);
       this. setTitle("                                                             cubo");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

         panel1 = new Panel();

        this.add(panel1);


    }



}
