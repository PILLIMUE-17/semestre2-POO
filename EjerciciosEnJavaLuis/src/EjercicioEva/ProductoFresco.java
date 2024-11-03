
package EjercicioEva;


public class ProductoFresco extends Producto{
    private int fechaEnvasao;
    private String pais;
    
    

    public ProductoFresco(int fechaEnvasao, String pais, int fechaCaducidad, int lote) {
        
        this.fechaEnvasao = fechaEnvasao;
        this.pais = pais;
    }

    public ProductoFresco() {
    }

    public int getFechaEnvasao() {
        return fechaEnvasao;
    }

    public void setFechaEnvasao(int fechaEnvasao) {
        this.fechaEnvasao = fechaEnvasao;
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
        return "ProductoFresco: " + " FechaEnvasao= " + fechaEnvasao + " Pais= " + pais +" FechaDeCaducidad= "+fechaCaducidad+" Lote= "+lote;
    }
    
    public   boolean verificarFechaCaducidad(int fechaActual){
        if(fechaActual>fechaCaducidad){
            return true;
        }else{
            return false;
        }
        
    }

    
}
