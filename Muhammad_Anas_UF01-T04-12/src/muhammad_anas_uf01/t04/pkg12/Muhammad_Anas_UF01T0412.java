/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg12;

import java.util.Scanner;
public class Muhammad_Anas_UF01T0412 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int suma = 0;
        int contador = 0;
        int numero;
        
        System.out.println("Introdueix numero (introdueix -1 per acabar):");
        
        do {
            numero = input.nextInt();
            if (numero >= 0 && numero <= 10) {
                suma += numero;
                contador++;
            } else if (numero != -1) {
                System.out.println("Numero no sumat: " + numero);
            }
        } while (numero != -1);
        
        if (contador > 0) {
            double mitjana = (double) suma / contador;
            System.out.println("La mitjana dels numeros sumats es: " + mitjana);
        } else {
            System.out.println("No s'ha introduit cap numero entre 0 i 10.");
        }
        input.close();
    }
    
}
