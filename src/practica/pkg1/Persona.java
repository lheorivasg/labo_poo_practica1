
package practica.pkg1;


public class Persona {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;

    /**
     * Contructor vacio
     */
    public Persona() {
    }

    
    /**
     * 
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno 
     */
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    
    /**
     * Metodo para obtener el parametro nombre
     * @return 
     */
    public String getNombre() {
        return nombre;
    }

    
    /**
     * Metodo para establecer el parametro nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Metodo para obtener el parametro ApellidoPaterno
     * @return 
     */    
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    
    /**
     *Metodo para establecer el parametro ApellidoPaterno 
     * @param apellidoPaterno 
     */
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    
    /**
     * Metodo para obtener el parametro ApellidoMaterno
     * @return 
     */       
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    
    /**
     * Metodo para establecer el parametro ApellidoMaterno
     * @return 
     */       
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    
    /**
     * Metodo que representa el estado de los atributos de un objeto
     * @return 
     */
    @Override
    public String toString() {
        return "Persona: " + "\nnombre: " + nombre + "\nApellido Paterno: " + apellidoPaterno + "\nApellido Materno: " + apellidoMaterno;
    }
    
    
    
}
