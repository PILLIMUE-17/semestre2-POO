/*
 * Programa que muestre los números del 1 al 100, pero sin mostrar los múltiplos de 7.
 */
package EjerciciosBucles;



public class Bucle1 {
    public static void main(String[] args) {
        
       for(int i=1;i<=100;i++){
           if (i%7 !=0)
           System.out.println(i);
       }
            
    }
    
}
