/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rober
 */
public class StackDouble extends ListaDoble {
  
    
    public void push(Nodo nNuevo){
        agregarInicio(nNuevo);
    }
    
    public int peek(){
        int iResu = 0;
        if(inicio != null){
            iResu = inicio.getValor();
            
        }else{
            //NOTIFICAR QUE NO HAY DATOS
        }
        return iResu;
    }
    
    public int pop(){
        int iResu = 0;
        if(inicio != null){
            iResu = inicio.getValor();
            //remover el nodo inicial
            borrarNodo(0);
        }else{
            //NOTIFICAR QUE NO HAY DATOS
        }
        return iResu;
    }
    
}
