/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;
import ec.edu.intsuperior.vista.Loggin;
import ec.edu.intsuperior.vista.formularios.Administrador;

import ec.edu.intsuperior.vista.formularios.PanelAdmin;
import java.sql.Connection;

  

public class Controlador {
    Loggin loggin = new Loggin(this);
    Administrador administrador = new Administrador(this); 
    PanelAdmin panelAdmin= new PanelAdmin (this);
    
    public void showLoggin(){
        loggin.setVisible(true);
    }
    public void closeLoggin(){
        loggin.setVisible(false);
    }    
    public void showAdministrador(){
        administrador.setVisible(true);
    }
    public void closeAdministrador(){
        administrador.setVisible(false);
     }    
     public void showPanelAdmin(){
        panelAdmin.setVisible(true);
    }
     public void closePanelAdmin(){
        panelAdmin.setVisible(false);
}
}