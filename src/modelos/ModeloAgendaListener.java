/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/**
 *
 * @author hola
 */
public class ModeloAgendaListener implements ListDataListener{
    private ModeloTabla mt;
    private ModeloAgenda m;

    public ModeloAgendaListener(ModeloTabla mt, ModeloAgenda m) {
        this.mt = mt;
        this.m = m;
    }
    
    @Override
    public void intervalAdded(ListDataEvent lde) {
        mt.fireTableRowsInserted(lde.getIndex0(), lde.getIndex1());
    }

    @Override
    public void intervalRemoved(ListDataEvent lde) {
        mt.fireTableRowsDeleted(lde.getIndex0(), lde.getIndex1());
    }

    @Override
    public void contentsChanged(ListDataEvent lde) {
        System.out.println("Contenido cambiado");
    }
    
}
