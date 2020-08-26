/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo.constructorcristianponce;

/**
 *
 * @author Administrator
 */
public class Persona {
    String nombre,apellido;
    int dni; 
    
public Persona(){
    System.out.println("Crear Persona");}

public Persona(int dni){
    this.dni = dni ;}

public Persona(int dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;}

public Persona(int dni, String nombre, String apellido){
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
public void imprimir()
{        System.out.println(dni + nombre + apellido);
    }

}
