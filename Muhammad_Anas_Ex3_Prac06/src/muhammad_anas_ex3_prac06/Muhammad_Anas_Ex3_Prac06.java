/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac06;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac06 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix el dia de la setmana (1 = dilluns, 2 = dimarts, ..., 7 = diumenge): ");
        int diaActual = input.nextInt();

        if (diaActual < 1 || diaActual > 7) {
            System.out.println("Error: el numero introduït no correspon a un dia de la setmana valid.");
            return;
        }
        System.out.print("Introdueix quants dies han de transcorrer: ");
        int diesTranscorreguts = input.nextInt();

        int diaResultant = (diaActual + diesTranscorreguts - 1) % 7 + 1;

        String[] diesSetmana = {"Dilluns", "Dimarts", "Dimecres", "Dijous", "Divendres", "Dissabte", "Diumenge"};

        System.out.println("Dia introduit: " + diesSetmana[diaActual - 1]);
        System.out.println("Despres de " + diesTranscorreguts + " dies sera: " + diesSetmana[diaResultant - 1]);

        input.close();
    }
    
}
