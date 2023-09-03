/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author LENOVO
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int m = 532;
        int n = 112;
        int mcd = AlgEuclides(m,n);
        System.out.println("El máximo común divisor de :" + m +  " y " + n + " es: "+ mcd); 
    }
    public static int AlgEuclides(int m, int n){
        while (n != 0){
        int resto = m % n;
        m=n;
        n = resto;
        }
        return m;
    }
}
