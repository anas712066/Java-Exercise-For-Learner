/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_programa_amb_menu;
import java.util.Scanner;
public class Muhammad_Anas_Programa_amb_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numeroUsuari;
        
        do {
        System.out.println("\n--Menu Principal--\n");
        System.out.println("1. Opció 1: Mostrar Missatge 1");
        System.out.println("2. Opció 2: Mostrar Missatge 2");
        System.out.println("3. Opció 3: Mostrar Missatge 3");
        System.out.println("4. Sortir");
        System.out.print("Tria una opcio de 1 fins al 4: ");
        
        while (!input.hasNextInt()) {
            System.out.println("Entrada no valida! Si us plau, introdueix un numero entre 1 i 4.");
            input.next();
            System.out.print("Tria una opcio de 1 fins al 4: ");
        }
        numeroUsuari = input.nextInt();
        
            switch(numeroUsuari) {
                case 1:
                    System.out.println("Has seleccionat opcio 1 aquest es el Missatge 1");
                    break;
                case 2:
                    System.out.println("Has seleccionat opcio 2 aquest es el missatge 2");
                    break;
                case 3:
                    System.out.println("Has selecciont opcio 3 aquest es el missatge 3");
                    break;
                case 4:
                    System.out.println("Has sortit del programa...");
            }
                    
        }while (numeroUsuari != 4);
        
        input.close();
    }
    
}
