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
       QUEUEDOUBLE mqQuDo = new QUEUEDOUBLE();
       StackDouble msStDo = new StackDouble();
       mqQuDo.add(new Nodo (46));
       mqQuDo.add(new Nodo (47));
       mqQuDo.add(new Nodo (48));
       mqQuDo.add(new Nodo (155));
        System.out.println("Queue (Lista Doble): ");
       mqQuDo.imprimir();
        System.out.println("Valor de la cima(getRemove): " + mqQuDo.getRemove());
        System.out.println("Valor de la cima (segundo getRemove): " + mqQuDo.getRemove());
        System.out.println("Valor de la cima: " + mqQuDo.get());
        
        System.out.println("\nStack (Lista Doble): ");
        msStDo.push(new Nodo (19));
        msStDo.push(new Nodo (131));
        msStDo.push(new Nodo (80));
        msStDo.push(new Nodo (78));
        msStDo.push(new Nodo (87));
        msStDo.push(new Nodo (30));
        msStDo.imprimir();
        System.out.println("Valor de la cima (pop): " + msStDo.pop());
        System.out.println("Valor de la cima (pop 2): " + msStDo.pop());
        System.out.println("Valor de la cima (peek): " + msStDo.peek());
    }
    
}
