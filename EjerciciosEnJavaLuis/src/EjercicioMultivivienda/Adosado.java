
package EjercicioMultivivienda;

public class Adosado extends Vivienda implements IViviendas{
   private int numPlantas;

    public int getNumPlantas() {
        return numPlantas;
    }

    public void setNumPlantas(int numPlantas) {
        this.numPlantas = numPlantas;
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

    @Override
    public String toString() {
        return "Adosado: " + " Numero Plantas= " + numPlantas +" Calle= "+calle+" Superficie= "+superficieMetros;
    }

   

    public Adosado(int numPlantas, String calle, int superficieMetros) {
        super(calle, superficieMetros);
        this.numPlantas = numPlantas;
        this.precio=CalcularPrecio();
    }

    @Override
    public int CalcularPrecio() {
        int CalcularPrecio=(superficieMetros*1000);
        return CalcularPrecio;
    }

    @Override
    public double impuestoMunicipal() {
        double impuestoMunicipal=(CalcularPrecio()*0.05);
        return impuestoMunicipal;    
    }

    @Override
    public void aumentarPrecio(int aumento) {
        this.precio+=aumento;
    }
    
    
    
    
    
}
