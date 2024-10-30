
package EjercicioVivienda;
/*Crear la clase Vivienda. Atributos públicos String calle, int numero, double precio, int superficie, boolean
conGarage. Crear al menos dos constructors y ademas uno por defecto. Hacer programa Principal, con
un método main donde se creen objetos de la clase con todos los constructores, y consultar sus
atributos por consola*/

public class Vivienda {
    public String calle;
    public int numero;
    public double precio;
    public int superficie;
    public boolean conGaraje;
    

    public Vivienda() {
    }

    public Vivienda(String calle, int numero, double precio, int superficie, boolean conGaraje) {
        this.calle = calle;
        this.numero = numero;
        this.precio = precio;
        this.superficie = superficie;
        this.conGaraje = conGaraje;
    }

    public Vivienda(String calle, double precio, boolean conGaraje) {
        this.calle = calle;
        this.precio = precio;
        this.conGaraje = conGaraje;
    }

    
    
    
}
