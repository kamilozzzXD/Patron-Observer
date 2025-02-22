/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Brayan Camilo Herrera 160004711
package com.mycompany.taller;

import com.mycompany.taller.interfaz.Menu;
import javax.swing.SwingUtilities;


public class Impl {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            Menu menu = new Menu();
            menu.setVisible(true);
        });
    }

}
