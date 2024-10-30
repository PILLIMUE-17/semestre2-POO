
package EjercicioEmpleadoT;


public class PruebaEmpleadoT {
    public static void main(String[] args) {
        
    
    Empleado empleado1=new Empleado("PAULA","3124272341");
    Empleado empleado2=new Empleado("CARLOS","3204373841");
    Empleado empleado3=new Empleado("LUIS","335282342");
    Empleado empleado4=new Empleado("LEIDY","3144172745");
    
    Empleado cont[]=new Empleado[4];
    cont[0]= empleado1; 
    cont[1]= empleado2; 
    cont[2]= empleado3; 
    cont[3]= empleado4; 
    
    for(int i=0;i<cont.length;i++){
        System.out.println("Empleado "+(i+1)+" Nombre= "+cont[i].getNombre()+" Telefono= "+cont[i].getTelefono());
    }
        System.out.println("----EMPLEADOS INSTANCIADOS----");
        System.out.println("Empleados instaciados= "+Empleado.getNumeroEmpleados());
    
    
    
    
    
    }

}
