import java.util.*;

public class MenuPrincipal {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        try{
            menuPrincipal();
        }catch (Exception e){
            System.out.println("Opción inválida");
        }
    }

    public static void menuPrincipal(){
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
                    Registrar registro = new Registrar();
                    registro.MenuRegistro();
                    System.out.println();
                    break;
                case 2:
                    Ingresar ingreso = new Ingresar();
                    ingreso.MenuIngreso();
                    System.out.println();
                    break;

                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 3");
            }
        }while (!salir);
    }
}


