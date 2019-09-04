
package Herencia;


public class recepcionista extends persona {
    private int horas_trabajadas;
    private int fecha_ingreso;
    private String seguro;

    public int getHoras_trabajadas() {
        return horas_trabajadas;
    }

    public void setHoras_trabajadas(int horas_trabajadas) {
        this.horas_trabajadas = horas_trabajadas;
    }

    public int getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(int fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }
    @Override// esto significa que estamos sobre inscribiendo el metodo 
    public  void saludar (){
            System.out.println("Hola soy la recepcionista");
        
    }
    public void prueba (){
        saludar();
        super.saludar();// con el super llamas a un metodo de la clase padre
    }
    
    public static void main(String[] args) {
        recepcionista objeto = new recepcionista();
        objeto.setNombre("Maria");
        System.out.println(objeto.getNombre());
        objeto.prueba();
    }
    
}
