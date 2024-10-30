
package coche;


public class Prueba {
    public static void main (String[] args){
        Coche miCoche=new Coche();
        miCoche.marca="toyota";
        miCoche.color="black";
        miCoche.cilindrada=2500;
        miCoche.matricula="toyota";
        System.out.println("marca"+miCoche.marca);
        
        System.out.println("color:"+miCoche.color);
        miCoche.color="negro";
        miCoche.decirSiEsMetalizado();
        
        System.out.println("cilindrada"+miCoche.cilindrada);
        System.out.println("color inicial"+miCoche.color);
        miCoche.cambiarColor("red");
        System.out.println("color actualizado:"+miCoche.color);

       Coche c2 = new Coche("audi","blanco","RTYH",168436);
        System.out.println("marca");
    }
    
}
