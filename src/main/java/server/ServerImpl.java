package server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author milton
 */
public class ServerImpl extends UnicastRemoteObject implements Server{

    private List<User> users; 
    public ServerImpl() throws RemoteException {
        super();
        users = new ArrayList();
        for(int k = 0; k < 20 ; k++)
            users.add(new User("User"+k, k));
    }
    @Override
    public String getUserString(int id) throws RemoteException {
        for(User x : users)
            if(x.getId()==id)
                return x.toString();
        return "Not found";
    }
}
