
package practica.pkg1;



public class Alumno extends Persona {
    private String trimestreIngreso;
    private String unidad;

    
    /**
     * Contructor vacio
     */    
    public Alumno() {//Construcotr vacio
    }

    
    /**
     * Contructor parametrizado unicamente con los atributos trimestreIngresado y unidad
     * 
     * @param trimestreIngreso
     * @param unidad 
     */
    public Alumno(String trimestreIngreso, String unidad) { //Constructor Parametrizado
        this.trimestreIngreso = trimestreIngreso;
        this.unidad = unidad;
    }

    
    /**
     * Contructor parametrizado con todos los atributos de la clase
     * 
     * @param trimestreIngreso
     * @param unidad
     * @param nombre
     * @param apellidoPaterno
     * @param apellidoMaterno 
     */
    public Alumno(String trimestreIngreso, String unidad, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.trimestreIngreso = trimestreIngreso;
        this.unidad = unidad;
    }

    
    /**
     * Metodo para obtener el trimestre de ingreso
     * @return 
     */
    public String getTrimestreIngreso() {
        return trimestreIngreso;
    }

    
    
    /**
     * Metodo para establecer el trimestre de ingreso
     * @param trimestreIngreso 
     */
    public void setTrimestreIngreso(String trimestreIngreso) {
        this.trimestreIngreso = trimestreIngreso;
    }

    /**
     * Metodo para obtener el parametro unidad
     * @return 
     */
    public String getUnidad() {
        return unidad;
    }

    
    /**
     * Metodo para establecer el parametro unidad
     * @param unidad 
     */
    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
    /**
     * Metodo para asociar el nombre de la unidad con el primer digito de la matricular
     * @return primer digito de la matricula
     */
    public String obtenerUnidad(){
        if(unidad=="Xochimilco"){
        return "1";
        }else if(unidad=="Azcapotzalco"){
        return "2";
        }else if(unidad=="Iztapalapa"){
        return "3";
        }else if(unidad=="Cuajimalpa"){
        return "4";
        }else if(unidad=="Lerma"){
        return "5";
        }else
            return "#";
    }
    
    
    /**
     * Meotodo para asociar el segundo digito de la matricula con el trimestre de ingreso
     * @return segundo digito
     */
    public String tri(){
        String tri;
        tri= trimestreIngreso.substring(3,4);
        if(tri.equals("I")){
        return "1";
        }else if(tri.equals("P")){
        return "2";
        }
        else if(tri.equals("O")){
        return "3";
        }
        else
            return "#";
    }

    
    /**
     * Metodo para gener numeros aleatorios
     * @param min
     * @param max
     * @return un numero aleatorio del 0 al 9
     */
    public static int getRandom(int min, int max) {
		int range = (max - min) + 1;
     		int random = (int) ((range * Math.random()) + min);
		return random;
	}

    
    /**
     * El metodo que llama construye la matricula por medio de los metodos obtenerUnidad() + trimestreIngreso.substring(0, 2) 
     * + tri()+getRandom(0, 2) + getRandom(0, 4) +getRandom(5, 9) + getRandom(0, 9) + getRandom (0, 9) +getRandom(0, 9)
     */
    public void generarMatricula(){
       String matricula= obtenerUnidad() +trimestreIngreso.substring(0, 2)+ tri()+getRandom(0, 2)+getRandom(0, 4)+getRandom(5, 9)+getRandom(0, 9)+getRandom(0, 9) +getRandom(0, 9); 
        
        System.out.println("Matricula:"+matricula); 
    }

    /**
     * Metodo que representa el estado de los atributos de un objeto
     * @return 
     */
    @Override
    public String toString() {
        return "Alumno: " + "trimestreIngreso=" + trimestreIngreso + ", unidad=" + unidad;
    }

    
}
