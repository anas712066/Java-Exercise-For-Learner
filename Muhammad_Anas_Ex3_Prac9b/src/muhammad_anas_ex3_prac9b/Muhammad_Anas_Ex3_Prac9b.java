/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac9b;
import java.util.Random;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac9b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int euros = random.nextInt(100001);

        System.out.println("Quantitat generada: " + euros + " euros\n");

        int[] bitlletsIMonedes = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] tipus = {"bitllet", "bitllets", "moneda", "monedes"};

        StringBuilder resultat = new StringBuilder();

        for (int valor : bitlletsIMonedes) {
            int quantitat = euros / valor;
            if (quantitat > 0) {
                euros %= valor;
                if (valor >= 5) {
                    resultat.append(quantitat).append(" ").append(quantitat == 1 ? tipus[0] : tipus[1]).append(" de ").append(valor).append(" euros\n");
                } else {
                    resultat.append(quantitat).append(" ").append(quantitat == 1 ? tipus[2] : tipus[3]).append(" de ").append(valor).append(" euros\n");
                }
            }
        }

        if (resultat.length() > 0) {
            System.out.println(resultat);
        } else {
            System.out.println("La quantitat es 0 euros.");
        }
    }
    
}
