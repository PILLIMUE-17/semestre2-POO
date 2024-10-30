
package cuentas;


public class Cuenta {
      private  int numerolargo;
        private double saldo;
        private Persona cliente;

    public Cuenta(int numerolargo, Persona cliente) {
        this.numerolargo = numerolargo;
        this.cliente = cliente;
    }

    public int getNumerolargo() {
        return numerolargo;
    }

    public void setNumerolargo(int numerolargo) {
        this.numerolargo = numerolargo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numerolargo=" + numerolargo + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
        public void ingresar(double x){
            if(x>0){
                this.saldo+=x;
            }else{
                System.out.println("importe no valido");
            }
        }
          public void retirar(double x){
               if(x<=saldo){
                 this.saldo-=x;
                }else{
                   System.out.println("saldo insuficiente para retirar");
               }
                
          }
}
                      
               
                
           
            
        

