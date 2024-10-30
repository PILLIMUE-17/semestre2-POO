
package Herencia;


public class Coche extends Vehiculo {
    private int numPlazas;

    public Coche(int numPlazas, String color, String marca) {
        super(color, marca);
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

 
}
