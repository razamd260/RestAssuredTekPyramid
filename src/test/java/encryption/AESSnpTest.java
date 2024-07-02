package encryption;

import org.testng.annotations.Test;

public class AESSnpTest {
   
	 @Test
	 public void sampleTest() throws Throwable {
		 String privateKey="AcO3tEam@j!tu_#1";
		 String data="Noushad";
		 
		 EncrypAndDecryptUtility ed=new EncrypAndDecryptUtility();
		 System.out.println(" Encryption Data => "+ed.encrypt(data, privateKey));
		 String value = ed.encrypt(data, privateKey);
		 
		 System.out.println(" Decryption Data => "+ed.decrypt(value, privateKey));
		 
	 }
}
