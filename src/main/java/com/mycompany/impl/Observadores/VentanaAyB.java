/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.Observadores;

import com.mycompany.taller.Observador.Observador;
import com.mycompany.taller.interfaz.Ventana_A_B;

/**
 *
 * @author ef1008 R3
 */
public class VentanaAyB implements Observador {

    private int dataA;
    private int dataB;
    private Ventana_A_B venAB;
    
    public VentanaAyB() {
        this.venAB = new Ventana_A_B();
    }

    @Override
    public void update(int dataA, int dataB) {
        this.dataA = dataA;
        this.dataB = dataB;
        display();
    }

    public void display() {
        System.out.println("Dato A actualizado: " + dataA + ",  Dato B actualizado: " + dataB);
        if (!venAB.isVisible()) {
            venAB.setVisible(true);
        }
        venAB.mostrarAyB(dataA, dataB);
    }
}
