/*Pedir por teclado el día, mes y año de una fecha e indicar si la fecha es correcta. Similar al ejercicio
anterior, pero considerando ahora que hay en realidad meses de 28, 30 y 31 días. Para simplificar
consideremos que no existen años bisiestos.
 */
package EjerciciosDeSwitch;

import java.util.Scanner;


public class EjercicioDeSwitch {
    public static void main(String[] args) {
        int  dia,año,mes;
        Scanner sc=new Scanner(System.in);
        System.out.println("INGRESE EL DIA ");
         dia=sc.nextInt();
         System.out.println("INGRESE  EL MES -EN NUMERO-");
         mes=sc.nextInt();
         System.out.println("INGRESE EL AÑO");
         año=sc.nextInt();
        switch (mes){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (dia<1||dia>31){
                    System.out.println("DIA ERRONEO. EL DIA TIENE QUE SER DE 1-31");   
                } else{
                    System.out.println("LA FECHA ES CORRECTA:"+dia+"/"+mes+"/"+año);
                }
                break;
            case 4: case 6: case 9: case 11:
                if (dia<1||dia>30){
                    System.out.println("DIA ERRONEO. EL DIA TIENE QUE SER DE 1-30"); 
                } else{
                     System.out.println("LA FECHA ES C0RRECTA:"+dia+"/"+mes+"/"+año);
                }
                break;
            case 2:
                if(dia<1||dia>28){
                    System.out.println("DIA ERRONEO. EL DIA TIENE QUE SER DE 1-28");
                } else{
                     System.out.println("LA FECHA ES C0RRECTA:"+dia+"/"+mes+"/"+año);
                }
            default:
                System.out.println("MES ERRONEO. EL MES TIENE QUE SER 1-12");
                
        }
        
    
    }
}
