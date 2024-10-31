/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_joc_aprendre_restar_ver_1;

import java.util.Scanner;
import java.util.Random;
public class Muhammad_Anas_Joc_aprendre_restar_ver_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int num1;
        int num2;
        
        do {
            num1 = random.nextInt(10) +1;
            num2 = random.nextInt(10) +1;
        } while (num1 == num2 || num1 < num2);
        
        int resultatCorrecte = num1 - num2;
        int intents = 0;
        boolean correcte = false;
        
        long tempsInicial = System.currentTimeMillis();
        
        while (intents < 5 && !correcte) {
            System.out.println("Quin és el resultat de " + num1 + " - " + num2 + "?");
            int respostaUsuari = input.nextInt();
            intents++;
            
            if (respostaUsuari == resultatCorrecte) {
                correcte = true;
                System.out.println("Enhorabona! Has encertat la resposta.");
            } else {
                System.out.println("Incorrecte! Et queden " + (5 - intents) + " intents.");
            }
        }
        long tempsFinal = System.currentTimeMillis();
        long tempsTotal = (tempsFinal - tempsInicial) / 1000;
        
        if (!correcte) {
            System.out.println("Ho sentim heu esgotat els 5 intents.");
        }
        System.out.println("Has trigat " + tempsTotal + " segons i has utilitzats " + intents + " intents.");
        input.close();
    }
    
}
