package GUIs;

import javax.swing.*;
import java.awt.*;

public class VentanaPreguntasProfesor extends Ventana{
    private JRadioButton botonOpcionA;
    private JRadioButton botonOpcionB;
    private JRadioButton botonOpcionC;
    private JRadioButton botonOpcionD;
    private ButtonGroup bg;
    private JButton botonGuardar;
    private JButton botonSalida;
    private JTextArea mainDisplay;
    private JTextField opcionADisplay;
    private JTextField opcionBDisplay;
    private JTextField opcionCDisplay;
    private JTextField opcionDDisplay;
    private JTextField ingresarLeccion;


    public VentanaPreguntasProfesor() {
        super("VentanaPreguntasProfesor",950,650);
        this.bg=bg;
        generarElementosVentana();
    }


    public void generarElementosVentana() {
        generarBotonOpcionA();
        generarBotonOpcionB();
        generarBotonOpcionC();
        generarBotonOpcionD();
        generarBotonGuardar();
        generarBotonSalir();
        generarMainDisplay();
        generarGrupoBotones();
        generarOpcionA();
        generarOpcionB();
        generarOpcionC();
        generarOpcionD();
        generarInputPanel();

    }
    /**
     * genera el botòn de la primera opciòn
     */

    public void generarInputPanel(){
        JLabel labelIngreso = new JLabel("Ingrese el nombre de la leccion: ");
        labelIngreso.setBounds(50, 20, 200, 40);
        labelIngreso.setForeground(Color.BLACK);
        this.ingresarLeccion = new JTextField();
        ingresarLeccion.setBounds(300, 20, 500, 40);
        super.add(labelIngreso);
        super.add(ingresarLeccion);


    }
    public void generarBotonOpcionA() {
        String textoBoton = "Opcion A: ";
        this.botonOpcionA = super.generarJRadioButton(textoBoton,50,300,150,40);
        this.add(this.botonOpcionA);
        this.botonOpcionA.addActionListener(this);
    }
    /**
     *  genera el botòn de la segunda opciòn
     */
    public void generarBotonOpcionB() {
        String textoBoton = "Opcion B: ";
        this.botonOpcionB = super.generarJRadioButton(textoBoton,50,350,150,40);
        this.add(this.botonOpcionB);
        this.botonOpcionB.addActionListener(this);
    }
    /**
     * genera el botòn de la tercera opciòn
     */
    public void generarBotonOpcionC() {
        String textoBoton = "Opcion C: ";
        this.botonOpcionC = super.generarJRadioButton(textoBoton,50,400,150,40);
        this.add(this.botonOpcionC);
        this.botonOpcionC.addActionListener(this);
    }
    public void generarBotonOpcionD() {
        String textoBoton = "Opcion D: ";
        this.botonOpcionD = super.generarJRadioButton(textoBoton,50,450,150,40);
        this.add(this.botonOpcionD);
        this.botonOpcionD.addActionListener(this);
    }
    public void generarGrupoBotones(){
        bg=new ButtonGroup();
        bg.add(botonOpcionA);
        bg.add(botonOpcionB);
        bg.add(botonOpcionC);
        bg.add(botonOpcionD);
        /*ButtonGroup grupoRadioBotones = new ButtonGroup();
        grupoRadioBotones.add(botonOpcionA);
        grupoRadioBotones.add(botonOpcionB);
        grupoRadioBotones.add(botonOpcionC);
        grupoRadioBotones.add(botonOpcionD);*/





    }
    /**
     * genera el botòn para guardar la opciòn elegida
     */
    public void generarBotonGuardar() {
        String textoBoton = "Guardar";
        this.botonGuardar = super.generarBoton(textoBoton,50,550,150,40);
        this.add(this.botonGuardar);
        this.botonGuardar.addActionListener(this);
    }
    /**
     * genera el botòn de salida
     */
    public void generarBotonSalir() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton,750,550,150,40);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }

    public void generarMainDisplay(){
        this.mainDisplay = new JTextArea();
        this.mainDisplay.setBounds(50,70,830,200);
        this.mainDisplay.setBackground(Color.BLUE);
        this.mainDisplay.setFont(new Font("Calibri",2,40));
        this.mainDisplay.setColumns(1);
        this.mainDisplay.setRows(15);
        this.mainDisplay.setEditable(true);
        this.mainDisplay.setLineWrap(true);
        this.mainDisplay.setWrapStyleWord(true);
        super.add(this.mainDisplay);
    }

    public void generarOpcionA(){
        this.opcionADisplay = new JTextField();
        this.opcionADisplay.setBounds(235,300,650,40);
        this.opcionADisplay.setEditable(true);
        super.add(this.opcionADisplay);
    }

    public void generarOpcionB(){
        this.opcionBDisplay = new JTextField();
        this.opcionBDisplay.setBounds(235,350,650,40);
        this.opcionBDisplay.setEditable(true);
        super.add(this.opcionBDisplay);
    }

    public void generarOpcionC(){
        this.opcionCDisplay = new JTextField();
        this.opcionCDisplay.setBounds(235,400,650,40);
        this.opcionCDisplay.setEditable(true);
        super.add(this.opcionCDisplay);
    }
    public void generarOpcionD(){
        this.opcionDDisplay = new JTextField();
        this.opcionDDisplay.setBounds(235,450,650,40);
        this.opcionDDisplay.setEditable(true);
        super.add(this.opcionDDisplay);
    }
}
