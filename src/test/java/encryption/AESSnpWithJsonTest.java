package encryption;

import org.testng.annotations.Test;

public class AESSnpWithJsonTest {
   
	 @Test
	 public void sampleTest() throws Throwable {
		 String privateKey="AcO3tEam@j!tu_#1";
		 String data="{\r\n"
		 		+ "			 \"name\" : \"Noushad\",\r\n"
		 		+ "			 \"Job\"  : \"QA\"\r\n"
		 		+ " 		 }";
		 
		 
		 
		 
		 EncrypAndDecryptUtility ed=new EncrypAndDecryptUtility();
		 System.out.println(" Encryption Data => "+ed.encrypt(data, privateKey));
		 String value = ed.encrypt(data, privateKey);
		 
		 System.out.println(" Decryption Data => "+ed.decrypt(value, privateKey));
		 
	 }
}
