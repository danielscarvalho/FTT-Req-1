import java.net.*;
import java.io.*;

public class ReqApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://github.com/toddmotto/public-apis
				
		try {
		
			URL url = new URL("https://api.duckduckgo.com/?format=json&q=Sonia+Braga");
			
			URLConnection urlConn = url.openConnection();
			
			BufferedReader bfReader = new BufferedReader(
					new InputStreamReader(
							urlConn.getInputStream()
							));
			
			//String text;

     		System.out.println(bfReader.readLine());
			
			bfReader.close();
			
		} catch (Exception e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
