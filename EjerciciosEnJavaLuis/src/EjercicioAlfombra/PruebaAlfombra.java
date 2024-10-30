
package EjercicioAlfombra;


public class PruebaAlfombra {
    public static void main(String[] args) {
        Alfombra alfombraCuadrada= new AlfombraCuadrada(14,"ROSADO",2000);
        Alfombra alfombraRedonda= new AlfombraRedonda(43,"NEGRO",3000);
        
        System.out.print(alfombraRedonda);  
        System.out.println(" Color= "+alfombraRedonda.getColor()+" Precio= "+alfombraRedonda.getPrecioMetro());  
        System.out.println("----CALCULAR METODOS---");
        System.out.println("ALFOMBRA REDONDA");
        System.out.println("SUPERFICIE= "+alfombraRedonda.CalcularSuperficie());
        System.out.println(String.format("PRECIO= %.2f ",alfombraRedonda.CalcularPrecio()));
      
        System.out.print(alfombraCuadrada);  
        System.out.println(" Color= "+alfombraCuadrada.getColor()+" Precio= "+alfombraCuadrada.getPrecioMetro());  
        System.out.println("----CALCULAR METODOS---");
        System.out.println("ALFOMBRA CUADRADA");
        System.out.println("SUPERFICIE= "+alfombraCuadrada.CalcularSuperficie());
        System.out.println("PRECIO= "+alfombraCuadrada.CalcularPrecio());
        
    }
    
}
