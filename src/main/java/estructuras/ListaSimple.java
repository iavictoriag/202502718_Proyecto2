/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructuras;

/**
 *
 * @author vicky
 */
public class ListaSimple {
    private NodoSimple cabeza;
    private int tamanio;

    public ListaSimple() {
        this.cabeza = null;
        this.tamanio = 0;
    }
    // leemos la lista 
    public boolean estaVacia() {
        return cabeza == null;
    }

    public void insertar(Object dato) {
        NodoSimple nuevo = new NodoSimple(dato);
        // iniciar el nuevo nodo
        if (estaVacia()) {
            cabeza = nuevo;
        } else {
            NodoSimple actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
        tamanio++; // mas lista
    }
    // tamaño de la lista
    public int getTamanio() {
        return tamanio;
    }

    public NodoSimple getCabeza() {
        return cabeza;
    }
}