
package EjercicioAlfombra;


public class Habitacion {
    public String nombre;
     Alfombra[] alfombras;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Alfombra[] getAlfombras() {
        return alfombras;
    }

    public void setAlfombras(Alfombra[] alfombras) {
        this.alfombras = alfombras;
    }

    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras=new Alfombra[0];
    }
    
    
    /*metodos*/
     public boolean agregarAlfombra(Alfombra alf){
         if(alf!=null){
             
             return true;
         } else {
             return false;
        }
     }

    
    
    
     
    
}
