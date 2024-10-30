
package EjercicioCuentaDeAhorro;


public class CuentaAhorro extends Cuenta {
    private int saldoMinimo;

    public CuentaAhorro() {
    }

    public CuentaAhorro(int saldoMinimo, int numeroDeCuenta, String cliente) {
        super(numeroDeCuenta, cliente);
        this.saldoMinimo = saldoMinimo;
    }

    public int getSaldoMinimo() {
        return saldoMinimo;
    }

    public void setSaldoMinimo(int saldoMinimo) {
        this.saldoMinimo = saldoMinimo;
    }

    @Override
    public String toString() {
        return "CuentaAhorro: " + " Saldo Minimo= " + saldoMinimo +" Numero de cuenta= "+numeroDeCuenta+" Cliente= "+cliente;
    }
    

    @Override
    public double retirar(double x) {
        if(x<saldoMinimo){
            double retirable=saldoMinimo-x;
            return retirable;
        }else{
            return 0;
        }
    }

    @Override
    public double ingresar(double x) {
        
        if(x<saldoMinimo){
            double ingresar=saldoMinimo+x;
            return ingresar;
        }else{
            return 0;
        }
    }
    
}
