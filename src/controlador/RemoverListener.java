/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.ModeloAgenda;
import vistas.Ventana;

/**
 *
 * @author hola
 */
public class RemoverListener implements ActionListener{
    private Ventana v;
    private ModeloAgenda m;

    public RemoverListener(Ventana v, ModeloAgenda m) {
        this.v = v;
        this.m = m;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        m.removeElement(v.getSelected());
    }
    
}
