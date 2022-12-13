/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vistas.Ventana;
import modelos.ModeloAgenda;

/**
 *
 * @author hola
 */
public class AgregarListener implements ActionListener{
    private Ventana v;
    private ModeloAgenda m;

    public AgregarListener(Ventana v, ModeloAgenda m) {
        this.v = v;
        this.m = m;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        String nombre = v.getNombre();
        String direccion = v.getDireccion();
        String telefono = v.getTelefono();
        m.createPersona(nombre, direccion, telefono);
    }
    
}
