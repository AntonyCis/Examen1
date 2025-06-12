package examen.clases;

public class Docente {
    private String nombreCompleto;
    private int edad;
    private String cedula;
    private String materia;
    private String curso;


    // Constructores
    public Docente(String nombreCompleto, int edad, String cedula, String materia, String curso) {
        this.nombreCompleto = nombreCompleto;
        this.edad = edad;
        this.cedula = cedula;
        this.materia = materia;
        this.curso = curso;
    }

    //GETTERS AND SETTERS
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Metodos

    public void mostrarPerfil (){
        System.out.println("Perfil Docente: " +
                "nombre='" + nombreCompleto + '\'' +
                ", edad=" + edad +
                ", cedula='" + cedula + '\'' +
                ", materia='" + materia + '\'' +
                ", curso='" + curso + '\'');
    }
}
