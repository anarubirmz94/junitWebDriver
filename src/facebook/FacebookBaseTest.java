package facebook;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookBaseTest {
	
	protected WebDriver driver;
	//Quitamos la definicion de @before porque tiene parametros
	protected void setUp(String browser, String url) {
		System.out.println("Arranca el browser porfa y navega a la pagina.");
		System.setProperty("webdriver.chrome.driver", "C:\\test_automation\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		System.out.println("Destruye la configuracion");
		driver.quit();
	}
	
	protected void likeAllPhotos() {
		// TODO Auto-generated method stub
		
	}

	protected void gotoPhotos() {
		// TODO Auto-generated method stub
		
	}

	protected void searchFacebookFriend(String friendName) {
		// TODO Auto-generated method stub
		
	}

	protected void logIntoFacebook(String user, String password) {
		// TODO Auto-generated method stub
		
	}

}
