/*
 * 
 */
package PracticaParcial;

import java.util.Scanner;

/**
 *
 * 20241221065 LUIS ALFREDO REPIZO PILLIMUE
 */
public class Camiones {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] datoscamion = new double[100][6];
        double tipoproducto=0,tiposervicio=0,valorpark=0,tiempo=0,peso=0,largo=0;

        for (int ncamiones = 0; ncamiones < datoscamion.length; ncamiones++) {
            System.out.print("SERVICIO A REALIZAR (1. DESCARGA 2.CARGA)");
            double tipoServicio = sc.nextDouble();
            if (tipoServicio == 1) {
                System.out.print("TIPO DE PRODUCTO (1. PERECEDERO 2. NO PERECEDERO");
                tipoproducto = sc.nextDouble();

                System.out.print("PESO DE LA CARGA: ");
                 peso = sc.nextDouble();
                switch ((int) tipoproducto) {
                    case 1:
                        if (peso < 8) {
                        valorpark = (15000 * peso);

                        } else {
                             valorpark = (9000 * peso);

                        }

                        break;
                    case 2:
                        if (peso < 8) {
                             valorpark = 60000;

                        } else {
                             valorpark = 60000 + (peso - 10) * 7000;

                        }
                        break;
                }

            } else{
                 System.out.print("TIempo en el parqueadero ");
                 tiempo = sc.nextDouble();

                System.out.print("LARGO DEL CAMION ");
                 largo = sc.nextDouble();
                if (tiempo<=2){
                    valorpark=0;
                    System.out.println("GRATIS");
                }else{
                    if(largo<=4){
                     valorpark=(tiempo-2)*4000;
                    }
                    else{
                        valorpark=(tiempo-2)*4000*1.25;
                            
                            }
                    
                }
                }
                }
                }
            }
                
                
                
               

            
        
    
                
           
          
            
   
             