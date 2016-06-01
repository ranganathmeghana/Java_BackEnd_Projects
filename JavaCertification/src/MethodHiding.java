
public class MethodHiding {

	public static void display(){
		
		System.out.println("parent display");
	}
	
}

class MethodHidingChild extends MethodHiding{
	
public static void display(){
		System.out.println("child display");
	}
	
	
}
class Main{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodHidingChild m=new MethodHidingChild();
		m.display();
		

	}

}