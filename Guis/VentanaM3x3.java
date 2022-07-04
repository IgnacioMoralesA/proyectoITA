package Guis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Herramientas.Matrices;

public class VentanaM3x3 extends Ventana{
    JPanel panel;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JTextField textField6;
    JTextField textField7;
    JTextField textField8;
    JTextField textField9;
    JTextField textField10;
    JButton button1;
    JButton button2;
    JButton button3;
    JButton button4;
    JButton button5;
    JButton button6;
    JButton button7;
    JButton button8;
    JButton button9;
    JButton button10;
    JButton button11;
    JButton button12;
    JButton button13;


    JLabel label;
    Font myFont = new Font("Ink Free",Font.BOLD,30);

    public VentanaM3x3(String nombre, int largoX, int largoY) {
        super(nombre, largoX, largoY);
        iniciarcomponentes();
    }

    private void iniciarcomponentes() {
        panelVentana();
        camposDeTextoVentanas();
        etiquetasVentana();
        botonesVentana();
        //botones2();
    }

    private void etiquetasVentana() {
        generarJLabel(label," = ",200,70,50,50);
    }

    private void panelVentana() {
        panel=new JPanel();
        this.add(panel);
    }

    private void camposDeTextoVentanas() {
        textField1=generarJTextField(20,20,50,50);
        this.add(textField1);
        textField2=generarJTextField(70,20,50,50);
        this.add(textField2);
        textField3=generarJTextField(120,20,50,50);
        this.add(textField3);
        textField4=generarJTextField(20,70,50,50);
        this.add(textField4);
        textField5=generarJTextField(70,70,50,50);
        this.add(textField5);
        textField6=generarJTextField(120,70,50,50);
        this.add(textField6);
        textField7=generarJTextField(20,120,50,50);
        this.add(textField7);
        textField8=generarJTextField(70,120,50,50);
        this.add(textField8);
        textField9=generarJTextField(120,120,50,50);
        this.add(textField9);
        textField10=generarJTextField(240,70,150,50);
        this.add(textField10);
    }


    private void botonesVentana() {
        button1 = generarBoton("7",20,180,50,50);
        this.add(button1);
        button2 = generarBoton("8",70,180,50,50);
        this.add(button2);
        button3 = generarBoton("9",120,180,50,50);
        this.add(button3);
        button4 = generarBoton("4",20,230,50,50);
        this.add(button4);
        button5 = generarBoton("5",70,230,50,50);
        this.add(button5);
        button6 = generarBoton("6",120,230,50,50);
        this.add(button6);
        button7 = generarBoton("1",20,280,50,50);
        this.add(button7);
        button8 = generarBoton("2",70,280,50,50);
        this.add(button8);
        button9 = generarBoton("3",120,280,50,50);
        this.add(button9);
        button10 = generarBoton("AC",20,330,50,50);
        this.add(button10);
        button11 = generarBoton("0",70,330,50,50);
        this.add(button11);
        button12 = generarBoton("<-",120,330,50,50);
        this.add(button12);
        button13 = generarBoton("Determinante",20,380,150,50);
        this.add(button13);

    }

    private void accionBotones() {
        double[][] matriz3x3 = new double[3][3];
        Matrices matrices = new Matrices();
        ingresarCoefM3x3(matriz3x3);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    if(e.getSource() == button1) {
                        textField1.setText(textField1.getText().concat(String.valueOf(7)));
                    }
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button2) {
                    textField1.setText(textField1.getText().concat(String.valueOf(8)));
                }
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button3) {
                    textField1.setText(textField1.getText().concat(String.valueOf(9)));
                }
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button4) {
                    textField1.setText(textField1.getText().concat(String.valueOf(4)));
                }
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button5) {
                    textField1.setText(textField1.getText().concat(String.valueOf(5)));
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button6) {
                    textField1.setText(textField1.getText().concat(String.valueOf(6)));
                }
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button7) {
                    textField1.setText(textField1.getText().concat(String.valueOf(1)));
                }
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button8) {
                    textField1.setText(textField1.getText().concat(String.valueOf(2)));
                }
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button9) {
                    textField1.setText(textField1.getText().concat(String.valueOf(3)));
                }
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == button11) {
                    textField1.setText(textField1.getText().concat(String.valueOf(0)));
                }
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField10.setText(textField10.getText().concat(String.valueOf(Matrices.determinante3x3(matriz3x3))));
            }
        });
    }

    private void ingresarCoefM3x3(double[][] matriz) {
        String text= String.valueOf(textField1);
        String text1= String.valueOf(textField2);
        String text2= String.valueOf(textField3);
        String text3= String.valueOf(textField4);
        String text4= String.valueOf(textField5);
        String text5= String.valueOf(textField6);
        String text6= String.valueOf(textField7);
        String text7= String.valueOf(textField8);
        String text8= String.valueOf(textField9);
        matriz[0][0]= Double.parseDouble(text);
        matriz[0][1]= Double.parseDouble(text1);
        matriz[0][2]= Double.parseDouble(text2);
        matriz[1][0]= Double.parseDouble(text3);
        matriz[1][1]= Double.parseDouble(text4);
        matriz[1][2]= Double.parseDouble(text5);
        matriz[2][0]= Double.parseDouble(text6);
        matriz[2][1]= Double.parseDouble(text7);
        matriz[2][2]= Double.parseDouble(text8);
    }
}