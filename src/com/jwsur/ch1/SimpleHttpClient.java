package com.jwsur.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;

public class SimpleHttpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		String strURL = "http://www.amazon.com/index.html";
		URL url = new URL(strURL);
		String host = url.getHost();
		String path = url.getPath();
		int port = url.getPort();
		if (port < 0) port = 80;
		// Send the request.
		String request = "GET " + path + " HTTP/1.1\n";
		request += "host: " + host;
		request += "\n\n";
		Socket sock = new Socket(host, port);
		PrintWriter writer = new PrintWriter(sock.getOutputStream());
		writer.print(request);
		writer.flush();
		// Read and print the response.
		BufferedReader reader =
		new BufferedReader(new InputStreamReader(sock.getInputStream()));
		String next_record = null;
		while ((next_record = reader.readLine()) != null)
		System.out.println(next_record);
		sock.close();

	}

}
