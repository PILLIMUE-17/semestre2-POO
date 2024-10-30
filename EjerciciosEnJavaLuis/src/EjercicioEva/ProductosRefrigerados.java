
package EjercicioEva;


public class ProductosRefrigerados {
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

    @Override
    public String toString() {
        return "ProductosRefrigerados{" + "codigoSupervision=" + codigoSupervision + ", fechaEnvasado=" + fechaEnvasado + ", temperatura=" + temperatura + ", pais=" + pais + '}'+super.toString();
    }
    
    
    
}
