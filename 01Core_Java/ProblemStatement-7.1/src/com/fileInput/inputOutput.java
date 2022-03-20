package com.fileInput;
import java.io.File;
import java.io.BufferedReader;

import java.io.InputStreamReader;

public class inputOutput 
{

	
	public static void main(String args[])
	{
		
		inputOutput gfg = new inputOutput();
		gfg.newFile();
	}
	public void newFile()
	{
		String strPath = "", strName = "";


		try {

			
			BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
			System.out.println("Enter the file name:");

		
			strName = br.readLine();
			System.out.println("Enter the file path:");

			
			strPath = br.readLine();

		
			File file1
				= new File(strPath + "" + strName + ".txt");
			if(file1.exists())
			{
				System.out.println("Your Given File Name Is Already Exists");
			}

		
			else
			{
				file1.createNewFile();
			}
			
		}


		catch (Exception ex1) {
		}
	}
}
