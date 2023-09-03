/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

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
        
        int A = 10;
        int B = 12;
        int resultado=suma(A,B);
        System.out.println("Suma de los dos números: "+resultado);
        System.out. println("El número mas pequeño de las dos sumas es: "+(resultado-1));
        
    }
    
    public static int suma(int A, int B){
        
        return A+B;
    }
    
}
