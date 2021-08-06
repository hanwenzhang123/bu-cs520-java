package cs520.module6.L2_networking;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class P01_URLDemo {

	public static void main(String[] args) {

		InputStreamReader inputStream = null;
		BufferedReader reader = null;

		try {
			URL urlObject = new URL("https://met.bu.edu");

			// Print URL info
			System.out.printf("Protocol (%s), Host (%s)\n", urlObject.getProtocol(), urlObject.getHost());

			System.out.printf("Port (%s), Default Port (%s)\n", urlObject.getPort(), urlObject.getDefaultPort());

			System.out.printf("Path (%s) Query (%s) File (%s)\n", urlObject.getPath(), urlObject.getQuery(),
					urlObject.getFile());

			// Read the data
			StringBuffer buffer = new StringBuffer();
			String inputLine;

			inputStream = new InputStreamReader(urlObject.openStream());
			reader = new BufferedReader(inputStream);

			while ((inputLine = reader.readLine()) != null) {
				buffer.append(inputLine + "\n");
			}

			// Display the data
			System.out.println(buffer);
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
				// Exception closing stream or reader
			}
		}
	}

}
