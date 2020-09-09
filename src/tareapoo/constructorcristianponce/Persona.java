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
    String nombre="",apellido="";
    int dni = 0,edad= 0;
    
public Persona(){
this.dni = 0;
this.nombre = "";
this.apellido ="";
this.edad = 0;
}
        
        
public Persona(int dni){
    this();
    this.dni = dni ;
}

public Persona(int dni, String nombre){
        this(dni);
        this.nombre = nombre;
}

public Persona(int dni, String nombre, String apellido){
        this(dni,nombre);
        this.apellido = apellido;
    }

public Persona(int dni,String nombre, String apellido,int edad){
        this(dni,nombre,apellido);
        this.edad = edad;
}

public void imprimir()
{        System.out.println(dni + nombre + apellido + edad);
    }

}
