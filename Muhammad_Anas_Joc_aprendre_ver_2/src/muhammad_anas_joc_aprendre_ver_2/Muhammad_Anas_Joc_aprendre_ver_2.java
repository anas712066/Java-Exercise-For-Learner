/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_joc_aprendre_ver_2;

import java.util.Scanner;
import java.util.Random;
public class Muhammad_Anas_Joc_aprendre_ver_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int encerts = 0;
        int errors = 0;
        int restesFetes = 0;
        
        long tempsInicial = System.currentTimeMillis();
        
        while (restesFetes < 5) {
            int num1, num2;
        do {
            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;
        } while (num1 == num2 || num1 < num2);
        
        int resultatCorrecte = num1 - num2;
        System.out.println("Resta " + (restesFetes + 1) + ": Quin es el resultat de " + num1 + " - " + num2 + "?");
        int respostaUsuari = input.nextInt();
        
        if (respostaUsuari == resultatCorrecte) {
            System.out.println("Correcte!");
            encerts++;
        } else {
            System.out.println("Incorrecte! La resposta correcta era: " + resultatCorrecte);
            errors++;
            }
        restesFetes++;
        }
        long tempsFinal = System.currentTimeMillis();
        long tempsTotal = (tempsFinal - tempsInicial) / 1000;
        
        System.out.println("Has trigat " + tempsTotal + " segons.");
        System.out.println("Encerts: " + encerts);
        System.out.println("Errors: " + errors);
        
        input.close();
    }
    
}
