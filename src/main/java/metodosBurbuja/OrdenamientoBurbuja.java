/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosBurbuja;

/**
 *
 * @author danie
 */
public class OrdenamientoBurbuja {
    public static void ordenamientoBurbuja(int[] arregloN) {
        int longitud = arregloN.length;
        for (int i = 0; i < longitud - 1; i++) {
            for (int j = 0; j < longitud- 1 - i; j++) {
                if (arregloN[j] > arregloN[j + 1]) {
                    // Intercambio (swap)
                    int temp = arregloN[j];
                    arregloN[j] = arregloN[j + 1];
                    arregloN[j + 1] = temp;
                }
            }
        }
    }

    public static void ordenamientoBurbujamejorado(int[] arregloN) {
        int longitud = arregloN.length;
        for (int i = 0; i < longitud - 1; i++) {
            boolean bandera = false;
            for (int j = 0; j < longitud - 1 - i; j++) {
                if (arregloN[j] > arregloN[j + 1]) {
                    int temp = arregloN[j];
                    arregloN[j] = arregloN[j + 1];
                    arregloN[j + 1] = temp;
                    bandera = true; 
                }
            }
            if (!bandera) {
                break;
            }
        }
    }
    
   public static void main(String[] args) {
    
        int[] arregloDesordenado = {5, 3, 7, 9, 0, 2, 4};
        
        System.out.println("--- Prueba con Arreglo Desordenado ---");
        System.out.print("Estado inicial: ");
        for (int n : arregloDesordenado) System.out.print(n + " ");
        System.out.println();
        
        ordenamientoBurbujamejorado(arregloDesordenado);
        
        System.out.print("Resultado final: ");
        for (int n : arregloDesordenado) System.out.print(n + " ");
        System.out.println("\n");

        int[] arregloParcial = {1, 2, 4, 3, 5};
        
        System.out.println("--- Prueba con Arreglo Parcialmente Ordenado ---");
        System.out.print("Estado inicial: ");
        for (int n : arregloParcial) System.out.print(n + " ");
        System.out.println();
        
        ordenamientoBurbujamejorado(arregloParcial);
        
        System.out.print("Resultado final: ");
        for (int n : arregloParcial) System.out.print(n + " ");
        System.out.println();
    }
}


