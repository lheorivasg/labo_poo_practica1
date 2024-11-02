
package practica.pkg1;



public class Alumno extends Persona {
    private String trimestreIngreso;
    private String unidad;

    public Alumno() {//Construcotr vacio
    }

    public Alumno(String trimestreIngreso, String unidad) { //Constructor Parametrizado
        this.trimestreIngreso = trimestreIngreso;
        this.unidad = unidad;
    }

    public Alumno(String trimestreIngreso, String unidad, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.trimestreIngreso = trimestreIngreso;
        this.unidad = unidad;
    }

    public String getTrimestreIngreso() {
        return trimestreIngreso;
    }

    public void setTrimestreIngreso(String trimestreIngreso) {
        this.trimestreIngreso = trimestreIngreso;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }
    
    
    
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

    public static int getRandom(int min, int max) {
		int range = (max - min) + 1;
     		int random = (int) ((range * Math.random()) + min);
		return random;
	}

    public void generarMatricula(){
       String matricula= obtenerUnidad() +trimestreIngreso.substring(0, 2)+ tri()+getRandom(0, 2)+getRandom(0, 4)+getRandom(5, 9)+getRandom(0, 9)+getRandom(0, 9) +getRandom(0, 9); 
        
        System.out.println("Matricula:"+matricula); 
    }

    @Override
    public String toString() {
        return "Alumno: " + "trimestreIngreso=" + trimestreIngreso + ", unidad=" + unidad;
    }

    
}
