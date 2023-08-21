package head;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
		String filePath = "D:/Eclipse WS/JavaDocs/Interview_Prep-prep1/Interview_Prep-prep1/Adhoc_practice/src/test/resources/details.properties";
		FileReader fr = new FileReader(filePath);
				
		Properties pr = new Properties();
		pr.load(fr);
		
		System.out.println(pr.getProperty("webDriver"));
		System.out.println(pr.getProperty("maximumWaits"));
		System.out.println(pr.getProperty("standarWait"));
		System.out.println(pr.getProperty("pollingInterval"));
		System.out.println(pr.getProperty("loginKey"));
		System.out.println();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
