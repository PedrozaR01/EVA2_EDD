
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
        Scanner Inpt = new Scanner(System.in);
        ListaDoble lstLista = new ListaDoble();
        for (int i = 0; i < 10; i++) {
            int iVal = (int)(Math.random() * 1000);
            lstLista.agregarNodo(new Nodo(iVal));
        }
        lstLista.imprimir();
        lstLista.agregarInicio(new Nodo (115));
        lstLista.imprimir();
        lstLista.borrarNodo(0);
        lstLista.agregarInicio(new Nodo (12));
        lstLista.imprimir();
        System.out.println("Introduce el valor a buscar: ");
        int iPos = Inpt.nextInt();
        Inpt.nextLine();
        System.out.println("El valor " + iPos + " se encuentra en la posicion " + lstLista.buscar(iPos));
        ListaDoble lstCopy = lstLista.copiaLista();
        System.out.println("Copia: ");
        lstCopy.imprimir();
        lstCopy.agregarNodo(new Nodo (115));
        lstCopy.imprimir();
        System.out.println("Probando métodos...");
        lstLista.borrarNodo(5);
        lstLista.imprimir();
        lstLista.borrarNodo(1);
        lstLista.imprimir();
        lstLista.agregarEn(8, new Nodo(245));
        lstLista.imprimir();
        lstLista.agregarEn(8, new Nodo(115));
        lstLista.imprimir();
    }
    
}
