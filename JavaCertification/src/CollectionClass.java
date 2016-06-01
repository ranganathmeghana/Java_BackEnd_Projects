import java.util.HashMap;
import java.util.Map;


public class CollectionClass {
	
	private static int counter;	
	private int studentId;
	private String studentName;
	private int studentAge;
	private double avgMarks;

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		CollectionClass.counter = counter;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public double getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}

	 public static void main(String[] args) {
		 
		  
			// TODO Auto-generated method stub
		 
		 CollectionClass ob=new CollectionClass();
			ob.setAvgMarks(100.0);
			ob.setStudentAge(18);
			//ob.setStudentId(665900);
			ob.setStudentName("meghana");
			HashMapFunctionality obj=new HashMapFunctionality();
			obj.addStudent(ob);
			
			
			CollectionClass ob1=new CollectionClass();
			ob1.setAvgMarks(50.0);
			ob1.setStudentAge(20);
			//ob1.setStudentId(665808);
			ob1.setStudentName("megha");
			obj.addStudent(ob1);
			
			CollectionClass ob2=new CollectionClass();
			ob2.setAvgMarks(80.0);
			ob2.setStudentAge(22);
			//ob2.setStudentId(667998);
			ob2.setStudentName("megh");
			obj.addStudent(ob2);
			
			CollectionClass ob3=new CollectionClass();
			ob3.setAvgMarks(90.0);
			ob3.setStudentAge(24);
			//ob3.setStudentId(200883);
			ob3.setStudentName("ghana");
		
		}
	
}

class HashMapFunctionality{
	 HashMap<Integer,CollectionClass> map=  map=new HashMap<Integer, CollectionClass>();;
	
	 public boolean addStudent(CollectionClass obj){
		if(obj!=null && map.containsKey(obj.getStudentId())==false){
			map.put(obj.getStudentId(), obj);
			return true;
		}
		 return false;
	 }
	 
	 Student serachByRollno(int rollNo)
	 {
		 
	 }
}
