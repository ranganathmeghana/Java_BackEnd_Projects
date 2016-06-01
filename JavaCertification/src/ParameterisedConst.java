
public class ParameterisedConst {
	private int EmpId;
	private static int counter;
	private String EmpName;
	private String Ibu;
	private String ProjectCode;
	private int JobLevel;
	
	static
	{
		counter=1000;
	}
	
	public ParameterisedConst()
	{
	this.EmpId=++counter;
		
	}
	
	public ParameterisedConst(String empname,int joblevel)
	{
		this.EmpName=empname;
		this.JobLevel=joblevel;
		this.Ibu="BENCH";
		this.ProjectCode="BENCH_PUNE2";
				
	}
	

	public ParameterisedConst(String empname,String ibu,int joblevel)
	{
		this.EmpName=empname;
		this.JobLevel=joblevel;
		this.Ibu=ibu;
		this.ProjectCode="BENCH_"+ibu+"PUNE2";
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterisedConst obj=new ParameterisedConst();
		
	
	}

}
