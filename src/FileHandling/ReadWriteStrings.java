package Assignment3FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteStrings 
{

	public static void main(String[] args) throws IOException 
	{
		Scanner sc = new Scanner(System.in);
		String file = "output.txt";
		
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		System.out.println("Enter Message :");
		
		String input =sc.nextLine();
		bw.write(input);
		bw.close();
		System.out.println("Message Written Successfully..."+file);
		
		FileReader fr = new FileReader(file);
		BufferedReader br =new BufferedReader(fr);
		
		System.out.println("Reading file......");
		String msg = br.readLine();
		System.out.println("File content : "+msg);
		br.close();
		sc.close();
		
		

	}

}
