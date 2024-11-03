
package EjercicioEva;


public class CongeladoPorAire extends ProductosCongelados {
    private String nitrogeno;
    private String oxigeno;
    private String carbono;
    private String vaporDeAgua;

    public CongeladoPorAire(String nitrogeno, String oxigeno, String carbono, String vaporDeAgua, int fechaEnvasado, String pais, double temperatura, String fechaCaducidad, int lote) {
        super(fechaEnvasado, pais, temperatura, fechaCaducidad, lote);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.carbono = carbono;
        this.vaporDeAgua = vaporDeAgua;
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

    

    

    public String getNitrogeno() {
        return nitrogeno;
    }

    public void setNitrogeno(String nitrogeno) {
        this.nitrogeno = nitrogeno;
    }

    public String getOxigeno() {
        return oxigeno;
    }

    public void setOxigeno(String oxigeno) {
        this.oxigeno = oxigeno;
    }

    public String getCarbono() {
        return carbono;
    }

    public void setCarbono(String carbono) {
        this.carbono = carbono;
    }

    public String getVaporDeAgua() {
        return vaporDeAgua;
    }

    public void setVaporDeAgua(String vaporDeAgua) {
        this.vaporDeAgua = vaporDeAgua;
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
        return "CongeladoPorAire: " + " Nitrogeno= " + nitrogeno + " Oxigeno= " + oxigeno + " Carbono= " + carbono + " VaporDeAgua= " + vaporDeAgua + " FechaEnvasado= "+fechaEnvasado+" Pais= "+pais+" Temperatura= "+temperatura+" FechaCaducidad= "+fechaCaducidad+" Lote= "+lote;

    }

    
    
}
