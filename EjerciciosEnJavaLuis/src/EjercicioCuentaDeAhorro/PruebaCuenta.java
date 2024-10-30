
package EjercicioCuentaDeAhorro;


public class PruebaCuenta {
    public static void main(String[] args) {
            CuentaAhorro cuentaA1= new CuentaAhorro(2000,43122,"CARLOS");
            CuentaCorriente cuentaC1= new CuentaCorriente(2000,4000,142442,"ALBERTO");
            System.out.println("---CUENTA AHORRO----");
            System.out.println(cuentaA1);
            System.out.println("-----METODOS----");
            System.out.println("RETIRAR 300 = "+cuentaA1.retirar(300));
            System.out.println("INGRESAR 500= "+cuentaA1.ingresar(500));
            
            System.out.println("---CUENTA CORRIENTE---");
            System.out.println(cuentaC1);
            System.out.println("-----METODOS----");
            System.out.println("RETIRAR 600 = "+cuentaC1.retirar(600));
            System.out.println("INGRESAR 1100= "+cuentaC1.ingresar(1100));

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
    }
    
}
