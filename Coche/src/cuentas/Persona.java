
package cuentas;


public class Persona {
    private String nombre;
    private String Nif;

    public Persona(String nombre, String Nif) {
        this.nombre = nombre;
        this.Nif = Nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return Nif;
    }

    public void setNif(String Nif) {
        this.Nif = Nif;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Nif=" + Nif + '}';
    }
    

    
    
}
