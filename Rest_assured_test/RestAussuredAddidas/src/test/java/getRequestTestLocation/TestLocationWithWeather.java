package getRequestTestLocation;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.sun.xml.bind.v2.schemagen.xmlschema.List;

import static io.restassured.RestAssured.*;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


public class TestLocationWithWeather {

	@Test
	public void testResponsecode()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code is "+code);
		
		Assert.assertEquals(code, 200);
		
		
	}
	
	//Test response code using rest assured given,when,then BDD
	@Test
	public void testLocation2()
	{
		given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552")
        .then().statusCode(200);
				
	
	}


		@Test
		public void testLocation()
		{
			String location=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
						
					System.out.println("Output of API is "+location);
					
					JsonPath jsonPath = new JsonPath(location);
				    Assert.assertEquals(
				            "London",
				            jsonPath.getString("name"));
					
				  				    
				    //String jsonPath.get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552").
			
		}

		
		@Test
		public void testBodyParamCountry()
		{
			String paramcountry=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
						
					System.out.println("Output of API is "+paramcountry);
					
					JsonPath jsonPath = new JsonPath(paramcountry);
				    Assert.assertEquals(
				            "GB",
				            jsonPath.getString("country"));
					
				  }

		@Test
		public void testBodyParamId()
		{
			String paramcountryid=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
						
					System.out.println("Output of API is "+paramcountryid);
					
					JsonPath jsonPath = new JsonPath(paramcountryid);
				    Assert.assertEquals(
				            "2643743",
				            jsonPath.getString("id"));
					
				  }
		
		@Test
		public void testTokyoLocation()
		{
			given().when().get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552")
	        .then().statusCode(200);
					
		
		}


			@Test
			public void testTokyoCityNmae()
			{
				String location=get("http://api.openweathermap.org/data/2.5/weather?q=Tokyo&appid=e987b65804b56ea596e2278d3f5f3552").asString();
							
						System.out.println("Output of Tokyo city API response is "+location);
						
						JsonPath jsonPath = new JsonPath(location);
					    Assert.assertEquals(
					            "Tokyo",
					            jsonPath.getString("name"));
						
					  				    
					    //String jsonPath.get("http://api.openweathermap.org/data/2.5/weather?q=Delhi&appid=e987b65804b56ea596e2278d3f5f3552").
				
			}

	
			
				@Test
				public void testTokyoLocationxml()
				{
					given().when().get("https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22")
			        .then().statusCode(200);
							
				
				}


					@Test
					public void testTokyoCityNameXml()
					{
						String location=get("https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").asString();
									
								System.out.println("Output of Tokyo city API response is "+location);
						
					}
					
	
}
