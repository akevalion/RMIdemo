/*
 */
package client;
import java.rmi.Naming;
import server.Server;
/**
 *
 * @author milton
 */
public class Client {
    public static void main(String[] args) {
        try {
            Server service = (Server) Naming.lookup("rmi://localhost/Server");
            String response = service.getUserString(7);
            System.out.println("Respuesta del servidor: " + response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
