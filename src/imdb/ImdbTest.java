package imdb;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
@RunWith(JUnitParamsRunner.class)
public class ImdbTest extends ParentTest{
	/*
	@Test
	
	public void testSearchMovie() {
		setUp();
		navigateToPage("https://www.imdb.com");
		validatePage("IMDb - Movies, TV and Celebrities - IMDb");//
		searchMovie("Eso");
		validateMovieExists();
	}

	
	@Test
	public void testPlayTrailer() {
	setUp();
		navigateToPage("http://imdb.com");
		validatePage("IMDb - Movies, TV and Celebrities - IMDb");
		searchMovie("Titanic");
		validateMovieExists();
		selectMovie("Titanic");//
		validateCorrectMovie("Titanic (1997) - IMDb");
		playTrailer();
		
		
	}
	
	*/

	@Test
	@FileParameters("./data/paramsIMDb1.csv")
	public void testValidateMovieStars(String pagina, String tituloPagina, String pelicula, String anio, String actor1, String actor2) {
//http://imdb.com,IMDb - Movies\, TV and Celebrities - IMDb,Titanic,1997,Leonardo DiCaprio,Kate Winslet
		setUp();
		navigateToPage(pagina);
		validatePage(tituloPagina);
		searchMovie(pelicula);
		validateMovieExists();
		selectMovie(pelicula);
		validateCorrectMovie(pelicula+" ("+ anio +") - IMDb");
		validateMovieStars(actor1,actor2);
	}

	

}
