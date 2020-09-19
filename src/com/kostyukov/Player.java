package com.kostyukov;

import java.util.ArrayList;

public class Player implements ISaveable
{
	private String name;
	private int hp;
	private int armor;
	private String primaryWeapon;
	private String secondaryWeapon;
	
	public Player(String name, int hp, int armor, String primaryWeapon, String secondaryWeapon)
	{
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.primaryWeapon = primaryWeapon;
		this.secondaryWeapon = secondaryWeapon;
	}
	
	@Override
	public String toString()
	{
		return "Player{" +
				"name='" + name + '\''+
				", hp=" + hp +
				", armor=" + armor +
				", primaryWeapon='" + primaryWeapon + '\''+
				", secondaryWeapon='" + secondaryWeapon + '\'' +
				'}';
	}
	
	@Override
	public ArrayList SaveData()
	{
		ArrayList list = new ArrayList();
		list.add(name);
		list.add(hp);
		list.add(armor);
		list.add(primaryWeapon);
		list.add(secondaryWeapon);
		return list;
	}
	
	@Override
	public void LoadData(ArrayList list)
	{
		if (!name.equals(list.get(0)))
		{
			System.out.println("Incorrect player saved data");
			return;
		}
		
		hp = (int) list.get(1);
		armor = (int) list.get(2);
		primaryWeapon = (String) list.get(3);
		secondaryWeapon = (String) list.get(4);
	}
	
	public int getHp()
	{
		return hp;
	}
	
	public void setHp(int hp)
	{
		this.hp = hp;
	}
	
	public int getArmor()
	{
		return armor;
	}
	
	public void setArmor(int armor)
	{
		this.armor = armor;
	}
	
	public String getPrimaryWeapon()
	{
		return primaryWeapon;
	}
	
	public void setPrimaryWeapon(String primaryWeapon)
	{
		this.primaryWeapon = primaryWeapon;
	}
	
	public String getSecondaryWeapon()
	{
		return secondaryWeapon;
	}
	
	public void setSecondaryWeapon(String secondaryWeapon)
	{
		this.secondaryWeapon = secondaryWeapon;
	}
	
	public String getName()
	{
		return name;
	}
}