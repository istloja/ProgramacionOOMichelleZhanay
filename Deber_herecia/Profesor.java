/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Deber_herecia;

/**
 *
 * @author LENOVO
 */
public class Profesor extends Administrador{
    public static void main(String[] args) {
        Profesor objeto = new Profesor ();
        objeto.setMateria("Programacion");
        System.out.println(objeto.getMateria());
        objeto.prueba();
    }
    public String materia;
    public String plan_de_materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getPlan_de_materia() {
        return plan_de_materia;
    }

    public void setPlan_de_materia(String plan_de_materia) {
        this.plan_de_materia = plan_de_materia;
    }
    public void mostrar_horas_laborables(){
        System.out.println("Horas laboras:" + 44 );
    }
    public void prueba (){
        mostrar_horas_laborables();
        super.mostrar_horas_laborables();
    }
    
}
