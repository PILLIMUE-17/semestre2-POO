/*Crear una clase Reloj, con atributos hora, minuto y segundo, que pueda ser construida indicando los
tres atributos, o bien solo la hora y minutos, o bien solo la hora.
Crear ademas los métodos necesarios para modificar y consultar la hora en cualquier momento de
forma manual.
Crear los métodos adelantarReloj(int cantidadDeSegundos) y atrasarReloj(int
cantidadDeSegundos).
Mantenga la integridad de los datos en todo momento (no puede haber en ele valor de segundos o
minutos un valor mayor de 59 ni menor de 0, etc).
Crear una clase ProbarReloj que cree un reloj con una hora concreta, la modifique y luego pruebe los
dos métodos indicados*/
package EjercicioReloj;

public class Reloj {

    public int hora;
    public int minutos;
    public int segundos;

    public Reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Reloj(int hora, int minutos) {
        this.hora = hora;
        this.minutos = minutos;
    }

    public Reloj(int segundos) {
        this.segundos = segundos;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {

        if (hora >= 0 || hora < 24) {
            this.hora = hora;

        } else {
            System.out.println("NO SE PUEDE DAR UNA HORA NEGATIVA");
        }

    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(hora>=0||hora<24){
            this.hora = hora;
  
        }else{
            System.out.println("NO SE PUEDE DAR UNA HORA NEGATIVA");
        }    
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
         if(hora>=0||hora<24){
            this.hora = hora;
  
        }else{
            System.out.println("NO SE PUEDE DAR UNA HORA NEGATIVA");
        }
    }
    
    public int adelantarReloj(int cantidadSegundos){
        segundos+=cantidadSegundos;
        ajustarTiempo();
        return 0;
    }
    
    public int atrasarReloj(int cantidadSegundos){
        segundos-=cantidadSegundos;
        ajustarTiempo();
        return 0;
        
    }
    
    public void ajustarTiempo(){
        if(segundos>=60){
            minutos+=segundos/60;
            segundos%=60;
            
        }else if (segundos<0){
            minutos+=(segundos/60)-1;
            segundos=60+(segundos%60);
        }
        
        if (minutos>=60){
            hora+=minutos/60;
            minutos%=60;
        } else if(minutos<0){
            hora+=(minutos/60)-1;
            minutos=60+(minutos%60);
        }
        
        if (hora>=24){
            hora%=24;
        }else if (hora<0){
            hora=24+(hora/24);
        }
    }
    
    
    
    
    
    
    

}
