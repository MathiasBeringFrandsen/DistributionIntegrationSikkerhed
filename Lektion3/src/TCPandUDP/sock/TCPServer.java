package TCPandUDP.sock;
import java.io.*;
import java.net.*;
public class TCPServer {
	
	/**
	 * @param args
	 */
	public static void main(String[] args)throws Exception {
		String clientSentence;
		String capitalizedSentence;
		ServerSocket welcomeSocket = new ServerSocket(6789);
		while (true) {
			Socket connectionSocket = welcomeSocket.accept();
			BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream()));
			DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
			System.out.println("Ny Bruger: ");
			System.out.println("Ip-adresse: " + connectionSocket.getInetAddress());
			System.out.println("Socket: " + connectionSocket.getRemoteSocketAddress());
			clientSentence = inFromClient.readLine();
			capitalizedSentence = clientSentence.toUpperCase() + '\n';
			outToClient.writeBytes(capitalizedSentence);
	
		}
	}
}
