
package EjercicioEva;


public class ProductosRefrigerados extends Producto {
    private int codigoSupervision;
    private int fechaEnvasado;
    private double temperatura;
    private String pais;

    public ProductosRefrigerados(int codigoSupervision, int fechaEnvasado, double temperatura, String pais, String fechaCaducidad, int lote) {
       
        this.codigoSupervision = codigoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperatura = temperatura;
        this.pais = pais;
    }

    public ProductosRefrigerados() {
    }

    public int getCodigoSupervision() {
        return codigoSupervision;
    }

    public void setCodigoSupervision(int codigoSupervision) {
        this.codigoSupervision = codigoSupervision;
    }

    public int getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(int fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
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
        return "ProductosRefrigerados: " + "CodigoSupervision= " + codigoSupervision + " FechaEnvasado= " + fechaEnvasado + " Temperatura= " + temperatura + " Pais= " + pais +" Lote= "+lote;
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
