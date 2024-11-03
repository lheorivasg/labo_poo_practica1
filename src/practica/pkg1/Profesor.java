
package practica.pkg1;


import java.util.HashMap;


public class Profesor extends Trabajador {
    private String curp;

    public Profesor(String curp, String numEconomico) {
        super(numEconomico);
        this.curp = curp;
    }

    public Profesor(String curp, String numEconomico, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(numEconomico, nombre, apellidoPaterno, apellidoMaterno);
        this.curp = curp;
    }

    

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    
    public String obtenerSexo(){
    String llave = curp.substring(10,11);
    HashMap<String, String> sexo = new HashMap<String, String>();

    sexo.put("H","Hombre");
    sexo.put("M","Mujer");
    
    return sexo.getOrDefault(llave, "Sexo no valido");

    }


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

    public String validarCurp(){
        String primerApellido = getApellidoPaterno();
        String segundoApellido = getApellidoMaterno();
        String nombre = getNombre();
        
        
        String letraApellidoP = primerApellido.substring(0);
        String letraApellidoM = segundoApellido.substring(0);
        String letraNombre = nombre.substring(0);
        
        
        char vocalApellidoP = ' ';
        for(char c: primerApellido.toCharArray()){
            if("AEIOU".indexOf(Character.toUpperCase(c)) !=-1 ){
                vocalApellidoP = Character.toUpperCase(c);
                break;
            }
        
        }
        
        if(vocalApellidoP == ' '){
            return "No se encontro una vocal en el Apellido Paterno";
        }
        
        
        
        if(curp.substring(0) == letraApellidoP &&
           curp.charAt(1) == vocalApellidoP &&
           curp.substring(2) == letraApellidoM &&
           curp.substring(3) == letraNombre ) {
            return "Curp valido";
        } else {
            return "Curp no valido";
        }
    
    }
    
    
}


