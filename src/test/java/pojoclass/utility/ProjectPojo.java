package pojoclass.utility;

public class ProjectPojo {

	  private String ProjectName;
	  private String status;
	  private String craetedBy;
	  private int teamsize;
	public ProjectPojo(String projectName, String status, String craetedBy, int teamsize) {
		super();
		ProjectName = projectName;
		this.status = status;
		this.craetedBy = craetedBy;
		this.teamsize = teamsize;
	}
	
	public ProjectPojo() {}  
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
	public String getCraetedBy() {
		return craetedBy;
	}
	public void setCraetedBy(String craetedBy) {
		this.craetedBy = craetedBy;
	}
	public int getTeamsize() {
		return teamsize;
	}
	public void setTeamsize(int teamsize) {
		this.teamsize = teamsize;
	}
	  
}
