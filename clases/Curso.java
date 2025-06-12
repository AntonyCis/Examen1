package examen.clases;

public class Curso {
    String nombreCurso;
    boolean duracionFija;
    boolean evaluacionFinal;
    boolean recargo;

    public Curso(String nombreCurso, boolean duracionFija, boolean evaluacionFinal, boolean recargo) {
        this.nombreCurso = nombreCurso;
        this.duracionFija = duracionFija;
        this.evaluacionFinal = evaluacionFinal;
        this.recargo = recargo;
    }
}
