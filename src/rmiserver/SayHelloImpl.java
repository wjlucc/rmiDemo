package rmiserver;

import java.rmi.RemoteException;

public class SayHelloImpl implements SayHelloInterface {

	@Override
	public String sayHello() throws RemoteException {
		// TODO Auto-generated method stub
		
		System.out.println("服务端程序执行.....");
		return "我在测试,这是服务端返回给客户端的结果！";

	}
}
