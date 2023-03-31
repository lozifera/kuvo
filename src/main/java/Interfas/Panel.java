package Interfas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    
    JMenuBar menu;
    JMenu columana1 ;
    JMenuItem  opcionReset;
    JMenuItem  opcionSalir;
    JMenu columana2 ;
    JMenuItem opcionAgregar ;
    JMenuItem opcionEliminar;
    JMenuItem opcionAzar;
    JMenuItem opcionOrdenar;

  private int altura;


    public Panel() {
        this.setSize(600,400);
        setBackground(Color.black);

        menu = new JMenuBar();
        menu.setBackground(Color.GRAY);
        menu.setBounds(0,0,600,25);


        menuArchivo();
        menuAreglo();

        this.add(menu);




    }
    private  void menuArchivo(){
        columana1  = new JMenu("Menu Archivo");
        reseteo();
        exit();
        columana1.add(opcionSalir);
    }
    private  void  reseteo(){
        opcionReset = new JMenuItem("Reset");
        columana1.add(opcionReset);
    }
    private  void  exit (){
        opcionSalir = new JMenuItem(" Salir");
        menu.add(columana1);
    }
    private  void  menuAreglo(){
        columana2 = new JMenu("Menu Areglo");
        agregar();
        azar();
        ordenar();
        eliminar();
        menu.add(columana2);

    }
    private void agregar (){
        opcionAgregar= new JMenuItem("Agregar");
        columana2.add(opcionAgregar);

        opcionAgregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               altura  =   Integer.parseInt(JOptionPane.showInputDialog("ingres la altura deseada"))  ;



            }
        });

    }
    private void azar (){
        opcionAzar=new JMenuItem("Azar");
        columana2.add(opcionAzar);
    }
    private void ordenar (){
        opcionOrdenar=new JMenuItem("Ordenar");
        columana2.add(opcionOrdenar);
    }
    private void eliminar(){
        opcionEliminar=new JMenuItem("Eliminar");
        columana2.add(opcionEliminar);
    }










}
