
package EjercicioForma;


public class Cuadrado extends Forma implements IFormas {
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado, String nombre, double posicionX, double posicionY, String Color) {
        super(nombre, posicionX, posicionY, Color);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "CUADRADO: " + " LADO= " + lado ;
    }
    
    
    
    

    @Override
    public double CalcularArea() {
        double areaC=lado*lado;
        return areaC;
    }
    
    public double CalcularPerimetro(){
        double perimetroC=lado*4;
        return perimetroC;
    }

    @Override
    public double calcularPerimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
