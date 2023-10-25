
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Contraseña {
    public static void main(String[] args) {
        // TODO code application logic here
        Listas listita= new Listas();
        int opcion=0, el;
        do{
            try{
                opcion=Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Ingresar Nombre\n2. Ingresar contraseña\n"
                        + "3. Salir","Menu de opciones"));
                switch(opcion){
                    case 1:
                        try{
                            el=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el Elemento:", 
                                    "Insertando al inicio",3));
                            //Agregando al Nodo
                            listita.agregarAlInicio(el);
                        }catch(NumberFormatException n){                            
                            JOptionPane.showMessageDialog(null,"Error "+ n.getMessage());
                        }
                        break;
                    case 2:
                        listita.mostrarLista();
                        break;
                    case 3:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion incorrecta ");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error "+ e.getMessage());
            }
    }while(opcion!=3);
    }
}
