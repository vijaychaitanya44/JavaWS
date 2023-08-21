package head;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class LocatorReader {

	private static final String filePath = "D:\\Eclipse WS\\Interview_Prep\\Adhoc_practice\\src\\test\\resources\\locators.xml";

	public static void xmlParser() {
		try {

			File file = new File(filePath);

			JAXBContext jaxB = JAXBContext.newInstance(Locators.class);

			Unmarshaller un = jaxB.createUnmarshaller();
			Locators locators = (Locators) un.unmarshal(file);
			System.out.println(locators);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		LocatorReader lr = new LocatorReader();
		
		xmlParser();
	}
}