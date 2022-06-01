package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaEstudiante extends Ventana {
    private JLabel bienvenida;
    private JButton LeccionX1,LeccionX2,LeccionY1,LeccionY2,LeccionZ1,LeccionZ2,botonSalida;


    public VentanaEstudiante() {

        super("VentanaEstudiante", 600, 800);
        generarElementosVentana();

    }


    public void generarElementosVentana() {
        generarMensajeBienvenida();
        generarBotonLeccionX1();
        generarBotonLeccionX2();
        generarBotonLeccionY1();
        generarBotonLeccionY2();
        generarBotonLeccionZ1();
        generarBotonLeccionZ2();

        generarBotonSalida();
    }


    public void generarMensajeBienvenida() {
        String textoBienvenida = "Bienvenido Estudiante ";
        super.generarJLabelEncabezado(this.bienvenida, textoBienvenida, 60, 30, 700, 60);

    }


    public void generarBotonLeccionX1() {
        String textoBoton = "LeccionX1";
        this.LeccionX1 = super.generarBoton(textoBoton, 150, 150, 300, 60);
        this.add(this.LeccionX1);
        this.LeccionX1.addActionListener(this);
    }


    public void generarBotonLeccionX2() {
        String textoBoton = "LeccionX2";
        this.LeccionX2 = super.generarBoton(textoBoton, 150, 230, 300, 60);
        this.add(this.LeccionX2);
        this.LeccionX2.addActionListener(this);
    }


    public void generarBotonLeccionY1() {
        String textoBoton = "LeccionY1";
        this.LeccionY1 = super.generarBoton(textoBoton, 150, 310, 300, 60);
        this.add(this.LeccionY1);
        this.LeccionY1.addActionListener(this);
    }

    public void generarBotonLeccionY2() {
        String textoBoton = "LeccionY2";
        this.LeccionY2 = super.generarBoton(textoBoton, 150, 390, 300, 60);
        this.add(this.LeccionY2);
        this.LeccionY2.addActionListener(this);
    }

    public void generarBotonLeccionZ1() {
        String textoBoton = "LeccionZ1";
        this.LeccionZ1 = super.generarBoton(textoBoton, 150, 470, 300, 60);
        this.add(this.LeccionZ1);
        this.LeccionX2.addActionListener(this);
    }

    public void generarBotonLeccionZ2() {
        String textoBoton = "LeccionZ2";
        this.LeccionZ2 = super.generarBoton(textoBoton, 150, 550, 300, 0);
        this.add(this.LeccionZ2);
        this.LeccionX2.addActionListener(this);
    }

    public void generarBotonSalida() {
        String textoBoton = "Salir";
        this.botonSalida = super.generarBoton(textoBoton, 200, 600, 200, 80);
        this.add(this.botonSalida);
        this.LeccionX2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.LeccionX1) {
            JOptionPane.showMessageDialog(this, "Esta opcion esta siendo trabajada para un proximo avance.");
            this.dispose();

        }
        if (e.getSource() == this.LeccionX2) {
            JOptionPane.showMessageDialog(this, "Esta opcion esta siendo trabajada para un proximo avance.");
            this.dispose();


        }
        if (e.getSource() == this.LeccionY1) {
            JOptionPane.showMessageDialog(this, "Esta opcion esta siendo trabajada para un proximo avance.");
            this.dispose();

        }
        if (e.getSource() == this.LeccionY2) {
            JOptionPane.showMessageDialog(this, "Esta opcion esta siendo trabajada para un proximo avance.");
            this.dispose();
            if (e.getSource() == this.botonSalida) {
                this.dispose();
                System.exit(0);
            }
        }
        if (e.getSource() == this.LeccionZ1) {
            JOptionPane.showMessageDialog(this, "Esta opcion esta siendo trabajada para un proximo avance.");
            this.dispose();

        }
        if (e.getSource() == this.LeccionZ2) {
            JOptionPane.showMessageDialog(this, "Esta opcion esta siendo trabajada para un proximo avance.");
            this.dispose();
        }
        if(e.getSource() == this.botonSalida){
            this.dispose();
            System.exit(0);
        }

    }
}
