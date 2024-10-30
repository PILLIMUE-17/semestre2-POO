
package EjercicioForma;

/**
 *
 * 8.a.1
 */
public class Forma {
    public String nombre;
    public double posicionX;
    public double posicionY;
    public String Color;

    public Forma() {
    }

    public Forma(String nombre, double posicionX, double posicionY, String Color) {
        this.nombre = nombre;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.Color = Color;
    }
    
    public double CalcularArea(){
        return 0;
    }
   
        
   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(double posicionX) {
        this.posicionX = posicionX;
    }

    public double getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(double posicionY) {
        this.posicionY = posicionY;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    @Override
    public String toString() {
        return "Forma{" + "nombre=" + nombre + ", posicionX=" + posicionX + ", posicionY=" + posicionY + ", Color=" + Color + '}';
    }
    
            
    
}
