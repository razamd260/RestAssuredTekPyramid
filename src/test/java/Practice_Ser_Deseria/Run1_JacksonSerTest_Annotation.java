package Practice_Ser_Deseria;
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
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
	private String ProjectName;
	@JsonProperty(value="Create By")
	private String CreateBy;
	private int teamsize;
	private String status;
	
	public Project1() { }
	public Project1(String projectName, String createBy, int teamsize, String status) {
		super();
		ProjectName = projectName;
		CreateBy = createBy;
		this.teamsize = teamsize;
		this.status = status;
	}
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getCreateBy() {
		return CreateBy;
	}
	public void setCreateBy(String createBy) {
		CreateBy = createBy;
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
		Project pobj=new Project("Orange","Noushad",10,"Create");  // Java Object
		ObjectMapper objmapper=new ObjectMapper();
		objmapper.writeValue(new File("./project.json"), pobj);// serialization is done   
		System.out.println("=======End=========");
		
		
		
		
		
	}
	  
}
