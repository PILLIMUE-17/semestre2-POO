
package PooPapel;


public class PruebaPapel {
     public static void main(String[] args) {
          Papel papel1 =new Papel();
    Papel papel2 = new Papel();
    
    
    papel1.color="azul";
    papel1.grosor= 23;
    
    papel2.color="negro";
    papel2.grosor=43;
    
        System.out.println("papel 1: color= "+papel1.color+", grosor= "+papel1.grosor);
         System.out.println("papel 2: color= "+papel2.color+", grosor= "+papel2.grosor);
    }
}
