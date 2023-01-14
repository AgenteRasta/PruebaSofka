/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebasofka;

import controlador.CtrlNaves;
import modelo.Consultas;
import modelo.Lanzadera;
import modelo.Nave;
import modelo.Naves;
import vista.Vista;

/**
 *
 * @author Rasta
 */
public class PruebaSofka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Naves mod = new Naves();
        Lanzadera mod1 = new Lanzadera() {};  
        Consultas modC = new Consultas();
        Vista frm= new Vista();
        
        
        
        
        CtrlNaves ctrl= new CtrlNaves(mod,mod1,modC,frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
    
}
