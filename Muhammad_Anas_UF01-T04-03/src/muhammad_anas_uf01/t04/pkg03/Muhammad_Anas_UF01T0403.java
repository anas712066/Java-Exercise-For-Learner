/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg03;
import java.util.Scanner;
public class Muhammad_Anas_UF01T0403 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nombre;
        int majorNombre = Integer.MIN_VALUE;
        
        System.out.println("Introdueix nombres un nombre negatiu per acabar: ");
        
        do {
            nombre = input.nextInt();
            if (nombre > 0 && nombre > majorNombre) {
                majorNombre = nombre;
            }
        } while (nombre >= 0);
        System.out.println("El major nombre introduit es: " + majorNombre);
        input.close();
    }
}
