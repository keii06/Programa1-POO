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
public class Animal {
    private String nombre;
    private int edad;
    private String raza;
    private String color;
    private String nombreN;
    private int inteligencia;
    
    
    public Animal(String nombre){
    nombreN = nombre;
    }
    public String getNombre(){
    return nombreN;
    }
    public int getEdad(){
    return edad;
    }
    public void setEdad(int EdadN) {
    edad = EdadN;
    }
    public String getRaza(){
    return raza;
    }
    public void setRaza(String razaN){
    raza = razaN;
    }
    public String getColor(){
    return color;
    }
    public void setColor(String colorN){
    color = colorN;
    }
    public int getInteligencia(){
    return inteligencia;
    } 
    public void setInteligencia(int inteligenciaN){
    inteligencia = inteligenciaN;
    }
    
    }
    

