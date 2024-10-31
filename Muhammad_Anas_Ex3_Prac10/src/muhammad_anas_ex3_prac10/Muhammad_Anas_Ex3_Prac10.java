/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac10;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introdueix el nombre de minuts utilitzats: ");
        int minuts = scanner.nextInt();
        
        double quotaFixa = 5.0;
        
        double quotaMovimoon = calcularQuotaMovimoon(minuts);
        double quotaEarthtel = calcularQuotaEarthtel(minuts);
        double quotaAntena = calcularQuotaAntena(minuts);
        
         System.out.println("Quota total per MOVIMOON: " + (quotaFixa + quotaMovimoon) + " €");
        System.out.println("Quota total per EARTHTEL: " + (quotaFixa + quotaEarthtel) + " €");
        System.out.println("Quota total per ANTENA: " + (quotaFixa + quotaAntena) + " €");
        
        scanner.close();
    }
        public static double calcularQuotaMovimoon(int minuts) {
            return 0.45 * minuts;
    }
        public static double calcularQuotaEarthtel(int minuts) {
        if (minuts <= 40) {
            return 0.49 * minuts; 
        } else if (minuts <= 120) {
            return 19.6 + 0.33 * (minuts - 40); 
        } else {
            return 46 + 0.20 * (minuts - 120);
        }
    }
        public static double calcularQuotaAntena(int minuts) {
        if (minuts <= 30) {
            return 0.60 * minuts;
        } else if (minuts <= 50) {
            return 18 + 0.25 * (minuts - 30);
        } else {
            return 18 + 5 + 0.10 * (minuts - 50);
        }
    }
