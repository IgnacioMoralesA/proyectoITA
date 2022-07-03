package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class VentanaPestañaCurso extends Ventana {
    private JLabel labelCurso;
    private JButton botonListaEstudiantes;
    private JButton botonAgregarLeccion;
    private JButton botonSalir;


    public VentanaPestañaCurso() {
        super("I.T.A", 500, 500);
        generarElementosVentana();
    }

    private void generarLabel() {
        String textoBienvenida = "Curso ";
        super.generarJLabelEncabezado(this.labelCurso, textoBienvenida, 180, 30, 600, 60);
    }

    public void generarElementosVentana() {
        generarLabel();
        generarBotonLista();
        generarBotonAgregar();
        generarBotonSalir();

    }

    public void generarBotonLista() {
        String textoBoton = "Lista de estudiantes ";
        this.botonListaEstudiantes = super.generarBoton(textoBoton, 90, 100, 300, 80);
        this.add(this.botonListaEstudiantes);
        this.botonListaEstudiantes.addActionListener(this);

    }

    public void generarBotonAgregar() {
        String textoBoton = "Agregar leccion ";
        this.botonAgregarLeccion = super.generarBoton(textoBoton, 90, 200, 300, 80);
        this.add(this.botonAgregarLeccion);
        this.botonAgregarLeccion.addActionListener(this);

    }
    public void generarBotonSalir(){
        String textoBoton = "Salir ";
        this.botonSalir = super.generarBoton(textoBoton, 140, 300, 200, 50);
        this.add(this.botonSalir);
        this.botonSalir.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.botonAgregarLeccion) {
            VentanaPreguntasProfesor ventana = new VentanaPreguntasProfesor();
            this.dispose();


        }
        if (e.getSource() == this.botonListaEstudiantes) {
            VentanaListaEstudiantes ventana = new VentanaListaEstudiantes();
            this.dispose();


        }
        if(e.getSource() == this.botonSalir){
            this.dispose();
            System.exit(0);
        }


    }
}
