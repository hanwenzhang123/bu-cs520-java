Client-Server Communication
One way for a client program to communicate with a server program using an established protocol is 
through the ServerSocket and Socket classes in the java.net package.
The server program listens for client connections on a specific port, using a ServerSocket object instance.

Client makes a connection to the server socket and sends a message.
Server program accepts the connection from the client, reads the message, and responds with an acknowledgment.
The server closes the connection to the client and goes back into a waiting state for the next client connection.

    
The server program starts by creating a ServerSocket object instance on the specified port. 
// We will use 8080 here but any available port number would work:
ServerSocket serverSocket = new ServerSocket(8080);

private static boolean listening = true;

// Listen for client connections
while (listening) {
    socket = serverSocket.accept();
    processConnection(socket);
}

The socket will always close because it is done in the finally block:

} finally {
    // Close Socket and ServerSocket
    try {if (socket != null) {
        socket.close();
    }
    ...
        

public static void processConnection(Socket socket) throws Exception {
    try {
        System.out.println("Received connection from " + socket.getRemoteSocketAddress());

        // Create a reader from the socket's input stream
        inputStream = new InputStreamReader(socket.getInputStream());
        reader = new BufferedReader(inputStream);

        // Create a writer to the socket's output stream
        writer = new PrintWriter(socket.getOutputStream(), true);

        // Process the input from the client and write the response
        String input = reader.readLine();
        String response = new StringBuffer(input).reverse().toString();

        // Send back acknowledgment
        writer.println("ACK :" + response);

        // Check whether the server must terminate
        if (input.equalsIgnoreCase("quit")) {
            listening = false;
        }
    } catch (Exception e) {
        // Throw the exception back to main()
        throw e;
    } finally {
        try {
            // Close the writer and reader
            if (writer != null) writer.close();
            if (reader != null) reader.close();
        } catch (Exception e2) {
            // Exception when trying to close Socket and ServerSocket
            e2.printStackTrace();
        }
    }
}
    
    
//Complete Code
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
                if (writer != null) writer.close();
                if (reader != null) reader.close();
                if (inputStream != null) inputStream.close();
                if (socket != null) socket.close();
            } catch (Exception e2) {
                // Exception caused when trying to close
                e2.printStackTrace();
            }
        }
    }
}
