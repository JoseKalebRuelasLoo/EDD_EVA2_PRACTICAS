/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaa2_7_lista_simple;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose kaleb
 */
public class EVAA2_7_LISTA_SIMPLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CREAR UNA LISTA
        Lista miLista = new Lista(); //creo una lista vacía
        /*int[] miArreglo = new int[1000000];
        for (int i = 0; i < miArreglo.length; i++) {
            miArreglo[i] = (int) (Math.random() * 1000);
        }
        for (int i = 0; i < 1000000; i++) {
            miLista.add(new Nodo(1));
        }*/
        miLista.add(100);
        miLista.add(200);
        miLista.add(300);
        miLista.add(400);
        miLista.add(500);
        System.out.println("Conteo: " + miLista.length());
        miLista.printList();
        System.out.println("");
        System.out.println("\nDesues de insertar");
        miLista.insertAt(0, 9999);
        System.out.println("Conteo: " + miLista.length());
        miLista.printList();
        System.out.println("");
        System.out.println("\nDesues de borrar");
        miLista.deleteAt(5);
        System.out.println("Conteo: " + miLista.length());
        miLista.printList();
        System.out.println("");
        miLista.add(77777777);
        System.out.println("\nDesues de agregar");
        System.out.println("Conteo: " + miLista.length());
        miLista.printList();
        System.out.println("");
        for (int i = miLista.length() - 1; i >= 0; i--) {
            try {
                System.out.print(miLista.get(i) + " - ");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        /*
        System.out.println("\nCantidad de nodos: " + miLista.length());
        
        try {
            System.out.println("\nPosicion: " + miLista.get(10));
        } catch (Exception ex) {//Se resuelve el error 
            ex.printStackTrace();//Imprime el error
            //Logger.getLogger(EVAA2_7_LISTA_SIMPLE.class.getName()).log(Level.SEVERE, null, ex);
        }
        miLista.clear();
            miLista.add(new Nodo(1000));
            miLista.add(new Nodo(2000));
            System.out.println("");
            miLista.printList();*/
    }
}
