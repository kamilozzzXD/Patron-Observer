/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.taller.ObservableInterface;

import com.mycompany.taller.Observador.Observador;

/**
 *
 * @author ef1008 R3
 */
public interface ObservableInterface {
    void addObservador(Observador observer);
    void removeObservador(Observador observer);
    void notifcarObservadores();
}
