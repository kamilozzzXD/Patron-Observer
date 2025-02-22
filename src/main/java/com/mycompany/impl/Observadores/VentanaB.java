/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.Observadores;

import com.mycompany.taller.Observador.Observador;
import com.mycompany.taller.interfaz.Ventana_B;

/**
 *
 * @author ef1008 R3
 */
public class VentanaB implements Observador {

    private int dataB;
    private Ventana_B venB;
    
    public VentanaB() {
        this.venB = new Ventana_B();
    }

    @Override
    public void update(int dataA, int dataB) {
        this.dataB = dataB;
        display();
    }

    public void display() {
        System.out.println("Dato B actualizado: " + dataB);
        if (!venB.isVisible()) {
            venB.setVisible(true);
        }
        venB.mostrarB(dataB);
    }
    
}
