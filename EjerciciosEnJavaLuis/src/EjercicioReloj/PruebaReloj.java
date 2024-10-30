
package EjercicioReloj;


public class PruebaReloj {
    public static void main(String[] args) {
            Reloj reloj1=new Reloj(2,31,34);
            System.out.println("HORA INICIAL:"+ " HORAS= "+reloj1.hora+"--MINUTOS= "+reloj1.minutos+"--SEGUNDOS= "+reloj1.segundos);
             System.out.println("------CAMBIAR LA HORA------");
            reloj1.setHora(1);
            reloj1.setMinutos(42);
            reloj1.setSegundos(59);
            System.out.println("HORA CAMBIADA="+ " HORAS= "+reloj1.hora+"--MINUTOS= "+reloj1.minutos+"--SEGUNDOS= "+reloj1.segundos);
            reloj1.adelantarReloj(120);
            System.out.println("--------------ADELANTAR 120 SEGUNDOS--------");
            System.out.println("HORA DESPUES DE ADELANTARLA ="+ " HORAS= "+reloj1.hora+"--MINUTOS= "+reloj1.minutos+"--SEGUNDOS= "+reloj1.segundos);
            reloj1.atrasarReloj(90);
            System.out.println("--------------ATRASAR 90 SEGUNDOS--------");
            System.out.println("HORA DESPUES DE ADELANTARLA ="+ " HORAS= "+reloj1.hora+"--MINUTOS= "+reloj1.minutos+"--SEGUNDOS= "+reloj1.segundos);
            
    }
   
}
