/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza 18550354
 */
public class ListaDoble {
    private Nodo inicio;
    private Nodo fin;
    private int iContNodos;

    public ListaDoble() {
        inicio = null;
        fin = null;
        iContNodos = 0;
    }
    
    public void agregarNodo(Nodo nNuevo){
    //LISTA VACIA
        if(inicio == null){
        inicio = nNuevo;
        fin = nNuevo;
        iContNodos++;
        }else{//Hay elementos
        fin.setSiguiente(nNuevo);
        nNuevo.setPrevio(fin);
        fin = nNuevo;
        iContNodos++;
        }
    }
    
    public void imprimir(){
        //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null){
            System.out.print("[" + nTemp.getValor()+ "]");
            nTemp = nTemp.getSiguiente();
        } 
        System.out.println("");
    }
    
    //O(N)
     public void imprimirOrenInverso(){
        //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = fin;
        while (nTemp != null){
            System.out.print("[" + nTemp.getValor()+ "]");
            nTemp = nTemp.getPrevio();
        } 
        System.out.println("");
    }
     
     public int longitud (){
    return iContNodos;
    }
     
     public boolean estaVacia(){
        if(inicio == null){
         return true;
    }else{
        return false;
        }
    }
     
     public void vaciar(){
    inicio = null;
    fin = null;
    }
     
     //O(N)
   /* public int getValor(int iPos){
    int iVal = 0;    
    int iCont = 0;
    //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null){
            if(iCont == iPos){
                iVal = nTemp.getValor();
                break;
            }
            nTemp = nTemp.getSiguiente();
            iCont++;
        }
        return iVal;
    }*/
     
    public void agregarInicio(Nodo nNuevo){
        //VERIFICAR EL ESTADO DE LA LISTA
        //ESTA VACIA?
        if(inicio == null){//Lista vacia
            inicio = nNuevo;
            fin = nNuevo;
            iContNodos++;
        }else{
            nNuevo.setSiguiente(inicio);//LO PONEMOS AL PRINCIPIO
            inicio.setPrevio(nNuevo);
            inicio = nNuevo;
            iContNodos++;
        }
    }
    
     public void agregarEn(int iPos, Nodo nNuevo){
        //posicion valida (dentro del indice de la lista)
        //SI HAY 0 NODOS EN LA LISTA
        //INSERTAR AL INICIO (pos = 0)
        //INSERTAR EN CUALQUIER POSICION
        if(iPos == 0){
            agregarInicio(nNuevo);
        }else{//INSERTAR EN CUALQUIER POSICION
            //VALIDAR SI LA LISTA ESTA VACIA
            int conta = 0;
            Nodo nTemp = inicio;
            while(conta != iPos-1){
                conta++;
                nTemp = nTemp.getSiguiente();
            }
                nNuevo.setSiguiente(nTemp.getSiguiente());
                nNuevo.setPrevio(nTemp.getPrevio());
                nTemp.setSiguiente(nNuevo);
            
        }
            
        
    }
     
       //O(N)
   /* public int buscar (int iVal){
        int iPos = -1;
        //COMO BUSCAMOS EL VALOR
        //recorrer elemento por elemento
        //detener la busqueda cuando lo encontremos
        //se puede llegar al final de la lista sin
        //encontrarlo
        int iCont = 0;
        Nodo nTemp = inicio;
        while(nTemp != null){
            //DETENER EL CICLO CUANDO LO ENCONTREMOS
            if(iVal == nTemp.getValor()){
                iPos = iCont;
                break;
            }
            iCont ++;
            nTemp = nTemp.getSiguiente();
        }
        return iPos;
    }*/
     
     //O(N)
    public void borrarNodo(int iPos){
        //Borrar al inicio de la lista
        //borrar cualquier posiciòn
        //VERIFICAR QUE HAYA NODOS
        //verificar que la posiciòn sea vàlida
        
        if(inicio != null){ // TENEMOS NODOS
            if(iPos == 0){ // nodo inicial
                // HAY UN NODO
                // HAY N NODOS
                inicio = inicio.getSiguiente();
                // EL PROBLEMA ES EL NODO FIN
                if(inicio.getSiguiente()== null){
                    fin = null;
                    iContNodos--;
                }
            }else{ // cualquier otro nodo
                // MOVERNOS POR LA LISTA
                // EN UNA LISTA SIMPLE (UN SOLO ENLACE)
                // IMPLICA MOVERNOS HASTA LA POSICION PREVIA -1
                Nodo nTemp = inicio;
                int contador = 0;
                while(contador != iPos-1){
                    nTemp = nTemp.getSiguiente();
                    contador++;
                }
                Nodo nSig = nTemp.getSiguiente();
                nTemp.setSiguiente(nSig.getSiguiente());
                nTemp.setPrevio(nSig.getPrevio());
                // EL PROBLEMA ES EL NODO FIN
                if(nTemp.getSiguiente()==null){ // BORRAMOS EL ULTIMO NODO
                    fin = nTemp;
                    iContNodos--;
                }
            }
        }else{ // GENERAR UNA EXCEPCION -> LISTA VACIA
            
        }
    }
    
    //O(N)
    public ListaDoble copiaLista(){
        ListaDoble lsCopia = new ListaDoble();
        //HAY QUE RECORRER TODA LA LISTA, LEER CADA NODO
        //CREAR UN NODO NUEVO PARA LEER ESE VALOR
        //INSERTARLO EN LA NUEVA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null){
            lsCopia.agregarNodo(new Nodo(nTemp.getValor()));
            nTemp = nTemp.getSiguiente();
        } 
        return lsCopia;
    }
}
