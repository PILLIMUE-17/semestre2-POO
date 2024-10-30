
package EjercicioMercaregala;


public class Pescado extends Producto implements IProducto {
    private String tipoPescado;

    public Pescado(String tipoPescado, String nombre, int peso, int precioKilo) {
        super(nombre, peso, precioKilo);
        this.tipoPescado = tipoPescado;
    }

    public String getTipoPescado() {
        return tipoPescado;
    }

    public void setTipoPescado(String tipoPescado) {
        this.tipoPescado = tipoPescado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPrecioKilo() {
        return precioKilo;
    }

    public void setPrecioKilo(int precioKilo) {
        this.precioKilo = precioKilo;
    }

    @Override
    public String toString() {
        return "Pescado{" + "tipoPescado=" + tipoPescado + '}';
    }

    @Override
    public double calcularPrecio() {
        return peso*precioKilo; 
    }
    
    
}
