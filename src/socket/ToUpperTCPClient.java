package socket;

import java.io.IOException;
import java.io.InputStream;  
import java.io.OutputStream;  
import java.net.Socket;  

  
public class ToUpperTCPClient {  
      
    //客户端使用的TCP Socket  
    private Socket clientSocket;  
      
    public String toUpperRemote(String serverIp, int serverPort, String str) {  
        StringBuilder recvStrBuilder = new StringBuilder();  
        try {  
            //创建连接服务器的Socket  
            clientSocket = new Socket(serverIp, serverPort);  
              
            //写出请求字符串  
            OutputStream out = clientSocket.getOutputStream();  
            out.write(str.getBytes());  
              
            //读取服务器响应  
            InputStream in = clientSocket.getInputStream();  
            for (int c = in.read(); c != '#'; c = in.read()) {  
                recvStrBuilder.append((char)c);  
            }  
        } catch (IOException e) {  
            e.printStackTrace();  
        } finally {  
            try {  
                if (clientSocket != null) {  
                    clientSocket.close();  
                }  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
          
        return recvStrBuilder.toString();  
    }  
      
    public static void main(String[] args) {  
        ToUpperTCPClient client = new ToUpperTCPClient();  
        String recvStr = client.toUpperRemote(ToUpperTCPThreadServer.SERVER_IP, ToUpperTCPThreadServer.SERVER_PORT,
                "ab" + ToUpperTCPThreadServer.REQUEST_END_CHAR);
        System.out.println("收到:" + recvStr);  
    }  
}  