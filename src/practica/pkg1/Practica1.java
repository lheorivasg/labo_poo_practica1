
package practica.pkg1;
/**
 * 
 * @author Equipo 5: Max Alvarez Alvarez, Hugo Rubio Romero y Leonardo Rivas Gutierrez
 * @version 3
 */

public class Practica1 {

    public static void main(String[] args) {
        /**
         * Crear objetos Alumno, Profesor y Administrativo, para Prueba 1
         */
        Alumno Al1 = new Alumno("17-I", "Azcapotzalco", "Mauricio", "Sanchez", "Lopez");
        Profesor P1 = new Profesor("FURJ860423HBCNCR08", "235689", "Jorge", "Fuentes", "Rocha");
        Administrativo Ad1 = new Administrativo("15/05/1989", "123489", "Sofia", "Martinez", "Rodriguez");

        
        /**
         * Impresion de la Prueba 1
         */
        System.out.println("=== Prueba 1 ===");
        System.out.println("Alumno 1 " + Al1.getNombre());
        Al1.generarMatricula();

        System.out.println("\nProfesor 1 " + P1.getNombre());
        System.out.println(P1.obtenerSexo());
        System.out.println(P1.obtenerEstado());
        System.out.println(P1.validarCurp());
        
        System.out.println("\nAdministrador 1 " + Ad1.getNombre());
        System.out.println(Ad1.generarRFC());
        
        
        
        /**
         * Crear objetos Alumno, Profesor y Administrativo, para Prueba 2
         */
        Alumno Al2 = new Alumno("23-P", "Lerma", "Carla", "Trujillo", "Sandoval");
        Profesor P2 = new Profesor("TRFJ910819HMSRLL07", "889658", "Julio", "Trujillo", "Flores");
        Administrativo Ad2 = new Administrativo("29/02/1995", "30301", "Regina", "Diaz", "Medina");

        /**
         * Impresion de la Prueba 2
         */
        System.out.println("\n=== Prueba 2 ===");
        System.out.println("Alumno 2 " + Al2.getNombre());
        Al2.generarMatricula();

        System.out.println("\nProfesor 2 " + P2.getNombre());
        System.out.println(P2.obtenerSexo());
        System.out.println(P2.obtenerEstado());
        System.out.println(P2.validarCurp());


        System.out.println("\nAdministrador 2 " + Ad2.getNombre());
        System.out.println(Ad2.generarRFC());
        
        
        /**
         * Crear objetos Alumno, Profesor y Administrativo, para Prueba 1
         */ 
        Alumno Al3 = new Alumno("21-O", "Iztapalapa", "Diego", "Martinez", "Negrete");
        Profesor P3 = new Profesor("CRCC850623MNERLE04", "758965", "Cecilia", "Cruz", "Colorado");
        Administrativo Ad3 = new Administrativo("01/08/1962", "54321", "Maricela", "Romero", "Huerta");
        
        
        
        
        /**
         *Impresion de la Prueba 3 
         */
        System.out.println("\n=== Prueba 3 ===");
        System.out.println("Alumno 3 " + Al3.getNombre());
        Al3.generarMatricula();

        System.out.println("\nProfesor 3 " + P3.getNombre());
        System.out.println(P3.obtenerSexo());
        System.out.println(P3.obtenerEstado());
        System.out.println(P3.validarCurp());

        System.out.println("\nAdministrador 3 " + Ad3.getNombre());
        System.out.println(Ad3.generarRFC());
        
        
    }
    
}
