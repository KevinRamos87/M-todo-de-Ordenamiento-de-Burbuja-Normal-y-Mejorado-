/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursividad.palabra;

/**
 *
 * @author danie
 */
public class Palindromo {

    public boolean esPalindromo(String palabra) {
        if (palabra == null) {
            return false;
        }
        return esPalindromoAux(palabra, 0, palabra.length() - 1);
    }

    private boolean esPalindromoAux(String palabra, int inicio, int fin) {
        if (inicio >= fin) {
            return true;
        }
        if (palabra.charAt(inicio) != palabra.charAt(fin)) {
            return false;
        }
        return esPalindromoAux(palabra, inicio + 1, fin - 1);
    }

    public static void main(String[] args) {
        Palindromo p = new Palindromo();
        
        // Aquí puedes cambiar la palabra para probar
        String palabraPrueba = "radar"; 
        
        boolean resultado = p.esPalindromo(palabraPrueba);
        System.out.println("¿Es '" + palabraPrueba + "' un palíndromo? " + resultado);
    }
}
