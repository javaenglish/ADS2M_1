package com.senac.files;

public class Pessoa {

		private String name;
		private String address;
		private String phone[];
		
		//constructor with fields
		public Pessoa(String nome, String address, String phone[]) 
		{
			this.name 				= nome;
			this.address 			= address;
			this.phone 			= phone;
		}
		
		public String getName()
		{
			return name;
		}
		
		public String getEndereco()
		{
			return address;
		}
		
		public String[] getTelefone()
		{
			return phone;
		}
		
		//sets the phone by an index
		public void setTelefone(int index, String phone)
		{
			this.phone[index] = phone;
	}
}

