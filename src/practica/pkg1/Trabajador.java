/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

/**
 * 
 * @author Equipo 5: Max Alvarez Alvarez, Hugo Rubio Romero y Leonardo Rivas Gutierrez
 * @version 3
 */
public class Trabajador extends Persona {
    protected String numEconomico;

    /**
     * Contructor con el parametro numEconomico
     * @param numEconomico 
     */
    public Trabajador(String numEconomico) {
        this.numEconomico = numEconomico;
    }

    /**
     * Constructor con el parametro de la clase y los de la super clase Persona
     * @param numEconomico
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno 
     */
    public Trabajador(String numEconomico, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.numEconomico = numEconomico;
    }

    /**
     * Metodo para obtener el Numero Economico
     * @return 
     */
    public String getNumEconomico() {
        return numEconomico;
    }

    /**
     * Metodo para obtener el Numero Economico
     * @param numEconomico 
     */
    public void setNumEconomico(String numEconomico) {
        this.numEconomico = numEconomico;
    }
    
    
}
