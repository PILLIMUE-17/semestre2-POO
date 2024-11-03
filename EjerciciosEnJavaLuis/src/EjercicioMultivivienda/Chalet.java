
package EjercicioMultivivienda;

public class Chalet extends Vivienda implements IViviendas{
    private int numParcela;
    private boolean conPiscina;

    public int getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(int numParcela) {
        this.numParcela = numParcela;
    }

    public boolean isConPiscina() {
        return conPiscina;
    }

    public void setConPiscina(boolean conPiscina) {
       this.conPiscina=conPiscina;
        
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
        return "Chalet1: " + " Numero Parcela= " + numParcela + " ConPiscina= " + conPiscina +" Calle= "+calle+" Superficie= "+superficieMetros;
    }

    public Chalet(int numParcela, boolean conPiscina, String calle, int superficieMetros) {
        super(calle, superficieMetros);
        this.numParcela = numParcela;
        this.precio= CalcularPrecio();
         
        if(conPiscina==true){
            this.conPiscina=conPiscina;
        }else if(conPiscina==false){
            this.conPiscina=false;
        }
    }

    @Override
    public int CalcularPrecio() {
        int CalcularPrecio=(superficieMetros*1300);
        return CalcularPrecio;
    }

    @Override
    public double impuestoMunicipal() {
        if(conPiscina==true){
        double impuestoMunicipal=(CalcularPrecio()*0.05)+200;
        return impuestoMunicipal;    
        }else{
        double impuestoMunicipal=(CalcularPrecio()*0.05);
        return impuestoMunicipal;
        }
    }

    @Override
    public void aumentarPrecio(int aumento) {
        this.precio+=aumento;
    }
            
            
            
            
            
            
            
            
    
    
    
    
}
