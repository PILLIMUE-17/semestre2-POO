
package EjercicioCoche;


public class Coche {
    protected String marca;
    protected String color;
    protected int km;
    protected double precio;
    protected double factor_contaminacion;
    protected int anio;
    protected String matricula;
    protected String dniTitular;

    public Coche(String marca, String color, double precio, double factor_contaminacion, int anio) {
        this.marca = marca;
        this.color = color;
        this.km=0;
        this.precio = precio;
        this.factor_contaminacion = factor_contaminacion;
        this.anio = anio;
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
        if(km>0){
          this.km += km;

        }
        
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

    public int getAnio() {
        return anio;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getDniTitular() {
        return dniTitular;
    }

    public void setDniTitular(String dniTitular) {
        this.dniTitular = dniTitular;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Coche: " + " Marca= " + marca + " Color= " + color + " km= " + km + " Precio= " + precio + " Factor contaminacion= " + factor_contaminacion + " Año=" + anio + " Matricula= " + matricula + " dniTitular= " + dniTitular ;
    }

    public void comprarCoche(Coche otroCoche){
         if (this.dniTitular != null && otroCoche.getDniTitular() != null) {
            this.dniTitular = otroCoche.getDniTitular();
        } else {
            System.out.println("Ambos coches deben tener un dniTitular asignado.");
        }
    }

    
    
}
