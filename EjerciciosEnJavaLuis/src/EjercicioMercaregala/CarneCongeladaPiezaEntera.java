
package EjercicioMercaregala;


public class CarneCongeladaPiezaEntera extends CarnesCongeladas implements IProducto {
    private boolean bandeja;
    

    public CarneCongeladaPiezaEntera(boolean bandeja, String empresa, String nombre, int peso, int precioKilo) {
        super(empresa, nombre, peso, precioKilo);
        this.bandeja = bandeja;
    }

    public boolean isBandeja() {
        return bandeja;
    }

    @Override
    public String toString() {
        return "CarneCongeladaPiezaEntera{" + "bandeja=" + bandeja + '}';
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
    public double calcularPrecio() {
    
        return peso*precioKilo;
    }

    
    
    
   
    
    
    
}
