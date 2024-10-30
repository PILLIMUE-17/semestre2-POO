
package EjercicioCuentaDeAhorro;


public class CuentaCorriente extends Cuenta {
    private int maximoRetirable;

    public CuentaCorriente() {
    }

    public CuentaCorriente(int saldo,int maximoRetirable, int numeroDeCuenta, String cliente) {
        super(numeroDeCuenta, cliente);
        this.saldo=saldo;
        this.maximoRetirable = maximoRetirable;
    }

    public int getMaximoRetirable() {
        return maximoRetirable;
    }

    public void setMaximoRetirable(int maximoRetirable) {
        this.maximoRetirable = maximoRetirable;
    }

    @Override
    public String toString() {
        return "CuentaCorriente: "+" Saldo= "+saldo + " Maximo Retirable= " + maximoRetirable + " Numero de Cuenta= "+numeroDeCuenta+" Cliente= "+cliente;
    }

    @Override
    public double retirar(double x) {
        if(x<=maximoRetirable){
            double retir=saldo-x;
            return retir;
        }else{
            return 0;
        }
    }
     public double ingresar(double x){
        if(x>0){
            double ingresar=saldo+x;
            return ingresar;
        }else{
            return 0;
        }
        
    }

    
}
