package getVerifyCityid;

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


public class testApiwithId {

	@Test
	public void testCountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 2172797 and City Cairns respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkIdMainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkIdMaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkIdMinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkIdHumidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkIdPressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkIdVisibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkIdWeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkIdWeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkIdWindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkIdWindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkIdClouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkIdSunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkIdSunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Cairns and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testIdCitynameMadridAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Cairns"));
	
	}
	
	
	@Test
	public void testIdCityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Cairns"));
	}
	@Test
	public void testIdCitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Cairns"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(2172797));
	}
	@Test
	public void checkIdMaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Cairns and Id is 2172797 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	//
	@Test
	public void testId2643743CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 2643743 and City London respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId2643743MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is London and Id is 2643743 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId2643743MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId2643743MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId2643743Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId2643743Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId2643743Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId2643743WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId2643743WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId2643743WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId2643743WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId2643743Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId2643743Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId2643743Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is London and Id is 2643743 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId2643743() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name London and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId2643743CitynameLondonAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("London"));
	
	}
	
	
	@Test
	public void testId2643743CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("London"));
	}
	@Test
	public void testId2643743CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("London"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(2643743));
	}
	@Test
	public void checkId2643743MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2643743&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	
	//-------------------- Test with City ID 2950159-----------------/
	@Test
	public void testId2950159CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Status code of id 2950159 and City Berlin respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId2950159MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=London&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId2950159MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId2950159MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId2950159Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId2950159Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId2950159Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId2950159WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId2950159WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId2950159WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId2950159WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId2950159Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId2950159Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId2950159Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Berlin and Id is 2950159 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId2950159() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Berlin and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId2950159CitynameBerlinAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Berlin"));
	
	}
	
	
	@Test
	public void testId2950159CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Berlin"));
	}
	@Test
	public void testId2950159CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Berlin"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(2950159));
	}
	@Test
	public void checkId2950159MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is London and Id is 2950159 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2950159&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//--------------------- Test with City ID 3128760-------------------------//
	
	@Test
	public void testId3128760CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Status code of id 3128760 and City Barcelona respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId3128760MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Barcelona&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId3128760MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId3128760MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId3128760Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId3128760Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId3128760Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId3128760WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId3128760WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId3128760WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId3128760WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId3128760Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId3128760Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId3128760Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId3128760() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Barcelona and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId3128760CitynameBarcelonaAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Barcelona"));
	
	}
	
	
	@Test
	public void testId3128760CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Barcelona"));
	}
	@Test
	public void testId3128760CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Barcelona"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(3128760));
	}
	@Test
	public void checkId3128760MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Barcelona and Id is 3128760 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3128760&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//------------------ Test with City ID 3117735 --------------------//
	
	@Test
	public void testId3117735CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Status code of id 3117735 and City Madrid respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId3117735MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Madrid&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId3117735MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId3117735MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId3117735Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId3117735Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId3117735Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId3117735WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId3117735WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId3117735WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId3117735WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId3117735Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId3117735Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId3117735Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId3117735() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Madrid and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId3117735CitynameMadridAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Madrid"));
	
	}
	
	
	@Test
	public void testId3117735CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Madrid"));
	}
	@Test
	public void testId3117735CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Madrid"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(3117735));
	}
	@Test
	public void checkId3117735MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Madrid and Id is 3117735 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3117735&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//-------------------- Test with City ID 3104324--------------------------------//
	
	@Test
	public void testId3104324CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Status code of id 3104324 and City Zaragoza respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId3104324MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Zaragoza&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId3104324MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId3104324MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId3104324Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId3104324Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId3104324Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId3104324WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId3104324WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId3104324WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId3104324WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId3104324Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId3104324Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId3104324Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId3104324() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Zaragoza and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId3104324CitynameZaragozaAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Zaragoza"));
	
	}
	
	
	@Test
	public void testId3104324CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Zaragoza"));
	}
	@Test
	public void testId3104324CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Zaragoza"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(3104324));
	}
	@Test
	public void checkId3104324MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Zaragoza and Id is 3104324 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=3104324&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//------------- Test with City ID 1277333-------------//
	
	@Test
	public void testId1277333CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 1277333 and City Bangalore respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId1277333MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Bangalore&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId1277333MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId1277333MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId1277333Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId1277333Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId1277333Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId1277333WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId1277333WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId1277333WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId1277333WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId1277333Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId1277333Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId1277333Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId1277333() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Bangalore and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId1277333CitynameBangaloreAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Bangalore"));
	
	}
	
	
	@Test
	public void testId1277333CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Bangalore"));
	}
	@Test
	public void testId1277333CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Bangalore"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(1277333));
	}
	@Test
	public void checkId1277333MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Bangalore and Id is 1277333 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1277333&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//---------------------- Test with City ID 1275339 ------------------------//
	
	@Test
	public void testId1275339CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Status code of id 1275339 and City Mumbai respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId1275339MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Mumbai&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId1275339MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId1275339MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId1275339Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId1275339Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId1275339Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId1275339WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId1275339WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId1275339WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId1275339WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId1275339Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId1275339Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId1275339Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId1275339() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Mumbai and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId1275339CitynameMumbaiAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Mumbai"));
	
	}
	
	
	@Test
	public void testId1275339CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Mumbai"));
	}
	@Test
	public void testId1275339CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Mumbai"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(1275339));
	}
	@Test
	public void checkId1275339MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Mumbai and Id is 1275339 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1275339&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//---------------- Test with City ID 1273294 --------------------------------//
	
	@Test
	public void testId1273294CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Status code of id 1273294 and City Delhi respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId1273294MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
				System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId1273294MaxTemp() {
		
		float maxtempdelhi = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Max Temp is "+maxtempdelhi);
					
	}
	@Test
	public void checkId1273294MinTemp() {
		
		float mintempdelhi = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Min Temp is "+mintempdelhi);
					
	}
	
	
	@Test
	public void checkId1273294Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId1273294Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId1273294Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId1273294WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId1273294WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId1273294WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId1273294WindDeg() {
		
		int delwinddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Weather wind is "+delwinddeg);
					
	}
	
	@Test
	public void checkId1273294Clouds() {
		
		int delcloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Weather Clouds all is "+delcloudsall);
					
	}
	
	@Test
	public void checkId1273294Sunrise() {
		
		int delsunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Sunrise at "+delsunrise);
					
	}
	
	@Test
	public void checkId1273294Sunset() {
		
		int delsunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Sunset at "+delsunset);
					
	}
	

	@Test
	public void checkCityId1273294() {
		
		int delcityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Delhi and City Id is "+delcityid);
					
	}
	
	//id with code and name
	@Test
	public void testId1273294CitynameDelhiAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Delhi"));
	
	}
	
	
	@Test
	public void testId1273294CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Delhi"));
	}
	@Test
	public void testId1273294CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Delhi"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(1273294));
	}
	@Test
	public void checkId1273294MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Delhi and Id is 1273294 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1273294&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//-------------------- Test with 4049979 ------------------------//
	
	@Test
	public void testId4049979CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Status code of id 4049979 and City Birmingham respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId4049979MainTemp() {
		
		float birmaintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Birmingham&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Main Temp is  "+birmaintemp);
					
	}

	@Test
	public void checkId4049979MaxTemp() {
		
		float birmaxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Max Temp is "+birmaxtemp);
					
	}
	@Test
	public void checkId4049979MinTemp() {
		
		float birmintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Min Temp is "+birmintemp);
					
	}
	
	
	@Test
	public void checkId4049979Humidity() {
		
		int birhumidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Weather Humidity is "+birhumidity);
					
	}
	
	@Test
	public void checkId4049979Pressure() {
		
		int birtemppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Weather Humidity is "+birtemppressure);
					
	}
	
	
	@Test
	public void checkId4049979Visibility() {
		
		int birvisibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Weather Visibility is "+birvisibility);
					
	}
	
	
	@Test
	public void checkId4049979WeaterMain() {
		
		String birweathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Weather main is "+birweathermain);
					
	}
	
	@Test
	public void checkId4049979WeaterMainDescription() {
		
		String birdescription = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Weather Status Description is "+birdescription);
					
	}
	
	@Test
	public void checkId4049979WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId4049979WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId4049979Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId4049979Sunrise() {
		
		int birsunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Sunrise at "+birsunrise);
					
	}
	
	@Test
	public void checkId4049979Sunset() {
		
		int birsunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Sunset at "+birsunset);
					
	}
	

	@Test
	public void checkCityId4049979() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Birmingham and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId4049979CitynameBirminghamAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Birmingham"));
	
	}
	
	
	@Test
	public void testId4049979CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Birmingham"));
	}
	@Test
	public void testId4049979CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Birmingham"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(4049979));
	}
	@Test
	public void checkId4049979MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Birmingham and Id is 4049979 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=4049979&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//-----------------Test with city ID 5089178-----//
	
	@Test
	public void testId5089178CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 5089178 and City Manchester respose is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId5089178MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Manchester&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId5089178MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId5089178MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId5089178Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId5089178Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId5089178Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId5089178WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId5089178WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId5089178WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId5089178WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId5089178Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId5089178Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId5089178Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId5089178() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Manchester and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId5089178CitynameManchesterAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Manchester"));
	
	}
	
	
	@Test
	public void testId5089178CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Manchester"));
	}
	@Test
	public void testId5089178CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Manchester"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(5089178));
	}
	@Test
	public void checkId5089178MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Manchester and Id is 5089178 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=5089178&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//
	
	@Test
	public void testId2648579CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Status code of id 2648579 and City Glasgow response is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId2648579MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Glasgow&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId2648579MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId2648579MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId2648579Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId2648579Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId2648579Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId2648579WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId2648579WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId2648579WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId2648579WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId2648579Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId2648579Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId2648579Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId2648579() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Glasgow and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId2648579CitynameGlasgowAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Glasgow"));
	
	}
	
	
	@Test
	public void testId2648579CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Glasgow"));
	}
	@Test
	public void testId2648579CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Glasgow"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(2648579));
	}
	@Test
	public void checkId2648579MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Glasgow and Id is 2648579 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2648579&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//
	
	@Test
	public void testId2644688CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 2644688 and City Leeds response is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId2644688MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Leeds&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId2644688MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId2644688MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId2644688Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId2644688Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId2644688Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId2644688WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId2644688WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId2644688WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId2644688WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId2644688Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId2644688Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId2644688Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId2644688() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Leeds and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId2644688CitynameLeedsAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Leeds"));
	
	}
	
	
	@Test
	public void testId2644688CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Leeds"));
	}
	@Test
	public void testId2644688CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Leeds"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(2644688));
	}
	@Test
	public void checkId2644688MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Leeds and Id is 2644688 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644688&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//
	
	@Test
	public void testId2644210CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 2644210 and City Liverpool response is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId2644210MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Liverpool&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId2644210MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId2644210MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId2644210Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId2644210Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId2644210Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId2644210WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId2644210WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId2644210WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId2644210WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId2644210Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId2644210Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId2644210Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId2644210() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Liverpool and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId2644210CitynameLiverpoolAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Liverpool"));
	
	}
	
	
	@Test
	public void testId2644210CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Liverpool"));
	}
	@Test
	public void testId2644210CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Liverpool"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(2644210));
	}
	@Test
	public void checkId2644210MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Liverpool and Id is 2644210 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2644210&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//
	
		
	//
	
	@Test
	public void testId6355234CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 6355234 and City Murcia response is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId6355234MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Murcia&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId6355234MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId6355234MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId6355234Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId6355234Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId6355234Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId6355234WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId6355234WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId6355234WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId6355234WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId6355234Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId6355234Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId6355234Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId6355234() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Murcia and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId6355234CitynameMurciaAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Murcia"));
	
	}
	
	
	@Test
	public void testId6355234CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Murcia"));
	}
	@Test
	public void testId6355234CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Murcia"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(6355234));
	}
	@Test
	public void checkId6355234MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Murcia and Id is 6355234 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=6355234&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	//
	
	@Test
	public void testId2147714CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 2147714 and City Sydney response is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId2147714MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId2147714MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId2147714MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId2147714Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId2147714Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId2147714Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId2147714WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId2147714WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId2147714WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId2147714WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId2147714Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId2147714Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId2147714Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId2147714() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Sydney and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId2147714CitynameSydneyAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Sydney"));
	
	}
	
	
	@Test
	public void testId2147714CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Sydney"));
	}
	@Test
	public void testId2147714CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Sydney"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(2147714));
	}
	@Test
	public void checkId2147714MaxAndMinTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Sydney and Id is 2147714 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2147714&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
					
	}
	
	//
	
	@Test
	public void testId2158177CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 2158177 and City Melbourne response is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId2158177MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Melbourne&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId2158177MaxTemp() {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Max Temp is "+maxtemp);
					
	}
	@Test
	public void checkId2158177MinTemp() {
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Min Temp is "+mintemp);
					
	}
	
	
	@Test
	public void checkId2158177Humidity() {
		
		int humidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Weather Humidity is "+humidity);
					
	}
	
	@Test
	public void checkId2158177Pressure() {
		
		int temppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Weather Humidity is "+temppressure);
					
	}
	
	
	@Test
	public void checkId2158177Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId2158177WeaterMain() {
		
		String weathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Weather main is "+weathermain);
					
	}
	
	@Test
	public void checkId2158177WeaterMainDescription() {
		
		String description = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Weather Status Description is "+description);
					
	}
	
	@Test
	public void checkId2158177WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId2158177WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId2158177Clouds() {
		
		int cloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Weather Clouds all is "+cloudsall);
					
	}
	
	@Test
	public void checkId2158177Sunrise() {
		
		int sunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Sunrise at "+sunrise);
					
	}
	
	@Test
	public void checkId2158177Sunset() {
		
		int sunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Sunset at "+sunset);
					
	}
	

	@Test
	public void checkCityId2158177() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Melbourne and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId2158177CitynameMelbourneAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Melbourne"));
	
	}
	
	
	@Test
	public void testId2158177CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Melbourne"));
	}
	@Test
	public void testId2158177CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Melbourne"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(2158177));
	}
	@Test
	public void checkId2158177MaxAndMinTemp() throws InterruptedException {
		
		float maxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		//System.out.println("Output of CitY Name is Melbourne and Id is 2158177 for Max Temp is "+maxtemp);
		
		float mintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=2158177&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		//System.out.println("Max and Min Temprature is "+mintemp);
		System.out.println("Max Temp is : " +maxtemp + " Min Temp is : "+ mintemp +".");
		Thread.sleep(30);			
	}
	//--------------- Test for City ID 1850147 ------------------//
		
	@Test
	public void testId1850147CountryResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		System.out.println("Tet cases execution is in progress for openweatermap By ID");
		System.out.println("Status code of id 1850147 and City Tokyo response is "+code);
		Assert.assertEquals(code, 200);
				
	}
	
	@Test
	public void checkId1850147MainTemp() {
		
		float maintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp");
		//String maintemp = given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Tokyo&appid=e987b65804b56ea596e2278d3f5f3552").then().extract().path("wind");
		
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Main Temp is  "+maintemp);
					
	}

	@Test
	public void checkId1850147MaxTemp() {
		
		float tokmaxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Max Temp is "+tokmaxtemp);
					
	}
	@Test
	public void checkId1850147MinTemp() {
		
		float tokmintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Min Temp is "+tokmintemp);
					
	}
	
	
	@Test
	public void checkId1850147Humidity() {
		
		int tohumidity = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.humidity");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Weather Humidity is "+tohumidity);
					
	}
	
	@Test
	public void checkId1850147Pressure() {
		
		int totemppressure = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.pressure");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Weather Humidity is "+totemppressure);
					
	}
	
	
	@Test
	public void checkId1850147Visibility() {
		
		int visibility = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("visibility");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Weather Visibility is "+visibility);
					
	}
	
	
	@Test
	public void checkId1850147WeaterMain() {
		
		String toweathermain = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.main[0]");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Weather main is "+toweathermain);
					
	}
	
	@Test
	public void checkId1850147WeaterMainDescription() {
		
		String todescription = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("weather.description[0]");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Weather Status Description is "+todescription);
					
	}
	
	@Test
	public void checkId1850147WindSpeed() {
		
		float wind = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.speed");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Weather wind Speed is "+wind);
					
	}

	@Test
	public void checkId1850147WindDeg() {
		
		int winddeg = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("wind.deg");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Weather wind is "+winddeg);
					
	}
	
	@Test
	public void checkId1850147Clouds() {
		
		int tocloudsall = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("clouds.all");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Weather Clouds all is "+tocloudsall);
					
	}
	
	@Test
	public void checkId1850147Sunrise() {
		
		int tosunrise = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunrise");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Sunrise at "+tosunrise);
					
	}
	
	@Test
	public void checkId1850147Sunset() {
		
		int tosunset = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("sys.sunset");
		System.out.println("Output of CitY Name is Tokyo and Id is 1850147 for Sunset at "+tosunset);
					
	}
	

	@Test
	public void checkCityId1850147() {
		
		int cityid = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("id");
		System.out.println("Output of CitY Name Tokyo and City Id is "+cityid);
					
	}
	
	//id with code and name
	@Test
	public void testId1850147CitynameTokyoAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Tokyo"));
	
	}
	
	
	@Test
	public void testId1850147CityParameters()
	{
		
		given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22")
		.then().body(containsString("Tokyo"));
	}
	@Test
	public void testId1850147CitynameAndCode()
	{
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("name", equalTo("Tokyo"));
	given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22")
    .then().body("cod", equalTo(200)).body("id", equalTo(1850147));
	}
	@Test
	public void checkId1850147MaxAndMinTemp() {
		
		float tomaxtemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_max");
		float tomintemp = given().when().get("https://samples.openweathermap.org/data/2.5/weather?id=1850147&appid=b6907d289e10d714a6e88b30761fae22").then().extract().path("main.temp_min");
		System.out.println("Max Temp is : " +tomaxtemp + " Min Temp is : "+ tomintemp +".");
					
	}
	
	
}
