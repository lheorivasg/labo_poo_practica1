
package practica.pkg1;


import java.util.HashMap;

/**
 * 
 * @author Equipo 5: Max Alvarez Alvarez, Hugo Rubio Romero y Leonardo Rivas Gutierrez
 * @version 3
 */
public class Profesor extends Trabajador {
    private String curp;


/**
 * Constructor con los parametros de la clase y de la super clase
 * @param curp
 * @param numEconomico
 * @param nombre
 * @param apellidoPaterno
 * @param apellidoMaterno 
 */
    public Profesor(String curp, String numEconomico, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(numEconomico, nombre, apellidoPaterno, apellidoMaterno);
        this.curp = curp;
    }

    
/**
 * Metodo para obtener el curp
 * @return 
 */
    public String getCurp() {
        return curp;
    }

    /**
     * Metodo establecer obtener el sexo
     * @param curp 
     */
    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    /**
     * Metodo para detecter H o M e identificar si la persona es hombre o Mujer
     * @return Hombre/Mujer
     */
    public String obtenerSexo(){
    String llave = curp.substring(10,11);
    HashMap<String, String> sexo = new HashMap<String, String>();

    sexo.put("H","Hombre");
    sexo.put("M","Mujer");
    
    return sexo.getOrDefault(llave, "Sexo no valido");

    }


    /**
     * HashMap para identificar el caracter 11 y 12 del curp y por lo tanto identificar de que estado es originaria la persona
     * @return Estado de Origen
     */
    public String obtenerEstado(){
        String llave = curp.substring(11,13);

        HashMap<String, String> estados = new HashMap<String, String>();

        estados.put("AS","Aguascalientes");
        estados.put("BS","Baja California Sur");
        estados.put("CL","Coahuila");
        estados.put("CS","Chiapas");
        estados.put("GT","Guamajuato");
        estados.put("HG","Hidalgo");
        estados.put("MC","Mexico");
        estados.put("MS","Morelos");
        estados.put("NL","Nuevo Leon");
        estados.put("PL","Puebla");
        estados.put("QR","Quintana Roo");
        estados.put("SL","Sinaloa");
        estados.put("TC","Tabasco");
        estados.put("TL","Tlaxcaña");
        estados.put("YN","Yucatan");
        estados.put("NE","Nacido en extranejero");
        estados.put("BC","Baja California");
        estados.put("CC","Campeche");
        estados.put("CM","Colima");
        estados.put("CH","Chihuahua");
        estados.put("DG","Durango");
        estados.put("GR","Guerrero");
        estados.put("JC","Jalisco");
        estados.put("MN","Michoacan");
        estados.put("NT","Nayarit");
        estados.put("OC","Oaxaca");
        estados.put("QT","Queretaro");
        estados.put("SP","San Luis Potosi");
        estados.put("SR","Sonora");
        estados.put("TS","Tamaulipas");
        estados.put("VZ","Veracruz");
        estados.put("ZS","Zacatecas");

    return estados.getOrDefault(llave, "Clave no valida para un CURP");
    }

    
    /**
     * Metodo para validar que el curp cumple con las directrices que formar un curp
     * @return Curp valido o no valido
     */
    public String validarCurp(){
        String primerApellido = getApellidoPaterno().toUpperCase();
        String segundoApellido = getApellidoMaterno().toUpperCase();
        String nombre = getNombre().toUpperCase();
        
        
        String letraApellidoP = primerApellido.substring(0,1);

        char vocalApellidoP = ' ';
        for(int i = 1; i < primerApellido.length(); i++){
            char c = primerApellido.charAt(i);
            if("AEIOU".indexOf(c) != -1 ){
                vocalApellidoP = c;
                break;
            }
        
        }
        
        if(vocalApellidoP == ' '){
            return "No se encontro una vocal en el Apellido Paterno";
        }
        
        String letraApellidoM = segundoApellido.substring(0,1);
        String letraNombre = nombre.substring(0,1);
        
        
        
        if(curp.substring(0,1).equals(letraApellidoP) &&
           curp.charAt(1) == (vocalApellidoP) &&
           curp.substring(2,3).equals(letraApellidoM) &&
           curp.substring(3,4).equals(letraNombre) ) {
           return "Curp valido";
        } else {
            return "Curp no valido";
        }
    
    }
    
    
}


