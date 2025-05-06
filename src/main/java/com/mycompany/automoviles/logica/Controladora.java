
package com.mycompany.automoviles.logica;

import com.mycompany.automoviles.persistencia.ControladoraPerisistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPerisistencia controlPersis = new ControladoraPerisistencia();
    Automovil auto = new Automovil();

    public void agregarAutomovil(String modelo, String marca, String color, String motor, String patente, int cantPuertas) {
        
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPantente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
    }

    public void borrarAutomovil(int id_automovil) {
        controlPersis.borrarAutomovil(id_automovil);
    }

    public Automovil traerAuto(int id_automovil) {
        return controlPersis.traerAutos(id_automovil);
    }

    public void editarAuto(Automovil auto, String modelo, String marca, String color, String motor, String patente, int cantPuertas) {
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setColor(color);
        auto.setMotor(motor);
        auto.setPantente(patente);
        auto.setCantPuertas(cantPuertas);
        
        controlPersis.editarAuto(auto);
        
    }

   


    
    
}
