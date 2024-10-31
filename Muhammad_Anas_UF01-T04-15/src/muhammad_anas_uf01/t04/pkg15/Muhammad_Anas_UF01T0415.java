/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg15;

import java.util.Scanner;
public class Muhammad_Anas_UF01T0415 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numUsuari;
        int i;
        int conPos;
        int conNeg;
        int conZero;
        
        numUsuari = 0;
        i = 0;
        conPos = 0;
        conNeg = 0;
        conZero = 0;
        
        do{
        System.out.print("Introdueix 10 numeros i et dire quants son negatius, quants son positius i quants son zero: ");
        numUsuari = input.nextInt();
        if (numUsuari < 0) {
            System.out.println("El numero introduit es un negatiu");
            conNeg++;
        } else  {
            System.out.println("El numero es postiu");
            conPos++;
        }
        if (numUsuari == 0) {
            System.out.println("El numero es un zero.");
            conZero++;
        }
        i++;
        } while (i < 10);
        System.out.println("Introdueix numeros negatius = " + conNeg + ", positius = " + conPos + "i zeros = " + conZero + ".\n");
        input.close();
    }
    
}
