
package leccion;


public class Animales {
    public String especie;
    public String alimentacion;
    public String habitad;
    public String region_nat;
    public String tipo_DoM;

    public Animales(String especie, String alimentacion, String habitad, String region_nat, String tipo_DoM) {
        this.especie = especie;
        this.alimentacion = alimentacion;
        this.habitad = habitad;
        this.region_nat = region_nat;
        this.tipo_DoM = tipo_DoM;
    }

    Animales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getRegion_nat() {
        return region_nat;
    }

    public void setRegion_nat(String region_nat) {
        this.region_nat = region_nat;
    }

    public String getTipo_DoM() {
        return tipo_DoM;
    }

    public void setTipo_DoM(String tipo_DoM) {
        this.tipo_DoM = tipo_DoM;
    }

   

    
    
}
