package Herramientas;

import java.util.Scanner;

public class Matrices {

    static Scanner leer = new Scanner(System.in);

    public static void menuMatriz(){
        new CalculadoraCientifica();
        int eleccion;
        do{
            do {
                opcionesMatriz();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        generarMatriz2();
                        break;
                    case 2:
                        generarMatriz3();
                        break;
                    case 3:
                        generarMatriz4();
                        break;
                    case 4:
                        break;
                }
            }while (eleccion<1 || eleccion>4);
        }while(eleccion != 4);

    }

    public static void opcionesMatriz(){
        System.out.println("=====MENU=====");
        System.out.println("[1] Generar matriz 2x2");
        System.out.println("[2] Generar matriz 3x3");
        System.out.println("[3] Generar matriz 4x4");
        System.out.println("[4] Salir");
    }

    public static void generarMatriz2(){
        double[][] matriz2x2 = new double[2][2];
        ingresarcoeficientes(matriz2x2);
        menu2x2(matriz2x2);
    }

    private static void menu2x2(double[][] matriz) {
        int eleccion;
        do {
            do {
                opcionesMenu3x3();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        llenarMatriz(matriz);
                        break;
                    case 2:
                        llenarAll(matriz);
                        break;
                    case 3:
                        determinante2x2(matriz);
                        break;
                    case 4:
                        break;
                }
            }while (eleccion<1 || eleccion>4);
        }while (eleccion!=4);
    }

    private static void determinante2x2(double[][] matriz) {
        double suma=matriz[0][0]*matriz[1][1];
        double resta=matriz[0][1]*matriz[1][0];
        double resultado=suma-resta;
        CalculadoraCientifica.resultado(resultado);
    }

    public static void ingresarcoeficientes(double[][] matriz){
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=0;
            }
        }
        mostrarMatriz(matriz);
    }

    public static void generarMatriz3(){
        double[][] matriz3x3 = new double[3][3];
        ingresarcoeficientes(matriz3x3);
        menu3x3(matriz3x3);
    }

    public static void menu3x3(double[][] matriz){
        int eleccion;
        do {
            do {
                opcionesMenu3x3();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        llenarMatriz(matriz);
                        break;
                    case 2:
                        llenarAll(matriz);
                        break;
                    case 3:
                        determinante3x3(matriz);
                        break;
                    case 4:
                        break;
                }
            }while (eleccion<1 || eleccion>4);
        }while (eleccion!=4);
    }

    public static void opcionesMenu3x3(){
        System.out.println("=====MENU=====");
        System.out.println("[1] Llenar matriz");
        System.out.println("[2] Llenar matriz aleatoriamente");
        System.out.println("[3] Determinante");
        System.out.println("[4] Salir");
    }

    public static void llenarMatriz(double[][] matriz){
        double numero;
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println("ingrese valor para la casilla "+"["+x+"] ["+y+"]");
                numero=leer.nextInt();
                matriz[x][y]=numero;
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
        }
        mostrarMatriz(matriz);
    }

    public static void llenarAll(double[][] matriz){
        int numero;
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                numero= (int) (Math.random()*100);
                matriz[x][y]=numero;
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
        }
        mostrarMatriz(matriz);
    }

    public static void mostrarMatriz(double[][] matriz){
        for (int x=0; x < matriz.length; x++) {
            System.out.print("[");
            for (int y=0; y < matriz[x].length; y++) {
                System.out.print (matriz[x][y]);
                if (y!=matriz[x].length-1) System.out.print("\t");
            }
            System.out.println("]");
        }
    }

    public static double determinante3x3(double[][] matriz){
        double sumado1=(matriz[0][0]*matriz[1][1]*matriz[2][2]);
        double sumado2=(matriz[1][0]*matriz[2][1]*matriz[0][2]);
        double sumado3=(matriz[2][0]*matriz[0][1]*matriz[1][2]);
        double restado1=-(matriz[0][2]*matriz[1][1]*matriz[2][0]);
        double restado2=-(matriz[1][2]*matriz[2][1]*matriz[0][0]);
        double restado3=-(matriz[2][2]*matriz[0][1]*matriz[1][0]);
        double sumadoT=sumado1+sumado2+sumado3;
        double restadoT=restado1+restado2+restado3;
        //CalculadoraCientifica.resultado(resutado);
        return sumadoT+restadoT;
    }

    public static void generarMatriz4(){
        double[][] matriz4x4 = new double[4][4];
        ingresarcoeficientes(matriz4x4);
        menu4x4(matriz4x4);
    }

    public static void menu4x4(double[][] matriz) {
        int eleccion;
        do {
            do {
                opcionesMenu4x4();
                eleccion=leer.nextInt();
                switch (eleccion){
                    case 1:
                        llenarMatriz(matriz);
                        break;
                    case 2:
                        llenarAll(matriz);
                        break;
                    case 3:
                        determinante4x4(matriz);
                        break;
                    case 4:
                        break;
                }
            }while (eleccion<1 || eleccion>4);
        }while (eleccion!=4);
    }

    public static void opcionesMenu4x4() {
        System.out.println("=====MENU=====");
        System.out.println("[1] Llenar matriz");
        System.out.println("[2] Llenar matriz aleatoriamente");
        System.out.println("[3] Determinante");
        System.out.println("[4] Salir");
    }

    public static void determinante4x4(double[][] matriz) {
        double sumafila1=(matriz[1][1]*matriz[2][2]*matriz[3][3])+(matriz[2][1]*matriz[3][2]*matriz[1][3])+(matriz[3][1]*matriz[1][2]*matriz[2][3]);
        double restafila1=-(matriz[1][3]*matriz[2][2]*matriz[3][1])-(matriz[2][3]*matriz[3][2]*matriz[1][1])-(matriz[1][2]*matriz[2][1]*matriz[3][3]);
        double sumafila2=(matriz[0][1]*matriz[2][2]*matriz[3][3])+(matriz[2][1]*matriz[3][2]*matriz[0][3])+(matriz[3][1]*matriz[0][2]*matriz[2][3]);
        double restafila2=-(matriz[0][3]*matriz[2][2]*matriz[3][1])-(matriz[2][3]*matriz[3][2]*matriz[0][1])-(matriz[0][2]*matriz[2][1]*matriz[3][3]);
        double sumafila3=(matriz[0][1]*matriz[1][2]*matriz[3][3])+(matriz[1][1]*matriz[3][2]*matriz[0][3])+(matriz[3][1]*matriz[0][2]*matriz[1][3]);
        double restafila3=-(matriz[0][3]*matriz[1][2]*matriz[3][1])-(matriz[1][3]*matriz[3][2]*matriz[0][1])-(matriz[0][2]*matriz[1][1]*matriz[3][3]);
        double sumafila4=(matriz[0][1]*matriz[1][2]*matriz[2][3])+(matriz[1][1]*matriz[2][2]*matriz[0][3])+(matriz[2][1]*matriz[0][2]*matriz[1][3]);
        double restafila4=-(matriz[0][3]*matriz[1][2]*matriz[2][1])-(matriz[1][3]*matriz[2][2]*matriz[0][1])-(matriz[0][2]*matriz[1][1]*matriz[2][3]);
        double fila1=matriz[0][0]*(sumafila1+restafila1);
        double fila2=(-matriz[1][0])*(sumafila2+restafila2);
        double fila3=matriz[2][0]*(sumafila3+restafila3);
        double fila4=(-matriz[3][0])*(sumafila4+restafila4);
        double resultado=fila1+fila2+fila3+fila4;
        CalculadoraCientifica.resultado(resultado);
    }
}