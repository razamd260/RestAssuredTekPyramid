package pojoclass.utility;

public class ProjectPojo {
	 
	  String ProjectName;
	   String status;
	   String createdBy; 
	  int teamsize;
	  
	  
	  
	  
	  public ProjectPojo(String projectName, String status, String createdBy, int teamsize) {
		super();
		ProjectName = projectName;
		this.status = status;
		this.createdBy = createdBy;
		this.teamsize = teamsize;
	}

	public ProjectPojo() {
		// TODO Auto-generated constructor stub
	}
	  
	public String getProjectName() {
		return ProjectName;
	}
	public void setProjectName(String projectName) {
		ProjectName = projectName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String craetedBy) {
		this.createdBy = craetedBy;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	
	
		  
}
