
package EjercicioBase;


public class Vehiculo {
    protected String placa;
    protected String marca;
    protected double precio;
    protected int cilindraje;
    protected double impuestoCirculacion;
    protected double cuotaMesGaraje;
    protected static final double constante=100;

    public Vehiculo(String placa, String marca, double precio, int cilindraje) {
        this.placa = placa=null;
        this.marca = marca;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.cuotaMesGaraje=constante;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public double getImpuestoCirculacion() {
        return impuestoCirculacion;
    }

    public void setImpuestoCirculacion(double impuestoCirculacion) {
        this.impuestoCirculacion = impuestoCirculacion;
    }

    public double getCuotaMesGaraje() {
        return cuotaMesGaraje;
    }

    public void setCuotaMesGaraje(double cuotaMesGaraje) {
        if(cuotaMesGaraje<0){
            this.cuotaMesGaraje=cuotaMesGaraje;
        }else{
            
        }

    }
    
    public void calcularImpuestosCirculacion(){
         this.impuestoCirculacion=precio*0.02;
        
    }
    
    public boolean placa(String placa){
        if(placa.length()== 6){
            
            return true ;
            
        }else{
            return false;
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
