package com.bcn;

import java.util.UUID;

import com.bcn.model.User;

public class Main {

	public static void main(String[] args) {

		// First comment
		System.out.println("Hello World !!");
		User me = new User();
		me.setId(UUID.randomUUID().toString());
		me.setFisrtName("Bruno");
		me.setName("Cappoen");
		me.setMainHobby("DIY");
		
		System.out.println(me);
		
		System.out.println("See you soon !");

	}

}
