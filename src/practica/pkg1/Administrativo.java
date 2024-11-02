/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.pkg1;

import java.util.Random;

public class Administrativo extends Persona{
    private String fechaNacimiento;
    
    public Administrativo(String fechaNacimiento, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.fechaNacimiento = fechaNacimiento;
    }

    public static int getRandom() {
        int range = (9 - 0) + 1;
        int random = (int) ((range * Math.random()) + 0);
        return random;
    }


    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    

    private static char randomChar(int numeroAleatorio_11) {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'A');
    }
//    int numeroAleatorio_1 = getRandom(65, 90);
//    char a = randomChar(numeroAleatorio_1);
//    char b = randomChar(numeroAleatorio_1);
//
//    int numeroAleatorio = getRandom(0, 9);

//    public void generarRFC() {
//
//        String subpaterno = apellidoPaterno.substring(0, 2);
//        subpaterno = subpaterno.toUpperCase();
//
//        String submaterno = apellidoMaterno.substring(0, 1);
//        submaterno = submaterno.toUpperCase();
//
//        String subnombre = nombre.substring(0, 1);
//        subnombre = subnombre.toUpperCase();
//
//        String ultimoaño = fechaNacimiento.substring(6, 8);
//        String submes = fechaNacimiento.substring(2, 4);
//        String subdia = fechaNacimiento.substring(0, 2);
//
//        System.out.println(subpaterno + submaterno + subnombre + ultimoaño + submes + subdia + a + b + numeroAleatorio);
//
//    }
//
//    private int getRandom(int i, int i0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
}
