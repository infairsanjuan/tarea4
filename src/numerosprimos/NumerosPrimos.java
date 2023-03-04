/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package numerosprimos;

/** Clase para probar el algoritmo de la criba de Eratóstenes 
 *  para generar números primos.
 * 
 * @author arkano
 */
public class NumerosPrimos {   
    
    public static void main(String[] args) {
       int[] centArray = CribaEratostenes.generarPrimos(100);             // Probamos a generar los primos entre 1 y 100
       for (int i=0;i<centArray.length;i++){
            System.out.println(centArray[i]);                   // Los mostramos
            
        }
    
    }
}
    
    
 

