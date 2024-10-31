/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac04;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_prac04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix la mida del cargol (en cm): ");
        double mida = input.nextDouble();
        
        if (mida >= 1 && mida < 3) {
            System.out.println("El cargol es petit.");
        } else if (mida >= 3 && mida < 5) {
            System.out.println("El cargol es mitja.");
        } else if (mida >= 5 && mida < 6.5) {
            System.out.println("El cargol es gran.");
        } else if (mida >= 5 && mida < 8.5) {
            System.out.println("El cargol es molt gran.");
        } else {
            System.out.println("Mida fora de rang");
        }
        input.close();
    }
}
