
package EjercicioCoche;


public class PruebaCoche {
    public static void main(String[] args) {
        
    
    CocheMatriculado cocheM=new CocheMatriculado(2002,12,"TOYOTA","NARANJA",300,12,9);
    Coche coche=new Coche("FORD","NEGRO",400,9,11);
    coche.setDniTitular("45678");
    coche.setMatricula("AYSTY22");
    
    System.out.println("----MOSTRAR ATRIBUTOS-------");
    System.out.println(cocheM);
    System.out.println(coche);
    System.out.println("------METODOS-------");
    
     coche.comprarCoche(cocheM);
     System.out.println("Nuevo dni del coche después de comprar: " + coche.getDniTitular());
        
     
     
     System.out.println("-------------METODO CALCULAR IMPUESTO MATRICULACION------");
     
        System.out.println("IMPUESTO DE MATRICULACION= "+cocheM.calcularImpuestoMatriculacion());
     
     
    }
    
    
    
    
    
}
