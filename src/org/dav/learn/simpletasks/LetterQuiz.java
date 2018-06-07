package org.dav.learn.simpletasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LetterQuiz
{
	private int secretLetter;
	
	public static int getGuess()
	{
		int result = 0;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			String line = reader.readLine().toUpperCase();
			result = (int)line.charAt(0);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return result;
	}
	
	public LetterQuiz()
	{
		secretLetter = (int)(Math.random() * 26) + 65;
	}
	
	public void start()
	{
		int guess;
		
		while ((guess = getGuess()) != secretLetter)
			if (guess == 0)
			{
				System.out.println("Problem with input");
				break;
			}
			else if (guess > secretLetter)
				System.out.println("You’re too high");
			else
				System.out.println("You’re too low");
	}
}
