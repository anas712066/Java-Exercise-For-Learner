/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg04_while;
import java.util.Scanner;
public class Muhammad_Anas_UF01T0404_While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        int suma = 0;
        
        System.out.println("Introdueix un valor negatiu per que acabi: ");
        numero = input.nextInt();
        
        while (numero >= 0) {
                System.out.print("Aquest es un numero positiu.");
                numero = input.nextInt();
                suma += numero;
        }
        System.out.println("Aquest és un numero negatiu");
        System.out.println("La suma de tots els numeros positius és: " + suma + ".");
        input.close();
    }
    
}
