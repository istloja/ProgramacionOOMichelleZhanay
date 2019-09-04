
package leccion;


public class Mamiferos extends Animales {
    public String movilidad;
    public String marsupia;

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public String getMarsupia() {
        return marsupia;
    }

    public void setMarsupia(String marsupia) {
        this.marsupia = marsupia;
    }

    public Mamiferos(String movilidad, String marsupia, String especie, String alimentacion, String habitad, String region_nat, String tipo_DoM) {
        super(especie, alimentacion, habitad, region_nat, tipo_DoM);
        this.movilidad = movilidad;
        this.marsupia = marsupia;
    }
    
    public Mamiferos(String especie, String alimentacion, String habitad, String region_nat, String tipo_DoM) {
        super(especie, alimentacion, habitad, region_nat, tipo_DoM);
    }
    
    
    
}
