/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac01;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix un numero: ");
        int numero = input.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " es parell. " );
        } else {
            System.out.println("El numero " + numero + " no es parell.");
        }
        input.close();
    }
    
}
