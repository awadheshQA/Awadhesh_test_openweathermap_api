package sanityTest;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;
import java.util.HashMap;
import java.util.Map;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class SanityTestCases {
	
	@Test
	public void testResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code of respose is "+code);
		
		Assert.assertEquals(code, 200);
		
		
	}
	
	//Test response code using rest assured given,when,then BDD
	@Test
	public void testParameters()
	{
		given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552")
        .then().body(containsString("Delhi"));
	}
  
	// (description = “To verify that multiple values ( response code and city name) belongs to the response body”)
	
	@Test
		public void testCitynameAndId()
		{
		given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552")
        .then().body("id", equalTo(1273294)).body("name", equalTo("Delhi"));
		}
		// (description = “To verify that multiple values ( city ID and city name) belongs to the response body”)
		
		@Test
		public void testCitynameAndCode()
		{
			
		given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552")
        .then().body("cod", equalTo(200)).body("name", equalTo("Delhi"));
		
		}
		
		@Test
		public void testCitynameLondonAndCode()
		{
		given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552")
        .then().body("cod", equalTo(200)).body("name", equalTo("London"));
		}
		
		@Test
		public void testCitynameSydneyAndCode()
		{
		given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=e987b65804b56ea596e2278d3f5f3552")
        .then().body("cod", equalTo(200)).body("name", equalTo("Sydney"));
		
		
		//String json = get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552").asString();
			//	List<String> winnderIds = from(json).get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552.country.id");		
		//System.out.println("Status code is "+json);
	}


		@Test
		public void testcityLocation()
		{
			String location=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
						
					System.out.println("city location is "+location);
					
					JsonPath jsonPath = new JsonPath(location);
				    Assert.assertEquals(
				            "London",
				            jsonPath.getString("name"));
					
				  				    
				    //String jsonPath.get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552").
			
		}

		@Test
		public void extractCityNameFromResponseBody() {
			String cityname = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("name");
			System.out.println("Output of City Name is "+cityname);
			}
		
		// (description = “To verify the content type”)
		@Test
		public void verifyContentType() {
			given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().assertThat().statusCode(200).and().contentType("application/json");
		}
		

		@Test
		public void testCitynameMadridAndCode()
		{
		given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Madrid&appid=e987b65804b56ea596e2278d3f5f3552")
        .then().body("cod", equalTo(200)).body("name", equalTo("Madrid"));
		
		
		//.then().assertThat().body("lotto.lottoId", equalTo(5));
		
		}
		
		//https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22
		@Test
		public void testCitynameBerlinAndCode()
		{
		given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Berlin&appid=e987b65804b56ea596e2278d3f5f3552")
        .then().body("cod", equalTo(200)).body("name", equalTo("Berlin"));
		
	
	  	}
	
	@Test
	public void checkMainTemp() {
		
		float maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of LondonMain Temp "+maintemp);
					
	}

	@Test
	public void checkMaxTemp() {
		
		float maxtemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.temp_max");
		System.out.println("Output of London Max Temp "+maxtemp);
					
	}
	@Test
	public void checkMinTemp() {
		
		float mintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.temp_min");
		System.out.println("Output of London Min Temp "+mintemp);
					
	}
	
	
	@Test
	public void checkHumidity() {
		
		int humidity = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.humidity");
		System.out.println("Output of London Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkPressure() {
		
		int temppressure = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.pressure");
		System.out.println("Output of London Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkVisibility() {
		
		int visibility = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("visibility");
		System.out.println("Output of LondonWeather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkWeaterMain() {
		
		String weathermain = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("weather.main[0]");
		System.out.println("Output of London Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkWeaterMainDescription() {
		
		String description = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("weather.description[0]");
		System.out.println("Output of London Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkWindSpeed() {
		
		float wind = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind.speed");
		System.out.println("Output of London Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkWindDeg() {
		
		int winddeg = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind.deg");
		System.out.println("Output of London Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkClouds() {
		
		int cloudsall = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("clouds.all");
		System.out.println("Output of London Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkSunrise() {
		
		int sunrise = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("sys.sunrise");
		System.out.println("Output of London Sunrise is "+sunrise);
					
	}
	
	@Test
	public void checkSunset() {
		
		int sunset = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("sys.sunset");
		System.out.println("Output of London Sunset is "+sunset);
					
	}
	

	@Test
	public void checkCityId() {
		
		int cityid = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("id");
		System.out.println("Output of London CiTy id is "+cityid);
					
	}
	
	//

	@Test
	public void testCallforSeveralCityIDsrespCode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/group?id=524901,703448,2643743&units=metric&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
	System.out.println("Status code of CallforSeveralCityIDsrespCode respose is "+code);
	
	Assert.assertEquals(code, 200);
    
	
	}


	@Test
	public void testCallforSeveralCityIDs()
	{
		String location=get("https://samples.openweathermap.org/data/2.5/group?id=524901,703448,2643743&units=metric&appid=b6907d289e10d714a6e88b30761fae22").asString();
					
				System.out.println("city location is "+location);
				
						
			  				    
			    //String jsonPath.get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552").
		
	}
	
	
	///---------- Test cases to verify one-one parameters from one API variable like city---/
	
	@Test
	public void checkDublinMainTemp() {
		
		float maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Dublin&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of Main Temp of Dublin "+maintemp);
					
	}

	@Test
	public void checkCaliforniaMaxTemp() {
		
		float maxtemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=California&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.temp_max");
		System.out.println("Output of Main Temp of California "+maxtemp);
					
	}
	// My Native Temperature 
		@Test
	public void checkLalitpurMaxTemp() {
		
		float maxtemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Lalitpur&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.temp_max");
		System.out.println("Output of Main Temp of My Native "+maxtemp);
					
	}
	
	@Test
	public void checkAucklandMinTemp() {
		
		float mintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Auckland&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.temp_min");
		System.out.println("Output of Auckland Main Temp  "+mintemp);
					
	}
	
	
	@Test
	public void checkBerlinHumidity() {
		
		int humidity = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Berlin&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.humidity");
		System.out.println("Output of Berlin Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkBarcelonaPressure() {
		
		int temppressure = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Barcelona&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("main.pressure");
		System.out.println("Output of Barcelona Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkLondonVisibility() {
		
		int visibility = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("visibility");
		System.out.println("Output of London Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkMadridWeaterMain() {
		
		String weathermain = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Madrid&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("weather.main[0]");
		System.out.println("Output of Madrid Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkDublinWeaterMainDescription() {
		
		String description = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Dublin&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("weather.description[0]");
		System.out.println("Output of Dublin Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkManchesterWindSpeed() {
		
		float wind = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Manchester&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind.speed");
		System.out.println("Output of Manchester Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkGangtokWindDeg() {
		
		float winddeg = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Gangtok&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind.deg");
		System.out.println("Output of Gangtok Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkValenciaClouds() {
		
		int cloudsall = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Valencia&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("clouds.all");
		System.out.println("Output of Valencia Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkZaragozaSunrise() {
		
		int sunrise = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Zaragoza&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("sys.sunrise");
		System.out.println("Output of Zaragoza Sunrise is "+sunrise);
					
	}
	
	@Test
	public void checkZaragozaSunset() {
		
		int sunset = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Zaragoza&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("sys.sunset");
		System.out.println("Output of Zaragoza Sunset is "+sunset);
					
	}
	

	@Test
	public void checkTokiyoCityId() {
		
		int cityid = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Tokyo&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("id");
		System.out.println("Output of Tokyo CiTy id is "+cityid);
					
	}
	
	
	}
	 
			
		
		
		
		 


