/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.Observadores;

import com.mycompany.taller.Observador.Observador;
import com.mycompany.taller.interfaz.Ventana_A;

/**
 *
 * @author ef1008 R3
 */
public class VentanaA implements Observador{
    private int dataA;
    private Ventana_A venA;
    
    public VentanaA() {
        this.venA = new Ventana_A();
    }

    @Override
    public void update(int dataA, int dataB) {
        this.dataA = dataA;
        display();
    }

    public void display() {
        System.out.println("Dato A actualizado: " + dataA);
        if (!venA.isVisible()) {
            venA.setVisible(true);
        }
        venA.mostrarA(dataA);
    }
}
