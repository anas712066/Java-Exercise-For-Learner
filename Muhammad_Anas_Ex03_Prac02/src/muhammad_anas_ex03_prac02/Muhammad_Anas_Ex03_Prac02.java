/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex03_prac02;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex03_Prac02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix el nombre d'anys humans: ");
        double anysHumans = input.nextDouble();
        
        if (anysHumans < 0) {
            System.out.println("Error: El nombre d'anys no pot ser negatiu.");
        } else {
            double anysGos;
            
            if (anysHumans <= 2) {
                anysGos = anysHumans * 10.5;
            } else {
                anysGos = 2 * 10.5 + (anysHumans - 2) * 4;
            }
            System.out.println(anysHumans + " anys humans equivalen a " + anysGos + " anys de gos.");
        }
        input.close();
    }
    
}
