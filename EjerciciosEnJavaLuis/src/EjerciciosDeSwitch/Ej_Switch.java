/*
 *  * Pedir por teclado dos números enteros correspondientes a un número de mes y un número de año.
Mostrar el número de días que tiene dicho mes. Se debe comprobar que el valor introducido para el
mes esté comprendido entre 1 y 12. Se de be controlar que un año sea bisiesto (un año es bisiesto si es
múltiplo de 4 y no de 100, pero si son bisiestos los múltiplos de 400)

 */
package EjerciciosDeSwitch;

import java.util.Scanner;


public class Ej_Switch {
    public static void main(String[] args) {
        int mes, año;
        boolean añobi;
         Scanner sc=new Scanner(System.in);
         System.out.println("INGRESE EL NUMERO DEL MES:");
         mes=sc.nextInt();
        System.out.println("INGRESE EL AÑO:");
        año=sc.nextInt();
        if (mes<1&&mes>12){
            System.out.println("INGRESE UN MES DE 1 A 12");
            return;
        }
        boolean esBisiesto = (año % 4 == 0 && año % 100!=0)||(año % 400==0);
        
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                
                if (esBisiesto){
                    System.out.println("EL MES "+mes+" y tiene 31 dias, y es un año bisiesto");
                    
                }else{
                    System.out.println("EL MES "+mes+" y tiene 31 dias, y no es un año bisiesto");
                }
                break;
            case 4: case 6: case 9: case 11:
                  
                if (esBisiesto){
                    System.out.println("EL MES "+mes+" y tiene 30 dias, y es un año bisiesto");
                    
                }else{
                    System.out.println("EL MES "+mes+" y tiene 30 dias, y no es un año bisiesto");
                }
                break;
            
            case 2:
                  
                if (esBisiesto){
                    System.out.println("EL MES "+mes+" y tiene 29 dias, y es un año bisiesto");
                    
                }else{
                    System.out.println("EL MES "+mes+" y tiene 28 dias, y no es un año bisiesto");
                }
                break;
            
            }
        }
         
    }
    
  
    
    

