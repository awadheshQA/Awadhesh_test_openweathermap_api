package testBygeographicCoordinates;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class byGeographicCoordinates {

	@Test
	public void testResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code of respose is "+code);
		
		Assert.assertEquals(code, 200);
		
		
	}
	
	//Test response code using rest assured given,when,then BDD
	@Test
	public void testParameters()
	{
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22")
        .then().body(containsString("Tawarano"));
	}
  
	// (description = “To verify that multiple values ( response code and city name) belongs to the response body”)
	
	@Test
		public void testCitynameAndId()
		{
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22")
        .then().body("id", equalTo(1907296)).body("name", equalTo("Tawarano"));
		}
		// (description = “To verify that multiple values ( city ID and city name) belongs to the response body”)
		
		@Test
		public void testCitynameAndCode()
		{
			
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22")
        .then().body("cod", equalTo(200)).body("name", equalTo("Tawarano"));
		
		}
		
		@Test
		public void testGeograhicalAndCode()
		{
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22")
        .then().body("cod", equalTo(200)).body("name", equalTo("Tawarano"));
		}
		
		@Test
		public void testGeograhicalCityNames()
		{
			String location=get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").asString();
						
					System.out.println("city location is "+location);
					
					JsonPath jsonPath = new JsonPath(location);
				    Assert.assertEquals(
				            "Tawarano",
				            jsonPath.getString("name"));
					
				  				    
				    //String jsonPath.get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552").
			
		}

		@Test
		public void extractCityNameFromResponseBody() {
			String cityname = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("name");
			System.out.println("Output of City Name is "+cityname);
			}
		
		// (description = “To verify the content type”)
		@Test
		public void verifyContentType() {
			given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().assertThat().statusCode(200).and().contentType("application/json");
		}
		

		@Test
		public void testCitynameMadridAndCode()
		{
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22")
        .then().body("cod", equalTo(200)).body("name", equalTo("Tawarano"));
		
		
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
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of Main Temp "+maintemp);
					
	}

	@Test
	public void checkMaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of Main Temp "+maxtemp);
					
	}
	@Test
	public void checkMinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of Main Temp "+mintemp);
					
	}
	
	
	@Test
	public void checkHumidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkPressure() {
		
		float temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of Weather Humidity is "+temppressure);
					
	}
	
	

	@Test
	public void checkWeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkWeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkWindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkWindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkClouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkSunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of Sunrise is "+sunrise);
					
	}
	
	@Test
	public void checkSunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of Sunset is "+sunset);
					
	}
	

	@Test
	public void checkCityId() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CiTy id is "+cityid);
					
	}
	
	 public static void main(String []args){
		   String strMain = "Alpha, Beta, Delta, Gamma, Sigma";
		    String[] arrSplit = strMain.split(", ");
		    for (int i=0; i < arrSplit.length; i++)
		    {
		      System.out.println(arrSplit[i]);
		    }
		  }
	 

	
	}
	 
			
		
		
		
		 





