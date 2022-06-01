import java.util.List;

public class AgregarPreguntas {
    public void agrego() {
        Cuestionario c = new Cuestionario();

        c.agregarPregunta(new Pregunta("Cual es el resultado de 2 * 3", List.of(
                new Respuesta("1", false),
                new Respuesta("5", false),
                new Respuesta("6", true),
                new Respuesta("8", false)
        )));

        c.agregarPregunta(new Pregunta("Cual es el resultado de 1 + 1", List.of(
                new Respuesta("1", false),
                new Respuesta("2", true),
                new Respuesta("4", false),
                new Respuesta("0", false)
        )));

        c.agregarPregunta(new Pregunta("Cual es el resultado de 2*3+6", List.of(
                new Respuesta("18", false),
                new Respuesta("12", true),
                new Respuesta("11", false),
                new Respuesta("0", false)
        )));

        c.agregarPregunta(new Pregunta("Cual es el resultado de 5 / 2", List.of(
                new Respuesta("2,5", true),
                new Respuesta("0,4", false),
                new Respuesta("10", false),
                new Respuesta("25", false)
        )));

        c.preguntar();
        c.imprimirResultados();
    }
}


