package Practice_Ser_Deseria;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
class ExampleJson2KtPOJO  {
        String createdBy;
        String projectName;
        int teamSize;
        List<String> teamMember;
        Projectmanger projectmanger;

      
	    public ExampleJson2KtPOJO(String createdBy, String projectName, int teamSize, List<String> teamMember,
				Projectmanger projectmanger) {
			super();
			this.createdBy = createdBy;
			this.projectName = projectName;
			this.teamSize = teamSize;
			this.teamMember = teamMember;
			this.projectmanger = projectmanger;
		}
		public void setCreatedBy(String createdBy) {
	        this.createdBy = createdBy;
	    }
	    public String getCreatedBy() {
	        return createdBy;
	    }
	    
	    public void setProjectName(String projectName) {
	        this.projectName = projectName;
	    }
	    public String getProjectName() {
	        return projectName;
	    }
	    
	    public void setTeamSize(int teamSize) {
	        this.teamSize = teamSize;
	    }
	    public int getTeamSize() {
	        return teamSize;
	    }
	    
	    public void setTeamMember(List<String> teamMember) {
	        this.teamMember = teamMember;
	    }
	    public List<String> getTeamMember() {
	        return teamMember;
	    }
	    
	    public void setProjectmanger(Projectmanger projectmanger) {
	        this.projectmanger = projectmanger;
	    }
	    public Projectmanger getProjectmanger() {
	        return projectmanger;
	    }
	    
	}






   
class Projectmanger {
   String name;
   String empID;
   
   
   
    public Projectmanger(String name, String empID) {
	super();
	this.name = name;
	this.empID = empID;
}
	public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public void setEmpID(String empID) {
        this.empID = empID;
    }
    public String getEmpID() {
        return empID;
    }
    
}

public class Run3_POJO {
       public static void main(String[] args) throws Throwable, DatabindException, IOException {
    	   ArrayList a1=new ArrayList();
    	   a1.add("john");
    	   a1.add("cena");
    	   Projectmanger pmn=new Projectmanger("Parkas","123");
    	   ExampleJson2KtPOJO projectobj=new ExampleJson2KtPOJO("Noushad","Deepak01",10,a1,pmn);
    	   System.out.println(projectobj.projectName);
    	   
    	   // convert into json
    	   
    	   ObjectMapper objM=new ObjectMapper();
    	   objM.writeValue(new File("./project01.json"), projectobj);
    	   
	}
}
