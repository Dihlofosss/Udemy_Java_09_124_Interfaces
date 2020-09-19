package com.kostyukov;

import java.util.ArrayList;

public class NPC implements ISaveable
{
	private String name;
	private int hp;
	private int armor;
	private String weapon;
	private String visualSkin;
	
	public NPC(String name, int hp, int armor, String weapon, String visualSkin)
	{
		this.name = name;
		this.hp = hp;
		this.armor = armor;
		this.weapon = weapon;
		this.visualSkin = visualSkin;
	}
	
	@Override
	public ArrayList SaveData()
	{
		ArrayList list = new ArrayList();
		list.add(0, name);
		list.add(1, visualSkin);
		list.add(2, hp);
		list.add(3, armor);
		list.add(4, weapon);
		return list;
	}
	
	@Override
	public void LoadData(ArrayList list)
	{
		if (!name.equals(list.get(0)))
		{
			System.out.println("Incorrect NPC saved data, wrong NPC name");
			return;
		}
		
		visualSkin = (String) list.get(1);
		hp = (int) list.get(2);
		armor = (int) list.get(3);
		weapon = (String) list.get(4);
	}
	
	@Override
	public String toString()
	{
		return "NPC{" +
				"name='" + name + '\'' +
				", hp=" + hp +
				", armor=" + armor +
				", weapon='" + weapon + '\'' +
				", visualSkin='" + visualSkin + '\'' +
				'}';
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
	
	public String getWeapon()
	{
		return weapon;
	}
	
	public void setWeapon(String weapon)
	{
		this.weapon = weapon;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getVisualSkin()
	{
		return visualSkin;
	}
}