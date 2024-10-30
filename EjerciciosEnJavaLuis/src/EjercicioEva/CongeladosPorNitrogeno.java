package EjercicioEva;


public class CongeladosPorNitrogeno extends Producto{
    private String metodoDeCongelacion;
    private int timpoDeExposicion;

    public CongeladosPorNitrogeno() {
    }

    public CongeladosPorNitrogeno(String metodoDeCongelacion, int timpoDeExposicion, int fechaEnvasado, String pais, double temperatura, String fechaCaducidad, int lote) {
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.timpoDeExposicion = timpoDeExposicion;
    }

    public CongeladosPorNitrogeno(String metodoDeCongelacion, int timpoDeExposicion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.timpoDeExposicion = timpoDeExposicion;
    }

    public String getMetodoDeCongelacion() {
        return metodoDeCongelacion;
    }

    public void setMetodoDeCongelacion(String metodoDeCongelacion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
    }

    public int getTimpoDeExposicion() {
        return timpoDeExposicion;
    }

    public void setTimpoDeExposicion(int timpoDeExposicion) {
        this.timpoDeExposicion = timpoDeExposicion;
    }

    @Override
    public String toString() {
        return "CongeladosPorNitrogeno{" + "metodoDeCongelacion=" + metodoDeCongelacion + ", timpoDeExposicion=" + timpoDeExposicion + '}';
    }

    @Override
    public boolean verificarFechaCaducidad(int fechaActual) {
        if(fechaActual>fechaCaducidad){
            return true;
        }else{
            return false;
            
        }
    }
    
    
}
