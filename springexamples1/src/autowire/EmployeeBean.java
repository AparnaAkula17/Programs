package autowire;

public class EmployeeBean 
{
	private String fullName;
	private String departmentBean;
	public EmployeeBean(String departmentBean) {
		super();
		
		this.departmentBean = departmentBean;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDepartmentBean() {
		return departmentBean;
	}
	public void setDepartmentBean(String departmentBean) {
		this.departmentBean = departmentBean;
	}
	
}
