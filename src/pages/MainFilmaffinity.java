package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainFilmaffinity {
	WebDriver driver;
	
	@FindBy(linkText="Top Filmaffinity")
	WebElement topLink;
	
	public void clickTopFilmaffinity() {
        topLink.click();  
	}
	
	public MainFilmaffinity(WebDriver driver) {
		utilities.Tools.cerrarBanner(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
