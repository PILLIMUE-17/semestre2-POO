
package coche;


public class CocheV2 {
    private String marca;
    private String color;
    private int km;
    
    private double precio;
    private double factorComtaminacion;
    private int anio;
    
    private String matricula;
    private double impuestoMatriculacion;
    private String dniTitular;

    public CocheV2(String marca, String color, double precio, double factorComtaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
        this.factorComtaminacion = factorComtaminacion;
        this.anio = anio;
        this.km=0;
   }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        if(km>this.km){
            this.km = km;
        }else{
            System.out.println("no se puede actulizar km");
        }
        
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getFactorComtaminacion() {
        return factorComtaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion(double impuestoMatriculacion) {
        this.impuestoMatriculacion = impuestoMatriculacion;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }
    public void anadirKm(int km){
       // this.Km+Km;
         if(km>0){
            this.km += km;
        }else{
            System.out.println("error: km negativo");
        }
        
    }

    @Override
    public String toString() {
        return "CocheV2{" + "marca=" + marca + ", color=" + color + ", km=" + km + ", precio=" + precio + ", factorComtaminacion=" + factorComtaminacion + ", anio=" + anio + ", matricula=" + matricula + ", impuestoMatriculacion=" + impuestoMatriculacion + ", dniTitular=" + dniTitular + '}';
    }
    
}
