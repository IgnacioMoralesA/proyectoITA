package Herramientas;

public class CalculadoraBasica {

    public static double sumar(double a, double b) {
        return a+b;
    }

    public static double restar(double a, double b) {
        return a-b;
    }

    public static double multiplicar(double a, double b) {
        return a*b;
    }

    public static double dividir(double a, double b){
        return a/b;
    }

    public static double mayor(double a, double b) {
        return Math.max(a,b);
    }

    public static double menor(double a, double b) {
        return Math.min(a,b);
    }

    public static double modulo(double a, double b){
        return a%b;
    }
}