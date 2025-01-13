/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_funcion_5;

public class Muhammad_Anas_funcion_5 {
    public static int diesMes(int més, int any) {
        int diesMes = 0;
        if (més == 1 || més == 3 || més == 5 || més == 7 || més == 8 || més == 10 || més ==12) {
            diesMes = 31;
        } else {
            if (més == 4 || més == 6 || més == 9 || més == 11) {
                diesMes = 30;
            } else {
                if (més == 2) {
                    if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0) {
                        diesMes = 29;
                    } else {
                        diesMes = 28;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
       
    }
    
}

Implementa una funció que rebi com a arguments dos enters que representen un mes i un any, i torni com a resultat el nombre de dies d'aquest mes. Si és febrer s'ha de comprovar si és un any de traspàs