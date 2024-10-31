/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac11;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        int valorAleatori = random.nextInt(90) + 10;
        
        System.out.println("Benvingut al joc de la rifa!");
        System.out.println("He generat un numero de dues xifres. Has d'intentar endevinar-lo.");
        System.out.println("Premis possibles:");
        System.out.println("- Si endevines el numero exactament, guanyaras una setmana a l'Illa de la Palma!");
        System.out.println("- Si els digits son correctes pero en ordre diferent, guanyaras un sopar a un restaurant de luxe.");
        System.out.println("- Si nomes coincideix un digit, guanyaras una guia de viatge.");
        System.out.println("Els premis son mutuament excloents, nomes pots guanyar-ne un.");
        
        System.out.print("Introdueix el teu numero de dues xifres: ");
        int valorUsuari = input.nextInt();
        
        int digitAleatori1 = valorAleatori / 10;
        int digitAleatori2 = valorAleatori % 10;
        int digitUsuari1 = valorUsuari / 10;
        int digitUsuari2 = valorUsuari % 10;
        
         if (valorUsuari == valorAleatori) {
            System.out.println("Felicitats! Has endevinat el numero exacte! Has guanyat una setmana a l'Illa de la Palma!");
        } else if ((digitUsuari1 == digitAleatori2 && digitUsuari2 == digitAleatori1)) {
            System.out.println("Bona feina! Els digits coincideixen en ordre diferent. Has guanyat un sopar a un restaurant de luxe!");
        } else if (digitUsuari1 == digitAleatori1 || digitUsuari1 == digitAleatori2 || digitUsuari2 == digitAleatori1 || digitUsuari2 == digitAleatori2) {
            System.out.println("Has encertat un dels digits! Has guanyat una guia de viatge!");
        } else {
            System.out.println("Ho sento, no has obtingut cap premi. Bona sort la propera vegada!");
        }
        System.out.println("El numero correcte era: " + valorAleatori);
        input.close();
    }
    
}
