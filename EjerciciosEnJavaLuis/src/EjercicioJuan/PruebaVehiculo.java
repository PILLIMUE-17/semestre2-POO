
package EjercicioJuan;


public class PruebaVehiculo {
    public static void main(String[] args) {
        Camiones camion1=new Camiones(32,4,5000,"Toyota",10000);
        Camiones camion2=new Camiones(21,8,6000,"AUDI",70000);
        Camiones camion3=new Camiones(12,5,9000,"FORD",50000);
        
        Camiones array[]=new Camiones[3];
        array[0]=camion1;
        array[1]=camion2;
        array[2]=camion3;
        
        Furgonetas furgo1=new Furgonetas(21,3000,"KIA",6000);
        Furgonetas furgo2=new Furgonetas(11,2000,"TWINGO",5000);
     
        System.out.println("----ARRAY DE 3 CAMIONES----");

        for(int i=0;i<array.length;i++){
            System.out.println("EL PRECIO DE VENTA DEL CAMION "+(i+1)+" es: "+array[i].precioVenta());
            
        }
        System.out.println("----ARRAY DE 2 FURGONETAS----");
        
        Furgonetas array1[]=new Furgonetas[2];
        array1[0]=furgo1;
        array1[1]=furgo2;
        
        for(int i=0;i<array1.length;i++){
            System.out.println("El PRECIO DE VENTA DE LA FURGONETA "+(i+1)+" es: "+array1[i].precioVenta());
        }
        System.out.println("-----UNIR LOS DOS ARRAYS---");
        
        Vehiculo array2[]= new Vehiculo[5];
        array2[0]=camion1;
        array2[1]=camion2;
        array2[2]=camion3;
        array2[3]=furgo1;
        array2[4]=furgo2;
        
        for (int i = 0; i <array2.length; i++) {
            
            System.out.println("El PRECIO DE VENTA DE LOS VEHICULOS (CAMIONES PRIMEROS 3, Y FURGONETAS 2 ULTIMOS) "+(i+1)+" es: "+array2[i].precioVenta());

        }

  }
    
}
