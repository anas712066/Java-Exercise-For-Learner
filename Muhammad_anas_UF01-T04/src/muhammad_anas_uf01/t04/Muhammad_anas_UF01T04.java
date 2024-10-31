/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04;
import java.util.Scanner;
public class Muhammad_anas_UF01T04 {
    public static void main(String[] args) {
        int a, b, i, j;
        Scanner entrada = new Scanner(System.in);
        
        a = entrada.nextInt();
        b = entrada.nextInt();

        i = a;
        j = 1;
        
        while (i <= b) {
            System.out.println(i + j);
            j *= 2;
            i += 1;
        }
        System.out.println(j);
    }
}
