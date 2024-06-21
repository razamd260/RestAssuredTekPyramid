package pac;

import org.testng.annotations.Test;

import static com.backend.testing.A_forMethodChaining.*;

public class Run1_forMethodChaining {
      
	@SuppressWarnings("static-access")
	@Test
	public void sampleTest() {
		//A_forMethodChaining a1=new A_forMethodChaining();   i commit after third Approch
		/*a1.a();   first Approch
		a1.b();
		a1.c();*/
		
	//	a1.a().b().c();    second Approch
		
   //		a1.a().b().c().d();  Third Approch
	
		
		a().b().c().d();  // i am not getting error  
	}
}
