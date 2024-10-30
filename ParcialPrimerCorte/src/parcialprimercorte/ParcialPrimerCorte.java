/*
 */
package parcialprimercorte;


import java.util.Scanner;

/**
 *
 * @LUIS ALFREDO REPIZO PILLIMUE 20241221065
 */
public class ParcialPrimerCorte {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nhabitaciones = 0;
        double[][] datoconsumo = new double[100][7];
        System.out.println("INGRESE EL NUMERO DE HABITACION");
        int habitacion = sc.nextInt();

        double lunes = (int) (Math.random() * (30) + 30);
        double martes = (int) (Math.random() * (30) + 30);
        double miercoles = (int) (Math.random() * (30) + 40);
        double jueves = (int) (Math.random() * (30) + 30);
        double viernes = (int) (Math.random() * (30) + 30) * 1.2;
        double sabado = (int) (Math.random() * (30) + 30) * 1.2;
        double domingo = (int) (Math.random() * (40) + 30) * 1.2;

        datoconsumo[(int) nhabitaciones][0] = lunes;
        datoconsumo[(int) nhabitaciones][1] = martes;
        datoconsumo[(int) nhabitaciones][2] = miercoles;
        datoconsumo[(int) nhabitaciones][3] = jueves;
        datoconsumo[(int) nhabitaciones][4] = viernes;
        datoconsumo[(int) nhabitaciones][5] = sabado;
        datoconsumo[(int) nhabitaciones][6] = domingo;

        double promediosemana = (lunes + martes + miercoles + jueves + viernes + sabado + domingo / 7);
        double finsemana = (viernes + sabado + domingo) / 3;
        double consumodia=(lunes+martes+miercoles+jueves+viernes+sabado+domingo);
        double consumohabitacion=(lunes+martes+miercoles+jueves+viernes+sabado+domingo);
        
        for (nhabitaciones = 0; nhabitaciones <= datoconsumo.length; nhabitaciones++) {

            switch (habitacion) {

                case 1:
                    System.out.println("N# HABITACION: " + habitacion);
                    System.out.println("CONSUMO DIARIO:");
                    System.out.println("LUNES:" + lunes);
                    System.out.println("MARTES:" + martes);
                    System.out.println("MIERCOLES:" + miercoles);
                    System.out.println("JUEVES:" + jueves);
                    System.out.println("VIERNES:" + viernes);
                    System.out.println("SABADO:" + sabado);
                    System.out.println("DOMINGO:" + domingo);
                    System.out.println("PROMEDIO ENTRE SEMANA: " + promediosemana);
                    System.out.println("PROMEDIO FIN DE SEMANA: " + finsemana);
                    nhabitaciones = nhabitaciones + 1;
                    break;
                case 2:
                    System.out.println("N# HABITACION: " + habitacion);
                    System.out.println("CONSUMO DIARIO:");
                    System.out.println("LUNES:" + lunes);
                    System.out.println("MARTES:" + martes);
                    System.out.println("MIERCOLES:" + miercoles);
                    System.out.println("JUEVES:" + jueves);
                    System.out.println("VIERNES:" + viernes);
                    System.out.println("SABADO:" + sabado);
                    System.out.println("DOMINGO:" + domingo);
                    System.out.println("PROMEDIO ENTRE SEMANA: " + promediosemana);
                    System.out.println("PROMEDIO FIN DE SEMANA: " + finsemana);
                    nhabitaciones = nhabitaciones + 1;
                    break;
                case 3:
                    System.out.println("N# HABITACION: " + habitacion);
                    System.out.println("CONSUMO DIARIO:");
                    System.out.println("LUNES:" + lunes);
                    System.out.println("MARTES:" + martes);
                    System.out.println("MIERCOLES:" + miercoles);
                    System.out.println("JUEVES:" + jueves);
                    System.out.println("VIERNES:" + viernes);
                    System.out.println("SABADO:" + sabado);
                    System.out.println("DOMINGO:" + domingo);
                    System.out.println("PROMEDIO ENTRE SEMANA: " + promediosemana);
                    System.out.println("PROMEDIO FIN DE SEMANA: " + finsemana);
                    nhabitaciones = nhabitaciones + 1;
                    break;
                case 4:
                    System.out.println("N# HABITACION: " + habitacion);
                    System.out.println("CONSUMO DIARIO:");
                    System.out.println("LUNES:" + lunes);
                    System.out.println("MARTES:" + martes);
                    System.out.println("MIERCOLES:" + miercoles);
                    System.out.println("JUEVES:" + jueves);
                    System.out.println("VIERNES:" + viernes);
                    System.out.println("SABADO:" + sabado);
                    System.out.println("DOMINGO:" + domingo);
                    System.out.println("PROMEDIO ENTRE SEMANA: " + promediosemana);
                    System.out.println("PROMEDIO FIN DE SEMANA: " + finsemana);
                    nhabitaciones = nhabitaciones + 1;
                    break;
                case 5:
                    System.out.println("N# HABITACION: " + habitacion);
                    System.out.println("CONSUMO DIARIO:");
                    System.out.println("LUNES:" + lunes);
                    System.out.println("MARTES:" + martes);
                    System.out.println("MIERCOLES:" + miercoles);
                    System.out.println("JUEVES:" + jueves);
                    System.out.println("VIERNES:" + viernes);
                    System.out.println("SABADO:" + sabado);
                    System.out.println("DOMINGO:" + domingo);
                    System.out.println("PROMEDIO ENTRE SEMANA: " + promediosemana);
                    System.out.println("PROMEDIO FIN DE SEMANA: " + finsemana);
                    nhabitaciones = nhabitaciones + 1;
                    break;
                case 6:
                    System.out.println("N# HABITACION: " + habitacion);
                    System.out.println("CONSUMO DIARIO:");
                    System.out.println("LUNES:" + lunes);
                    System.out.println("MARTES:" + martes);
                    System.out.println("MIERCOLES:" + miercoles);
                    System.out.println("JUEVES:" + jueves);
                    System.out.println("VIERNES:" + viernes);
                    System.out.println("SABADO:" + sabado);
                    System.out.println("DOMINGO:" + domingo);
                    System.out.println("PROMEDIO ENTRE SEMANA: " + promediosemana);
                    System.out.println("PROMEDIO FIN DE SEMANA: " + finsemana);
                    nhabitaciones = nhabitaciones + 1;
                    break;
                case 7:
                    System.out.println("N# HABITACION: " + habitacion);
                    System.out.println("CONSUMO DIARIO:");
                    System.out.println("LUNES:" + lunes);
                    System.out.println("MARTES:" + martes);
                    System.out.println("MIERCOLES:" + miercoles);
                    System.out.println("JUEVES:" + jueves);
                    System.out.println("VIERNES:" + viernes);
                    System.out.println("SABADO:" + sabado);
                    System.out.println("DOMINGO:" + domingo);
                    System.out.println("PROMEDIO ENTRE SEMANA: " + promediosemana);
                    System.out.println("PROMEDIO FIN DE SEMANA: " + finsemana);
                    nhabitaciones = nhabitaciones + 1;
                    break;

            }

        }
        System.out.println("Consumo total del hotel por dia"+consumodia);
        System.out.println("Consumo promedio por habitacion"+consumohabitacion);
        System.out.println("habitacion que mas consume");
        System.out.println("Habitacion que menos consume");

    }

}
