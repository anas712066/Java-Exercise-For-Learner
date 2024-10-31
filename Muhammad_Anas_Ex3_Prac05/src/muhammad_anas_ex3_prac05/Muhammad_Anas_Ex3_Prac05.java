/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac05;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueic un numero parell: ");
        int parell = input.nextInt();
        
        System.out.print("Introduiex un numero senar: ");
        int senar = input.nextInt();
        
        if (parell % 2 == 0 && senar % 2 != 0) {
            if (parell == 2 * senar) {
                System.out.println(parell + " es el doble de " + senar + ".");
            } else {
                System.out.println(parell + " no es el doble de " + senar + ".");
            }
        } else {
            System.out.println("Si us plau, assegura't que el primer numero sigui parell i el segon numero sigui senar");
        }
        input.close();
    }
    
}
