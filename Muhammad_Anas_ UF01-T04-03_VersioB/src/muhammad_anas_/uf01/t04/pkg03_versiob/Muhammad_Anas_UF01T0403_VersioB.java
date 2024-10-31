/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_.uf01.t04.pkg03_versiob;
import  java.util.Scanner;
public class Muhammad_Anas_UF01T0403_VersioB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nombre;
        int majorNombre = 0;
        
        System.out.println("Introdueix nombres un nombre negatiu per acabar: ");
        nombre = input.nextInt();
        
        while (nombre >= 0) {
            if (nombre > majorNombre) {
                majorNombre = nombre;
            }
            nombre = input.nextInt();
        }
        System.out.println("El major nombre introduit es: " + majorNombre);
        input.close();
    }
    
}
