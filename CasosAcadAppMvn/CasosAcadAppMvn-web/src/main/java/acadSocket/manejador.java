/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadSocket;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.enterprise.context.ApplicationScoped;
import javax.json.JsonObject;
import javax.websocket.Session;
import socket.manejadorDeSessiones;

/**
 *
 * @author delsas
 */
@ApplicationScoped
class manejador {
    private final Set<Session> sessions = new HashSet<>();

    public void addSession(Session session) {
        sessions.add(session);

    }

    public void removeSession(Session session) {
        sessions.remove(session);
    }
    
    public void sendToAllConnectedSessions(String message, Session remitente) {
        for (Session session : sessions) {
            if(session!=remitente)
            sendToSession(session, message);
        }
    }

    public void sendToSession(Session session, String message) {
        try {
            session.getBasicRemote().sendText(message);
        } catch (IOException ex) {
            sessions.remove(session);
            Logger.getLogger(manejadorDeSessiones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
