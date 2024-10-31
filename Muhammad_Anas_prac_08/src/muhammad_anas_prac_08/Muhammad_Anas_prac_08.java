/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_prac_08;
import java.util.Scanner;
/**
 *
 * @author Tarda
 */
public class Muhammad_Anas_prac_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introdueix la distancia (km): ");
        double distancia = scanner.nextDouble();
        
        System.out.print("Introduiex el consum (km/l): ");
        double consum = scanner.nextDouble();
        
        System.out.print("Introdueix el preubenzina en (€ per l): ");
        double preubenzina = scanner.nextDouble();
        
        double preufinal = distancia * preubenzina / consum;
        
        System.out.println("El preu final es: " + preufinal + " €.");
        
        scanner.close();
        
    }
    
}
