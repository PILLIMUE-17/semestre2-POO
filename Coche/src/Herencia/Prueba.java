
package Herencia;


public class Prueba {
    public static void main(String[] args) {
        Coche c=new Coche(5,"kia","rojo");
        System.out.println(c.toString());
        c.pintar("azul");
        System.out.println(c.toString());
        
    }
    
}
