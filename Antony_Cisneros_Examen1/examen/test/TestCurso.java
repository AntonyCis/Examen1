package examen.test;

import examen.clases.CursoCertificado;
import examen.clases.Docente;
import examen.clases.Estudiante;
import examen.clases.Matricula;

public class TestCurso {
    public static void main(String[] args) {
        Docente d = new Docente("Antony Cisneros", 19, "17527557342","Matematicas", "Regular");
        Estudiante e = new Estudiante("Antony Cisneros", 12, "17527557342","Matematicas");
        d.mostrarPerfil();
        System.out.println("---------------------------------------------------------------------------------------------------");
        Docente d1 = new Docente("Sergio Granizo", 19, "17527557342","Programacion", "Certificado");
        d1.mostrarPerfil();
        System.out.println("---------------------------------------------------------------------------------------------------");
        e.validarEdad();
        e.mostrarDatos();
        System.out.println("---------------------------------------------------------------------------------------------------");
        Matricula m = new Matricula("Antony Cisneros", 12, "17527557342","Matematicas", 2.2);
        m.registrarEvaluacion();
        m.mostrarDetalles();
        System.out.println("---------------------------------------------------------------------------------------------------");
        CursoCertificado cc = new CursoCertificado("Programacion", true, true, true);
        cc.MostrarResumen();

    }
}
