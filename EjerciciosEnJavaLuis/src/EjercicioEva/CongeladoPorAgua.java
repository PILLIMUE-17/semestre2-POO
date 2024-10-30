
package EjercicioEva;


public class CongeladoPorAgua extends Producto {
    private int salinidad;

    public CongeladoPorAgua() {
    }

    public CongeladoPorAgua(int salinidad, int fechaEnvasado, String pais, double temperatura, String fechaCaducidad, int lote) {
        this.salinidad = salinidad;
    }

    public int getSalinidad() {
        return salinidad;
    }

    public void setSalinidad(int salinidad) {
        this.salinidad = salinidad;
    }

    @Override
    public String toString() {
        return "CongeladoPorAgua{" + "salinidad=" + salinidad + '}';
    }

    @Override
    public boolean verificarFechaCaducidad(int fechaActual) {
        if(fechaActual>fechaCaducidad){
            return true;
        }else{
            return false;
            
        }    }
    
    
}
