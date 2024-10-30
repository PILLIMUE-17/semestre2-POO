
package EjercicioVivienda;


public class PruebaVivienda {
    public static void main(String[] args) {
        Vivienda casa1= new Vivienda("42b",43,20000,23,true);
        Vivienda casa2= new Vivienda("calle la paz",46782,false);
        Vivienda casa3= new Vivienda ();
        
       
        System.out.println("Vivienda1: Calle= "+casa1.calle+ " Numero= " + casa1.numero+ " Precio= " +casa1.precio+ " Superficie= "+casa1.superficie+" Garaje= "+casa1.conGaraje);
        System.out.println("------------------");
        
        System.out.println("Vivienda2: Calle= "+casa2.calle+" Precio= "+casa2.precio+" Garaje= "+casa2.conGaraje);
        System.out.println("------------------");
        
        System.out.println("Vivienda3: Calle= "+casa3.calle);


       
    }
    
}
