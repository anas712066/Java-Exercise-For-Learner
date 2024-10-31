/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac14;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Introdueix la temperatura en graus centigrads (ºC): ");
        double temperaturaCelsius = input.nextDouble();
        
        System.out.println("Escull el sistema de temperatura al qual vols convertir:");
        System.out.println("1. Kelvin (K)");
        System.out.println("2. Fahrenheit (ºF)");
        System.out.println("3. Rankine (ºRankine)");
        System.out.println("4. Réaumur (ºReaumur)");
        
        System.out.print("Introdueix el numero de la teva eleccio: ");
        int eleccio = input.nextInt();
        
        double temperaturaConvertida = 0;
        String sistemaTemperatura = "";
        
        switch (eleccio) {
            case 1:
                temperaturaConvertida = 273.15 + temperaturaCelsius;
                sistemaTemperatura = "Kelvin (K)";
                break;
            case 2:
                temperaturaConvertida = (9.0 / 5.0) * temperaturaCelsius + 32;
                sistemaTemperatura = "Fahrenheit (ºF)";
                break;
            case 3:
                temperaturaConvertida = (9.0 / 5.0) * temperaturaCelsius + 491.67;
                sistemaTemperatura = "Rankine (ºRankine)";
                break;
            case 4:
                temperaturaConvertida = (4.0 / 5.0) * temperaturaCelsius;
                sistemaTemperatura = "Reaumur (ºReaumur)";
                break;
            default:
                System.out.println("Has introduit una opcio no valida.");
                System.exit(0);
        }
        System.out.printf("La temperatura %.2fºC es %.2fº en el sistema %s.\n", temperaturaCelsius, temperaturaConvertida, sistemaTemperatura);

        input.close();
    }
    
}
