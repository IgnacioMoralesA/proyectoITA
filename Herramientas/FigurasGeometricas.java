package Herramientas;

import java.util.Scanner;

public class FigurasGeometricas {

    static Scanner leer = new Scanner(System.in);

    public static void figurasGeometricas() {
        new CalculadoraCientifica();
        int eleccion;
        do {
            mostrarOpcionesFiguras();
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1 -> perimetros();
                case 2 -> areas();
            }
        }while (eleccion < 1 || eleccion > 2);
    }

    public static void mostrarOpcionesFiguras() {
        System.out.println("=====MENU=====");
        System.out.println("¿Qué desea calcular?");
        System.out.println("[1] Perimetros");
        System.out.println("[2] Areas");
    }

    public static void perimetros() {
        int eleccion;
        do {
            mostrarOpcionesPerimetros();
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    perimetroCuadrado();
                    break;
                case 2:
                    perimetroRectangulo();
                    break;
                case 3:
                    perimetroCirculo();
                    break;
                case 4:
                    volumenEsfera();
                    break;
                case 5:
                    volumenCubo();
                    break;
                case 6:
                    volumenCono();
                    break;
                case 7:
                    break;
            }
        }while (eleccion<1 || eleccion>7);
    }

    public static void mostrarOpcionesPerimetros() {
        System.out.println(" ====MENU==== ");
        System.out.println("[1] Cuadrado");
        System.out.println("[2] Rectangulo");
        System.out.println("[3] Circulo");
        System.out.println("[4] Volumen Esfera");
        System.out.println("[5] Volumen Cubo");
        System.out.println("[6] Volumen Cono");
        System.out.println("[7] Salir");

    }

    public static void perimetroCuadrado(){
        String[] operadores = {"el valor del lado del cuadrado: "};
        double[] numeros = CalculadoraCientifica.ingresarNumeros(operadores);
        double a=numeros[0];
        double perimetro = (4*a);
        CalculadoraCientifica.resultado(perimetro);
    }

    public static void perimetroRectangulo(){
        String[] operadores = {"el alto del rectangulo: ","el ancho del rectangulo: "};
        double[] numeros= CalculadoraCientifica.ingresarNumeros(operadores);
        double a=numeros[0];
        double b=numeros[1];
        double perimetro = (a*b);
        CalculadoraCientifica.resultado(perimetro);
    }

    public static void perimetroCirculo(){
        String[] operadores={"el radio del circulo: "};
        double[] numeros= CalculadoraCientifica.ingresarNumeros(operadores);
        double a = numeros[0];
        double perimetro = (2*a*Math.PI);
        CalculadoraCientifica.resultado(perimetro);
    }

    public static void volumenEsfera(){
        String[] operadores={"el radio de su esfera: "};
        double[] numeros= CalculadoraCientifica.ingresarNumeros(operadores);
        double a = numeros[0];
        double volumen = ((4*Math.pow(a,3)*Math.PI)/3);
        CalculadoraCientifica.resultado(volumen);
    }

    public static void volumenCubo(){
        String[] operadores={"el valor de un lado de su cubo: "};
        double[] numeros= CalculadoraCientifica.ingresarNumeros(operadores);
        double a = numeros[0];
        double volumen = (4*a);
        CalculadoraCientifica.resultado(volumen);
    }

    public static void volumenCono() {
        String[] opradores={"el radio del cono: ","la altura del cono: "};
        double[] numeros= CalculadoraCientifica.ingresarNumeros(opradores);
        double a = numeros[0];
        double b = numeros[1];
        double volumen = ((Math.PI*Math.pow(a,2)*b)/3);
        CalculadoraCientifica.resultado(volumen);
    }

    public static void areas() {
        int eleccion;
        do {
            mostrarOpcionesAreas();
            eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    areaCuadrado();
                    break;
                case 2:
                    areaRectangulo();
                    break;
                case 3:
                    areaCirculo();
                    break;
                case 4:
                    areaEsfera();
                    break;
                case 5:
                    areaCubo();
                    break;
                case 6:
                    areaCono();
                    break;
                case 7:
                    break;
            }
        }while (eleccion<1 || eleccion>7);
    }

    public static void mostrarOpcionesAreas() {
        System.out.println("=====MENU=====");
        System.out.println("Seleccione el área que desea calcular: ");
        System.out.println("[1] Area de un cuadrado");
        System.out.println("[2] Area de un rectangulo");
        System.out.println("[3] Area de un circulo");
        System.out.println("[4] Area de una esfera");
        System.out.println("[5] Area de un cubo");
        System.out.println("[6] Area de un cono");
        System.out.println("[7] Salir");

    }

    public static void areaCuadrado(){
        System.out.println("Cual es el lado de su cuadrado?");
        double a = leer.nextDouble();
        double area = Math.pow(a,2);
        CalculadoraCientifica.resultado(area);
    }

    public static void areaRectangulo(){
        System.out.println("Ingrese el ancho de su rectangulo: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese el alto de su rectangulo: ");
        double b = leer.nextDouble();
        double area = a*b;
        CalculadoraCientifica.resultado(area);
    }

    public static void areaCirculo(){
        System.out.println("Ingrese el radio de su circulo: ");
        double a = leer.nextDouble();
        double area = (Math.PI*Math.pow(a,2));
        CalculadoraCientifica.resultado(area);
    }

    public static void areaEsfera(){
        System.out.println("Ingrese el radio de su esfera: ");
        double a = leer.nextDouble();
        double area = (4*a*Math.PI);
        CalculadoraCientifica.resultado(area);
    }

    public static void areaCubo(){
        System.out.println("Ingrese el valor de un lado de su cubo: ");
        double a = leer.nextDouble();
        double area = (6*Math.pow(a,2));
        CalculadoraCientifica.resultado(area);
    }

    public static void areaCono(){
        System.out.println("Ingrese el radio de el cono: ");
        double a = leer.nextDouble();
        System.out.println("Ingrese el alto de el cono: ");
        double b = leer.nextDouble();
        double g = Math.sqrt((Math.pow(a,2)+Math.pow(b,2)));
        double area = (Math.PI*Math.pow(a,2)+Math.PI*a*g);
        CalculadoraCientifica.resultado(area);
    }
}
