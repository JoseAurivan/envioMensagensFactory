/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.Mensagem;

/**
 *
 * @author auriv
 */
class Email extends Mensagem{
    
    @Override
    public void enviarMensagem(String string){
        System.out.println("Mensagem enivada via email "+string);
    }
}
