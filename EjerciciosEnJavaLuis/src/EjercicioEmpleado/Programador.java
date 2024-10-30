package EjercicioEmpleado;


public class Programador extends Empleado {
    private int lineaDeCodigoPorHora;
    private String lenguajeDominante;

    public Programador() {
    }

    public Programador(int lineaDeCodigoPorHora, String lenguajeDominante, String nombre, String dni, int edad, boolean casado, double salario) {
        super(nombre, dni, edad, casado, salario);
        this.lineaDeCodigoPorHora = lineaDeCodigoPorHora;
        this.lenguajeDominante = lenguajeDominante;
    }
    
    public double calcularSalario(){
        double calcularSalario=10*lineaDeCodigoPorHora;
        return calcularSalario;
    }

    public int getLineaDeCodigoPorHora() {
        return lineaDeCodigoPorHora;
    }

    public void setLineaDeCodigoPorHora(int lineaDeCodigoPorHora) {
        this.lineaDeCodigoPorHora = lineaDeCodigoPorHora;
    }

    public String getLenguajeDominante() {
        return lenguajeDominante;
    }

    public void setLenguajeDominante(String lenguajeDominante) {
        this.lenguajeDominante = lenguajeDominante;
    }

    @Override
    public String toString() {
        return "Programador: " + "LineaDeCodigoPorHora= " + lineaDeCodigoPorHora + " LenguajeDominante= " + lenguajeDominante + " Nombre= "+nombre+" Dni= "+dni+" Edad= "+edad+" Casado= "+casado+" Salario= "+salario;
    }
    
}
