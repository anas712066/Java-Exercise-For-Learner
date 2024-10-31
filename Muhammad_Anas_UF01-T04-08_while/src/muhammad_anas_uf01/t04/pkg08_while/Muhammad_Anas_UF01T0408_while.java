/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg08_while;
import java.util.Scanner;
public class Muhammad_Anas_UF01T0408_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       System.out.print("Introduiex un nombre: ");
       int num = input.nextInt();
       int producte = 1;
       
       while (num > 0) {
           producte *= num;
           num--;
       }
       System.out.println("El resultat de producte de nombre: " + producte + ".");
       input.close();
    }
    
}
