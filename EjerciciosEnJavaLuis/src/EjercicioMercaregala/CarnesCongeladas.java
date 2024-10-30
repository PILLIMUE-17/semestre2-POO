
package EjercicioMercaregala;


public class CarnesCongeladas extends Carnes implements IProducto {
    private String empresa;
    
    public CarnesCongeladas(String empresa, String nombre, int peso, int precioKilo) {
        super(nombre, peso, precioKilo);
        this.empresa = empresa;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
