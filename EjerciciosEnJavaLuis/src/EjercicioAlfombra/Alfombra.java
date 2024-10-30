
package EjercicioAlfombra;

/**
 *
 * ejercicio 8.a.10*/


public class Alfombra implements IAlfombras{
    private String color;
    public double precioMetro;

    public Alfombra() {
    }

    public Alfombra(String color, int precioMetro) {
        this.color = color;
        this.precioMetro = precioMetro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioMetro() {
        return precioMetro;
    }

    public void setPrecioMetro(int precioMetro) {
        this.precioMetro = precioMetro;
    }

    @Override
    public String toString() {
        return "Alfombra{" + "color=" + color + ", precioMetro=" + precioMetro + '}';
    }

    @Override
    public double CalcularSuperficie() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double CalcularPrecio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
