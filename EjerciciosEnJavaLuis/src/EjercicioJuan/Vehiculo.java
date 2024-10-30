
package EjercicioJuan;

/**
 *
 * 8.a.5
 */
public class Vehiculo {
    protected int precioInicial;
    protected String marca;
    protected int precioFinal;

    public Vehiculo() {
    }

    public Vehiculo(int precioInicial, String marca, int precioFinal) {
        this.precioInicial = precioInicial;
        this.marca = marca;
        this.precioFinal = precioFinal;
    }

    public int getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(int precioInicial) {
        this.precioInicial = precioInicial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "precioInicial=" + precioInicial + ", marca=" + marca + ", precioFinal=" + precioFinal + '}';
    }
    
    
    public double precioVenta(){
    return 0;
}
}
