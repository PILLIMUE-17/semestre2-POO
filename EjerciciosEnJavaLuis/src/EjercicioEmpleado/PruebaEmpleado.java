
package EjercicioEmpleado;




public class PruebaEmpleado {
    public static void main(String[] args) {
        Programador programador1=new Programador(34,"JAVA","LUIS","1231312",24,false,3000);
        Empleado empleado1=new Empleado("PAULA","4324565",18,true,4000);
        
        System.out.println(programador1);
        System.out.println("---------------");
        System.out.println(empleado1);
        System.out.println("---------------");
        
        System.out.println("---PROBAR METODOS---");
        System.out.println("CLASIFICACION DEL PROGRAMADOR= "+programador1.clasifica());
        System.out.println("CLASIFICACION DEL EMPLEADO= "+empleado1.clasifica());
        System.out.println("-----METODO SUBIR SALARIO AUMENTO 40%-----");
       
        
        System.out.println("AUMENTO SALARIO PROGRAMADOR= "+programador1.subirSalario(40));
        System.out.println("AUMENTO SALARIO EMPLEADO= "+empleado1.subirSalario(40));
        System.out.println("-------------");

        System.out.println("---PROBAR METODO Calcular salario----");
        System.out.println("CALCULAR SALARIO PROGRAMADOR= "+programador1.calcularSalario());
     

        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
