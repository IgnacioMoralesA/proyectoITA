package Guis;
import Herramientas.CalculadoraBasica;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class VentanaCalculadoraBasica extends Ventana{
    private final JButton[] botonesNumeros = new JButton[10];
    private final ArrayList<JButton> botonesFunciones = new ArrayList<>();
    private JButton botonSumar,botonRestar,botonMulti,botonDividir;
    private JButton botonDecimal, botonResultado, botonAC, botonDelete, botonSigno;
    private JTextField textoCalculadora;

    private double num1;
    private double resultado;
    private char operador;

    public VentanaCalculadoraBasica(String nombre, int largoX, int largoY) {
        super("Calculadora", 330, 390);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        botonesFunciones();
        botonesNumeros();
        campoTexto();
    }

    private void botonesFunciones() {
        this.botonesFunciones.add(this.botonAC = generarBoton("AC",90,100,60,40));
        this.botonesFunciones.add(this.botonDelete = generarBoton("DEL",160,100,60,40));
        this.botonesFunciones.add(this.botonSigno = generarBoton("+/-",20,100,60,40));
        this.botonesFunciones.add(this.botonDividir = generarBoton("/",230,100,60,40));
        this.botonesFunciones.add(this.botonMulti = generarBoton("X",230,150,60,40));
        this.botonesFunciones.add(this.botonRestar = generarBoton("-",230,200,60,40));
        this.botonesFunciones.add(this.botonSumar = generarBoton("+",230,250,60,40));
        this.botonesFunciones.add(this.botonDecimal = generarBoton(",",160,300,60,40));
        this.botonesFunciones.add(this.botonResultado = generarBoton("=",230,300,60,40));

        for (JButton button : this.botonesFunciones) {
            button.setFont(new Font("Calibri", Font.BOLD, 11));
            this.add(button);
            button.addActionListener(this);
        }
    }

    private void botonesNumeros() {
        this.botonesNumeros[0] = generarBoton("0",20,300,130,40);
        this.botonesNumeros[1] = generarBoton("1",20,250,60,40);
        this.botonesNumeros[2] = generarBoton("2",90,250,60,40);
        this.botonesNumeros[3] = generarBoton("3",160,250,60,40);
        this.botonesNumeros[4] = generarBoton("4",20,200,60,40);
        this.botonesNumeros[5] = generarBoton("5",90,200,60,40);
        this.botonesNumeros[6] = generarBoton("6",160,200,60,40);
        this.botonesNumeros[7] = generarBoton("7",20,150,60,40);
        this.botonesNumeros[8] = generarBoton("8",90,150,60,40);
        this.botonesNumeros[9] = generarBoton("9",160,150,60,40);

        for (JButton botonesNumero : botonesNumeros) {
            this.add(botonesNumero);
            botonesNumero.addActionListener(this);
        }
    }

    private void campoTexto() {
        this.textoCalculadora = generarJTextField(20,30,270,60);
        this.textoCalculadora.setEnabled(false);
        this.textoCalculadora.setFont(new Font("Calibri", Font.BOLD | Font.ITALIC, 30));
        this.add(this.textoCalculadora);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            for (int i = 0; i < this.botonesNumeros.length; i++) {
                if(e.getSource() == this.botonesNumeros[i]) {
                    this.textoCalculadora.setText(this.textoCalculadora.getText().concat(String.valueOf(i)));
                }
            }
            if(e.getSource()==botonDecimal) {
                this.textoCalculadora.setText(this.textoCalculadora.getText().concat("."));
            }
            if(e.getSource()==botonSumar) {
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='+';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonRestar) {
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='-';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonMulti) {
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='*';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonDividir) {
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='/';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonResultado) {
                double num2 = Double.parseDouble(this.textoCalculadora.getText());

                switch (operador) {
                    case '+' -> resultado = CalculadoraBasica.sumar(num1, num2);
                    case '-' -> resultado = CalculadoraBasica.restar(num1, num2);
                    case '*' -> resultado = CalculadoraBasica.multiplicar(num1, num2);
                    case '/' -> resultado = CalculadoraBasica.dividir(num1, num2);
                    case 'M' -> resultado = CalculadoraBasica.modulo(num1, num2);
                }
                num1 = resultado;
                this.textoCalculadora.setText(String.valueOf(resultado));
            }
            if(e.getSource()==botonAC) {
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonSigno) {
                double temp = Double.parseDouble(this.textoCalculadora.getText());
                temp *= -1;
                this.textoCalculadora.setText(String.valueOf(temp));
            }
            if(e.getSource()==botonDelete) {
                String string = textoCalculadora.getText();
                textoCalculadora.setText("");
                for(int i=0;i<string.length()-1;i++) {
                    textoCalculadora.setText(textoCalculadora.getText()+string.charAt(i));
                }
            }
        }catch (NumberFormatException ex){
            String error="ERROR!";
            textoCalculadora.setText(error);
        }catch (Exception e1){
            String error="SYNTAX ERROR";
            textoCalculadora.setText(error);
        }
    }
}
