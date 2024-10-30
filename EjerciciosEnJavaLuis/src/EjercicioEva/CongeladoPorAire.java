
package EjercicioEva;


public class CongeladoPorAire extends Producto {
    private String nitrogeno;
    private String oxigeno;
    private String carbono;
    private String vaporDeAgua;

    

    public CongeladoPorAire(String nitrogeno, String oxigeno, String carbono, String vaporDeAgua) {
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.carbono = carbono;
        this.vaporDeAgua = vaporDeAgua;
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

    @Override
    public String toString() {
        return "CongeladoPorAire{" + "nitrogeno=" + nitrogeno + ", oxigeno=" + oxigeno + ", carbono=" + carbono + ", vaporDeAgua=" + vaporDeAgua + '}';
    }

    @Override
    public boolean verificarFechaCaducidad(int fechaActual) {
        if(fechaActual>fechaCaducidad){
            return true;
        }else{
            return false;
            
        }    }
    
    
}
