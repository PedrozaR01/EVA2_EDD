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
        MiStack msPila = new MiStack();
        msPila.push(new Nodo(112));
        msPila.push(new Nodo(113));
        msPila.push(new Nodo(115));
        msPila.push(new Nodo(117));
        msPila.push(new Nodo(234));
        msPila.push(new Nodo(19));
        msPila.push(new Nodo(21));
        msPila.push(new Nodo(2));
        msPila.push(new Nodo(957));
        msPila.push(new Nodo(12234));
        
        System.out.println("Hay " + msPila.longitud() + " nodos");
        
        msPila.imprimir();
        
        System.out.println("Valor en la cima " + msPila.peek());
        
        msPila.imprimir();
        
        System.out.println("Valor en la cima (pop) " + msPila.pop());
        
        msPila.imprimir();
        
        System.out.println("Valor en la cima " + msPila.peek());
    }
    
}
