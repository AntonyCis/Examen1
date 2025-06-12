package examen.clases;

public class CursoCertificado extends Curso{
    private double precio = 144;
    private double precioFinal;

    public CursoCertificado(String nombreCurso, boolean duracionFija, boolean evaluacionFinal, boolean recargo) {
        super(nombreCurso, duracionFija, evaluacionFinal, recargo);
    }

    public void calcularPrecioFinal (){
        if (recargo == true) {
            precioFinal = precio + (precio* 0.25);
        }
    }

    public void MostrarResumen(){

    }
}
