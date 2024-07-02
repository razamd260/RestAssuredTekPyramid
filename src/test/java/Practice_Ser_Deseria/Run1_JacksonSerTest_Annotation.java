package Practice_Ser_Deseria;
import java.io.File;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.ObjectMapper;


@JsonPropertyOrder(
	value = {
			"CreateBy",
			"ProjectName",
			"teamsize",
			"status"
	}
)

@JsonIgnoreProperties(
		
		value= {
				"teamsize"
		},allowSetters=true
)


class Project1{
	String ProjectName;
	@JsonProperty(value="Create By")
	String CreateBy;
	int teamsize;
	String status;
	
	private Project1() { }

	public Project1(String ProjectName, String CreateBy, int teamsize, String status) {
		super();
		this.ProjectName = ProjectName;
		this.CreateBy = CreateBy;
		this.teamsize = teamsize;
		this.status = status;
	}

	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String ProjectName) {
		this.ProjectName = ProjectName;
	}
	public String getCreateBy() {
		return CreateBy;
	}
	public void setCreateBy(String CreateBy) {
		this.CreateBy = CreateBy;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}




public class Run1_JacksonSerTest_Annotation {
	public static void main(String[] args) throws Throwable {
		Project1 pobj=new Project1("Orange","Noushad",10,"AtWork");  // Java Object
		ObjectMapper objmapper=new ObjectMapper();
		objmapper.writeValue(new File("./project03.json"), pobj);// serialization is done   
		System.out.println("=======End=========");
		
		
		
		
		
	}
	  
}
