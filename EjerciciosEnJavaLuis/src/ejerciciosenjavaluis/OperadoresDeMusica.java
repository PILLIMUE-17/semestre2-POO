package Ejerciciosenjavaluis;

import java.util.Scanner;

public class OperadoresDeMusica {

    public static void main(String[] args) {
        double preciosiniva;
        double descuentoprecio = 0, descuentomarca=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESE EL PRECIO DEL APARATO SIN IVA: ");
        preciosiniva = sc.nextDouble();
        sc.nextLine();
        System.out.println("INGRESE LA MARCA DEL APARATO:");
        String marca = sc.nextLine();
        if (preciosiniva < 500) {
            System.out.println("NO TIENES DESCUENTO POR EL VALOR DE TU COMPRA, TOTAL A PAGAR: " + preciosiniva);
        } 
              
        if  (preciosiniva >= 500) {

            descuentoprecio = (preciosiniva * 0.1);
            System.out.println("SE EFECTUARA UN DESCUENTO DEL 10% " + descuentoprecio);
        }
        if (marca.equals("NOSY")) {
            descuentomarca = (preciosiniva) * 0.05;
            System.out.println("SE EFECTUARA UN DESCUENTO DEL 5% POR SER MARCA -NOSY- " +descuentomarca);
        }
       double preciocondescuento= preciosiniva-descuentoprecio-descuentomarca;
       double iva=preciocondescuento*0.19;
       double preciofinal=preciocondescuento+iva;
        System.out.println("EL PRECIO FINAL CON IVA ES DE:"+preciofinal);

    }

}
