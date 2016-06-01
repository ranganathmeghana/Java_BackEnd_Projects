
public class ClassesAndObjects {

	private int empId;
	
	private String empName;
	
	private String ibu;
	
	private String projectCode;
	
	private int jobLevel;
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getIbu() {
		return ibu;
	}

	public void setIbu(String ibu) {
		this.ibu = ibu;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public int getJobLevel() {
		return jobLevel;
	}

	public void setJobLevel(int jobLevel) {
		this.jobLevel = jobLevel;
	}
	
	
	public String toString()
	{
		return +getEmpId()+""+getEmpName()+""+getIbu()+""+getJobLevel()+""+getProjectCode();
		//return "HI I'M MEGHANA";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassesAndObjects classesAndObjects=new ClassesAndObjects();
		classesAndObjects.setEmpId(665808);
		classesAndObjects.setEmpName("meghana");
		classesAndObjects.setIbu("Tech");
		classesAndObjects.setJobLevel(3);
		classesAndObjects.setProjectCode("MADMTRG");
        System.out.println(classesAndObjects);		
	}

}
