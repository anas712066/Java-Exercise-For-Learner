/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg07_do;

import java.util.Scanner;
public class Muhammad_Anas_UF01T0407_do {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.print("Introdueix un nombre: ");
        int num = input.nextInt();
        
        System.out.printf("El resultat de ordre decreixent es: ");
        
        do {
            if (num == 1) {
                System.out.printf("%d", num);
            } else {
                System.out.printf("%d, ", num);
            }
            num--;
        }while (num > 0);
        System.out.println(".");
        input.close();
    }
    
}
