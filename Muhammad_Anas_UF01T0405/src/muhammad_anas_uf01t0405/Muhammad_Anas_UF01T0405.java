/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01t0405;
import java.util.Scanner;
public class Muhammad_Anas_UF01T0405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nombre;
        int suma = 0;
        int i = 0;
        
        System.out.println("Introdueix nombres positius un nombre negatiu per acabar: ");
        nombre = input.nextInt();
        
        while (nombre >= 0) {
            System.out.print("Aquest es un numero positiu.\n");
            suma += nombre;
            i++;
            nombre = input.nextInt();
        }
        System.out.println("Aquest es un nombre negatiu.");
        System.out.println("La suma de tots els nombres positius es: " + suma);
        System.out.println("S'han introduit " + i + " nombres positius.");
        input.close();
    }
    
}
