package com.senac.files;

import java.util.Scanner;

public class FileView {
	
	Scanner entry = new Scanner (System.in);

	public void printContact(String name, String address, String phone[]) {
		System.out.printf("Name: %s - Address: %s - "
				+ "Phone: %s" , name, address, phone);
			
	}
	
}
