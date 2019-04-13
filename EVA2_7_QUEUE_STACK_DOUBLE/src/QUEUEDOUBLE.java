/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class QUEUEDOUBLE extends ListaDoble {
    
    
   
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
            iResu = inicio.getValor();
        }else{
            //Exception
            //throw new ArrayIndexOutOfBoundsException("Lista vacía");
        }
        return iResu;
    }
    
     public int getRemove(){
        int iResu = 0;
        if(inicio != null){
            iResu = inicio.getValor();
            borrarNodo(0);
        }else{
            //error
            //throw new ArrayIndexOutOfBoundsException("Lista vacía");
        }
        return iResu;
    }
}
