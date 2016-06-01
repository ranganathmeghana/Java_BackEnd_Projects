
public class OverrideEquals {

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
	
	
	public boolean equals(Object obj)
	{
		OverrideEquals overrideEquals=(OverrideEquals)obj;
	    if(this.empId==overrideEquals.getEmpId()){
	    	return true;
	    }
	    
	    return false;
	}		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverrideEquals object=new OverrideEquals();
		object.setEmpId(665808);
		object.setEmpName("meghana");
		object.setIbu("Tech");
		object.setJobLevel(3);
		object.setProjectCode("MADMTRG");
        System.out.println(object);		
        
        OverrideEquals object1=new OverrideEquals();
		object1.setEmpId(665808);
		object1.setEmpName("sindhura");
		object1.setIbu("apple");
		object1.setJobLevel(3);
		object1.setProjectCode("MADMTRG");
        System.out.println(object);		
        System.out.println(object.equals(object1));
        
	}

}
