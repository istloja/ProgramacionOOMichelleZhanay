
package Deber_herecia;



public class Precio extends Producto{
    public static void main(String[] args) {
        Precio objeto = new Precio();
        objeto.setCodigo(1254);
        System.out.println(objeto.getCodigo());
        objeto.prueba();
    }
    public float dolares;

    public float getDolares() {
        return dolares;
    }

    public void setDolares(float dolares) {
        this.dolares = dolares;
    }
    public void mostrar_fecha(){
        System.out.println("La fecha de caducidad es:"+ 12 +"/"+02+"/"+2019);
    }
    public void prueba (){
        mostrar_fecha();
        super.mostrar_fecha();
    }
    
    
    
}
