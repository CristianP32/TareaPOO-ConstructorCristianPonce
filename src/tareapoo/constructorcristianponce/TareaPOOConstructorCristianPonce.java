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
public class TareaPOOConstructorCristianPonce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona1, persona2, persona3, persona4;

        persona1 = new Persona();
        persona2 = new Persona(34234678);
        persona3 = new Persona(34234678 , "Carlos");
        persona4 = new Persona(34234678, "Carlos", "Perez");

        persona1.imprimir();
        persona2.imprimir();
        persona3.imprimir();
        persona4.imprimir();
    }
}
    

