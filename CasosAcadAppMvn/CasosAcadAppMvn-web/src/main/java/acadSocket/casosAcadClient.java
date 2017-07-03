/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acadSocket;

import java.awt.TrayIcon;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.ClientEndpoint;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
/**
 *
 * @author delsas
 */

@ClientEndpoint
public class casosAcadClient {
    private Session mySession;
    
    @OnOpen
    public void open(Session session) throws IOException{
        mySession = session;        
        System.out.println(session.getId() + ". Cliente conectado.");
    }
    
    @OnMessage
    public void onMessage(String text, Session ses)  {
        System.out.println("El cliente escuchó: "+text);
    }
    
    public void enviarmensaje(String mensaje) throws IOException{
        mySession.getBasicRemote().sendText(mensaje);
        System.out.println("se enció: "+mensaje);
    }
    
    @OnError
    public void error(Session session, Throwable e) {
        System.out.println(session.getId() + ". Hubo un error. cerremos cesión."+e.getMessage());
        if (session.isOpen()) {
            try {
                session.close();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    @OnClose
    public void close(Session session) {
        try {
            cerrarconexión();
            System.out.println(session.getId() + " was closed. La conexión del cliente se perdió.");
        } catch (IOException ex) {
            Logger.getLogger(casosAcadClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarconexión() throws IOException{
        mySession.close();
        System.out.println("Usted ha decidido desconectarse.\n\n");
    }
}
