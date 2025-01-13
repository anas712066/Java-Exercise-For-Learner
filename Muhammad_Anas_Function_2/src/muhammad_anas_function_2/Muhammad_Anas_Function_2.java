/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_function_2;
import java.util.Scanner;
public class Muhammad_Anas_Function_2 {
public static boolean mayor(float num1, float num2) {
        boolean mayor = false;
        if (num1 > num2) {
            mayor = true;
        }
        return mayor;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introdueix el primer número: ");
        float num1 = input.nextFloat();
        System.out.print("Introdueix el segon número: ");
        float num2 = input.nextFloat();
        boolean result = mayor(num1, num2);
        if (result = false) {
            System.out.println("El número " + num1 + " no es mayor que " + num2);
        } else {
            System.out.println("El número " + num1 + " es mayor que " + num2);
        }
        
    }
    
}
