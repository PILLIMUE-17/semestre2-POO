
package EjercicioMultivivienda;

 
public abstract class Vivienda {
    protected String calle;
    protected double precio;
    
    protected int superficieMetros;

    public Vivienda(String calle, int superficieMetros) {
        this.calle = calle;
       this.precio=CalcularPrecio();
        this.superficieMetros = superficieMetros;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    

    public int getSuperficieMetros() {
        return superficieMetros;
    }

    public void setSuperficieMetros(int superficieMetros) {
        this.superficieMetros = superficieMetros;
    }
    
    public abstract int CalcularPrecio();
        
    public abstract double impuestoMunicipal();
    
    
    
    
    
    
}
