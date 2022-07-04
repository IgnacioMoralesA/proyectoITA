package model;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void añadirEstudiantes(String user, String pass){
        this.estudiantes.add(new Estudiante(user,pass));
    }
}
