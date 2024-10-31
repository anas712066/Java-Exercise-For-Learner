/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg02;
import java.util.Scanner;
public class Muhammad_Anas_UF01T0402 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix els valors que sigui negatiu: ");
        int negatiu = input.nextInt();
        
        while (negatiu >= 0) {
            System.out.println("Aquest nombre no es correcta");
            
            System.out.print("Introdueix un altre vegada: ");
            negatiu = input.nextInt();
        }
        System.out.println("El nombre introduit esta correct");
        input.close();
    }
}
