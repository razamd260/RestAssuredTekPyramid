package PancardMock;

import org.mockito.Mockito;

class PANCard1{
	
	public  String isvalide(String panCard) {
		if(panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]")==true) {
			return "it's Valid pan";
		}else {
			return "it's not valid panCard";
		}
		
	}
	
	@SuppressWarnings("static-access")
	public static PANCard1 getMockObject() {
		PANCard1 mocObj=Mockito.mock(PANCard1.class);
		                Mockito.when(mocObj.isvalide("CQDPA0659A")).thenReturn("Valid panCard");
		                Mockito.when(mocObj.isvalide("CQDPA0659J")).thenReturn("Valid panCard");
		                Mockito.when(mocObj.isvalide("CQDPA06592")).thenReturn("its InValid panCard");
		                Mockito.when(mocObj.isvalide("CQDPA0659C")).thenReturn("Valid panCard");
		return mocObj; 
	}
}
public class MockingTest2 {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		PANCard1 obj = PANCard1.getMockObject();
		//obj.isvalide("CQDPA0659J");   here I was getting error check please
		
		System.out.println(obj.isvalide("CQDPA0659W"));
	}
}
