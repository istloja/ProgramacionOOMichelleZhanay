package Constructores;

public class Casa {

    private String direccion;
    private int numero;
    private double area;

    public Casa() {                // 1.es un metodo que no devuel nada //  2. siempre el constructor tiene el nombre de la clase // 3.
        direccion = "Loja";
        numero = 1;
        area = 20; // inicializar variables

    }

    public Casa(String direccion, int numero, double area) {
        this.direccion = direccion;
        this.numero = numero;
        this.area = area;
    }

    public static void main(String[] args) {
        // primer ejemplo con el constructor vacio
        Casa objeto = new Casa();
        System.out.println(objeto.getDireccion());
        System.out.println(objeto.getNumero());
        System.out.println(objeto.getArea());
        
        // segundo ejemplo usando constructor
        Casa objeto2 = new Casa("Quito",2,40);
        System.out.println(objeto2.getDireccion());
        System.out.println(objeto2.getNumero());
        System.out.println(objeto2.getArea());

    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

}
