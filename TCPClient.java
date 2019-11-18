package TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 流程：
 * 创建器客户
 * 1.建立连接：使用Socket创建客户器+服务器地址和端口
 * 3，操作：输入输出流操作
 * 4，释放资源。
 * @author dell
 *
 */

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("--------Client-----------");
		Socket client=new Socket("localhost",8888);//服务器的IP地址和端口
		DataOutputStream dos=new DataOutputStream(client.getOutputStream());
		String data="hello";
		dos.writeUTF(data);
		dos.flush();
		dos.close();
		client.close();
	}

}
