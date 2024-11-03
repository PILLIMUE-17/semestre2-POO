
package EjercicioBase;


public class Auto extends Vehiculo {
    private boolean tieneRadio;
    private boolean tieneNavegador;

    public Auto(boolean tieneRadio, boolean tieneNavegador, String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.tieneRadio = tieneRadio;
        this.tieneNavegador = tieneNavegador;
    }

    
    public double ImpuestoCirculacion(double impuestoCirculacion) {
        if(tieneRadio==true){
            double ImpuestoCirculacion=(precio*0.01)+precio;
            return ImpuestoCirculacion;

        }
        else if(tieneRadio==true && tieneNavegador==true){
            double ImpuestoCirculacion=(precio*0.03)+precio;
            return ImpuestoCirculacion;

        }else{
            return impuestoCirculacion;

        }
    }

    
    public double CuotaMesGaraje(double cuotaMesGaraje) {
        if(cilindraje>2499){
            double CuotaMesGaraje=(cuotaMesGaraje*0.2)+cuotaMesGaraje;
            return CuotaMesGaraje;
        }else{
            return cuotaMesGaraje;
        }
    }
     
    

    
    
    
    
    
    
}
