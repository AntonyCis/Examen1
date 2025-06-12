package examen.clases;

public class Matricula extends Estudiante{
    double notaEvaluacion;
    boolean notaValida;

    public Matricula(String nombreEstudiante, int edad, String cedula, String cursoInscrito, double notaEvaluacion) {
        super(nombreEstudiante, edad, cedula, cursoInscrito);
        this.notaEvaluacion = notaEvaluacion;
        this.cursoInscrito = cursoInscrito;
    }


    //METODOS

    public void registrarEvaluacion (){
        System.out.println("Evaluacion registrada: " + "Nota: " + notaEvaluacion + " ,Materia: " + cursoInscrito + " ,Estudiante: " + nombreEstudiante);
    }

    public void mostrarDetalles () {
        System.out.println("Curso Matriculado: " + cursoInscrito + ", Nota Evaluacion: " + notaEvaluacion);
    }
}
