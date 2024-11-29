/*
 */
package server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

/**
 *
 * @author milton
 */
public class RunServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            ServerImpl server = new ServerImpl();
            Naming.rebind("rmi://localhost/Server", server);
            System.out.println("Servidor listo...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
