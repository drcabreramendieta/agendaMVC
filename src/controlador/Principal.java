/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import modelos.ModeloAgenda;
import modelos.ModeloTabla;
import vistas.Ventana;
import vistas.Ventana1;

/**
 *
 * @author hola
 */
public class Principal {
    public static void main(String[] args){
        ModeloAgenda m = new ModeloAgenda();
        Ventana v = new Ventana1();
        AgregarListener al = new AgregarListener(v,m);
        RemoverListener rl = new RemoverListener(v,m);
        v.registerButtonsListeners(al, rl);
        v.registerListModel(m);
        
        ModeloTabla mt = new ModeloTabla(m);
        v.registerTableModel(mt);
        
        ((Ventana1)v).setVisible(true);
    }
}
