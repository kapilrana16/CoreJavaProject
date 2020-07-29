package Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable
{
	int a = 10;
	int b = 20;
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		Test test = new Test();
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("rana.txt");
		ObjectOutputStream oss = new ObjectOutputStream(fos);
		
		oss.writeObject(test);  // this will create a rana.txt file at specified location
		
		//De-Serialization
		FileInputStream fis = new FileInputStream("rana.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Test readdata = (Test) ois.readObject();
		
		System.out.println(readdata.a);
		System.out.println(readdata.b);
		
	}

}
