package evaa2_7_lista_simple;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jose kaleb
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int tama;//contador

    public Lista() {
        inicio = null;//Lista vacia 
        fin = null;
        tama = 0;
    }

    //agregar nodos
    public void add(int valor) {
        Nodo nuevo = new Nodo(valor);
        //HAY NODOS EN LA LISTA?
        if (inicio == null) { //LISTA VACIA
            inicio = nuevo;//conectamos el primer nodo a la lista
            fin = nuevo;
        } else { //LISTA CON NODOS
            //HAY QUE MOVERNOS AL FINAL DE LA LISTA
            //USANDO TEMP, NODO POR NODO HASTA LLEGAR AL FINAL
            /*Nodo temp = inicio;//aqui empezamos
            //WHILE
            while (temp.getSiguiente() != null) {//MIENTRAS TEMP != NULL NOS VAMOS A MOVER
                temp = temp.getSiguiente();//mover a tem al siguiente nodo 
            }
            temp.setSiguiente(nuevo);*/
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
        tama++;
    }

    public void printList() {
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while (temp != null) {//MIENTRAS TEMP.SIGUIENTE != NULL NOS VAMOS A MOVER
            System.out.print(temp.getDato() + " - ");
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
    }

//borrar lista
    public void clear() {
        inicio = null;
        fin = null;
        tama = 0;
    }

    //contar los nodos
    public int length() { //O(1)
        /*int iCont = 0;//0(N)
        Nodo temp = inicio;//aqui empezamos
        //WHILE
        while (temp != null) {//MIENTRAS TEMP != NULL NOS VAMOS A MOVER
            iCont++;
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
        return iCont;*/
        return tama;
    }

    //La lista esta vacia: True, con nodos: False
    public boolean isEmpty() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    //RECUPERAR UN VALOR DE LA LISTA:
    public int get(int pos) throws Exception {
        //Verificacion
        if (isEmpty()) {//LISTA VACÍA
            throw new Exception("No hay valores almacenados en la lista!!");
        } else {//POSICION QUE NO EXISTA: POSICION NEGATIVA O QUE NOS PASEMOS
            //pos tienen que estar entre cero y N-1 --> N es el tamaño I
            if ((pos < 0) || (pos >= length())) {
                throw new Exception("El valor" + pos + " no es una posicion valida en la lista");
            }
        }
        Nodo temp = inicio;
        for (int i = 0; i < pos; i++) {
            temp = temp.getSiguiente();//mover a temp al siguiente nodo
        }
        return temp.getDato();
    }

    private void insertAtBeginning(Nodo nuevo) {
        nuevo.setSiguiente(inicio); //Primero conectamos el nuevo nodo a la lista 
        inicio = nuevo;             //Conectar la lista 
    }

    public void insertAt(int pos, int valor) {
        Nodo nuevo = new Nodo(valor);
        //Validar
        //Situacuiones 
        //insertar al inicio
        if (pos == 0) {//insertar al inicio
            insertAtBeginning(nuevo);
        } else {//ccualquier otro caso
            //Movernos al nodo previo a la posicion
            Nodo temp = inicio;
            for (int i = 0; i < pos - 1; i++) {
                temp = temp.getSiguiente();
            }
        }
        tama++;
    }

    public void deleteAt(int pos) {// O(N)
        int iTamaLista = length();//Obtiene el tamaño de la lista
        //VALIDAR
        if (iTamaLista == 1) {
            clear();
        } else {
            //SITUACIONES:
            if (pos == 0) {//BORRAR UN NODO AL INICIO
                inicio = inicio.getSiguiente();
            } else {//CUALQUIER OTRO CASO
                //MOVERNOS ALI NODO PREVIO A LA POSICION
                Nodo temp = inicio;
                for (int i = 0; i < (pos - 1); i++) {
                    temp = temp.getSiguiente();//mover a temp al siguiente nodo
                }
                //FALTA RECONECTAR
                temp.setSiguiente(temp.getSiguiente().getSiguiente());
                if (pos == iTamaLista - 1) {//verifica si es el ultimo nodo de la lista 
                    fin = temp;
                }

            }
            tama--;
        }
    }
}
