import java.net.*;
import java.io.*;

import java.util.Scanner;

public class Client{
	public static void main(String[] args) throws IOException{

		Scanner input = new Scanner(System.in);

		System.out.println("What is your name?");
		String a = input.nextLine();

		Socket s = new Socket("localhost", 4999);

		PrintWriter pr = new PrintWriter(s.getOutputStream());
		pr.println(a);
		pr.flush();

		InputStreamReader in = new InputStreamReader(s.getInputStream());
		BufferedReader bf = new BufferedReader(in);

		String str = bf.readLine();
		System.out.println("server : "+str);

	}
}