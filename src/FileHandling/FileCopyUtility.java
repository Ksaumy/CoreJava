package Assignment3FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileCopyUtility {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter source file name :");
		String sourcefile = sc.nextLine();
		
		System.out.println("Enter the destination file name :");
		String destinationfile = sc.nextLine();
		
		Path sf = Paths.get(sourcefile);
		Path df = Paths.get(destinationfile);
		
		try
		{
		Files.copy(sf,df,StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File copied ");
		}
		catch(NoSuchFileException e)
		{
			System.err.println("Error: The source file was not found.");
		}
		catch (IOException e)
		{
            System.err.println("An error occurred: " + e.getMessage());
        }
		sc.close();
		
	}

}
