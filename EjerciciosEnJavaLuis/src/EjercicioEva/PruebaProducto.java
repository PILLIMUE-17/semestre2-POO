
package EjercicioEva;


public class PruebaProducto {
    public static void main(String[] args) {
        ProductoFresco productoF1= new ProductoFresco(14022023,"NORUEGA",01022024,7);
        ProductoFresco productoF2= new ProductoFresco(13021923,"Colombia",30112000,5);
        
        
        
        ProductosRefrigerados productoR1= new ProductosRefrigerados(32234554,12032000,13,"MEXICO","12/03/2001",2345);
        ProductosRefrigerados productoR2= new ProductosRefrigerados(87645322,11062040,2,"CANADA","13/12/2047",3212);
        ProductosRefrigerados productoR3= new ProductosRefrigerados(76754323,23092012,8,"COLOMBIA","08/07/2022",9876);

        CongeladoPorAgua productoA= new CongeladoPorAgua(32,23052000,"RUSIA",12.3,"12/09/2002",4231);
        CongeladoPorAgua productoA2= new CongeladoPorAgua(43,11072005,"ESPAÑA",11.5,"24/10/2008",7543);

        CongeladoPorAire productoaire= new CongeladoPorAire("12%","41%","23%","34%",12031974,"PORTUGAL",11,"03/12/2024",6789);
        CongeladoPorAire productoaire2= new CongeladoPorAire("15%","34%","12%","32%",11112000,"FRANCIA",12,"02/12/2023",1234);

        CongeladosPorNitrogeno productoN=new CongeladosPorNitrogeno("POR HIELO",13,22012001,"NORUEGA",13,"12/01/2001",1454);
    
        System.out.println("----MOSTRAR LOS DATOS------");
        System.out.println("PRODUCTOS FRESCOS");
        System.out.println(productoF1);
        System.out.println(productoF2);
        System.out.println("---------------------------");
        
        System.out.println("PRODUCTOS REFRIGERADOS");
        System.out.println(productoR1);
        System.out.println(productoR2);
        System.out.println(productoR3);
        System.out.println("---------------------------");
        System.out.println("CONGELADOS POR AGUA");
        System.out.println(productoA);
        System.out.println(productoA2);
        System.out.println("---------------------------");
        
        System.out.println("CONGELADOS POR AIRE");
        System.out.println(productoaire);
        System.out.println(productoaire2);
        
        System.out.println("---------------------------");
        System.out.println(productoN);

        

                

        


        
        


    
    }
    
}
