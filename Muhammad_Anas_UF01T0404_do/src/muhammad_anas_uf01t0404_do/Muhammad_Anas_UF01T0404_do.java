/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01t0404_do;
import java.util.Scanner;
public class Muhammad_Anas_UF01T0404_do {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        
        System.out.println("Introdueix un numero negatiu per que acabi: ");
        numero = input.nextInt();
        
        do {
            System.out.print("Aquest es un numero positiu.\n");
            if (numero >= 0) {
                suma += numero;
                numero = input.nextInt();
            }
        } while (numero >= 0);
        System.out.println("Aquest es un numero negatiu");
        System.out.println("La suma de tots els numeros positius es: " + suma);
        input.close();
    }
    
}
