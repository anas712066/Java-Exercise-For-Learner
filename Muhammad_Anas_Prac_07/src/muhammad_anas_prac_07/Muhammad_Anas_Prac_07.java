/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_prac_07;
import java.util.Scanner;
/**
 *
 * @author Tarda
 */
public class Muhammad_Anas_Prac_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introdueix numeros enters de 100 i 999: ");
        int numero = scanner.nextInt();
        
        int unitats = numero % 10;
        int desenes = (numero / 10) % 10;
        int centenes = (numero / 100) % 10;
        
        int suma = unitats + desenes + centenes;
        int producte = unitats * desenes * centenes;
        
        System.out.println("Suma dels digits: " + suma);
        System.out.println("Productes dels digits: " + producte);
        
        scanner.close();
    }
    
}
