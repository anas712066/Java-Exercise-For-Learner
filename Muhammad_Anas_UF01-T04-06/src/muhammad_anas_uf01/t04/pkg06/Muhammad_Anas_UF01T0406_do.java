/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg06;

import java.util.Scanner;
public class Muhammad_Anas_UF01T0406_do {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introdueix un nombre: ");
        int n = input.nextInt();

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);

        input.close();
        
    }
    
}
