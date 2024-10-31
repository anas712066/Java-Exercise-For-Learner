/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_prac_06;
import java.util.Scanner;
/**
 *
 * @author Tarda
 */
public class Muhammad_Anas_prac_06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introdueix la distancia en milles: ");
        double milles = scanner.nextDouble();
        
        double quilometres = milles * 1.6;
        
        System.out.println(milles + " milles són: " + quilometres + " quilometres.");
        
        scanner.close();
    }
    
}
