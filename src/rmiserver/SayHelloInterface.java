package rmiserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SayHelloInterface extends Remote {
	public String sayHello() throws RemoteException;
}
