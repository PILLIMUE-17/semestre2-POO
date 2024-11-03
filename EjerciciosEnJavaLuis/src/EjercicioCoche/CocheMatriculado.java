
package EjercicioCoche;


public class CocheMatriculado extends Coche {
    private int anioMtriculado;
    private int mesMatriculado;
    private double impuestoMatriculacion;

    public CocheMatriculado(int anioMtriculado, int mesMatriculado, String marca, String color, double precio, double factor_contaminacion, int anio) {
        super(marca, color, precio, factor_contaminacion, anio);
        this.anioMtriculado = anioMtriculado;
        this.mesMatriculado = mesMatriculado;
        this.impuestoMatriculacion = calcularImpuestoMatriculacion();
        this.setMatricula(matricula);
        this.setDniTitular(dniTitular);
    }
    
    public double calcularImpuestoMatriculacion() {
    if(anio>10){
        double calcularImpuestoMatriculacion=(precio/20)+100;
        
        return calcularImpuestoMatriculacion;
    }else{
        double calcularImpuestoMatriculacion=precio/20;
        
        return calcularImpuestoMatriculacion;
    }
      
    
}

    public int getAnioMtriculado() {
        return anioMtriculado;
    }

    public void setAnioMtriculado(int anioMtriculado) {
        this.anioMtriculado = anioMtriculado;
    }

    public int getMesMatriculado() {
        return mesMatriculado;
    }

    public void setMesMatriculado(int mesMatriculado) {
        this.mesMatriculado = mesMatriculado;
    }

    public double getImpuestoMatriculacion() {
        return impuestoMatriculacion;
    }

    public void setImpuestoMatriculacion(double impuestoMatriculacion) {
        this.impuestoMatriculacion = calcularImpuestoMatriculacion();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
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
        this.km = km;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getFactor_contaminacion() {
        return factor_contaminacion;
    }

    public void setFactor_contaminacion(double factor_contaminacion) {
        this.factor_contaminacion = factor_contaminacion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    @Override
    public String toString() {
        return "CocheMatriculado: " + " AñoMatriculado= " + anioMtriculado + " MesMatriculado= " + mesMatriculado + " ImpuestoMatriculacion= " + impuestoMatriculacion+" Marca= "+marca+" Color= "+color+" Precio= "+precio+" Factor contaminacion= "+factor_contaminacion+" Año= "+anio;
    }
    
    
    
    
    
    
    
    
    
    
}
