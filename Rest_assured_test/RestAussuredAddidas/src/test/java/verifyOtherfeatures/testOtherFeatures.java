package verifyOtherfeatures;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class testOtherFeatures {
	
	
	//----------------------------------Format of API response Testing-----------------------------------------//
// Format test case to test JSON body response code
	@Test
	public void testFormatJson()
	{
		int code=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code of JSON Format of response is "+code);
		
		Assert.assertEquals(code, 200);
			
	}
	
	@Test
	public void testFormatJsonRespBody()
	{
		String jresp=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body of JSON Format s "+jresp);
		
			
	}
	
	//--------------- Format test case to test XML body response code---------------------//
	
	@Test
	public void testFormatXml()
	{
		int xcode=get("https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code of XML Format of response is "+xcode);
		
		Assert.assertEquals(xcode, 200);
				
	}
	
	@Test
	public void testFormatXmlRespBody()
	{
		String xresp=get("https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body of XML Format is "+xresp);
		
			
	}
	
	//---- Format test case to test HTML body response code-------------------//
	
	@Test
	public void testFormatHtml()
	{
		int hcode=get("https://samples.openweathermap.org/data/2.5/weather?q=London&mode=html&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code HTML Format of response is "+hcode);
		
		Assert.assertEquals(hcode, 200);
		
		
	}
	
	@Test
	public void testFormathtmlRespBody()
	{
		String hresp=get("https://samples.openweathermap.org/data/2.5/weather?q=London&mode=html&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body of HTML Format of response is "+hresp);
			
	}
	
	
//--------------------------------------SearchAccuracy Type Like-------------------------------------//
	
	
		
	@Test
	public void testSearchAccuracy()
	{
		int sacode=get("https://samples.openweathermap.org/data/2.5/find?q=London&type=accurate&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code SearchAccuracy response is "+sacode);
		
		Assert.assertEquals(sacode, 200);
		
		
	}
	
	@Test
	public void testSearchAccuracyResBody()
	{
		String saresp=get("https://samples.openweathermap.org/data/2.5/find?q=London&type=accurate&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body of SearchAccuracy response is "+saresp);
			
	}
	
	//-------------------------SearchAccuracy Type Like ------------------------------/
	@Test
	public void testSearchAccuracyTypeLike()
	{
		int satlcode=get("https://samples.openweathermap.org/data/2.5/find?q=London&type=like&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code for SearchAccuracy response is "+satlcode);
		
		Assert.assertEquals(satlcode, 200);
		
		
	}
	
	@Test
	public void testSearchAccuracyTypeLikeResBody()
	{
		String saresp=get("https://samples.openweathermap.org/data/2.5/find?q=London&type=like&mode=xml&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body for SearchAccuracy response is "+saresp);
			
	}
	
	
    //------------------------------------------Units format Metric--------------------//
	
	@Test
	public void testUnitsMetricFormat()
	{
		int umcode=get("https://samples.openweathermap.org/data/2.5/find?q=London&units=metric&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code for Units format Metric response is "+umcode);
		
		Assert.assertEquals(umcode, 200);
		
		
	}
	
	@Test
	public void testUnitsMetricFormaResBody()
	{
		String umresp=get("https://samples.openweathermap.org/data/2.5/find?q=London&units=metric&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body for format Metric response is "+umresp);
			
	}
	
      //-------------------------------- Units format Imperial------------------//	
	@Test
	public void testUnitsImperialFormat()
	{
		int uicode=get("https://samples.openweathermap.org/data/2.5/find?q=London&units=imperial&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code for Units format Imperial response is "+uicode);
		
		Assert.assertEquals(uicode, 200);
		
		
	}
	
	@Test
	public void testUnitsImperialFormaResBody()
	{
		String uiresp=get("https://samples.openweathermap.org/data/2.5/find?q=London&units=imperial&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body forUnits format Imperial response is "+uiresp);
			
	}
	
	
	//------------------------------Multilingual support -------------------//
	
	@Test
	public void testMultilingualSupportLanZhCn()
	{
		int mlxhcncode=get("https://samples.openweathermap.org/data/2.5/forecast/daily?id=524901&lang=zh_cn&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code for Language ZhCn response is "+mlxhcncode);
		
		Assert.assertEquals(mlxhcncode, 200);
		
		
	}
	@Test
	public void testMultilingualSupportLanZhCnResBody()
	{
		String mlresp=get("https://samples.openweathermap.org/data/2.5/forecast/daily?id=524901&lang=zh_cn&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body for Language ZhCn response is "+mlresp);
			
	}
	
	//----------------------------Call back function for JavaScript code--------------//
	
	@Test
	public void testCallBackFunctionForJavaScriptcode()
	{
		int cbffjsccode=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&callback=test&appid=b6907d289e10d714a6e88b30761fae22").statusCode();
		
				System.out.println("Status code for Call back function for JavaScript code response is "+cbffjsccode);
		
		Assert.assertEquals(cbffjsccode, 200);
		
		}
	
	@Test
	public void testCallBackFunctionForJavaScriptcodeResBody()
	{
		String jscresp=get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&callback=test&appid=b6907d289e10d714a6e88b30761fae22").asString();
		
				System.out.println("Response Body for Call back function for JavaScript code response is "+jscresp);
			
	}
	
	}
	
		
	
	 
			
		
		
		
		 





