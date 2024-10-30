
package EjercicioEmpleado;

/**
 *
 * 8.a.2
 */
public class Empleado {
    public String nombre;
    public String dni;
    public int edad;
    public boolean casado;
    public double salario;

    public Empleado() {
    }

    public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        if(edad>=18&&edad<45){
            this.edad=edad;
        }else{
            System.out.println("Edad no valida rango entre 18-45");
        }
            
        this.casado = casado;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad>=18&&edad<45){
            this.edad=edad;
        }else{
            System.out.println("Edad no valida rango entre 18-45");
        }
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public  String clasifica(){
        if(edad<=21){ 
            return"ES PRINCIPIANTE";
        }else if(edad>=22&&edad<=35){
            return "ES INTERMEDIO";
        }else{
            return"ES SENIOR";
        }
        
        
            
    }

    @Override
    public String toString() {
        return "Empleado: " + "nombre= " + nombre + " dni= " + dni + " Edad= " + edad + " Casado= " + casado + " Salario= " + salario ;
    }
    public double subirSalario(int x){
        double subirSalario=(salario*x/100)+salario;
        return subirSalario;
    }

}
