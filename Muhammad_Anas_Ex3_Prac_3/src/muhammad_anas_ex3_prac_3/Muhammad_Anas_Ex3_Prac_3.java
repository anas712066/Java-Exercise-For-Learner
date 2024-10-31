/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac_3;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("Introdueix la longitud del costat 1: ");
         double costat1 = input.nextDouble();
         
         System.out.print("Introdueix la longitud del costat 2: ");
         double costat2 = input.nextDouble();
         
         System.out.print("Introdueix la longitud del costat 3: ");
         double costat3 = input.nextDouble();
         
         if (esTriangleValid(costat1, costat2, costat3)) {
             if (costat1 == costat2 && costat2 == costat3) {
                 System.out.println("El triangle es equilater.");
             } else if (costat1 == costat2 || costat2 == costat3 || costat1 == costat3) {
                 System.out.println("El triangle es isosceles.");    
             } else {
                 System.out.println("El triangle es escale.");
             }
         } else {
             System.out.println("Les longituds introduides no formen un triangle valid.");
         }
         input.close();
    }
    public static boolean esTriangleValid(double costat1, double costat2, double costat3) {
        return (costat1 + costat2 > costat3) &&
                (costat1 + costat3 > costat2) &&
                (costat2 + costat3 > costat1);
    }
    
}
