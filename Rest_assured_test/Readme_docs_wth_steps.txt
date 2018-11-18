
The Original directory 'Awadhesh_test_openweathermap_api'or zip/tar after extraction it  contains two testing frameworks( Rest_assured_test and Selenium_Test_Awadhesh )to test 
1- openweathermap current weather API and 
2- To Test store.demoqa.com --> Navigate to sample-page and comment
3- Document note what tools and pre-installed tools and dependencies

The Test frameworks designed in Java, Rest assured,Maven,TestNG,Selenium webdriver,BDD and other required stacks
Rest Assured: - Setting up Java, Eclipse,TestNG,Maven and Rest-assured and other dependencies
Selenium: Java, Eclipse,TestNG,Maven and selenium webdriver

Both the framworks having Readme file how to run and what about all test and more details can be get from README file

Awadhesh_test_openweathermap_api
   Rest_assured_test   ( To Test https://openweathermap.org/current weather API)
                        [This framework covered all API test functionalities from 'https://openweathermap.org/current']
      
	RestAssuredFramework --> This is the Main directory on test framework which contains all required libraries
	  
	    --> src/main/java/
		--> src/main/resources/
		-->src/test/java/
		    --> getFullData
			    --> TestDataForApi.java  [This program contains API test to get the api Response and full data using GET method and it print the response and verify the status code]
				                         [ To Run this program right click on the program and Run as TestNG Test OR you can Run by clicking on run button and select run as TestNG test]
										 [ All Test will display the status as PASSED or FAILED on console along tests output]
	                                     [ You need to get API key from openweathermap.org to pass in API along parameters like City Name]
					                     [ Example of API th get the data is "https://samples.openweathermap.org/data/2.5/weather?q={city name}&appid={Your API KEY}]
										 [ Example of ready API is "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22"]
										 
			--> getRequest
			    --> GetData.java         [ This program file contains very basic test case to verify the API response data and response code for city ]
                                         [ To Run this program right click on the program and Run as TestNG Test OR you can Run by clicking on run button and select run as TestNG test]
										 [ All Test will display the status as PASSED or FAILED on console along tests output]

            --> getRequestTestLocation
                --> TestLocationWithWeather.java			
			                             [ This program file contains same test to validate API response with random cities name (Delhi,London,Tokyo..) ]
				                         [ To Run this program right click on the program and Run as TestNG Test OR you can Run by clicking on run button and select run as TestNG test]
										 [ All Test will display the status as PASSED or FAILED on console along tests output]
	 					

            --> getVerifyCityId
                --> testApiwithId.java   [This program file contains multiple API tests for city id's and verify their response code,id,city name, Weather details and other parameteres in Json and xml format]
 				                         [ To Run this program right click on the program and Run as TestNG Test OR you can Run by clicking on run button and select run as TestNG test]
										 [ All Test will display the status as PASSED or FAILED on console along tests output]
	  

            --> sanityTest
			    --> SanityTestCases.java [ This program file contains all sanity level and Combinations of all parameters test data response ]
				                         [ This test also covering all major functionalities as below  of current weather API ]
										 [ Test covered API tests for combinations of all below parameters of Current weather data Call current weather data for one location,
												By city name
												By city ID
												By geographic coordinates
												By ZIP code
												Call current weather data for several cities
												Cities within a rectangle zone
												Cities in cycle
												Call for several city IDs
												Bulk downloading
												Parameters of API respond
												JSON
												XML
												List of condition codes
												Min/max temperature in current weather API and forecast API
												Other features Some senario's]
				                         [ To Run this program right click on the program and Run as TestNG Test OR you can Run by clicking on run button and select run as TestNG test]
										 [ All Test will display the status as PASSED or FAILED on console along tests output]
	 												

            --> testBygeographicCoordinates 
			    --> byGeographicCoordinates.java [This program file contains API test cases to test API By geographic coordinates ] 
				                         [ To Run this program right click on the program and Run as TestNG Test OR you can Run by clicking on run button and select run as TestNG test]
										 [ All Test will display the status as PASSED or FAILED on console along tests output]
	 

    	 
            --> testByZipCode 
			    --> byZipCode.java [This program file contains API test cases to test API By Zip code of city ] 
				                   [This also contains test as if not providing zip code then it should return default country data response ] 
				                         [ To Run this program right click on the program and Run as TestNG Test OR you can Run by clicking on run button and select run as TestNG test]
										 [ All Test will display the status as PASSED or FAILED on console along tests output]
	 
	 

            --> verifyOtherfeatures 
			    --> testOtherfeatures.java [This program file contains API test cases to test Other features of current weather page ]
                                           [Other features like Format, Search accuracy, Units format, Multilingual support, Call back function for JavaScript code]				
				                         [ To Run this program right click on the program and Run as TestNG Test OR you can Run by clicking on run button and select run as TestNG test]
										 [ All Test will display the status as PASSED or FAILED on console along tests output]
	 	
	
		src/test/resorces
		JRE System Library
		Maven Dependencies  --> Maven dependencies like ( httpclient,hamcrest,json,xmlpath..) you can see auto add once you make tag entries in pom file 
		TestNG   --> [ This is required TestNG files ]
		pom.xml  -->  [This file is heart of rest assured framework testing, This contains all dependencies tags]
					  [Once you create a new maven project then you can see in your project hirarchy pom file created  and then you need to add depencies xml tag in this file ]
					   Maven:

							<dependency>
							  <groupId>io.rest-assured</groupId>
							  <artifactId>rest-assured</artifactId>
							  <version>3.2.0</version>
							  <scope>test</scope>
							</dependency>				  
							
					  [ After adding these tags in you pom file you can see it download automatically all required dependencies ]
					  [ You can add as many depencies tag as per yir requirements here i ahve used some more like JsonPath, Xmlpath etc..]
			 
			 
			 
			d here like any package it required like Json tool,Java, or any library which required.
	


	Selenium_Test_Awadhesh [ This test framwork to test web application as http://store.demoqa.com/sample-page/ ] 
	
	    src/action/
		         --> StoreAction [ it has all actions and store steps]
		src/features
		         --> [ This file is for cucumber feature where we write Feature to read based on BDD]
		src/pageObj
		         --> [ This is file where i have stored all objects and this is a class StorePageObj also used for defining how.xpath, how.css etc..]
		src/runner
				  --> [ This is runner file which contains all runner classed and other required methods etc]
		src/step
		         --> [ This file is for to initiate steps and start Test Scenario like
   				       Given - Initial setup, 
					   Given - user navigates to the store, 
					   Given - user navigates to sample page
					   When  - user comments with wrong email
					   When  - user validates for error message
					   When  - user navigates back
					   Then  - user comments with correct email
					   Then  - check comment is recieved
					   Then  - close the browser ]  
					   
Import these project in your work space and run it.
Risk Face: 
Rest-assured: Many maven depencies does not download automatically also it depends on cross compatibilities between all supported versions
 Like Java, Eclips (I have used Neon), Rest assured 3.0.2, TestNG and other dependencies.
during testing of openweathermap api current project i noticed some of the city ids parameters returns same country for two different id's.
these 2 ids (2172797 and 6355234) returns same city name for me not sure why.

Selenium: May face webdriver installation issue and cucumber dependencies  
		
	
Thanks for reading i hope you enjoyed my automation framework --- Awadhesh Jha.
Date: 18-Nov-2018

	