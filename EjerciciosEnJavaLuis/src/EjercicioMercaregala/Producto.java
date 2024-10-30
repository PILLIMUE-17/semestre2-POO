
package EjercicioMercaregala;


public class Producto implements IProducto {
    protected String nombre;
    protected int peso;
    protected int precioKilo;

    public Producto() {
    }

    public Producto(String nombre, int peso, int precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
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
        return "BaseProducto{" + "nombre=" + nombre + ", peso=" + peso + ", precioKilo=" + precioKilo + " Precio= "+calcularPrecio();
    }
    
    

    @Override
    public double calcularPrecio() {
        return peso*precioKilo;
    }
    
}
