
public class StaticModifierClass {

	private static int counter;
	private int empId;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	private String empName;

	private String ibu;

	private String projectCode;

	private int jobLevel;

	static{
	counter=4000;
	}
	
	public StaticModifierClass()
	{
		this.empId=++counter;
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticModifierClass[] staticModifierClass=new StaticModifierClass[3];
		staticModifierClass[0]=new StaticModifierClass();
		staticModifierClass[0].setEmpName("meghana");
		staticModifierClass[0].setIbu("tech");
		staticModifierClass[0].setJobLevel(3);
		staticModifierClass[0].setProjectCode("madmtrng");

		staticModifierClass[1]=new StaticModifierClass();
		staticModifierClass[1].setEmpName("sindhura");
		staticModifierClass[1].setIbu("tech");
		staticModifierClass[1].setJobLevel(3);
		staticModifierClass[1].setProjectCode("madmtrng");

		staticModifierClass[2]=new StaticModifierClass();
		staticModifierClass[2].setEmpName("akhila");
		staticModifierClass[2].setIbu("tech");
		staticModifierClass[2].setJobLevel(3);
		staticModifierClass[2].setProjectCode("madmtrng");

		
		
for(StaticModifierClass i:staticModifierClass){
	
	System.out.println(i.getEmpId());
	System.out.println(i.getEmpName());
	System.out.println(i.getIbu());
	System.out.println(i.getJobLevel());
	System.out.println(i.getProjectCode());
	
}

System.out.println(counter);
	}

}
