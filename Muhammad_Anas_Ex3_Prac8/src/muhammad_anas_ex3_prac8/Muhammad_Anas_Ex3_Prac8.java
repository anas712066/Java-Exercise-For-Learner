/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_ex3_prac8;
import java.util.Scanner;
/**
 *
 * @author Anas
 */
public class Muhammad_Anas_Ex3_Prac8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el dia: ");
        int dia = sc.nextInt();
        System.out.print("Introdueix el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introdueix l'any: ");
        int any = sc.nextInt();

        if (esDataValida(dia, mes, any)) {
            System.out.println("La data " + dia + "/" + mes + "/" + any + " es valida.");
        } else {
            System.out.println("La data " + dia + "/" + mes + "/" + any + " no es valida.");
        }

        sc.close();
    }

    public static boolean esAnyDeTraspass(int any) {
        return (any % 4 == 0 && any % 100 != 0) || (any % 400 == 0);
    }

    public static boolean esDataValida(int dia, int mes, int any) {
        if (mes < 1 || mes > 12) {
            return false;
        }
        int diesMes;
        switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                diesMes = 31;
                break;
            case 4: case 6: case 9: case 11:
                diesMes = 30;
                break;
            case 2:
                diesMes = esAnyDeTraspass(any) ? 29 : 28;
                break;
            default:
                return false;
        }
        return dia >= 1 && dia <= diesMes;
    }
    
}
