
package EjercicioProfesor;


public class PruebaProfesorEmitero {
    public static void main(String[] args) {
        Profesor profesorE=new Profesor();
        System.out.println(profesorE.añosConsolidados);
        
        System.out.println("1.SI SE PUEDE ACCEDER A UN ATRIBUTO DE LA SUPERCLASE, SIN UTILIZAR EL SUPER NI GET, UTILIZANDO UN METODO, YA QUE EL MODIFICADOR DE ACCESO ESTA EN PROTECTED, YA QUE SOLO LAS PUEDE MODIFICAR Y VER LAS CLASES HIJAS");
        System.out.println("2. NO SE PUEDE ACCEDER A UN ATRIBUTO DESDE UNA SUBCLASE, SI EL ATRIBUTO ES PRIVADO, YA QUE EL MODIFICARDOR PRIVATE HACE EXCLUSIVO Y SOLO EXISTE EN LA CLASE QUE FUE CREADO");
        
        
        
    }
    
}
