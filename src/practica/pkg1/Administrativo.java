/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;
import java.util.Random;

public class Administrativo extends Trabajador{
    private String fechaNacimiento;
    
    
    /**
     * Contuctor parametrizado con fechaNacimiento y NumEconomico
     * @param fechaNacimiento
     * @param numEconomico 
     */
    public Administrativo(String fechaNacimiento, String numEconomico) {
        super(numEconomico);
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * Constructor parametrizado con los atributos de la clase y la super clase Trabajador
     * @param fechaNacimiento
     * @param numEconomico
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno 
     */
    public Administrativo(String fechaNacimiento, String numEconomico, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(numEconomico, nombre, apellidoPaterno, apellidoMaterno);
        this.fechaNacimiento = fechaNacimiento;
    }
    
    

/**
 * 
 * @return 
 */
    public String generarRFC(){
        StringBuilder rfc = new StringBuilder();
        
        String apellidoPaterno = getApellidoPaterno();
        String apellidoMaterno = getApellidoMaterno();
        String nombre = getNombre();
        
        // Obtener las dos primeras letras del apellido paterno
        if(apellidoPaterno.length() >= 2){
            rfc.append(apellidoPaterno.substring(0,2).toUpperCase());
        } else {
            rfc.append(apellidoPaterno.toUpperCase());
        }
        
        // Primera Letra del apellido Materno (o "X" si no se encuentra)
        if(apellidoMaterno.length() >= 1){
            rfc.append(apellidoMaterno.substring(0,1).toUpperCase());
        }else{
            rfc.append("X");
        }
        
        // Primera letra del nombre
        if (nombre.length() >= 1){
            rfc.append(nombre.substring(0,1).toUpperCase());
        }
        
        //Fecha de nacimiento en formato AAMMDD
        String[] fecha = fechaNacimiento.split("-");
        if(fecha.length == 3){
            rfc.append(fecha[0].substring(2,4)); // Ano 
            rfc.append(fecha[1]); // Mes
            rfc.append(2);        // Dia
        }
        
        
        //Homoclave (tres caracteres aleatorios
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        for(int i = 0; i < 3; i++){
            int indiceAleatorio = (int)(Math.random() * caracteres.length());
            rfc.append(caracteres.charAt(indiceAleatorio));
        }
        
        return rfc.toString();
    }



    /**
     * Metodo para obtener el parametro fechaNacimiento
     * @return 
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Metodo para establecer el parametro fechaNacimiento
     * @param fechaNacimiento 
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

}
