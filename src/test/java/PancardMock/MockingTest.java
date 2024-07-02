package PancardMock;



class PANCard{
	
	public static String isvalide(String panCard) {
		if(panCard.matches("[A-Z]{5}[0-9]{4}[A-Z]")==true) {
			return "it's Valid pan";
		}else {
			return "it's not valid panCard";
		}
		
	}
}
public class MockingTest {
	public static void main(String[] args) {
		System.out.println(PANCard.isvalide("ABCDE1234A"));
	}
}
