/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MandoParra 22550032
 */
public class Listas {
   protected Nodo inicio,fin;//Punteros para saber donde esta el inicio y el final
   
   public Listas(){
       inicio= null;
       fin=null;
   }
   //Metodo para agregar un nodo al inicio de la lista
   public void agregarAlInicio(int elemento){
       //Creando al nodo
       inicio = new Nodo(elemento, inicio);
       if(fin==null){
           fin=inicio;
       }
   }
   //Metodo para mostrar los  datos
   public void mostrarLista(){
       Nodo recorrer=inicio;
       while(recorrer!=null){
           System.out.println("["+recorrer.dato+"]--->");
           recorrer=recorrer.enlace;
       }
   }
   //Metodo para eliminar datos
   
   //Metodo para l3impiar lista
}

