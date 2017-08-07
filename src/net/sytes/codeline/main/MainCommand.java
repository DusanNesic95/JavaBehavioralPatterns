package net.sytes.codeline.main;

import java.util.Scanner;

import net.sytes.codeline.command.Command;
import net.sytes.codeline.command.FlipDownCommand;
import net.sytes.codeline.command.FlipUpCommand;
import net.sytes.codeline.command.Light;
import net.sytes.codeline.command.Switch;

public class MainCommand {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Light lamp = new Light();
		Command switchUp = new FlipUpCommand(lamp);
		Command switchDown = new FlipDownCommand(lamp);
		Switch mySwitch = new Switch();
		
		int userChoice = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Do you wish to turn the lamp on or off? Please input 1 or 2...");
		userChoice = userInput.nextInt();
		
		if (userChoice == 1) {
			mySwitch.storeAndExecute(switchUp);
		} else if (userChoice == 2) {
			mySwitch.storeAndExecute(switchDown);
		} else {
			throw new RuntimeException("You have to enter only 1 or 2!");
		}
		
		userInput.close();
	}
	
}
