/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza 18550354
 */
public class MiQueue {
    //INICIO PARA LA LISTA
    private Nodo inicio;
    private Nodo fin;
    private int iCont = 0;
    
    //PUSH --> AGREGA UN VALOR EN LA CIMA DE LA PILA
    //PEEK --> LEE EL VALOR DEL NODO EN LA CIMA
    //POP  --> LEE Y EIMINA EL NODO DE LA CIMA

    //Al crear la lista, inicia con cero elementos
    //LISTA VACIA
    //3 ESTADOS: VACIA, CON UN NODO, CON N NODOS
    public MiQueue() {
        inicio = null;
        fin = null;
    }
    
    //PRIMER MÈTODO: AGREGAR UN NODO
    //METODO QUE RECIBA UN NODO
    //EFICIENCIA O(N) (sin NODO fin)
    //EFICIENCIA --> O(1) (Con NODO fin)
    public void agregarNodo(Nodo nNuevo){
        //verificar el estado de la lista:
        //Està vacia?
        if(inicio == null){//Lista vacia
          inicio = nNuevo;
          fin = nNuevo; //MODIFICADO --> EFICIENCIA
          iCont++;
        }else{//Lista con n nodo
              //Lista con n nodos
            //LLEVAR AL FINAL DE LA LISTA
           /* NODO nTemp = inicio;
            while(nTemp.getSig() != null){
                nTemp = nTemp.getSig();
            }
            //CONECTAMOS NTEMP.SIG --> NUEVO
            nTemp.setSig(nNuevo);*/
            fin.setSig(nNuevo);
            fin = nNuevo;
            iCont++;
    }
    
}
    //O(1)
    public void agregarInicio(Nodo nNuevo){
        //VERIFICAR EL ESTADO DE LA LISTA
        //ESTA VACIA?
        if(inicio == null){//Lista vacia
            inicio = nNuevo;
            fin = nNuevo;
            iCont++;
        }else{
            nNuevo.setSig(inicio);//LO PONEMOS AL PRINCIPIO
            inicio = nNuevo;
            iCont++;
        }
    }
    //O(N)
    public void agregarEn(int iPos, Nodo nNuevo){
        //posicion valida (dentro del indice de la lista)
        //SI HAY 0 NODOS EN LA LISTA
        //INSERTAR AL INICIO (pos = 0)
        //INSERTAR EN CUALQUIER POSICION
        if (iPos == 0){
            agregarInicio(nNuevo);
        }else{//INSERTAR EN CUALQUIER POSICION
            //VALIDAR SI LA LISTA ESTA VACIA
            
        }
    }
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
                inicio = inicio.getSig();
                // EL PROBLEMA ES EL NODO FIN
                if(inicio.getSig() == null){
                    fin = null;
                    iCont--;
                }
            }else{ // cualquier otro nodo
                // MOVERNOS POR LA LISTA
                // EN UNA LISTA SIMPLE (UN SOLO ENLACE)
                // IMPLICA MOVERNOS HASTA LA POSICION PREVIA -1
                Nodo nTemp = inicio;
                int contador = 0;
                while(contador != iPos-1){
                    nTemp = nTemp.getSig();
                    contador++;
                }
                Nodo nSig = nTemp.getSig();
                nTemp.setSig(nSig.getSig());
                // EL PROBLEMA ES EL NODO FIN
                if(nTemp.getSig()==null){ // BORRAMOS EL ULTIMO NODO
                    fin = nTemp;
                    iCont--;
                }
            }
        }else{ // GENERAR UNA EXCEPCION -> LISTA VACIA
            
        }
    }
    //O(N)
    public void imprimir(){
        //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null){
            System.out.print("[" + nTemp.getDato()+ "]");
            nTemp = nTemp.getSig();
        } 
        System.out.println("");
    }
    //O(1)
    public int longitud(){
        /*NODO nTemp = inicio;
       while (nTemp != null){
            iCont++;
            nTemp = nTemp.getSig(); 
    }*/
        return iCont;
}
    //O(1)
    public void vaciar(){
        inicio = null;
        fin = null;
    }
    
    //LISTAS MANEJAN ÌNDICES COMO ARREGLOS
    //PRIMER NODO --> 0
    //ÙLTIMO NODA --> N - 1
    //EFICIENCIA --> O(N)
    //AGREGAR CONDICIONES:
    //LISTA VACÌA
    //PARÀMETRO INCORRECTO
    //(iPos no este entre 0 y N - 1)
    //Excepciones --> THROW
    
    //O(N)
    public int getValor(int iPos){
    int iVal = 0;    
    int iCont = 0;
    //LLEVAR AL FINAL DE LA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null){
            if(iCont == iPos){
                iVal = nTemp.getDato();
                break;
            }
            nTemp = nTemp.getSig();
            iCont++;
        }
        return iVal;
    }
    //O(1)
    public boolean estaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    //O(N)
    public int buscar (int iVal){
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
            if(iVal == nTemp.getDato()){
                iPos = iCont;
                break;
            }
            iCont ++;
            nTemp = nTemp.getSig();
        }
        return iPos;
    }
    
    //O(N)
    public MiQueue copiaLista(){
        MiQueue lsCopia = new MiQueue();
        //HAY QUE RECORRER TODA LA LISTA, LEER CADA NODO
        //CREAR UN NODO NUEVO PARA LEER ESE VALOR
        //INSERTARLO EN LA NUEVA LISTA
        Nodo nTemp = inicio;
        while (nTemp != null){
            lsCopia.agregarNodo(new Nodo(nTemp.getDato()));
            nTemp = nTemp.getSig();
        } 
        return lsCopia;
    }
    //O(N^2)
    public void imprimirOrdenInverso(){
        int iCont = longitud();
        for (int i = iCont - 1; i >= 0; i--) {
            System.out.print("[" + getValor(i) + "]");
        }
        System.out.println("");
    }
    
    public void add(Nodo nNuevo){
        if(inicio != null){
            agregarNodo(nNuevo);
        }else{
            agregarInicio(nNuevo);
        }
        
    }
    
    public int get(){
        int iResu = 0;
        if(inicio != null){
            iResu = inicio.getDato();
        }else{
            //Exception
            throw new ArrayIndexOutOfBoundsException("Lista vacía");
        }
        return iResu;
    }
    
    public int getRemove(){
        int iResu = 0;
        if(inicio != null){
            iResu = inicio.getDato();
            borrarNodo(0);
        }else{
            //error
            throw new ArrayIndexOutOfBoundsException("Lista vacía");
        }
        return iResu;
    }
}
