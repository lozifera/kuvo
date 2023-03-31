package Interfas;

import java.awt.*;

public class Dibujo {
    public Dibujo() {

    }
    public void suelo(Graphics g,int x,int y){

        g.setColor(Color.CYAN);
        g.fillRect(x,y,600,4);


    }
}
