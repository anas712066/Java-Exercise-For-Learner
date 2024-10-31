/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg10;

import java.util.Scanner;
public class Muhammad_Anas_UF01T0410 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n;
        
        do {
            System.out.print("Introdueix la quantitat de nombres (n): ");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("Has d'introduir un nombre positiu: ");
            }
        }while (n <= 0);
        
        double suma = 0;
        int contador = 1;
        
        while (contador <= n) {
            System.out.print("Introdueix el nombre " + contador + ": ");
            double valor = input.nextDouble();
            suma += valor;
            contador++;
        }
        double mitjana = suma / n;
        
        System.out.println("La mitjana aritmetica es: " + mitjana);
        
        input.close();
    }
    
}
