package Assignment3FileHandling;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWritePrimitives
{

	public static void main(String[] args) throws IOException
	{
		String primitivefile = "primitives.dat";
		
		FileOutputStream fos = new FileOutputStream(primitivefile);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(123);
		dos.writeDouble(56.89);
		dos.writeBoolean(true);
		dos.close();
		
		FileInputStream fis = new FileInputStream(primitivefile);
		DataInputStream dis = new DataInputStream(fis);
		
		int intValue = dis.readInt();
		double doubleValue = dis.readDouble();
		boolean booleanValue = dis.readBoolean();
		dis.close();
		
		System.out.println("Read values:");
        System.out.println("Int: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Boolean: " + booleanValue);

	}

}
