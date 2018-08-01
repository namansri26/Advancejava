package Nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContentType {

	public static void main(String[] args) {
		 
		Path p = Paths.get("D:\\Old Lappy\\abc.html");
		try
		{
			String contenttype = Files.probeContentType(p);
			System.out.printf("Content Type of"+ p+"is"+ contenttype);
			System.out.printf("%s", "hello");
		}
		catch (Exception ee)
		{}

	}

}
