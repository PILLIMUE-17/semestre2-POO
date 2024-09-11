/*
 14.Programa consistente en un juego en el que el ordenador genera aleatoriamente un número entre el 1
y el 100 y el usuario tendrá que adivinarlo en un máximo de 10 intentos. Por cada intento del usuario
se mostrará el mensaje “Te pasaste0”, o “No llegaste”, según corresponda. El programa terminará
cuando se agoten los intentos y/o el usuario acierte el número. Se ha de mostrar el mensaje
correspondiente al final así como informar del número “escondido”
 */
package EjerciciosBucles;

import java.util.Random;
import java.util.Scanner;




public class Bucle2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        Random random = new Random();
        int aletorio = random.nextInt(0,100);
        System.out.println("HORA DE JUGAR, TIENES 10 INTENTOS PARA ACERTAR UN NUMERO QUE ESTOY PENSANDO");
        
           for(int i=1;i<=10;i++){
            System.out.println("INTENTO: "+i);
            numero=sc.nextInt();
            if(numero>aletorio){
                System.out.println("te pasate");
            }else if (numero<aletorio){
                System.out.println("no llegaste");
        } else{
                System.out.println("!ACERTASTE¡ EL NUMERO ERA: "+aletorio);
                break;
            } 
            if(i==10){
            System.out.println("SE ACABARON LOS INTENTOS NO HACERTASTE, EL NUMERO ERA: "+aletorio);
        }   
       
        }
        

            
        
        
    }
    
}
