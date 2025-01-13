/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad_anas_funcion_3;

public class Muhammad_anas_funcion_3 {

public static double volumesfera(double radi) {
    double volum = 4.0/3.0 * Math.PI * Math.pow(radi, 3);
    return volum;
}
    public static void main(String[] args) {
        double radi = 5.0;
        double volum = volumesfera(radi);
        System.out.printf("El volum de la esfera amb radi és %.2f i el volum és %.2f\n", radi, volum);
    }
}
