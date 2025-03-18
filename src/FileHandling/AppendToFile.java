package Assignment3FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendToFile 
{

	public static void main(String[] args) throws IOException
	{
		String appendfile = "append.txt";
		Scanner sc = new Scanner(System.in);
		
		FileWriter fw = new FileWriter(appendfile, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
	
		System.out.println("Enter text in file to append :");
		
		while(true)
		{
			String input = sc.nextLine();
			if(input.equalsIgnoreCase("exit"))
			{
				break;
			}
			pw.println(input);
		}
		pw.close();
		bw.close();
		fw.close();
		
		System.out.println("Data of append file " + appendfile);
		
		FileReader fr = new FileReader(appendfile);
		BufferedReader br = new BufferedReader(fr);
		
		System.out.println("Content of file :");
		String line = br.readLine();
		
		while(line != null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		br.close();
		fr.close();
		sc.close();

	}

}
