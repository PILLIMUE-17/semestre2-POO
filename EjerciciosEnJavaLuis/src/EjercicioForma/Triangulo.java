
package EjercicioForma;


public class Triangulo extends Forma implements IFormas{
    private int Base;
    private int Altura;
    private int lado;

    public Triangulo() {
    }

    public Triangulo(int Base, int Altura, String nombre, double posicionX, double posicionY, String Color,int lado) {
        super(nombre, posicionX, posicionY, Color);
        this.lado=lado;
        this.Base = Base;
        this.Altura = Altura;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int getBase() {
        return Base;
    }

    public void setBase(int Base) {
        this.Base = Base;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "Triangulo: " + " Base= " + Base + " Altura= " + Altura ;
    }
    
    

    @Override
    public double CalcularArea() {
        double areaT=(Base*Altura)/2;
        return areaT;
    }

    @Override
    public double calcularPerimetro() {
        double perimetroI=2*lado+Base;
        return perimetroI;
    }

   

    
    

    
    
    
}
