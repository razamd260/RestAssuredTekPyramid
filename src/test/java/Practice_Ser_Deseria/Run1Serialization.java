package Practice_Ser_Deseria;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Candy  implements Serializable{
	String name;
	int level;
	long score;
	int life;
	public Candy(String name, int level, long score, int life) {
		super();
		this.name = name;
		this.level = level;
		this.score = score;
		this.life = life;
	}
	
	
}

public class Run1Serialization {
 public static void main(String[] args) throws Throwable {
	 Candy user1=new Candy("Madhuri DII",10,59588,2);
	 FileOutputStream fileout=new FileOutputStream("./madhri.txt");
	 
	 ObjectOutputStream objout=new ObjectOutputStream(fileout);
	 objout.writeObject(user1);
	 System.out.println("==========end========");
	 
}
}
