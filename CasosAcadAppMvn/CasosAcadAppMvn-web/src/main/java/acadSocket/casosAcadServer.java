/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadSocket;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import socket.ServerSocket;

/**
 *
 * @author delsas
 */
@ApplicationScoped
@ServerEndpoint("/casosacadserver")
public class casosAcadServer {

    @Inject
    manejador manejador;
    
    
    @OnMessage
    public String onMessage(String message, Session remitente) {
        System.out.println(message+" :: "+remitente.getId());
        String w=message.split("::")[0];
        switch(w){
            case "todos":
                manejador.sendToAllConnectedSessions(message.split("::")[1], remitente);
                break;
            default:
                manejador.sendToSession(remitente, "No se entendió lo que ha enviado. Intentelo de nuevo.");
        }
        return w;
    }

    @OnOpen
    public void open(Session session) {
        manejador.addSession(session);
        System.out.println("La session "+session.getId()+" se ha conectado.");
    }

    @OnClose
    public void close(Session session) {
        manejador.removeSession(session);
        System.out.println("La session "+session.getId()+" se ha desconectado.");
    }

    @OnError
    public void onError(Throwable error) {
        Logger.getLogger(ServerSocket.class.getName()).log(Level.SEVERE, null, error);
    }
    
}
