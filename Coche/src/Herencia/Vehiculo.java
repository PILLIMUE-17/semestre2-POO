
package Herencia;

 
public class Vehiculo {
    private String color;
    private String marca;

    public Vehiculo(String color, String marca) {
        this.color = color;
        this.marca = marca;
    }

    public Vehiculo() {
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + '}';
    }
    public void pintar(String colornuevo){
        
    }
}
