
package Ejerciciosenjavaluis;

import java.util.Scanner;

public class TiendaDeComputadores {
    public static void main(String[] args) {
        int compu, total1;
        int descuento;
        int totalfin;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero de computadores a comprar ");
        compu = sc.nextInt();
        total1 =(compu*500);
        
        
        if(compu<=0){
            System.out.println("ERROR");
        }
        
        else if (compu<5){
            descuento =(int) (total1*0.1);
            totalfin = (int) (total1-descuento);
            System.out.println("POR LA COMPRA DE "+compu+" COMPUTADORES SE HARA UN DESCUENTO DEL 10% TOTAL= "+totalfin+"EU");
                 
        }
       else if (compu>=5 && compu<10){
            descuento =(int) (total1*0.2);
            totalfin = (int) (total1-descuento);
            System.out.println("POR LA COMPRA DE "+compu+" COMPUTADORES SE HARA UN DESCUENTO DEL 20% TOTAL= "+totalfin+"EU");
            
        }
    
        else if (compu>=10){
            descuento =(int) (total1*0.4);
            totalfin = (int) (total1-descuento);
            System.out.println("POR LA COMPRA DE "+compu+" COMPUTADORES SE HARA UN DESCUENTO DEL 40% TOTAL= "+totalfin+"EU");
           
        }
        else {
            System.out.println("PORFAVOR INSERTE NUMEROS");
           
        }
        
            
            
        
        
        
        
        
        
    }
    
}
