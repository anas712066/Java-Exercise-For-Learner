/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac12;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_prac12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] animalsZodiac = {
            "Mico", "Gall", "Gos", "Porc", "Rata", "Bou", 
            "Tigre", "Conill", "Dragó", "Serp", "Cavall", "Ovella"
        };
        
        int anyBase = 2024;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix un any: ");
        int anyUsuari = input.nextInt();
        
        int indexAnimal = (anyUsuari - anyBase) % 12;
        if (indexAnimal < 0) {
            indexAnimal += 12;
        }
        
        String animal = animalsZodiac[indexAnimal];
        
        System.out.println("L'any " + anyUsuari + " es l'any del " + animal + ".");
        
        input.close();
    }
    
}
