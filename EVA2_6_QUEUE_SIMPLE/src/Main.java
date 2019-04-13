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
         MiQueue mqCola = new MiQueue();
         mqCola.add(new Nodo(115));
         mqCola.add(new Nodo(117));
         mqCola.add(new Nodo(524));
         mqCola.imprimir();
         System.out.println("Valor de la cima: " + mqCola.get());
         System.out.println("último valor de la cima: (getRemove) " +mqCola.getRemove());
         System.out.println("Nuevo valor de la cima: " + mqCola.get());
    }
    
}
