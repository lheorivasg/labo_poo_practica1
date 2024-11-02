
package practica.pkg1;


import java.util.HashMap;


public class Profesor extends Persona {
    private String curp;

    public Profesor(String curp, String nombre, String apellidoPaterno, String apellidoMaterno) {
        super(nombre, apellidoPaterno, apellidoMaterno);
        this.curp = curp;
    }

    public Profesor() {
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }
    
    
    public String obtenerSexo(){
    String llave = curp.substring(10);
    HashMap<String, String> sexo = new HashMap<String, String>();

    sexo.put("H","Hombre");
    sexo.put("M","Mujer");
    
    return sexo.get(llave);

    }


    public String obtenerEstado(){
        String llave = curp.substring(11,12);

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

        return estados.get(llave);
    }


    //public String validarCurp(){}




    
    
}


