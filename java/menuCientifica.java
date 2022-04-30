import java.util.Scanner;

public class menuCientifica {
    static Scanner leer = new Scanner(System.in);
    public static void menuCientifica(){
        try{
            menuCalculadora();
        }catch (Exception e){
            System.out.println("Valor no valido.");
        }
    }
    public static void menuCalculadora(){
        new CalculadoraCientifica();
        int eleccion;
        do {
            do {
                mostrarOpcionesMenu();
                eleccion = leer.nextInt();
                switch (eleccion) {
                    case 1:
                        CalculadoraCientifica.sumar();
                        break;
                    case 2:
                        CalculadoraCientifica.restar();
                        break;
                    case 3:
                        CalculadoraCientifica.multiplicar();
                        break;
                    case 4:
                        CalculadoraCientifica.dividir();
                        break;
                    case 5:
                        CalculadoraCientifica.raiz();
                        break;
                    case 6:
                        CalculadoraCientifica.mayor();
                        break;
                    case 7:
                        CalculadoraCientifica.menor();
                        break;
                    case 8:
                        CalculadoraCientifica.potencia();
                        break;
                    case 9:
                        CalculadoraCientifica.porcentaje();
                        break;
                    case 10:
                        CalculadoraCientifica.ecuacionCuadratica();
                        break;
                    case 11:
                        CalculadoraCientifica.figurasGeometricas();
                        break;
                    case 12:
                        CalculadoraCientifica.sistemaEcuaciones();
                        break;
                    case 13:
                        CalculadoraCientifica.ecuacionRecta();
                        break;
                    case 14:
                        CalculadoraCientifica.factoriales();
                        break;
                    case 15:
                        CalculadoraCientifica.divisores();
                        break;
                    case 16:
                        CalculadoraCientifica.logaritmoNatural();
                        break;
                    case 17:
                        CalculadoraCientifica.logaritmo10();
                        break;
                    case 18:
                        CalculadoraCientifica.seno();
                        break;
                    case 19:
                        CalculadoraCientifica.coseno();
                        break;
                    case 20:
                        CalculadoraCientifica.tangente();
                        break;
                    case 21:
                        CalculadoraCientifica.multiplicaSuma();
                        break;
                    case 22:
                        CalculadoraCientifica.senoHiperbolico();
                        break;
                    case 23:
                        CalculadoraCientifica.cosenoHiperbolico();
                        break;
                    case 24:
                        CalculadoraCientifica.tangenteHiperbolica();
                        break;
                    case 25:
                        CalculadoraCientifica.menuMatriz();
                        break;
                    case 26:
                        CalculadoraCientifica.valorAbsoluto();
                        break;
                    case 27:
                        CalculadoraCientifica.sumatoria();
                        break;
                    case 28:
                        break;
                }
            } while (eleccion < 1 || eleccion > 28);
        }while (eleccion != 28);
    }
    public static void mostrarOpcionesMenu(){
        System.out.println("Qué operación desea realizar? ");
        System.out.println("[1] Sumar");
        System.out.println("[2] Restar");
        System.out.println("[3] Multiplicar");
        System.out.println("[4] Dividir");
        System.out.println("[5] Raiz");
        System.out.println("[6] Sacar el número mayor");
        System.out.println("[7] Sacar el número menor");
        System.out.println("[8] Potencia");
        System.out.println("[9] Porcentaje");
        System.out.println("[10] Ecuación Cuadrática");
        System.out.println("[11] Perímetros, Áreas o Volúmenes");
        System.out.println("[12] Sistema de Ecuaciones (2 incógnitas)");
        System.out.println("[13] Ecuaciones de la recta");
        System.out.println("[14] Factoriales");
        System.out.println("[15] Divisores");
        System.out.println("[16] Logaritmo natural");
        System.out.println("[17] Logaritmo base 10");
        System.out.println("[18] Seno");
        System.out.println("[19] Coseno");
        System.out.println("[20] Tangeno");
        System.out.println("[21] Multiplica dos numeros y suma un tercero");
        System.out.println("[22] Seno hiperbolico");
        System.out.println("[23] Coseno hiperbolico");
        System.out.println("[24] Tangente hiperbolica");
        System.out.println("[25] Matriz");
        System.out.println("[26] Valor absoluto");
        System.out.println("[27] Sumatoria");
        System.out.println("[28] Salir");
    }
}
