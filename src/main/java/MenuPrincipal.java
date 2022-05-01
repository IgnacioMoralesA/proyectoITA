import java.io.IOException;
import java.util.*;

public class MenuPrincipal {
    public static void main(String[] args) throws IOException {
        PrincipalMenu();
    }

    public static void PrincipalMenu() throws IOException {
        Scanner ScanHD = new Scanner(System.in);
        boolean salir = false;
        int opcionPrincipal;
        System.out.println("Bienvenido a I.T.A");
        System.out.println("Para esta prueba por consola debe:");
        System.out.println("Ingrese el numero de la opcion de desee");
        do {
            System.out.println("[1] Registrar");
            System.out.println("[2] Ingresar");
            System.out.println("[3] Salir");
            opcionPrincipal = ScanHD.nextInt();

            switch (opcionPrincipal) {
                case 1:
                    System.out.println("En desarrollo, favor testear usuarios ya creados");
                    System.out.println("user1,pass1");
                    System.out.println("user2,pass2");
                    System.out.println("user3,pass3");
                    System.out.println("user4,pass4");
                    System.out.println("user5,pass5");
                    System.out.println("user6,pass6");
                    System.out.println("user7,pass7");


                    break;
                case 2:
                    Login.Loguear();
                    System.out.println("Logueo Exitoso");

                    break;

                case 3:
                    salir = true;

                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }
        }
        while (!salir);
    }

}


