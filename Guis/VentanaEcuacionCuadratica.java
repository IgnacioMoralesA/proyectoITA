package Guis;

import Guis.Ventana;

import javax.swing.*;

public class VentanaEcuacionCuadratica extends Ventana {
    JPanel panel;
    JTextField textField;
    JTextField textField1;
    JTextField textField2;
    JLabel label;
    JLabel label1;
    JLabel label2;
    
    public VentanaEcuacionCuadratica(String nombre, int largoX, int largoY) {
        super(nombre, largoX, largoY);
        iniciarcomponentes();
    }

    private void iniciarcomponentes() {
        panelVentana();
        camposDeTexto();
        etiquetasVentana();
        botonesVentana();
    }

    private void panelVentana() {
        panel = new JPanel();
        this.add(panel);
    }

    private void camposDeTexto() {
        textField = generarJTextField(20,20,40,40);
        this.add(textField);
        textField1 = generarJTextField(100,20,40,40);
        this.add(textField1);
        textField2 = generarJTextField(180,20,40,40);
        this.add(textField2);
    }

    private void etiquetasVentana() {
        generarJLabel(label," + ",60,20,40,40);
        generarJLabel(label1," + ",140,20,40,40);
        generarJLabel(label2," = ",220,20,40,40);
    }

    private void botonesVentana() {
        JButton button1 = generarBoton("7",20,180,50,50);
        this.add(button1);
        JButton button2 = generarBoton("8",70,180,50,50);
        this.add(button2);
        JButton button3 = generarBoton("9",120,180,50,50);
        this.add(button3);
        JButton button4 = generarBoton("4",20,230,50,50);
        this.add(button4);
        JButton button5 = generarBoton("5",70,230,50,50);
        this.add(button5);
        JButton button6 = generarBoton("6",120,230,50,50);
        this.add(button6);
        JButton button7 = generarBoton("1",20,280,50,50);
        this.add(button7);
        JButton button8 = generarBoton("2",70,280,50,50);
        this.add(button8);
        JButton button9 = generarBoton("3",120,280,50,50);
        this.add(button9);
        JButton button10 = generarBoton("0",70,330,50,50);
        this.add(button10);
        accionesBotones(button1,button2,button3,button4,button5,button6,button7,button8,button9,button10);
    }

    private void accionesBotones(JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6, JButton button7, JButton button8, JButton button9, JButton button10) {
    }

}
