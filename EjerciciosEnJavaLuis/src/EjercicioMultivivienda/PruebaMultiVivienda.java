
package EjercicioMultivivienda;


public class PruebaMultiVivienda {
    public static void main(String[] args) {
        Piso piso1= new Piso(12,10,"Calle 4 #65",3000);
        Adosado adosado1= new Adosado(3,"calle 1 #23",4000);
        Chalet Chalet1= new Chalet(2,true,"Calle 2 #37",2000);
        Chalet Chalet2= new Chalet(3,false,"Calle 5 #12",5000);

        System.out.println("-------MOSTRAR--------");
        System.out.println(piso1);
        System.out.println("Precio Calculado="+piso1.CalcularPrecio());
        System.out.println(adosado1);
        System.out.println("Precio Calculado="+adosado1.CalcularPrecio());
        System.out.println(Chalet1);
        System.out.println("Precio Calculado="+Chalet1.CalcularPrecio());

        System.out.println(Chalet2);
        System.out.println("Precio Calculado="+Chalet2.CalcularPrecio());
        
        System.out.println("-------MEJORAS---------");
        System.out.println("IMPUESTO MUNICIPAL PISO= "+piso1.impuestoMunicipal());
        System.out.println("IMPUESTO MUNICIPAL ADOSADO= "+adosado1.impuestoMunicipal());
        System.out.println("IMPUESTO MUNICIPAL CHALET 1= "+Chalet1.impuestoMunicipal());
        System.out.println("IMPUESTO MUNICIPAL CHALET 2= "+Chalet2.impuestoMunicipal());
        
        System.out.println("----------------------");
        piso1.aumentarPrecio(400);
        System.out.println("PRECIO AUMENTADO 400 EN PISO= "+piso1.precio);
        adosado1.aumentarPrecio(400);
        System.out.println("PRECIO AUMENTADO 400 EN ADOSADO= "+adosado1.precio);
        Chalet1.aumentarPrecio(400);
        System.out.println("PRECIO AUMENTADO 400 EN CHALET1= "+Chalet1.precio);
        Chalet2.aumentarPrecio(400);
        System.out.println("PRECIO AUMENTADO 400 EN CHALET2= "+Chalet2.precio);


        
        
        
        
        
    }
    
}
