package rmiserver;

/**
 * 这里将客户端也放在服务器这里了，可以将这个单独出去，要将原来的Server部分导出为jar包添加到Client的外部库中。
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

	public static void main(String[] args) {
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 2001);
			
			SayHelloInterface obj = (SayHelloInterface) registry.lookup("sayHello");
			
			String result = obj.sayHello();
			System.out.println(result);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("出现异常！");
			e.printStackTrace();
		}
	}
}
