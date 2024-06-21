package Practice_Ser_Deseria;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Run1_DeserforJson_JavaObject {
    
	   public static void main(String[] args) throws Throwable {
		ObjectMapper objM=new ObjectMapper();
		Project pobj=objM.readValue(new File("./project.json"), Project.class);  //Json to object java
		System.out.println(pobj.getProjectName());
		System.out.println(pobj.getCreateBy());
		System.out.println(pobj.getStatus());
		System.out.println(pobj.getTeamsize());
	}
}
