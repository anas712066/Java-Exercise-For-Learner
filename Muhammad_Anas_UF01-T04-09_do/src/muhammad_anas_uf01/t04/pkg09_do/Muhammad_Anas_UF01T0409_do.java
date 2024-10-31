/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg09_do;

import java.util.Scanner;
public class Muhammad_Anas_UF01T0409_do {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix un nombre: ");
        int num = input.nextInt();
        int suma = 0;
        int contador = 0;
        int imparell = 1;
        
        do {
            suma += imparell;
            imparell += 2;
            contador++;
        }while (contador < num);
        System.out.println("La suma dels primers " + num + " nombres imparells es: " + suma);
        input.close();
    }
    
}
