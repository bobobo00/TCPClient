package TCP;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ���̣�
 * �������ͻ�
 * 1.�������ӣ�ʹ��Socket�����ͻ���+��������ַ�Ͷ˿�
 * 3���������������������
 * 4���ͷ���Դ��
 * @author dell
 *
 */

public class TCPClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("--------Client-----------");
		Socket client=new Socket("localhost",8888);//��������IP��ַ�Ͷ˿�
		DataOutputStream dos=new DataOutputStream(client.getOutputStream());
		String data="hello";
		dos.writeUTF(data);
		dos.flush();
		dos.close();
		client.close();
	}

}
