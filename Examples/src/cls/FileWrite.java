package cls;
import java.io.*;
import java.util.*;

public class FileWrite {

	public static void main(String[] args)throws FileNotFoundException, IOException {
	  char ch;
	  int x;
	  try(FileReader fin=new FileReader("d://fileresult.txt");
			  FileWriter fout=new FileWriter("d://file.txt"))
	  {
		  x=fin.read();
		  while(x!=-1) {
			  ch=(char)x;
			  fout.write(ch);
			  System.out.print(ch);
			  x=fin.read();
		  }
	  }

	}

}
