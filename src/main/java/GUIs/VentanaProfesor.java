package GUIs;

import javax.swing.*;

public class VentanaProfesor extends Ventana {
    private JLabel bienvenida;
    private JButton botonRegistro;
    private JButton botonLogin;
    private JButton botonSalida;


    public VentanaProfesor() {

        super("VentanaProfesor", 600, 600);
        generarElementosVentana();

    }


    public void generarElementosVentana() {
        generarMensajeBienvenida();
        generarBotonRegistro();
        generarBotonLogin();
        generarBotonSalida();
    }


    public void generarMensajeBienvenida() {
        String textoBienvenida = "Bienvenido Profesor";
        super.generarJLabelEncabezado(this.bienvenida, textoBienvenida, 90, 30, 700, 60);

    }


    public void generarBotonRegistro() {
        String textoBoton = "Registrar curso";
        this.botonRegistro = super.generarBoton(textoBoton, 190, 150, 200, 80);
        this.add(this.botonRegistro);
        this.botonRegistro.addActionListener(this);
    }


    public void generarBotonLogin() {
        String textoBoton = "Ingresar a curso";
        this.botonLogin = super.generarBoton(textoBoton, 190, 250, 200, 80);
        this.add(this.botonLogin);
        this.botonLogin.addActionListener(this);
    }


    public void generarBotonSalida() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 190, 350, 200, 80);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }

}

