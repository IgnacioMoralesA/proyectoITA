package Herramientas;

import java.util.LinkedList;
import java.util.Scanner;

public class CalculadoraCientifica extends CalculadoraBasica{

    static Scanner leer = new Scanner(System.in);

    public static double[] ingresarNumeros(String[] operadores) {
        double[] numeros = new double[operadores.length];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese "+operadores[i]);
            numeros[i] = leer.nextDouble();
        }
        return numeros;
    }

    public static double raiz(double a,double b){
        if(a<0){
            System.out.println("Math error");
            return 0;
        }else {
            return Math.sqrt(a+(b*0));
        }
    }

    public static double potencia(double a, double b) {
        return Math.pow(a,b);
    }

    public static double porcentaje(double a, double b) {
        if(b>0){
            return a*(100/b);
        }else{
            return a;
        }
    }

    public static double seno(double a){
        return Math.sin(a);
    }

    public static double coseno(double a){
        return Math.cos(a);
    }

    public static double tangente(double a){
        return Math.tan(a);
    }

    public static double aSeno(double a){
        return Math.asin(a);
    }

    public static double aCoseno(double a){
        return Math.acos(a);
    }

    public static double aTangente(double a){
        return Math.atan(a);
    }

    public static double factoriales(double a) {
        int fact = 1;
        for( int i = 0; i <= a; i++ ) {
            fact *= (i+1);
        }
        return fact;
    }

    public static double logaritmoNatural(double a){
        return Math.log(a);
    }

    public static double logaritmo10(double a){
        return Math.log10(a);
    }

    public static double valorAbsoluto(double a){
        if(a<0){
            return a*=-1;
        }else{
            return a;
        }
    }

    public static void divisores(double a) {
        /*String[] operadores ={"numero"};
        double[] numeros=ingresarNumeros(operadores);
        Double a=numeros[0];*/
        LinkedList<Double>Divisores = agregarDivisores(a);

    }

    public static LinkedList agregarDivisores(Double numero) {
        LinkedList<Double>Divisores = new LinkedList<>();
        for (int i=1;i<(numero+1);i++){
            if(numero%i==0) {
                Divisores.add((double) i);
            }
        }
        mostrarDivisores(Divisores);
        return Divisores;
    }

    private static void mostrarDivisores(LinkedList<Double> divisores) {
        System.out.println(divisores);
    }

    public static double sumatoria(double a){
        double iSumatorio = 0;
        double iContador = a;
        while (iContador != 0) {
            iSumatorio = iSumatorio + iContador;
            iContador--;
        }
        return iSumatorio;
    }

    public static double cbrt(double a){
        return Math.cbrt(a);
    }

    public static void resultado(double resultado){
        System.out.println("El resultado es = "+resultado);
    }
}