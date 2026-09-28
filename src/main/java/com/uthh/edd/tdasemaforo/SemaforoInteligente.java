/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.tdasemaforo;

/**
 *
 * @author Kevin Daniel Ramos Castro
 */
public class SemaforoInteligente extends ControladorVial{
    private String colorActual; // "Rojo", "Amarillo", "Verde"
    private int tiempoDuracion; // en segundos

    public SemaforoInteligente(String ubicacion, boolean estadoActivo, String colorActual, int tiempoDuracion) {
        super(ubicacion, estadoActivo);
        this.colorActual = colorActual;
        this.tiempoDuracion = tiempoDuracion;
    }

    public String getColorActual() {
        return colorActual;
    }

    public void setColorActual(String colorActual) {
        if (colorActual.equals("Rojo") || colorActual.equals("Amarillo") || colorActual.equals("Verde")) {
            this.colorActual = colorActual;
        }
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        if (tiempoDuracion > 0) {
            this.tiempoDuracion = tiempoDuracion;
        }
    }


    public void cambiarCiclo() {
        if (this.colorActual.equals("Rojo")) {
            this.colorActual = "Verde";
            this.tiempoDuracion = 45;
        } else if (this.colorActual.equals("Verde")) {
            this.colorActual = "Amarillo";
            this.tiempoDuracion = 5;
        } else {
            this.colorActual = "Rojo";
            this.tiempoDuracion = 30;
        }
    }

    public String modoEmergencia(boolean activar) {
        if (activar) {
            this.colorActual = "Rojo";
            this.tiempoDuracion = 10;
            return "¡Alerta! Semáforo forzado a Rojo por emergencia vial.";
        }
        return "Semáforo operando en ciclo normal.";
    }

    public String evaluarFlujo() {
        switch (this.colorActual) {
            case "Verde":
                return "Flujo libre. Los vehículos pueden avanzar.";
            case "Amarillo":
                return "Precaución. El semáforo está a punto de cambiar.";
            case "Rojo":
                return "Alto total. Los vehículos deben estar detenidos.";
            default:
                return "Estado no identificado.";
        }
    }

    // MÉTODO RECURSIVO
    public int calcularTiempoAcumulado(int ciclosRestantes) {
        if (ciclosRestantes <= 1) {
            return this.tiempoDuracion;
        } else {
            return this.tiempoDuracion + calcularTiempoAcumulado(ciclosRestantes - 1);
        }
    }
}
