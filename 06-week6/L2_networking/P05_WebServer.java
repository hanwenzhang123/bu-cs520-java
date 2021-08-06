package cs520.module6.L2_networking;

import java.io.*;
import java.net.*;

public class P05_WebServer {

	public static String FILE_BASE = "./web/";

	public static void main(String[] args) throws IOException {

		int SERVER_PORT = 8888;
		ServerSocket serverSocket = null;

		try {
			serverSocket = new ServerSocket(SERVER_PORT);

			while (true) {
				Socket s = serverSocket.accept();
				Thread t = new WebServerThread(s);
				t.start();
			}
			// Above loop runs forever
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (serverSocket != null) {
				serverSocket.close();
			}
		}
	}
}
// end P05_WebServer class

// A separate thread handles each client connection
class WebServerThread extends Thread {

	private Socket socket = null;

	// Constructor
	public WebServerThread(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		BufferedReader is;
		DataOutputStream os = null;
		String request = null;
		String clientInput;

		try {
			// Text based input stream
			is = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// Binary output stream -- handle text and binary data
			os = new DataOutputStream(socket.getOutputStream());

			clientInput = is.readLine();
			System.out.println("  " + clientInput);
			if (clientInput.startsWith("GET")) {
				request = getRequestAction(clientInput);
				System.out.println("    Requested: " + request);
				if (request.equals("/")) {
					sendFileToClient("index.html", os);
				} else if (request.endsWith(".html")) {
					sendFileToClient(request.substring(1), os);
				} else if (request.endsWith(".jpg")) {
					sendFileToClient(request.substring(1), os);
				} else {
					sendFileToClient("invalid.html", os);
				}
			}
			os.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	} // end run

	private static void sendFileToClient(String file, DataOutputStream os) {
		String file_name = P05_WebServer.FILE_BASE + file;
		File f1 = new File(file_name);
		int size, charsRead = 0;

		FileInputStream fin = null;
		DataInputStream din = null;

		// if file exists, send it to the client
		if (f1.exists() == true) {
			try {
				fin = new FileInputStream(file_name);
				din = new DataInputStream(fin);

				size = (int) f1.length();
				System.out.printf("      Sending %d bytes (%s)\n", size, f1.getAbsolutePath());
				byte[] data = new byte[size];
				while (charsRead < size) {
					charsRead += din.read(data, charsRead, size - charsRead);
				}
				os.write(data);
			} catch (Exception e) {
				System.out.println("Error: " + e);
			} finally {
				try {
					os.flush();
					din.close();
					fin.close();
				} catch (Exception e) {
					System.out.println("Error: " + e);
				}
			}
		} else {
			System.out.printf("Alert: %s not located\n", file_name);
		}
	}

	// GET <Request Action> HTTP/1.1
	public static String getRequestAction(String input) {
		int startIndex = 4;
		int endIndex = input.indexOf("HTTP");
		return input.substring(startIndex, endIndex - 1);
	}

} // end class
