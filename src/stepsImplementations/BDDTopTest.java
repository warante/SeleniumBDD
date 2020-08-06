package stepsImplementations;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainFilmaffinity;
import pages.TopFilmaffinity;
import utilities.SetDriver;

public class BDDTopTest extends SetDriver{
	String url = "https://www.filmaffinity.com/es";
	
    @Given ("^user is in filmaffinity$")
    public void user_is_in_filmaffinity() {
    	driver.get(url);        
    }
    
    @When ("^user click on top button$")
    public void user_click_on_top_button() {
        MainFilmaffinity mainFilmaffinity = new MainFilmaffinity(driver);
        mainFilmaffinity.clickTopFilmaffinity();     	
    }
    
    
    @Then ("^verify position (.*), name (.*), director (.*), point (.*)$")
    public void verify_film(String posicion, String nombre, String director, String nota) {
        TopFilmaffinity topFilmaffinity = new TopFilmaffinity(driver);
        String pelicula = topFilmaffinity.getPelicula(posicion);  
        
        System.out.println("nombre película: " + pelicula);  
        Assert.assertTrue(pelicula.contains(nombre) && pelicula.contains(director) && pelicula.contains(nota.replace('.', ',')));
    	driver.quit();
    }
    
    
//    @Then("^verify position (\\d+), name El padrino, director Francis Ford Coppola, point (\\d+)\\.(\\d+)$")
//    public void verify_position_name_El_padrino_director_Francis_Ford_Coppola_point(int arg1, int arg2, int arg3) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//    	System.out.println("arg1: " + arg1);
//    	System.out.println("arg2: " + arg2);
//    	System.out.println("arg3: " + arg3);
//        Assert.assertTrue(true);
//    }

    
}
