package imdb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;
import utils.Locators;//Para referenciar a los Locators

public class ParentTest {
	
	protected WebDriver driver;
	
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.quit();		
	}
	public void validateMovieExists() {
	/*	WebElement searchBox = driver.findElement(By.id("navbar-query"));
		WebElement searchButton = driver.findElement(By.id("navbar-submit-button"));
		searchBox.clear();
		searchBox.sendKeys(movie);
		searchButton.click();*/
		
	}

	protected void searchMovie(String movie) {
		// TODO Auto-generated method stub
		WebElement searchBox = driver.findElement(Locators.NAVEGATION_BAR);//By.id("navbar-query"
		WebElement searchButton = driver.findElement(Locators.NAVEGATION_BUTTON);//By.id("navbar-submit-button"
		searchBox.clear();
		searchBox.sendKeys(movie);
		searchButton.click();
	}


	protected void validatePage(String titulo) {
		String tituloP=driver.getTitle();//titulo de la pagina
		if(titulo.equals(tituloP))
		{System.out.println("Pagina correcta");}
		else{System.out.println("Página incorrecta");}	
	}

	protected void navigateToPage(String url) {
		driver.get(url);
	}
	
	protected void playTrailer() {
		//WebElement trailer = driver.findElement(By.cssSelector("css=div.slate_fade_top"));
		//trailer.click();
	///video/imdb/vi1396095257?playlistId=tt1396484&ref_=tt_ov_vi  --href	
	}


	protected void validateCorrectMovie(String movie) {
		String tituloMovie=driver.getTitle();//titulo de la pagina
		if(tituloMovie.equals(movie))
		{System.out.println("Pagina correcta");}
		else{System.out.println("Página incorrecta");}	
	
	}

	protected void selectMovie(String movie) {
		WebElement nombreMovie = driver.findElement(By.linkText(movie));
		nombreMovie.click();
		
	}
	//Valida si estan dos actores en la pelicula seleccionada
	//El usuario debe antes seleccionar la pelicula
	protected void validateMovieStars(String actor1, String actor2) {
		WebElement  nombre= driver.findElement(Locators.LINK_ACTOR1);//By.xpath("//*[@id=\"title-overview-widget\"]/div[3]/div[1]/div[4]/span[1]/a/span")
		WebElement  nombre2= driver.findElement(Locators.LINK_ACTOR2);//By.xpath("//*[@id=\"title-overview-widget\"]/div[3]/div[1]/div[4]/span[2]/a/span")
		String a1=nombre.getText();
		String a2=nombre2.getText();
		
		System.out.println("Nombre de actores es:"+a1+" y "+a2);
		if(a1.equals(actor1))
		{
			if(a2.equals(actor2))
			{System.out.println("Actores iguales");}
			else{System.out.println("Actores diferentes");}
		}
		else{System.out.println("Actores diferentes");}
		}


}
