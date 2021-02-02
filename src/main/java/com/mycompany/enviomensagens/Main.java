/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enviomensagens;

import Factory.MensagemFactory;
import Factory.Mensagem;



/**
 *
 * @author auriv
 */
public class Main {
    public static void main(String[] args) {
        Mensagem msg;
        
        msg = MensagemFactory.WPPMensagem();
        msg.enviarMensagem("Olá Galera");
        msg = MensagemFactory.SMS();
        msg.enviarMensagem("Hello Boys");
        msg = MensagemFactory.Email();
        msg.enviarMensagem("Bom dia!");
    }
}
