/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza 18550354
 */
public class LISTA {
        //INICIO PARA LA LISTA
    private NODO inicio;

    //Al crear la lista, inicia con cero elementos
    //LISTA VACIA
    //3 ESTADOS: VACIA, CON UN NODO, CON N NODOS
    public LISTA() {
        inicio = null;
    }
    
    //PRIMER MÈTODO: AGREGAR UN NODO
    //METODO QUE RECIBA UN NODO
    //EFICIENCIA --> O(1)
    public void agregarNodo(NODO nNuevo){
        //verificar el estado de la lista:
        //Està vacia?
        if(inicio == null){//Lista vacia
          inicio = nNuevo;  
        }else{//Lista con n nodo
              //Lista con n nodos
        nNuevo.setSig(inicio);
        inicio = nNuevo;
        }
    
}
    
    public void imprimir(){
        //LLEVAR AL FINAL DE LA LISTA
        NODO nTemp = inicio;
        while (nTemp != null){
            System.out.println("[" + nTemp.getDato()+ "]");
            nTemp = nTemp.getSig();
        } 
        System.out.println("");
    }
    
    public int longitud(){
       NODO nTemp = inicio;
       int iCont = 0;
        while (nTemp != null){
            iCont++;
            nTemp = nTemp.getSig(); 
    }
        return iCont;
}
}
