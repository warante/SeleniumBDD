package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopFilmaffinity {
	WebDriver driver;
	
	@FindBy(id="top-movies")
	WebElement listadoPeliculas;
	
	List<WebElement> filas;
	
	public String getPelicula(String posicion) {       
        filas = listadoPeliculas.findElements(By.tagName("ul"));        
        return filas.get(Integer.parseInt(posicion)-1).getText();
	}
	
	public TopFilmaffinity(WebDriver driver) {
		utilities.Tools.cerrarBanner(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}
