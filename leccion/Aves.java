
package leccion;


public class Aves extends Animales {
    public String tipoPico;
    public String movilidad;

    public Aves(String tipoPico, String movilidad, String especie, String alimentacion, String habitad, String region_nat, String tipo_DoM) {
        super(especie, alimentacion, habitad, region_nat, tipo_DoM);
        this.tipoPico = tipoPico;
        this.movilidad = movilidad;
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public String getMovilidad() {
        return movilidad;
    }

    public void setMovilidad(String movilidad) {
        this.movilidad = movilidad;
    }

    public Aves(String especie, String alimentacion, String habitad, String region_nat, String tipo_DoM) {
        super(especie, alimentacion, habitad, region_nat, tipo_DoM);
    }
    
    
}
