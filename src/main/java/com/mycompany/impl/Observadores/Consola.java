/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.Observadores;

import com.mycompany.taller.Observador.Observador;

/**
 *
 * @author ef1008 R3
 */
public class Consola implements Observador{

    @Override
    public void update(int dataA, int dataB) {
         System.out.println("Consola -> Dato A: " + dataA + ", Dato B: " + dataB);
    }
    
}
