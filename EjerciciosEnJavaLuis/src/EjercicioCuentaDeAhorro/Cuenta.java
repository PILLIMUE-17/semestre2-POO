
package EjercicioCuentaDeAhorro;


public abstract class  Cuenta {
    protected int numeroDeCuenta;
    protected double saldo;
    protected String cliente;

    public Cuenta() {
    }

    public Cuenta(int numeroDeCuenta, String cliente) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.cliente = cliente;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    public abstract double ingresar(double x);

        
    
    public abstract double retirar(double x);
}
