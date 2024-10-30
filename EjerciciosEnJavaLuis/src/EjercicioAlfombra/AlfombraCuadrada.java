
package EjercicioAlfombra;


public class AlfombraCuadrada extends Alfombra implements IAlfombras{
    public int lado;

    public AlfombraCuadrada() {
    }

    public AlfombraCuadrada(int lado, String color, int precioMetro) {
        super(color, precioMetro);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Alfombra Cuadrada: " + "Lado= " + lado ;
    }
    
      @Override
    public double CalcularSuperficie() {
        
        double CalcularSuperficie=lado*lado;
        return CalcularSuperficie;
    }

    @Override
    public double CalcularPrecio() {
        double precio= CalcularSuperficie()*precioMetro;
        return precio;
    }
}
