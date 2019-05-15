package tt;
import org.testng.annotations.Test;
//import static io.restassured.RestAssured; can get rid of restassured and just have get
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetData {
	
	@Test
	public void testResponce() {
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		int code = resp.getStatusCode();
		System.out.println("Statis code is "+code);
		
		Assert.assertEquals(code, 200);
	}
	@Test
	public void testbody() {
		Response resp=RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		String data = resp.asString();
		System.out.println("Data is "+data);
		System.out.println("Responce time "+resp.getTime());
	}

}
