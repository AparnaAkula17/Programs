package files;

import java.io.*;

public class FileRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("D:\\cts training\\Examples\\src\\interexamples\\ConsumerTest.java");
			FileOutputStream fout=new FileOutputStream("d://output.txt");
			char ch;
			int i;
			while((i=fis.read())!=-1)
			{
				ch=(char)i;
				System.out.println(ch);
				fout.write(ch);
			}
			fis.close();
			fout.close();
		}
		catch(FileNotFoundException fnfe)
		{
			System.out.println("File does not exist..!");
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
	}

}
