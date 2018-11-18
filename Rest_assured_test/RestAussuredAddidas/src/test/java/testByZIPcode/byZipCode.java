package testByZIPcode;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class byZipCode {
	
	@Test
	public void testZipCodeResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code of respose is "+code);
		
		Assert.assertEquals(code, 200);
		
		
	}
	
	//Test response code using rest assured given,when,then BDD
	@Test
	public void testZipCodeParameters()
	{
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22")
        .then().body(containsString("Mountain View"));
	}
  
	
			
	//Test for: Please note if country is not specified then the search works for USA as a default.
		@Test
		public void testCitynameAndCode()
		{
			
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=560076&appid=b6907d289e10d714a6e88b30761fae22")
        .then().body("cod", equalTo(200)).body("name", equalTo("Mountain View"));
		
		}
				
		@Test
		public void checkCountryCodeForZipCode() {
			
			String zipcountrycode = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.country");
			System.out.println("Output of ZipCode Country Code is "+zipcountrycode);
						
		}
		
		
		@Test
		public void testZipCodeAndCode()
		{
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22")
        .then().body("cod", equalTo(200)).body("name", equalTo("Mountain View"));
		}
		
		@Test
		public void testGeograhicalCityNames()
		{
			String location=get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").asString();
						
					System.out.println("city location is "+location);
					
					JsonPath jsonPath = new JsonPath(location);
				    Assert.assertEquals(
				            "Mountain View",
				            jsonPath.getString("name"));
					
				  				    
				    //String jsonPath.get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").
			
		}

		@Test
		public void extractCityNameFromResponseBody() {
			String cityname = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("name");
			System.out.println("Output of City Name is "+cityname);
			}
		
		// (description = “To verify the content type”)
		@Test
		public void verifyZipCodeContentType() {
			given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().assertThat().statusCode(200).and().contentType("application/json");
		}
		


	@Test
	public void checkZipCodeMaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of Main Temp "+maxtemp);
					
	}
	@Test
	public void checkZipCodeMinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of Main Temp "+mintemp);
					
	}
	
	
	@Test
	public void checkZipCodeHumidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkZipCodePressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of Weather Humidity is "+temppressure);
					
	}
	
	

	@Test
	public void checkZipCodeWeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkZipCodeWeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkZipCodeWindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkZipCodeWindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkZipCodeClouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkZipCodeSunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of Sunrise is "+sunrise);
					
	}
	
	@Test
	public void checkZipCodeSunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of Sunset is "+sunset);
					
	}
	

	@Test
	public void checkZipCodeCityId() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CiTy id is "+cityid);
					
	}
	

		
}
