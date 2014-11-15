package com.fagyapong.cmpp269.beforemidterm;

import java.io.*;
import java.util.*;

public class PasswordSave {

	public static void main(String[] args) throws IOException {
		// Open object f for append
		FileWriter f = new FileWriter("c:/temp/passwords.txt", true);
		PrintWriter p = new PrintWriter(f);

		Scanner in = new Scanner(System.in);
		String url, username, password;

		System.out.println("Online account recorder");
		System.out.print("Enter the URL: ");
		url = in.nextLine();
		System.out.print("Enter the Username: ");
		username = in.nextLine();
		System.out.print("Enter the Password: ");
		password = in.nextLine();
		// append information to end of password file
		p.println("URL: " + url);
		p.println("Username: " + username);
		p.println("Password: " + password);
		p.println("---------------------------");

		System.out
				.println("You information has been added to the password file");
		// close all the files
		p.close();
		f.close();
		in.close();
	}
}
