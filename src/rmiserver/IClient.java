package rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IClient extends Remote {
    void printMessage(String message) throws RemoteException;

    void updateAdminScreen(AdminData adminData) throws RemoteException;

    boolean isAlive() throws RemoteException;

    void setAdmin() throws RemoteException;
}
