The core Java distribution provides basic networking capability for 
both the TCP (Transmission Control Protocol) and UDP (User Datagram Protocol) based communication protocols. 
The java.net package provides the relevant classes. 
In this lecture, we will look into TCP-related classes such as URL, URLConnection, ServerSocket and Socket.
Creating Java web resources normally requires Jakarta EE (formerly known as Java Enterprise Edition or J2EE), 
which is a specification designed for web and distributed programming.

//Working with URLs
The URL (Uniform Resource Locator) class is used to contain metadata about a web resource. 
The constructor of the class takes the web resource's address (URL) as its argument. 
The following code segment shows how the URL object is created. 
If the specified web page is not a valid URL, an exception is thrown.

try {
    String page = "https://www.bu.edu/met/degrees-certificates/ms-computer-information-systems?c=webappdev";
    URL urlObject = new URL(page);
} catch (Exception e) {
    // This will be a MalformedURLException if the page URL is invalid
    e.printStackTrace();
}

Method	Value Returned	Example Result
String getProtocol()	The URL's protocol name	https
String getHost()	The URL's host (domain) name	www.bu.edu
int getPort()	The URL's port number, or -1 if unspecified	-1
int getDefaultPort()	The URL's default port number	443
String getPath()	The URL's path part	/met/degrees-certificates/ms-computer-information-systems
String getQuery()	The URL's query string (parameter pairs)	c=webappdev
String getFile()	The URL's full path after the host portion	/met/degrees-certificates/ms-computer-information-systems?c=webappdev

    
The following code segment shows the above methods being invoked on a URL object instance.
System.out.printf("Protocol (%s), Host (%s)\n",
    urlObject.getProtocol(),
    urlObject.getHost());

System.out.printf("Port (%s), Default Port (%s)\n",
    urlObject.getPort(),
    urlObject.getDefaultPort());

System.out.printf("Path (%s), Query (%s), File (%s)\n",
    urlObject.getPath(),
    urlObject.getQuery(),
    urlObject.getFile());

The output of the above code segment is shown below:
Protocol (https), Host (www.bu.edu)
Port (-1), Default Port (443)
Path (/met/degrees-certificates/ms-computer-information-systems), Query (c=webappdev), File (/met/degrees-certificates/ms-computer-information-systems?c=webappdev)

// Read the data
StringBuffer buffer = new StringBuffer();
String inputLine;

InputStreamReader inputStream = new InputStreamReader(urlObject.openStream());
BufferedReader reader = new BufferedReader(inputStream);

while ((inputLine = reader.readLine()) != null) {
    buffer.append(inputLine + "\n");
}

// Display the first 1,000 characters of the HTML
System.out.println();
System.out.println(buffer.toString().substring(0, 1000));


The complete program listing of the above program (P01_URLDemo) is shown below.

package cs520.module6.L2_networking;

import java.net.*;
import java.io.*;

public class P01_URLDemo {

    public static void main(String[] args) {
        InputStreamReader inputStream = null;
        BufferedReader reader = null;

        try {
            String page = "https://www.bu.edu/met/degrees-certificates/ms-computer-information-systems?c=webappdev";
            URL urlObject = new URL(page);

            System.out.printf("Protocol (%s), Host (%s)\n",
                urlObject.getProtocol(),
                urlObject.getHost());

            System.out.printf("Port (%s), Default Port (%s)\n",
                urlObject.getPort(),
                urlObject.getDefaultPort());

            System.out.printf("Path (%s), Query (%s), File (%s)\n",
                urlObject.getPath(),
                urlObject.getQuery(),
                urlObject.getFile());

            // Read the data
            StringBuffer buffer = new StringBuffer();
            String inputLine;

            inputStream = new InputStreamReader(urlObject.openStream());
            reader = new BufferedReader(inputStream);
            while ((inputLine = reader.readLine()) != null) {
                buffer.append(inputLine + "\n");
            }

            // Display the first 1,000 characters of the HTML
            System.out.println();
            System.out.println(buffer.toString().substring(0, 1000));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (Exception e2) {
                // Exception when trying to close stream/reader
                e2.printStackTrace();
            }
        }
    }
}
  
