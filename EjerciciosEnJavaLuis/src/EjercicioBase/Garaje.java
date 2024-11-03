
package EjercicioBase;


public class Garaje implements IGarage{
    final int constante1=2;
    Vehiculo coleccion[]=new Vehiculo[constante1];
    double ingresosMensuales=0;
    int contador;
    @Override
    public double calcularIngresos() {
        for(int i=0;i<coleccion.length;i++){
            if(coleccion[i] !=null){
                ingresosMensuales+=coleccion[i].cuotaMesGaraje;
                
            }
            
            
        }
        return ingresosMensuales;
    }


    @Override
    public int calcularOcupacionPorTipoVehiculo(Vehiculo v) {
        for(int i=0;i<coleccion.length;i++)
            if(coleccion[i] !=null && coleccion[i].getClass()== v.getClass() ){
                contador++;
            }
         return contador;       
    }
    
}
