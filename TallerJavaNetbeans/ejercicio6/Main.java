/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;

/**
 *
 * @author LENOVO
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cateto1=5.3;
        double cateto2=4.3;
        double angulo1= Math.atan(cateto1/cateto2);
        double angulo2= Math.atan(cateto2/cateto1);
        angulo1 = Math.toDegrees(angulo1);
        angulo2 = Math.toDegrees(angulo2);
        double hipotenusa = calcularHipotenusa(cateto1,cateto2);
        System.out. println("La hipotenusa del triangulo es: "+hipotenusa);
        System.out. println("1 Ángulo agudo: "+angulo1 + "grados");
        System.out. println("2 Ángulo agudo: "+angulo2 + "grados");
    }
    
    public static double calcularHipotenusa(double cateto1, double cateto2){
        
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
    
    
}
