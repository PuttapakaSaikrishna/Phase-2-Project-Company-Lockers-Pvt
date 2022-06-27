package com.company.lockers;

import java.io.File;
import java.io.FileWriter;

import java.util.Scanner;

public class LockedMe 
{
	static final String Path ="D:\\ellipse\\Company Lockers pvt td\\LockedMeFiles";
	
	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		int ch ;
		
		do
		{
				displayMenu();
				System.out.println("Enter your Choice : ");
				ch = Integer.parseInt(obj.nextLine());
				
				switch (ch)
				{
					case 1:getAllFiles();
						break;
					case 2:createFiles();
						break;
					case 3:deleteFiles();
						break;
					case 4:searchFiles();
						break;
					case 5:System.exit(0);
						break;
					default:System.out.println("Invalid Option");
						break;
				
				}
		
					
		}
		while(ch>0);
		
}
	
	public static void displayMenu() 
	{
		System.out.println("**************************************************************");
		System.out.println("\tWelcome to company Lockers:- LockersMe.com");
		System.out.println("\tDeveloper name : Puttapaka Saikrishna");
		System.out.println("***************************************************************");
		System.out.println("\t1.Display all the files");
		System.out.println("\t2. Add files to existing directory");
		System.out.println("\t3. Delete a file");
		System.out.println("\t4. Search a file");
		System.out.println("\t5. Exit");
		System.out.println("***************************************************************");
		
	}
	
	public static void getAllFiles() 
	{
		File[] listOfFiles =new File(Path).listFiles();
		
		if(listOfFiles.length == 0)
			System.out.println("No files exit in the directory");
		else
		{
			for(File file: listOfFiles)
			{
				System.out.println(file.getName());
			}
		}
		
	}
	
	public static void createFiles() 
	{
		try 
		{
			  Scanner obj =new Scanner (System.in);
			  String fileName;
			  int lineCount;
			  
			 System.out.println("Enter the File name : ");
			 fileName = obj.nextLine();
			 
			 System.out.println("Enter how many lines to add in the files");
			 lineCount = Integer.parseInt(obj.nextLine());
			 
			 FileWriter fw =new FileWriter(Path +"\\"+fileName);
			 
			 for(int i=1 ; i<=lineCount;i++)
			 {
				 System.out.println("enter File Content line :");
				 fw.write(obj.nextLine()+"\n");
			 }
			 
			 System.out.println("File Created sucessfully");
			 fw.close();
		      
		 }
		
		catch (Exception e) 
		
			{
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	
	public static void deleteFiles() 
	{
		Scanner obj =new Scanner (System.in);
		try
		{
			String fileName;
			
			System.out.println("Enter file name to deleted ");
			fileName =obj.nextLine();
			
			File f1 =new File(Path+"\\"+fileName);
			
			if(f1.exists())
			{
				f1.delete();
				System.out.println("File deleted Sucessfully");
			}
			else
			{
				System.out.println("File does not created");
			}
		}
		catch(Exception e)
		
		{
			    System.out.println("An error occurred.");
			    e.printStackTrace();
		}
		
	}
	
	public static void searchFiles() 
	{
		Scanner obj = new Scanner(System.in);
		try
		{
			String fileName;
			System.out.println("Enter file name to Search ");
			fileName =obj.nextLine();
			
			File f1 =new File(Path+"\\"+fileName);
			
			if(f1.exists())
			{
				
				System.out.println("File is available");
			}
			else
			{
				System.out.println("File not available");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
