package com.jwsur.ch1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlConnectionClient {

	public static void main(String[] args) throws IOException {
		String strURL = "http://www.amazon.com/index.html";
		// TODO Auto-generated method stub
		// Parse the URL.
		URL url = new URL(strURL);
		// Connect.
		URLConnection sock = url.openConnection();
		// Read and print.
		BufferedReader reader =
		new BufferedReader(new InputStreamReader(sock.getInputStream()));
		String next_record = null;
		while ((next_record = reader.readLine()) != null)
		System.out.println(next_record);
		// Close.
		reader.close();

	}

}
