
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import static io.restassured.path.json.JsonPath.from;
import static org.testng.Assert.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Country{
	public static Response res;

	@BeforeClass
	public void setUP() {
		String sURL = "http://restcountries.eu/rest/v2/all";
	    RestAssured.baseURI = sURL;
	    res = (Response)RestAssured.given().queryParam("fields","name;alpha2Code;capital").contentType("application/json").get();
	}
	
	
	
	@Test(priority = 3)
	public void getCapitalfromCode() {
		System.out.println("\"Test - getCapitalfromCode\"");
		System.out.println("Enter Country Code:");
		Scanner sc = new Scanner(System.in);
		String code = sc.next();
		res = RestAssured.get("https://restcountries.eu/rest/v2/alpha/{code}",code);
		assertEquals(200,res.getStatusCode());
		String capital = res.jsonPath().get("capital");
		System.out.println("Capital : "+capital);
		res.getContentType();
		System.out.println("\"Complete - Test - getCapitalfromCode\"");
	}
	
	@Test(priority = 4)
	public void invalid_Code() {
		System.out.println("\"Test - invalid_Code\"");
		System.out.println("Enter Invalid Code:");
		Scanner sc = new Scanner(System.in);
		String code = sc.next();
		res = RestAssured.given().when().get("https://restcountries.eu/rest/v2/alpha/{code}",code);
		int statuscode =res.getStatusCode();
		assertTrue(statuscode == 400 || statuscode == 404);
		System.out.println("\"Complete - Test - invalid_Code\"");

	}
	
	

	@Test(priority = 5)
	public void invalid_URI() {
		System.out.println("\"Test - invalid_URI\"");
		System.out.println("Enter Country Code:");
		Scanner sc = new Scanner(System.in);
		String code = sc.next();
		RestAssured.given().when().get("https://restcountries.eu/rest/v2//alpha//{code}",code)
		.then().assertThat().statusCode(404);
		System.out.println("\"Complete - Test - invalid_URI\"");

		
	}
	
	@Test(priority = 5)
	public void validate_ContentType() {
		System.out.println("\"Test - valid_ContentType()\"");
		System.out.println("Enter Country Code:");
		Scanner sc = new Scanner(System.in);
		String code = sc.next();
		RestAssured.given().when().get("https://restcountries.eu/rest/v2/alpha/{code}",code)
		.then().assertThat().contentType(ContentType.JSON);
		System.out.println("\"Complete - Test - valid_ContentType()\"");

	}
	
	@Test(priority = 6)
	public void invalid_Method() {
		System.out.println("\"Test - invalid_Method()\"");
		System.out.println("Enter Country Code:");
		Scanner sc = new Scanner(System.in);
		String code = sc.next();
		RestAssured.given().when().post("https://restcountries.eu/rest/v2/alpha/{code}",code)
		.then().assertThat().statusCode(405);
		System.out.println("\"Complete - Test - invalid_Method()\"");

	}
	
	
	@Test(priority = 1)
	public void getCapitalfromName(){
		System.out.println("\"Test - getCapitalfromName\"");
		res = (Response)RestAssured.given().queryParam("fields","name;alpha2Code;capital").contentType("application/json").get();
		assertEquals(200,res.getStatusCode());
		String json = res.asString();
		System.out.println(json);
		
		List<String> namelist = res.jsonPath().getList("name");
		List<String> capitallist = res.jsonPath().getList("capital");
		boolean cont = true;
		
		while(cont) {
		System.out.println("Enter the Country Name:");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		if(namelist.contains(name)) {
			int a = namelist.indexOf(name);
			System.out.println("Capital : "+capitallist.get(a));
			System.out.println();
			System.out.println("Do you want to continue? Y/N :");
			String YesNo = sc.next();
			if(YesNo.equalsIgnoreCase("Y")) {
				cont = true;
			}else {
				cont = false;
			}
		
		}else {
			System.out.println("Invalid Country Code");
			
		}
		
		}
					
		System.out.println("\"Complete - Test - getCapitalfromName\"");

				
	}
	
	@Test(priority = 2)
	public void validate_filter(){
		System.out.println("\"Test - validate_filter\"");
		res = (Response)RestAssured.given().queryParam("fields","name;capital").contentType("application/json").get();
		assertEquals(200,res.getStatusCode());
		String json = res.asString();
		List<Map<String,String>> CountryList = from(json).getList("");
		for(Map<String,String> map : CountryList) {
			for(Map.Entry<String,String> entry : map.entrySet()) {
				assertTrue(entry.getKey().matches("name|capital"));
			}
		}
		
		System.out.println("\"Complete - Test - validate_filter\"");

	}


}
