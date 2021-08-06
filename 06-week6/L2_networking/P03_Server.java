package cs520.module6.L2_networking;

import java.io.*;
import java.net.*;

public class P03_Server {

	private static boolean listening = true;

	public static void main(String[] args) {

		int SERVER_PORT = 8080;
		ServerSocket serverSocket = null;
		// Create the ServerSocket
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// Listen for client connections
		Socket s = null;
		while (listening) {
			try {
				s = serverSocket.accept();
				processConnection(s);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		// out of the loop when client sends a quit message
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void processConnection(Socket s) throws IOException {
		System.out.println("Received connection from " + s.getRemoteSocketAddress());

		// Create a reader from the socket's input stream
		InputStreamReader inputStream = new InputStreamReader(s.getInputStream());
		BufferedReader reader = new BufferedReader(inputStream);

		// Create a writer to the socket's output stream
		PrintWriter writer = new PrintWriter(s.getOutputStream(), true);

		// Process the input from the client and write the response
		String input = reader.readLine();
		String response = new StringBuffer(input).reverse().toString();
		writer.println("ACK :" + response);

		// Close all the connections
		writer.close();
		reader.close();
		s.close();

		// Check if the server has to terminate
		if (input.equalsIgnoreCase("quit")) {
			listening = false;
		}
	}
}
