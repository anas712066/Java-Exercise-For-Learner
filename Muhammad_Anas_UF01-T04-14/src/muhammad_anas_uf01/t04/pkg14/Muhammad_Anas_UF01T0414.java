/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_uf01.t04.pkg14;

public class Muhammad_Anas_UF01T0414 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numParells , numSenars , suma1 , suma2;
        
        numParells = 2;
        numSenars = 1;
        suma1 = 0;
        suma2 = 0;
        
        while (numParells < 101) {
            suma1 = suma1 + numParells;
            numParells++;
            numParells++;
        }
        System.out.print("La suma del numeros parells del 1 al 100 és: " + suma1 + ".\n");
        
        while (numSenars < 101) {
            suma2 = suma2 + numSenars;
            numSenars++;
            numSenars++;
        }
        System.out.print("La suma del numeros senars del 1 al 100 és: " + suma2 + ".\n");
    }
    
}
