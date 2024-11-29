package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author milton
 */
public interface Server extends Remote{
    String getUserString(int id) throws RemoteException;
}
