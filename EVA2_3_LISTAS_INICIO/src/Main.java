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
        LISTA  lstMiLista = new LISTA();
       int[] aiDatos = new int[1000000];
        /*lstMiLista.agregarNodo(new NODO(100));
        lstMiLista.agregarNodo(new NODO(200));
        lstMiLista.agregarNodo(new NODO(300));
        lstMiLista.agregarNodo(new NODO(400));
        lstMiLista.agregarNodo(new NODO(500));
        lstMiLista.agregarNodo(new NODO(600));
        lstMiLista.agregarNodo(new NODO(700));
        lstMiLista.agregarNodo(new NODO(800));
        lstMiLista.agregarNodo(new NODO(900));
        lstMiLista.agregarNodo(new NODO(1000));
        lstMiLista.agregarNodo(new NODO(1100));
        
        lstMiLista.imprimir();
        System.out.println("En la lista hay " + lstMiLista.longitud() + " elementos");*/
        for (int i = 0; i < aiDatos.length; i++) {
            aiDatos[i] = (int)(Math.random() * 1000);
        }
        System.out.println("Fast af");
        
        for (int i = 0; i < 1000000; i++) {
            int iVal = (int)(Math.random() * 1000);
            lstMiLista.agregarNodo(new NODO(iVal));
        }
        System.out.println("UUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUHH");
    }
    }
    

