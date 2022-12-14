/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.table.AbstractTableModel;

/**
 *
 * @author hola
 */
public class ModeloTabla extends AbstractTableModel{
    
    private ModeloAgenda m;
    private ModeloAgendaListener mal;

    public ModeloTabla(ModeloAgenda m) {
        this.m = m;
        mal = new ModeloAgendaListener(this, m);
        m.addListDataListener(mal);
    }
    
    
    @Override
    public int getRowCount() {
        return m.getSize();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Persona p = m.getElementAt(i);
        switch(i1){
            case 0:
                return p.getNombre();
            case 1:
                return p.getDireccion();
            case 2:
                return p.getTelefono();
        }
        return null;
    }
    
}
