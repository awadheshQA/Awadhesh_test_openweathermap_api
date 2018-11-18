package getFullData;

import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;




public class TestDataForApi {
	
	@Test
	public void testResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code of respose is "+code);
		
		Assert.assertEquals(code, 200);
		
		
	}
	
	@Test
	public void testAllParameters()
	{
	
	String fullbody=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
	
	System.out.println("Response Body is "+fullbody);
	
	}
	
	@Test
	public void testAllParametersXml()
	{
	
	String xmlfullbody=get("https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").asString();
	
	System.out.println("Response Body in XML Format is "+xmlfullbody);
	
	}
		
		@Test
		public void testForecastDailyParametersXml()
		{
		
		String fcfullbody=get("https://samples.openweathermap.org/data/2.5/forecast/daily?id=524901&lang=sk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
		System.out.println("Response Body in XML Format is "+fcfullbody);
		
		}
		
		
		@Test
		public void testBboxResponsecode()
		{
			int code=get("https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
			
					System.out.println("Status code of bbox respose is "+code);
			
			Assert.assertEquals(code, 200);
			
			
		}
		
		@Test
		public void testBboxParameters()
		{
		
		String bbfullbody=get("https://samples.openweathermap.org/data/2.5/box/city?bbox=12,32,15,37,10&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
		System.out.println("Response Body of bbox API is "+bbfullbody);
		
		}
		
		
	
	
		
	
	
	
	
	}