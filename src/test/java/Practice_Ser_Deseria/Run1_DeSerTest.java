package Practice_Ser_Deseria;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Run1_DeSerTest {
   
	public static void main(String[] args) throws Throwable, IOException {
		FileInputStream fileinput=new FileInputStream("./f.txt");
		
		ObjectInputStream objin=new ObjectInputStream(fileinput);
		
		Candy user1=(Candy) objin.readObject();
		
		System.out.println(user1.name);
		System.out.println(user1.level);
		System.out.println(user1.life);
		System.out.println(user1.score);
	}
}
