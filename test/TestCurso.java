package examen.test;

import examen.clases.Docente;
import examen.clases.Estudiante;
import examen.clases.Matricula;

public class TestCurso {
    public static void main(String[] args) {
        Docente d = new Docente("Antony", 19, "17527557342","Matematicas", "Regular");
        Estudiante e = new Estudiante("Antony", 12, "17527557342","Matematicas");
        d.mostrarPerfil();
        e.validarEdad();
        e.mostrarDatos();

        Matricula m = new Matricula("Antony", 12, "17527557342","Matematicas", 2.2);
        m.registrarEvaluacion();
    }
}
