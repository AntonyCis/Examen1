package examen.clases;

public class Estudiante{
    String nombreEstudiante;
    int edad;
    String cedula;
    String cursoInscrito;
    private boolean edadValida;

    public Estudiante(String nombreEstudiante, int edad, String cedula, String cursoInscrito) {
        this.nombreEstudiante = nombreEstudiante;
        this.edad = edad;
        this.cedula = cedula;
        this.cursoInscrito = cursoInscrito;
    }

    // Metodos

    public void mostrarDatos (){
        System.out.println("Perfil Estudiante: " +
                "nombre='" + nombreEstudiante + '\'' +
                ", edad=" + edad +
                ", cedula='" + cedula + '\'' +
                ", curso='" + cursoInscrito + '\'' +
                ", edadValida='" + edadValida );
    }

    public void validarEdad () {
        if (edad >= 13 && edad <= 60){
            edadValida = true;
            System.out.println("Esta dentro de la edad permitida");
        } else {
            edadValida = false;
        }
    }

}
