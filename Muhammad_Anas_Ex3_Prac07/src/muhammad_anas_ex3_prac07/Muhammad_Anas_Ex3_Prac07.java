/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac07;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix un any entre 1700 i 2100: ");
        int any = input.nextInt();

        if (any < 1700 || any > 2100) {
            System.out.println("Error: l'any introduit no esta dins l'interval permes.");
        } else {
            if ((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
                System.out.println(any + " es un any de traspas.");
            } else {
                System.out.println(any + " no es un any de traspas.");
            }
        }
        input.close();
    }
    
}
