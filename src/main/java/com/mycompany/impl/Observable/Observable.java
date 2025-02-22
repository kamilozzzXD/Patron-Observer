/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.Observable;

import com.mycompany.taller.ObservableInterface.ObservableInterface;
import com.mycompany.taller.Observador.Observador;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ef1008 R3
 */
public class Observable implements ObservableInterface {
    private List<Observador> observadores = new ArrayList<>();
    private int dataA;
    private int dataB;

    @Override
    public void addObservador(Observador observer) {
        observadores.add(observer);
    }

    @Override
    public void removeObservador(Observador observer) {
        observadores.remove(observer);
    }

    @Override
    public void notifcarObservadores() {
    for (Observador observer : observadores) {
            observer.update(dataA, dataB);
        }    
    }
    
    public int generateDataA() {
        dataA = (int) (Math.random() * 10 + 1); 
        notifcarObservadores();
        return dataA;
    }

    public int generateDataB() {
        dataB = (int) (Math.random() * 10 + 1); 
        notifcarObservadores();
        return dataB;
    }

    public int getDataA() {
        return dataA;
    }

    public int getDataB() {
        return dataB;
    }
}
