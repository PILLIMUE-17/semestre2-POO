
package EjercicioAlfombra;


public class AlfombraRedonda extends Alfombra implements IAlfombras {
 public int radio;

    public AlfombraRedonda() {
    }

    public AlfombraRedonda(int radio, String color, int precioMetro) {
        super(color, precioMetro);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Alfombra Redonda: " + "Radio=" + radio ;
    }

    @Override
    public double CalcularSuperficie() {
        double pi=3.14;
        double CalcularSuperficie= (pi*radio*radio);
 
        return Math.round(CalcularSuperficie * 100.0) / 100.0;
        
    }

    @Override
    public double CalcularPrecio() {
        double CalcularPrecio= (double) (CalcularSuperficie()*precioMetro);
        

        return CalcularPrecio;
        
        
    }
 
}
