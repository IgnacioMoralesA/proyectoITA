package Guis;

import Herramientas.CalculadoraBasica;
import Herramientas.CalculadoraCientifica;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class VentanaCalculadoraCientifica extends Ventana {
    private final JButton[] botonesNumeros = new JButton[10];
    private final ArrayList<JButton> botonesFunciones = new ArrayList<>();
    private JButton botonSumar,botonRestar,botonMulti,botonDividir, botonModulo;
    private JButton botonDecimal, botonResultado, botonAC, botonDelete, botonSigno;
    private JButton botonRaiz, botonPotencia, botonPorcentaje, botonFactorial, botonLog, botonLog10, botonAbs, botoncbrt;
    private JButton botonSumatoria, botonSeno, botonCoseno, botonTan, botonAseno, botonAcos, botonAtan;
    private JTextField textoCalculadora;

    private double num1;
    private double resultado;
    private char operador;

    public VentanaCalculadoraCientifica() {
        super("Calculadora Científica", 330, 640);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        botonesFunciones();
        botonesNumeros();
        campoTexto();
        listaDesplegable();
    }

    private void listaDesplegable() {
        String[] opciones = {"Seleccionar","Ecuaciones Cuadráticas","Perímetros, Áreas o Volúmenes",
                "Sistema de Ecuaciones","Ecuaciones de la recta","Matrices"};
        JComboBox listaOpciones = generarListaDesplegable(opciones, 20, 550, 270, 40);
        this.add(listaOpciones);
        listaOpciones.addActionListener(this);
    }

    private void botonesFunciones() {
        this.botonesFunciones.add(this.botonSumatoria = generarBoton("Σ",20,100,60,40));
        this.botonesFunciones.add(this.botonPorcentaje = generarBoton("%",90,100,60,40));
        this.botonesFunciones.add(this.botonAC = generarBoton("AC",160,100,60,40));
        this.botonesFunciones.add(this.botonDelete = generarBoton("DEL",230,100,60,40));
        this.botonesFunciones.add(this.botonRaiz = generarBoton("√",20,150,60,40));
        this.botonesFunciones.add(this.botonFactorial = generarBoton("!",90,150,60,40));
        this.botonesFunciones.add(this.botonLog = generarBoton("lg",160,150,60,40));
        this.botonesFunciones.add(this.botonLog10 = generarBoton("LG10",230,150,60,40));
        this.botonesFunciones.add(this.botonAseno = generarBoton("ASIN",90,200,60,40));
        this.botonesFunciones.add(this.botonAcos = generarBoton("ACOS",160,200,60,40));
        this.botonesFunciones.add(this.botonAtan = generarBoton("ATAN",230,200,60,40));
        this.botonesFunciones.add(this.botonPotencia = generarBoton("^",20,200,60,40));
        this.botonesFunciones.add(this.botonAbs = generarBoton("||",20,250,60,40));
        this.botonesFunciones.add(this.botonSeno = generarBoton("SIN",90,250,60,40));
        this.botonesFunciones.add(this.botonCoseno = generarBoton("COS",160,250,60,40));
        this.botonesFunciones.add(this.botonTan = generarBoton("TAN",230,250,60,40));
        this.botonesFunciones.add(this.botonModulo = generarBoton("MOD",90,300,60,40));
        this.botonesFunciones.add(this.botonSigno = generarBoton("+/-",160,300,60,40));
        this.botonesFunciones.add(this.botonDividir = generarBoton("/",230,300,60,40));
        this.botonesFunciones.add(this.botonMulti = generarBoton("X",230,350,60,40));
        this.botonesFunciones.add(this.botonRestar = generarBoton("-",230,400,60,40));
        this.botonesFunciones.add(this.botonSumar = generarBoton("+",230,450,60,40));
        this.botonesFunciones.add(this.botonDecimal = generarBoton(",",160,500,60,40));
        this.botonesFunciones.add(this.botonResultado = generarBoton("=",230,500,60,40));
        this.botonesFunciones.add(this.botoncbrt = generarBoton("∛",20,300,60,40));

        for (JButton button : this.botonesFunciones) {
            button.setFont(new Font("Calibri", Font.BOLD, 11));
            this.add(button);
            button.addActionListener(this);
        }
    }

    private void botonesNumeros() {
        this.botonesNumeros[0] = generarBoton("0",20,500,130,40);
        this.botonesNumeros[1] = generarBoton("1",20,450,60,40);
        this.botonesNumeros[2] = generarBoton("2",90,450,60,40);
        this.botonesNumeros[3] = generarBoton("3",160,450,60,40);
        this.botonesNumeros[4] = generarBoton("4",20,400,60,40);
        this.botonesNumeros[5] = generarBoton("5",90,400,60,40);
        this.botonesNumeros[6] = generarBoton("6",160,400,60,40);
        this.botonesNumeros[7] = generarBoton("7",20,350,60,40);
        this.botonesNumeros[8] = generarBoton("8",90,350,60,40);
        this.botonesNumeros[9] = generarBoton("9",160,350,60,40);

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
            if(e.getSource()==botonModulo) {
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='M';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonRaiz) {
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='√';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonPotencia) {
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='^';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonPorcentaje) {
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='%';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonFactorial){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = '!';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonLog){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador= 'l';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonLog10){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = 'L';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonAseno){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador ='S';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonAtan){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = 'T';
                this.textoCalculadora.setText("");
            }
            if (e.getSource()==botonAcos){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = 'C';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonCoseno){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = 'c';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonSeno){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = 's';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonTan){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = 't';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonSumatoria){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = 'Σ';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonAbs){
                num1 = Double.parseDouble(this.textoCalculadora.getText());
                operador = '|';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botoncbrt){
                num1=Double.parseDouble(this.textoCalculadora.getText());
                operador = '∛';
                this.textoCalculadora.setText("");
            }
            if(e.getSource()==botonResultado) {
                double num2 = Double.parseDouble(this.textoCalculadora.getText());

                switch (operador) {
                    case '+' -> resultado = CalculadoraBasica.sumar(num1, num2);
                    case '-' -> resultado = CalculadoraBasica.restar(num1, num2);
                    case '*' -> resultado = CalculadoraBasica.multiplicar(num1, num2);
                    case '/' -> resultado = CalculadoraBasica.dividir(num1, num2);
                    case '%' -> resultado = CalculadoraCientifica.porcentaje(num1, num2);
                    case '√' -> resultado = CalculadoraCientifica.raiz(num1,num2);
                    case 'M' -> resultado = CalculadoraBasica.modulo(num1, num2);
                    case '^' -> resultado = CalculadoraCientifica.potencia(num1, num2);
                    case '!' -> resultado = CalculadoraCientifica.factoriales(num1);
                    case 'l' -> resultado = CalculadoraCientifica.logaritmoNatural(num1);
                    case 'L' -> resultado = CalculadoraCientifica.logaritmo10(num1);
                    case 'S' -> resultado = CalculadoraCientifica.aSeno(num1);
                    case 'C' -> resultado = CalculadoraCientifica.aCoseno(num1);
                    case 'T' -> resultado = CalculadoraCientifica.aTangente(num1);
                    case 's' -> resultado = CalculadoraCientifica.seno(num1);
                    case 'c' -> resultado = CalculadoraCientifica.coseno(num1);
                    case 't' -> resultado = CalculadoraCientifica.tangente(num1);
                    case 'Σ' -> resultado = CalculadoraCientifica.sumatoria(num1);
                    case '|' -> resultado = CalculadoraCientifica.valorAbsoluto(num1);
                    case '∛' -> resultado = CalculadoraCientifica.cbrt(num1);
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