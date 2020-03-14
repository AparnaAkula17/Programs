package cls;
import java.io.*;
import java.util.*;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		try(InputStreamReader cin=new InputStreamReader(System.in);
				FileOutputStream out=new FileOutputStream("D:\\fileresult.txt");)
		{
				System.out.println("enter character,'q' to quit");
				char c;
				do {
					c=(char) cin.read();
					out.write(c);
				}while(c!='q');
	}

	}
}

