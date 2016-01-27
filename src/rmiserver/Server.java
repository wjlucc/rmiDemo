package rmiserver;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server {
	
	public static void main(String[] args) throws RemoteException {
		System.out.println("服务器端开始启动！");
		
		SayHelloImpl ob = new SayHelloImpl();
		SayHelloInterface obj = (SayHelloInterface)UnicastRemoteObject.exportObject(ob, 0);
		Registry registry = LocateRegistry.createRegistry(2001);
		
		registry.rebind("sayHello", obj);
		
		
		System.out.println("服务器端启动完成！");
	}

}
