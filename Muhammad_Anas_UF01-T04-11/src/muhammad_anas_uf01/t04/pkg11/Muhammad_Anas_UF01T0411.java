/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg11;

import java.util.Scanner;
public class Muhammad_Anas_UF01T0411 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix el valor de x: ");
        int x = input.nextInt();
        
        System.out.print("Introdueix el valor de n: ");
        int n = input.nextInt();
        
        int resultat = 1;
        int contador = 0;
        
        while (contador < n) {
            resultat *= x;
            contador++;
        }
        
        System.out.println(x + "^" + n + " = " + resultat);
        input.close();
    }
    
}
