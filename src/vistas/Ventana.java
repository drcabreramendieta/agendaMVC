/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import java.awt.event.ActionListener;
import javax.swing.ListModel;
import modelos.Persona;

/**
 *
 * @author hola
 */
public interface Ventana {
    public void registerListModel(ListModel m);
    public void registerButtonsListeners(ActionListener a, ActionListener r);
    public String getNombre();
    public String getDireccion();
    public String getTelefono();
    public Persona getSelected();
}
