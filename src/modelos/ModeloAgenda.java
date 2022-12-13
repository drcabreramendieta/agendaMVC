/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author hola
 */
public class ModeloAgenda extends AbstractListModel<Persona>{
    private ArrayList<Persona> personas;

    public ModeloAgenda() {
        personas = new ArrayList<>();
    }
      
    @Override
    public int getSize() {
        return personas.size();
    }

    @Override
    public Persona getElementAt(int i) {
        return personas.get(i);
    }
    
    public void addElement(Persona p){
        int size = personas.size();
        personas.add(p);
        fireIntervalAdded(this,size,size);
    }
    
    public void removeElement(Persona p){
        int size = personas.size();
        personas.remove(p);
        fireIntervalRemoved(this,size,size);
    }
    
    public void createPersona(String nombre, 
            String direccion, 
            String telefono){
        Persona p = new Persona(nombre, direccion, telefono);
        addElement(p);
    }
}
