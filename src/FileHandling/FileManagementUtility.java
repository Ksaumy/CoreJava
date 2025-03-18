package Assignment3FileHandling;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileManagementUtility {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directory file.");
		String directorypath = sc.nextLine();
		Path dp =  Paths.get(directorypath);
		
		 System.out.println("Files in directory:");
	        if (Files.exists(dp) && Files.isDirectory(dp)) 
	        {
	            DirectoryStream<Path> stream = Files.newDirectoryStream(dp);
	            for (Path entry : stream)
	            {
	                System.out.println(entry.getFileName());
	            }
	        }
	        else
	        {
	        	System.out.println("Directory not exit.");
	        	return;
	        }
	        
	        System.out.println("Enter the name for the new directory:");
	        String newDirName = sc.nextLine();
	        Path newDirPath = dp.resolve(newDirName);
	        Files.createDirectory(newDirPath);
	        System.out.println("Directory created: " + newDirPath);
	        
	        System.out.println("Enter the file name to move into the new directory:");
	        String fileToMove = sc.nextLine();
	        Path filePath = dp.resolve(fileToMove);
	        Path targetPath = newDirPath.resolve(fileToMove);
	        Files.move(filePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
	        System.out.println("File moved to: " + targetPath);
	        
	        System.out.println("Enter the name for the new file to create in the new directory:");
	        String newFileName = sc.nextLine();
	        Path newFilePath = newDirPath.resolve(newFileName);
	        Files.createFile(newFilePath);
	        System.out.println("File created: " + newFilePath);
	        
	        System.out.println("Enter the name of the file to rename (in the new directory):");
	        String fileToRename = sc.nextLine();
	        Path renamePath = newDirPath.resolve(fileToRename);
	        System.out.println("Enter the new name for the file:");
	        String newFileNameToRename = sc.nextLine();
	        Path renamedPath = newDirPath.resolve(newFileNameToRename);
	        Files.move(renamePath, renamedPath, StandardCopyOption.REPLACE_EXISTING);
	        System.out.println("File renamed to: " + renamedPath);
	        
	        
	        System.out.println("Enter the name of the file to delete (in the new directory):");
	        String fileToDelete = sc.nextLine();
	        Path deletePath = newDirPath.resolve(fileToDelete);
	        Files.delete(deletePath);
	        System.out.println("File deleted: " + deletePath);

	        sc.close();

	            

	}

}
