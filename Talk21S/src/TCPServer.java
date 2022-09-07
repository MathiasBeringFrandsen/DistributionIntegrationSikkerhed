import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        String clientSentence;
        String returnMessage = "";
        ServerSocket welcomeSocket = new ServerSocket(8888);
        while (true) {
            Socket connectionSocket = welcomeSocket.accept();
            BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
            DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
            BufferedReader inFromServer = new BufferedReader(new InputStreamReader(System.in));
            clientSentence = inFromClient.readLine();
            if (!clientSentence.equalsIgnoreCase("Goddag")) {
                outToClient.writeBytes("Nej" + '\n');
            } else {
                outToClient.writeBytes("Goddag" + '\n');
                while (!returnMessage.equalsIgnoreCase("Farvel" + '\n')) {
                    System.out.println("From Client: " + inFromClient.readLine());
                    returnMessage = inFromServer.readLine() + '\n';
                    outToClient.writeBytes(returnMessage);
                }
                returnMessage = "";
            }
        }
    }
}