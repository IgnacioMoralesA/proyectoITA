package Herramientas;

public class trigonometricas {

    public static void seno(){
        String[] operadores={"numero: "};
        double[] numeros= CalculadoraCientifica.ingresarNumeros(operadores);
        double grado=Math.sin(numeros[0]);
        CalculadoraCientifica.resultado(grado);
    }

    public static void coseno(){
        String[] operadores={"numero: "};
        double[] numeros=CalculadoraCientifica.ingresarNumeros(operadores);
        double grado=Math.cos(numeros[0]);
        CalculadoraCientifica.resultado(grado);
    }

    public static void tangente(){
        String[] operadores={"numero: "};
        double[] numeros=CalculadoraCientifica.ingresarNumeros(operadores);
        double a=Math.tan(numeros[0]);
        CalculadoraCientifica.resultado(a);
    }

    public static void aSeno(){
        String[] operadores={"numero: "};
        double[] numeros=CalculadoraCientifica.ingresarNumeros(operadores);
        double a=Math.asin(numeros[0]);
        CalculadoraCientifica.resultado(a);
    }

    public static void aCoseno(){
        String[] operadores={"numero: "};
        double[] numeros=CalculadoraCientifica.ingresarNumeros(operadores);
        double a=Math.acos(numeros[0]);
        CalculadoraCientifica.resultado(a);
    }

    public static void aTangente(){
        String[] operadores={"numero: "};
        double[] numero=CalculadoraCientifica.ingresarNumeros(operadores);
        double a=Math.atan(numero[0]);
        CalculadoraCientifica.resultado(a);
    }
}
