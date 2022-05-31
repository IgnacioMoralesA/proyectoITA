package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends Ventana {
    private JLabel bienvenida;
    private JButton botonRegistro;
    private JButton botonLogin;
    private JButton botonSalida;

    public VentanaPrincipal() {

        super("VentanaPrincipal",800,600);
        generarElementosVentana();

    }

    public void generarElementosVentana() {
        generarMensajeBienvenida();
        generarBotonRegistro();
        generarBotonLogin();
        generarBotonSalida();
    }

    public void generarMensajeBienvenida() {
        String textoBienvenida = "Interactive Teachers Academy";
        super.generarJLabelEncabezado(this.bienvenida, textoBienvenida,80,30,700,60);

    }

    public void generarBotonRegistro() {
        String textoBoton = "Registrarse";
        this.botonRegistro = super.generarBoton(textoBoton,300,150,200,80);
        this.add(this.botonRegistro);
        this.botonRegistro.addActionListener(this);
    }

    public void generarBotonLogin() {
        String textoBoton = "Loguearse";
        this.botonLogin = super.generarBoton(textoBoton,300,250,200,80);
        this.add(this.botonLogin);
        this.botonLogin.addActionListener(this);
    }

    public void generarBotonSalida() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton,300,350,200,80);
        this.add(this.botonSalida);
        this.botonSalida.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.botonRegistro){
            VentanaRegistro registro= new VentanaRegistro();
            this.dispose();

        }

        if(e.getSource() == this.botonLogin){
            VentanaLogin login= new VentanaLogin();
            this.dispose();
        }
        if(e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }
    }
}
