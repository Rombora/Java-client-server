import java.net.*;
import java.io.*;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {
	public static void main(String[] args) throws IOException{
		System.out.println("Waiting for client..");
		ServerSocket ss = new ServerSocket(4999);
		Socket s = ss.accept();

		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		System.out.println("client : My name is "+str);

		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println("Nice to meet you "+str);
		pr.flush();
	}

}