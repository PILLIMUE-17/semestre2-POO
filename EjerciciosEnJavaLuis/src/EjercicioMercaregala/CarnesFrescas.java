
package EjercicioMercaregala;


public class CarnesFrescas extends Carnes implements IProducto{
    private int diasCaducidad;
    

    public CarnesFrescas(int diasCaducidad, String nombre, int peso, int precioKilo) {
        super(nombre, peso, precioKilo);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }

    public void setDiasCaducidad(int diasCaducidad) {
        this.diasCaducidad = diasCaducidad;
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
        return "CarnesFrescas{" + "diasCaducidad=" + diasCaducidad + '}';
    }

    @Override
    public double calcularPrecio() {
        return peso*precioKilo;
    }
    
}
