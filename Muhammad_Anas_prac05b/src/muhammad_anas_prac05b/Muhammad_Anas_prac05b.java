/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_prac05b;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_prac05b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduiex una quantitat de segons: ");
        int segons = scanner.nextInt();
        
        int dies = segons / (24 * 3600);
        segons %= (24 * 3600);
        
        int hores = segons / 3600;
        segons %= 3600;
        
        int minuts = segons / 60;
        int segonsRestants = segons % 60;
        
        System.out.println("Apartir de " + segons + " segons tens: ");
        System.out.println(dies + " dies, " + hores + " hores, " + minuts + " minuts, i " + segonsRestants + " segons.");
        
        scanner.close();
    }
    
}
