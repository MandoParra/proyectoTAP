/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MandoParra 22550032
 */
public class Nodo {
    public int dato;
    public Nodo enlace;//Puntero enlace
    
    //constructor para insertar al Final    
    public Nodo(int x){
        dato = x;
        enlace = null;
    }
    
    //COnstructor para insertar al inicio
    public Nodo(int x,Nodo n){
        dato = x;
        enlace = n;
    }
}
