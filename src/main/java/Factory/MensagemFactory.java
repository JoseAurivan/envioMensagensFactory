/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import Factory.Email;
import Factory.WhatsApp;
import Factory.SMS;
import Factory.Mensagem;

/**
 *
 * @author auriv
 */
public class MensagemFactory {
    
    public static Mensagem WPPMensagem(){
        return new WhatsApp();
    }
    
    public static Mensagem SMS(){
        return new SMS();
    }
    
    public static Mensagem Email(){
        return new Email();
    }
}
