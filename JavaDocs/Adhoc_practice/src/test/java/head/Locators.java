package head;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "locators")
public class Locators {
	
	
	public List<String> locators = new ArrayList<>();
	
	@XmlElement(name="locator")
	public List<String> getLocators() {
		return locators;
	}

	public void setLocators(List<String> locators) {
		this.locators = locators;
	}

	

}
