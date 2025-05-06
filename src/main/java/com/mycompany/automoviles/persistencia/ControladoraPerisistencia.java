
package com.mycompany.automoviles.persistencia;

import com.mycompany.automoviles.logica.Automovil;
import com.mycompany.automoviles.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPerisistencia {
    
    AutomovilJpaController autoJpa = new AutomovilJpaController();
    
    public void agregarAutomovil(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        return autoJpa.findAutomovilEntities();
    }

    public void borrarAutomovil(int id_automovil) {
        try {
            autoJpa.destroy(id_automovil);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPerisistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAutos(int id_automovil) {
        return autoJpa.findAutomovil(id_automovil);
    }

    public void editarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPerisistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
