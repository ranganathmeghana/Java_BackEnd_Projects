
public class VariableArguements {
	
private static int counter;	
private int studentId;
private String studentName;
private int studentAge;
private double avgMarks;

static{
	counter=1000;
}

public VariableArguements() {
	// TODO Auto-generated constructor stub
	studentId=++counter;
}

static double getAvgMarks(double[] marks){

	double sum=0.0;
	if(marks.length!=0)
	{
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
		
	}
	
	return sum/(marks.length);

}

	public static void main(String[] args) {

		VariableArguements obj=new VariableArguements();
		double[] marks={70.0,90.0,80.0,60.0};
		System.out.println(VariableArguements.getAvgMarks(marks));
		
	}

}
