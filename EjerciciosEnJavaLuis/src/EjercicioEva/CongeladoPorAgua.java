
package EjercicioEva;


public class CongeladoPorAgua extends ProductosCongelados {
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

    @Override
    public String toString() {
        return "CongeladoPorAgua: " + " Salinidad= " + salinidad +" FechaEnvasado= "+fechaEnvasado+" Pais= "+pais+" Temperatura= "+temperatura+" FechaCaducidad= "+fechaCaducidad+" Lote= "+lote;

    }

   
    
    
}
