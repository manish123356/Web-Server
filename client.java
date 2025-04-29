
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class client   {
    public void run() throws UnknownHostException,IOException{
        int port = 8010;
        InetAddress add = InetAddress.getByName("localhost");
        Socket socket = new Socket(add,port);
        PrintWriter toSocket = new PrintWriter(socket.getOutputStream());
        BufferedReader fromSocket = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        toSocket.println("Hello From The Client ");
        String line = fromSocket.readLine();
        System.out.println("Response From The Client "+line);
    }

    public static void main(String[] args) {
        try{
            client cli = new client();
            cli.run();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}



