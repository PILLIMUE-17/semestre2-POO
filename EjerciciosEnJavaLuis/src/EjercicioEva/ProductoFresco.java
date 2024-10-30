
package EjercicioEva;


public class ProductoFresco{
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

    @Override
    public String toString() {
        return "ProductoFresco{" + "fechaEnvasao=" + fechaEnvasao + ", pais=" + pais + '}'+" "+super.toString();
    }
    
    public   boolean verificarFechaCaducidad(int fechaActual){
        System.out.println("metodo desarrollado en productofresco");
        return true;
    }

    
}
