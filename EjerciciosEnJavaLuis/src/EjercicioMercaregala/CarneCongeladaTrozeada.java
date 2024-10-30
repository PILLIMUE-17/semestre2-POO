
package EjercicioMercaregala;


public class CarneCongeladaTrozeada extends CarnesCongeladas implements IProducto{
    private int piezasMedias;

    public CarneCongeladaTrozeada(int piezasMedias, String empresa, String nombre, int peso, int precioKilo) {
        super(empresa, nombre, peso, precioKilo);
        this.piezasMedias = piezasMedias;
    }

    public int getPiezasMedias() {
        return piezasMedias;
    }

    public void setPiezasMedias(int piezasMedias) {
        this.piezasMedias = piezasMedias;
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
        this.Origen = Origen;
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
        return "CarneCongeladaTrozeada{" + "piezasMedias=" + piezasMedias + '}';
    }

    @Override
    public double calcularPrecio() {
         return peso*precioKilo;
    }
    
    
}
