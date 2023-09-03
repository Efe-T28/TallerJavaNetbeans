/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

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
        int[] Productos = {1111,2222,3333,4444,5555};
        double[] Valor = {1200,2500,1500,3200,5180};
        int[] UnidadVen = {5,4,12,24,18};
        
        int totalProductos = 0;
        double totalIngresos =0;
        int productoTop =0;
        int productoCos = 0;
        
        for(int i = 0; i<5; i++){
            totalProductos += UnidadVen[i];
            totalIngresos +=Valor[i] * UnidadVen[i];
            
            if(UnidadVen[i]>UnidadVen[productoTop]){
                productoTop = i;
            }
            
            if(Valor[i]>Valor[productoCos]){
                productoCos = i;
            }
        }
        System.out.println("Total productos vendidos en el día: " + totalProductos);
        System.out.println("Total ingresos por ventas del día: " + totalIngresos);
        System.out.println("El producto más vendido (código): " + Productos [productoTop]);
        System.out.println("El producto más costoso vendido (código): " + Productos[productoCos]);

    }
}