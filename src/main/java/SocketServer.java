import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
    public static void main(String[] args) {

        ServerSocket serverSocket=null;
        try {
            serverSocket=new ServerSocket(8888);//启动一个服务
            //等待一个接收请求
            Socket socket=serverSocket.accept();
            BufferedReader reader=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println(reader.readLine());
            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

}
