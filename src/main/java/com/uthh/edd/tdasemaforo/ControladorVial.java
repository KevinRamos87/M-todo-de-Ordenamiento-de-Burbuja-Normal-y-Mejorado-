/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.tdasemaforo;

/**
 *
 * @author Kevin Daniel Ramos Castro
 */
public class ControladorVial {
    // Atributos privados (Encapsulamiento)
    private String ubicacion;
    private boolean estadoActivo;

    // Constructor vacío por defecto
    public ControladorVial() {
        this.ubicacion = "Cruce Principal";
        this.estadoActivo = true;
    }

    // Constructor con parámetros y validaciones
    public ControladorVial(String ubicacion, boolean estadoActivo) {
        this.ubicacion = (ubicacion != null && !ubicacion.isEmpty()) ? ubicacion : "La glorieta";
        this.estadoActivo = estadoActivo;
    }

    // Métodos de acceso (Gets y Sets)
    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEstadoActivo() {
        return estadoActivo;
    }

    public void setEstadoActivo(boolean estadoActivo) {
        this.estadoActivo = estadoActivo;
    }
}
