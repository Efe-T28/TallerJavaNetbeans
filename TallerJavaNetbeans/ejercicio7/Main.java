/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

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
        int horasTrabajadas=38;
        double valorHora = 89.88;
        double salarioTotal;
        double impuestos;
        
        if(horasTrabajadas<38){
            salarioTotal = horasTrabajadas * valorHora;
        }else{
            double horasExtras = horasTrabajadas - 48;
            salarioTotal  = (38 * valorHora)+(horasExtras * valorHora * 1.5 );
        }
        
        if (salarioTotal<=750){
            impuestos = 0;
        }else{
            impuestos = salarioTotal * 0.1;
        }
        
        double salarioFinal = salarioNeto(salarioTotal, impuestos);
        
        System.out.println("Salario Total: " + salarioTotal + " euros");
        System.out.println("Impuestos: "+ impuestos + "euros");
        System.out.println("Salario Final: " + salarioFinal + " euros");
    }
    
    public static double salarioNeto(double salarioTotal, double impuestos){
        return salarioTotal - impuestos;
    }
    
}
