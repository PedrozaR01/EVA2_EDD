
import java.util.Scanner;

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
        
        for (int i = 0; i < 10; i++) {
            int iVal = (int)(Math.random() * 1000);
            lstMiLista.agregarNodo(new NODO(iVal));
        }
        System.out.println("Faster than fast af");
        System.out.println("Valor en posiciòn 5 : " 
                + lstMiLista.getValor(5) );
        
        
        lstMiLista.imprimir();
        lstMiLista.borrarNodo(0);
        lstMiLista.imprimir();
        lstMiLista.agregarNodo(new NODO(999));
        lstMiLista.imprimir();
        lstMiLista.borrarNodo(9);
        lstMiLista.imprimir();
        lstMiLista.agregarNodo(new NODO(999));
        lstMiLista.imprimir();
        Scanner Inpt = new Scanner(System.in);
        System.out.println("");
        System.out.println("Ingresa el valor a buscar: ");
        int iValBus = Inpt.nextInt();
        Inpt.hasNextLine();
        System.out.println("El valor " + iValBus + 
                " esta en la posicion " + lstMiLista.buscar(iValBus));
        
        LISTA lstCopia = lstMiLista.copiaLista();
        lstCopia.imprimir();
        lstCopia.agregarNodo(new NODO (115));
        lstCopia.imprimir();
        lstMiLista.imprimir();
        lstMiLista.agregarNodo(new NODO(112));
        lstMiLista.imprimirOrdenInverso();
        System.out.println("Longitud final: " + lstMiLista.longitud());
        lstMiLista.imprimir();
        lstMiLista.agregarEn(5, new NODO(117));
        lstMiLista.imprimir();
        lstMiLista.agregarEn(8, new NODO(115));
        lstMiLista.imprimir();
    }
    
}
