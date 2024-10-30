
package EjercicioProfesor;


public class ProfesorEmerito extends Profesor {
    private int añosEmirito;
    
    public double obtenerSalarioBase(){
        double obtenerSalarioBase=925+añosConsolidados*12.25+23.30*añosEmirito;
        return obtenerSalarioBase;
        
        
    }
    public void mostrarAtributos(){
        System.out.println(añosConsolidados);
    
}
    
}
