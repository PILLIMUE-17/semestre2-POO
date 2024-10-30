/*
 *
 */
package parcialprimercorte;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @LUIS ALFREDO REPIZO PILLIMUE 20241221065
 */
public class CorrecionDeParcial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random aleatorio = new Random();
        String[] diassemana = {"LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO"};
        /* pedir habitacion*/
        System.out.println("INGRESE EL NUMERO DE HABITACIONES EN LA SEMANA");
        int numerohabitacion = sc.nextInt();
        /* MATRIZ DE CONSUMO DE ENERGIA*/
        double[][] consumo = new double[numerohabitacion][7];

        for (int i = 0; i < numerohabitacion; i++) {
            /*dias*/
            for (int dias = 0; dias < 7; dias++) {
                if (dias == 0 || dias == 1 || dias == 3) {
                    /*lunes,martes,jueves*/
                    consumo[i][dias] = 30 + aleatorio.nextDouble() * 50;
                    /*consumo entre 30 y 80 kw/hora*/
                } else if (dias == 2) {
                    consumo[i][dias] = 40 + aleatorio.nextDouble() * 60;/*consumo entre 40 y 100 kw/hora*/
                } else if (dias >= 4) {
                    consumo[i][dias] = consumo[i][0] * 1.2;/*incremento del 20% de los dias lunes*/

                }
            }
        }
        System.out.println("INGRESE EL NUMERO DE HABITACION A REPORTAR");
        int habitacion = sc.nextInt();

        if (habitacion >= 1 && habitacion <= numerohabitacion) {
            double sumasemana = 0, sumafinsemana = 0;
            int habitacion2 = habitacion - 1;
            System.out.println("N# habitacion: " + habitacion);
            System.out.println("Consumo diario");
            for (int dias = 0; dias < 7; dias++) {
                System.out.println(diassemana[dias] + ":" + String.format("%.2f", consumo[habitacion2][dias]) + "kwh");
                if (dias < 5) {
                    sumasemana += consumo[habitacion2][dias];
                } else {
                    sumafinsemana += consumo[habitacion2][dias];
                }
            }
            double promediosemana = sumasemana / 5;
            double promediofinsemana = sumafinsemana / 2;
            System.out.println("PROMEDIO ENTRE SEMANA: " +String.format("%.2f",promediosemana)+"kwh");
            System.out.println("PROMEDIO FIN SEMANA: " +String.format("%.2f",promediofinsemana)+"kwh");
        }else{
            System.out.println("ERROR NUMERO NO VALIDO");
        }
        double[] consumoTotalPorDia = new double[7];
        double[] consumoPromedioPorHabitacion = new double[numerohabitacion];
        double mayorConsumo = Double.MIN_VALUE, menorConsumo = Double.MAX_VALUE;
        int habMayorConsumo = 0, habMenorConsumo = 0;
        
        for (int i = 0; i < numerohabitacion; i++) {
            double totalHabitacion = 0;
            for (int dias = 0; dias < 7; dias++) {
                consumoTotalPorDia[dias] += consumo[i][dias];
                totalHabitacion += consumo[i][dias];
            }
            consumoPromedioPorHabitacion[i] = totalHabitacion;
            
            if (totalHabitacion > mayorConsumo) {
                mayorConsumo = totalHabitacion;
                habMayorConsumo = i + 1;
            }
            if (totalHabitacion < menorConsumo) {
                menorConsumo = totalHabitacion;
                habMenorConsumo = i + 1;
            }
        }
        
        // Imprimir estadísticas
        System.out.println("CONSUMO TOTAL DEL HOTEL");
        for (int dias = 0; dias < 7; dias++) {
            System.out.println(diassemana[dias] + ": " + String.format("%.2f", consumoTotalPorDia[dias]) + " kWh");
        }

        System.out.println("CONSUMO PROMEDIO POR HABITACION");
        for (int i = 0; i < numerohabitacion; i++) {
            System.out.println("HABITACION " + (i + 1) + ": " + String.format("%.2f", consumoPromedioPorHabitacion[i]) + " kWh");
        }

        System.out.println("HABITACION QUE MAS CONSUME: " + habMayorConsumo + " con " + String.format("%.2f", mayorConsumo) + " kWh");
        System.out.println("HABITACION QUE MENOS CONSUME " + habMenorConsumo + " con " + String.format("%.2f", menorConsumo) + " kWh");
        
        

    }

}
