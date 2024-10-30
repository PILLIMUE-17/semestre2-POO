
package EjercicioForma;


public class Rectangulo extends Forma {
    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura, String nombre, double posicionX, double posicionY, String Color) {
        super(nombre, posicionX, posicionY, Color);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }

    @Override
    public double CalcularArea() {
        double areaR=base*altura;
        return areaR;
    }
    
   
    
}
