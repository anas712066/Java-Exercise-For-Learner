/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_fucntion_4;

public class Muhammad_Anas_Fucntion_4 {
public static boolean traspasAny(int any) {
    boolean traspasAny = false;
    if (any % 4 == 0 && any % 100 !=0 || any % 400 == 0) {
        traspasAny = true;
    }
    return traspasAny;
}

    public static void main(String[] args) {
        int any = 2007;
        boolean traspas = traspasAny(any);
        if (traspas == false) {
            System.out.println("L'any " + any + " NO és de traspàs");
        } else {
                System.out.println("L'any " + any + " és de traspàs");
            }
        }
    
}
