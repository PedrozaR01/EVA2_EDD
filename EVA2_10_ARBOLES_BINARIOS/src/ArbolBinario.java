/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Roberto Pedroza 18550354
 */
public class ArbolBinario {
    private Nodo root;

    public ArbolBinario() {
        root = null;
    }
    
    public void agregarNodo(Nodo nNuevo){
        if(root == null){//ARBOL VACIO
            root = nNuevo;
        }else{//PROCESO RECURSIVO
            agregarRecursivo(root, nNuevo);
        }
    }
                                 //NODO ACTUAL, VALOR ACTUAL   
    private void agregarRecursivo(Nodo nActual, Nodo nNuevo){
        //IZQUIERDA
        if(nNuevo .getValor() < nActual.getValor()){
            //POSICIÒN OCUPADA, SEGUIMOS AVANZANDO
            if(nActual.getIzq() != null){
                agregarRecursivo(nActual.getIzq(), nNuevo);
            }else{
                nActual.setIzq(nNuevo);
            }
        //DERECHA
        }else if(nNuevo .getValor() > nActual.getValor()){
            if(nNuevo .getValor() > nActual.getValor()){
            //POSICIÒN OCUPADA, SEGUIMOS AVANZANDO
            if(nActual.getDer()!= null){
                agregarRecursivo(nActual.getDer(), nNuevo);
            }else{
                nActual.setDer(nNuevo);
            }
        }else{ //IGUAL --> MENSAJE AL USUARIO
                System.out.println("El valor ya existe en el àrbol");
                //LANZAR UNA EXCEPCIÒN
            }
        } 
    }
    
    public void imprimirInOrder(){
        inOrder(root);
    }
    
    private void inOrder(Nodo nActual){
        /*
        RECORRER IZQUIERDA
        LEER EL VALOR O IMPRIMIR
        RECORRER DERECHA
        */
        if(nActual != null){
            inOrder(nActual.getIzq());
            System.out.print("[" + nActual.getValor()
            + "]");
            inOrder(nActual.getDer());
        }
    }
    
    public void imprimirPreOrden(){
        PreOrden(root);
    }
    
    private void PreOrden(Nodo nActual){
        //LEE EL VALOR - IZQUIERDA - DERECHA
        if(nActual != null){
            System.out.print("[" + nActual.getValor() + "]");
            PreOrden(nActual.getIzq());
            PreOrden(nActual.getDer());
        }
    }
    
    public void imprimirPostOrden(){
        PostOrden(root);
    }
    
    private void PostOrden(Nodo nActual){
        //ABAJO-ARRIBA
        if(nActual != null){
            PostOrden(nActual.getIzq());
            PostOrden(nActual.getDer());
            System.out.print("[" + nActual.getValor() + "]");
        }
    }
}