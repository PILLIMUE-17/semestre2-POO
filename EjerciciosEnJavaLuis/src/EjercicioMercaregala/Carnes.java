
package EjercicioMercaregala;


public class Carnes extends Producto{
    public String Origen;

    public Carnes(String nombre, int peso, int precioKilo) {
        super(nombre, peso, precioKilo);
    }

    public String getOrigen() {
        return Origen;
    }

    public void setOrigen(String Origen) {
       if(Origen.equals("Avicola")){
           
       }else if (Origen.equals("Vacuno")){
           
       }else{
           System.out.println("ORIGEN NO VALIDO");
       }
    }
    
}
