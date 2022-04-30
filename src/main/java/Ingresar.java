import java.util.Scanner;

public class Ingresar {
    public static void MenuIngreso(){
        Scanner sn = new Scanner(System.in);
        String teclado1;
        String teclado2;
        System.out.println("A continuacion escriba sus datos de ingreso:");
        System.out.print("Usuario: ");
        teclado1 = sn.next();
        System.out.print("Contraseña: ");
        teclado2 = sn.next();

        //Cambiar esto:
        if (teclado1=="profesor"){
            Profesor profesor1 = new Profesor();
            profesor1.menuProfesor();
            System.out.println();

        }else if (teclado1=="alumno"){
            Alumno alumno1 = new Alumno();
            alumno1.menuAlumno();
            System.out.println();
        }
    }
}
