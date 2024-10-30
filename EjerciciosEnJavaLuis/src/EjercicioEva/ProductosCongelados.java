
package EjercicioEva;


public class ProductosCongelados extends Producto{
    private int fechaEnvasado;
    private String pais;
    private double temperatura;

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

    @Override
    public String toString() {
        return "ProductosCongelados{" + "fechaEnvasado=" + fechaEnvasado + ", pais=" + pais + ", temperatura=" + temperatura + '}'+super.toString();
    }

    @Override
    public boolean verificarFechaCaducidad(int fechaActual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
