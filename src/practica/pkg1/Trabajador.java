/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

/**
 *
 * @author Kirigalla
 */
public class Trabajador extends Persona {
    protected String numEconomico;

    public Trabajador(String numEconomico) {
        this.numEconomico = numEconomico;
    }

    public Trabajador(String numEconomico, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.numEconomico = numEconomico;
    }

    public String getNumEconomico() {
        return numEconomico;
    }

    public void setNumEconomico(String numEconomico) {
        this.numEconomico = numEconomico;
    }
    
    
}
