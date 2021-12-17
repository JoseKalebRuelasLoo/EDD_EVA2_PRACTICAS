/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_5_fibonacci;

/**
 *
 * @author jose kaleb
 */
public class EVA2_5_FIBONACCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("La posicion numero 11 en la sucesión de fibonacci es = " + fibonacci(11));
    }

    public static int fibonacci(int iPos) {
        if (iPos >1) {
            return fibonacci(iPos - 1) + fibonacci(iPos - 2);
        } else if (iPos == 1 || iPos == 0) {  // caso base
            return iPos;
        } else {//función recursiva
            System.out.println("Debes ingresar un dato valido");
            return -1;
            
        }
    }
}
