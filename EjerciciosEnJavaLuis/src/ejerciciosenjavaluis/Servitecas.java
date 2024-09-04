
package Ejerciciosenjavaluis;


import java.util.Scanner;



public class Servitecas {
    public static void main(String[] args) {
        double preciollantas;
        Scanner input = new Scanner (System.in);
        System.out.println("INGRESE LA CANTIDAD DE LLANTAS -PINCHADAS- A COMPRAR ");
        int cant= input.nextInt();
        if (cant<0){
            System.out.println("ERROR NO SE ACEPTAN NUMEROS NEGATIVOS ");
        }
        else if (cant<5){
           preciollantas=(cant*100);
            System.out.println("POR "+cant+" LLANTAS MARCA PINCHADAS. EL VALOR UNITARIO DE ELLAS ES DE 100U, VALOR TOTAL A PAGAR ES DE:"+preciollantas);
           
        }
        else if (cant>=5&&cant<=10){
             preciollantas=(cant*75);
             System.out.println("POR "+cant+" LLANTAS MARCA PINCHADAS. EL VALOR UNITARIO DE ELLAS ES DE 75U, VALOR TOTAL A PAGAR ES DE:"+preciollantas);
        }
        else{
            preciollantas=(cant*50);
             System.out.println("POR "+cant+" LLANTAS MARCA PINCHADAS. EL VALOR UNITARIO DE ELLAS ES DE 50U, VALOR TOTAL A PAGAR ES DE:"+preciollantas);
        }
            
    }
    
}
