/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_joc_aprendre_ver_3;

import java.util.Scanner;
import java.util.Random;
public class Muhammad_Anas_Joc_aprendre_ver_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int encerts = 0;
        int errors = 0;
        int restesProposades = 0;
        
        long tempsInicial = System.currentTimeMillis();
        
        boolean continuar = true;
        
        while (continuar) {
            int num1, num2;
            
        do {
            num1 = random.nextInt(10) + 1;
            num2 = random.nextInt(10) + 1;
        } while (num1 == num2 || num1 < num2);
        
        int resultatCorrecte = num1 - num2;
        restesProposades++;
        
        System.out.println("Resta " + restesProposades + ": Quin es el resultat de " + num1 + " - " + num2 + "?");
        int respostaUsuari = input.nextInt();
        
        if (respostaUsuari == resultatCorrecte) {
            System.out.println("Correcte!");
            encerts++;
        } else {
            System.out.println("Incorrecte! La resposta correcta era: " + resultatCorrecte);
            errors++;
        }
        System.out.println("Vols fer una altra resta? (s/n)");
        input.nextLine();
        String resposta = input.nextLine();
        
        if (resposta.equalsIgnoreCase("n")) {
            continuar = false;
        }
        }
        long tempsFinal = System.currentTimeMillis();
        long tempsTotal = (tempsFinal - tempsInicial) / 1000;
        
        System.out.println("Nombre de restes proposades: " + restesProposades);
        System.out.println("Encerts: " + encerts);
        System.out.println("Errors: " + errors);
        System.out.println("Temps total del programa: " + tempsTotal + " segons.");
        
        input.close();
    }
    
}
