
package EjercicioJuan;


public class Coches extends Vehiculo{
    private int numeroPuertas;

    public Coches() {
    }

    public Coches(int numeroPuertas, int precioInicial, String marca, int precioFinal) {
        super(precioInicial, marca, precioFinal);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Coches{" + "numeroPuertas=" + numeroPuertas + '}';
    }

    @Override
    public double precioVenta() {
        double precioVentaInicial=precioInicial+(0.6);
        return precioVentaInicial;
    }
    
    
    
}
