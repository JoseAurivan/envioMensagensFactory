/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

/**
 *
 * @author auriv
 */
public abstract class Mensagem {
    
    public void enviarMensagem(String string){
        System.out.println(string);
    }
}
