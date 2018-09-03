import java.io.PrintWriter;
import java.net.Socket;

public class SocketClient {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",8888);
            PrintWriter writer=new PrintWriter(socket.getOutputStream(),true);
            writer.print("萌萌");
            writer.close();
            socket.close();
        }catch (Exception e){
e.printStackTrace();
        }finally {

        }
    }
}
