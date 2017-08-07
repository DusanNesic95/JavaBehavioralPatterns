package net.sytes.codeline.main;

import net.sytes.codeline.mediator.User;

public class MainMediator {

	public static void main(String[] args) {
		User dusan = new User("Dusan");
		User milica = new User("Milica");
		
		dusan.sendMessage("Hi to everyone!");
		milica.sendMessage("Hi, I joined the chat.");
	}
	
}
