
package EjercicioJuan;


public class Furgonetas extends Vehiculo {
    private int capacidadCarga;

    public Furgonetas() {
    }

    public Furgonetas(int capacidadCarga, int precioInicial, String marca, int precioFinal) {
        super(precioInicial, marca, precioFinal);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Furgonetas{" + "capacidadCarga=" + capacidadCarga + '}';
    }

    @Override
    public double precioVenta() {
        double precioVentaInicial=(precioInicial*(0.6))+precioInicial;
        if(capacidadCarga>10){
            double precioVenta=(precioVentaInicial*(0.2))+precioVentaInicial;
            return precioVenta;
            
        }else{
            return precioVentaInicial;
        }
        
    }
    
}
