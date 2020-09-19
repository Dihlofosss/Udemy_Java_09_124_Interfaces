package com.kostyukov;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		ArrayList playerData, npcData;
		
		Player player = new Player("Hero", 100, 50, "Sword", "Shield");
		NPC Orc_Warrior_NPC = new NPC("Warrior Orc", 150, 15, "Hammer", "greenOrc");
		
		playerData = player.SaveData();
		npcData = Orc_Warrior_NPC.SaveData();
		
		for (Object obj:
			 playerData)
		{
			System.out.println(obj.toString());
		}
	}
	
	public static ArrayList<String> readValues()
	{
		ArrayList<String> values = new ArrayList<String>();
		
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		int index = 0;
		System.out.println("Choose\n" +
				"1 to enter a string\n" +
				"0 to quit");
		
		while (!quit) {
			System.out.print("Choose an option: ");
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice)
			{
				case 0 -> quit = true;
				case 1 -> {
					System.out.print("Enter a string: ");
					String stringInput = scanner.nextLine();
					values.add(index, stringInput);
					index++;
				}
			}
		}
		return values;
	}
}
