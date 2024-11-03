
package EjercicioEva;


public class ProductosCongelados extends Producto{
    protected int fechaEnvasado;
    protected String pais;
    protected double temperatura;

    public ProductosCongelados(int fechaEnvasado, String pais, double temperatura, String fechaCaducidad, int lote) {
      
        this.fechaEnvasado = fechaEnvasado;
        this.pais = pais;
        this.temperatura = temperatura;
    }

    public ProductosCongelados() {
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
        return "ProductosCongelados{" + "fechaEnvasado=" + fechaEnvasado + ", pais=" + pais + ", temperatura=" + temperatura + '}'+super.toString();
    }

 
    
    
    
    
}
