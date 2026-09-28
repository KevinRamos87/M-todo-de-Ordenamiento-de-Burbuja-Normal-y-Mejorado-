/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.uthh.edd.tdasemaforo;

/**
 *
 * @author Kevin Daniel Ramos Castro
 */
public class TdaSemaforo {

    public static void main(String[] args) {
       // Hacemos visible la ventana del semáforo al iniciar el programa
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventanasemaforo().setVisible(true);
            }
        });
    }
}
