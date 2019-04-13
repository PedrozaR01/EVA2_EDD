/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza 18550354
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArbolBinario abArbol = new ArbolBinario();
        abArbol.agregarNodo(new Nodo(13));
        abArbol.agregarNodo(new Nodo(10));
        abArbol.agregarNodo(new Nodo(18));
        abArbol.agregarNodo(new Nodo(2));
        abArbol.agregarNodo(new Nodo(11));
        abArbol.agregarNodo(new Nodo(17));
        abArbol.agregarNodo(new Nodo(20));
        abArbol.agregarNodo(new Nodo(16));
        abArbol.agregarNodo(new Nodo(16));
        //2-10-11-16-17-18-20
        System.out.println("Método In-Orden");
        abArbol.imprimirInOrder();
        //13-10-2-11-18-17-16-20
        System.out.println("\nMétodo Pre-Orden");
        abArbol.imprimirPreOrden();
        //2-11-10-16-17-20-18-13
        System.out.println("\nMétodo Post-Orden");
        abArbol.imprimirPostOrden();
    }
    
}
