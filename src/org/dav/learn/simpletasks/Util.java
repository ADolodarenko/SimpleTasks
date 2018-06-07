package org.dav.learn.simpletasks;

public class Util
{
	public static void addTenPercent(double[] array, int index)
	{
		if (index < 0 || index > array.length - 1)
			throw new IllegalArgumentException("Wrong index.");
		
		array[index] += array[index] * 0.1;
	}
	
	public static double footsTolightning(double seconds)
	{
		return seconds * 1100;
	}
}
