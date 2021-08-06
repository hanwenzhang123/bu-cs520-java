package cs520.module6.L2_networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class P04_Client {

	public static void main(String[] args) {
		PrintWriter writer = null;
		InputStreamReader inputStream = null;
		BufferedReader reader = null;
		Socket socket = null;
		
		try {
			// Connect to the server
			socket = new Socket("localhost", 8080);
	
			// Create a writer to the socket's output stream
			writer = new PrintWriter(socket.getOutputStream(), true);
			
			// Create a reader from the socket's input stream
			inputStream = new InputStreamReader(socket.getInputStream());
			reader = new BufferedReader(inputStream);
	
			// Send the message to the server
			writer.println("Here is a message");
	
			// Process the response from the server
			String response = reader.readLine();
			System.out.println(response);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// Close the writer, reader, stream and socket
				inputStream.close();
				writer.close();
				reader.close();
				socket.close();
			} catch (Exception e2) {
				// Exception caused when trying to close
				e2.printStackTrace();
			}
		}
	}
}
