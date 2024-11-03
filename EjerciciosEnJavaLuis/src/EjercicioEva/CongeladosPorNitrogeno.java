package EjercicioEva;


public class CongeladosPorNitrogeno extends ProductosCongelados{
    private String metodoDeCongelacion;
    private int timpoDeExposicion;

    public CongeladosPorNitrogeno() {
    }

    public CongeladosPorNitrogeno(String metodoDeCongelacion, int timpoDeExposicion, int fechaEnvasado, String pais, double temperatura, String fechaCaducidad, int lote) {
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.timpoDeExposicion = timpoDeExposicion;
    }

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(int fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
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
        return "CongeladosPorNitrogeno: " + "MetodoDeCongelacion= " + metodoDeCongelacion + " TimpoDeExposicion= " + timpoDeExposicion + " FechaEnvasado= "+fechaEnvasado+" Pais= "+pais+" Temperatura= "+temperatura+" FechaCaducidad= "+fechaCaducidad+" Lote= "+lote;
    }

    
    
    
}
