package com.kostyukov;

import java.util.ArrayList;

public interface ISaveable
{
	ArrayList SaveData();
	void LoadData(ArrayList list);
}
