
package practica.pkg1;

public class Practica1 {

    public static void main(String[] args) {
        Alumno Al1 = new Alumno("17-I","Azcapotzalco","Mauricio","Sanchez","Lopez");
        Profesor P1 =new Profesor("FURJ860423HBCNCR08","Jorge","Fuentes","Rocha");
        //Aministrativo Ad1 =new Administrativo();
        
        System.out.println("=== Prueba 1 ===");
        System.out.println("Alumno 1");
        Al1.generarMatricula();
       /* System.out.println("Profesor 1");
        System.out.println(P1.obtenerSexo());
        System.out.println(P1.obtenerEstado());
        */
        
        
        
        Alumno Al2 = new Alumno("23-P","Lerma","Carla","Trujillo","Sandoval");
        Profesor P2 =new Profesor("FURJ860423HBCNCR08","Jorge","Fuentes","Rocha");
        System.out.println("\n=== Prueba 2 ===");
        System.out.println("Alumno 2");
        Al2.generarMatricula();
        
        Alumno Al3 = new Alumno("21-O","Iztapalapa","Diego","Martinez","Negrete");
        
        System.out.println("\n=== Prueba 3 ===");
        System.out.println("Alumno 3");
        Al3.generarMatricula();
        
        
    }
    
}
