
package EjercicioBase;


public class Moto extends Vehiculo {
    public boolean tieneSidecar;

    public Moto(boolean tieneSidecar, String placa, String marca, double precio, int cilindraje) {
        super(placa, marca, precio, cilindraje);
        this.tieneSidecar = tieneSidecar;
    }

    

    
    
    
    
    
    public double ImpuestoCirculacion() {
        if(tieneSidecar=true){
            double impuestoCirculacion=(precio*0.1)+precio;
            return impuestoCirculacion;
        }else{
            return impuestoCirculacion;
        }
    }

    
    public double CuotaMesGaraje(double cuotaMesGaraje) {
        if(tieneSidecar=true){
            double Cuota=(cuotaMesGaraje*0.5)+cuotaMesGaraje;
            return Cuota;
        }else{
            return cuotaMesGaraje;
        }    
        
    }
    
    
}
