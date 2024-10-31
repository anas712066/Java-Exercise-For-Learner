/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac13;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introdueix cinc nUmeros enters diferents:");
        
        System.out.print("Primer numero: ");
        int primerValor = input.nextInt();

        System.out.print("Segon numero: ");
        int segonValor = input.nextInt();

        System.out.print("Tercer numero: ");
        int tercerValor = input.nextInt();

        System.out.print("Quart numero: ");
        int quartValor = input.nextInt();

        System.out.print("Cinque numero: ");
        int cinqueValor = input.nextInt();
        
        int valorMesProper = segonValor;
        int distanciaMinima = Math.abs(primerValor - segonValor);
        
        int distanciaTercer = Math.abs(primerValor - tercerValor);
        if (distanciaTercer < distanciaMinima) {
            distanciaMinima = distanciaTercer;
            valorMesProper = tercerValor;
        }
        
        int distanciaQuart = Math.abs(primerValor - quartValor);
        if (distanciaQuart < distanciaMinima) {
            distanciaMinima = distanciaQuart;
            valorMesProper = quartValor;
        }
        
        int distanciaCinque = Math.abs(primerValor - cinqueValor);
        if (distanciaCinque < distanciaMinima) {
            distanciaMinima = distanciaCinque;
            valorMesProper = cinqueValor;
        }
        
        System.out.println("El numero mes proper al " + primerValor + " es el " + valorMesProper + ".");
         
        input.close();
    }
    
}
