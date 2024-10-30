
package EjercicioJuan;


public class Camiones extends Vehiculo{
    private int tamañoRemolque;
    private int numeroEjes;

    public Camiones() {
    }

    public Camiones(int tamañoRemolque, int numeroEjes, int precioInicial, String marca, int precioFinal) {
        super(precioInicial, marca, precioFinal);
        this.tamañoRemolque = tamañoRemolque;
        this.numeroEjes = numeroEjes;
    }

    public int getTamañoRemolque() {
        return tamañoRemolque;
    }

    public void setTamañoRemolque(int tamañoRemolque) {
        this.tamañoRemolque = tamañoRemolque;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public String toString() {
        return "Camiones{" + "tama\u00f1oRemolque=" + tamañoRemolque + ", numeroEjes=" + numeroEjes + '}';
    }

    @Override
    public double precioVenta() {
       double precioVentaInicial=(precioInicial+(0.6)+precioInicial);
       double precioVenta=precioVentaInicial*numeroEjes;
       return precioVenta;

    }
    
    
    
}
