package cs520.module6.L2_networking;

import java.net.*;
import java.io.*;

public class P02_URLConnectionDemo {

	public static void main(String[] args) {

		String page = "http://www.bu.edu/csmet/files/2012/01/CS-520-OL-Spring-2-2012.pdf";
		URL urlObject = null;
		URLConnection urlConnectionObject = null;
		
		try {
			urlObject = new URL(page);
			urlConnectionObject = urlObject.openConnection();

			// Get the Content Type and the Content Size
			String contentType = urlConnectionObject.getContentType();
			int contentSize = urlConnectionObject.getContentLength();
			System.out.printf("Content Type:%s, Content Size:%d\n", contentType, contentSize);

			// Download the contents into a local file
			String outputFileName = "cs520.pdf";
			BufferedInputStream buf = new BufferedInputStream(urlConnectionObject.getInputStream());
			FileOutputStream out = new FileOutputStream(outputFileName);
			// read one byte at a time and write to the output
			int readByte = 0;
			while ((readByte = buf.read()) != -1)
				out.write(readByte);

			out.close();
			buf.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
