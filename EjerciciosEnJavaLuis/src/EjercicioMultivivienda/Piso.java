
package EjercicioMultivivienda;

public class Piso extends  Vivienda implements IViviendas {
    
    private int planta;
    private int puerta;

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public int getPuerta() {
        return puerta;
    }

    public void setPuerta(int puerta) {
        this.puerta = puerta;
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
        return "Piso: " + " Planta= " + planta + " Puerta= " + puerta + " Calle= "+calle+" Superficie= "+superficieMetros;
    }
    
    

    public Piso(int planta, int puerta, String calle, int superficieMetros) {
        super(calle,superficieMetros);
        this.planta = planta;
        this.puerta = puerta;
        this.precio= CalcularPrecio();
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
