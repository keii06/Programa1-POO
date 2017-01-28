/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa1;

/**
 *
 * @author Keii06
 */
public class Programa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal perro;
        perro = new Animal("Zeus");
        perro.setEdad(5);
        perro.setRaza("Huskie Siberiano");
        perro.setColor("Negro con manchas blancas");
        perro.setInteligencia(5);
        
        System.out.println("El nombre del animal es: " + perro.getNombre());
        System.out.println("Y la edad es de: " + perro.getEdad() + " Años");
        System.out.println("De raza: " + perro.getRaza());
        System.out.println("Con el color: " + perro.getColor());
        System.out.println("Con el nivel de inteligencia de: "+perro.getInteligencia()+"%");
    }
    
}
