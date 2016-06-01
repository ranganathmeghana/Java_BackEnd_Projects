
public class ConstructorOverridding {
	
	

	public ConstructorOverridding() {
	   
		System.out.println("11111111111");
    }

	

}


class ConstructorOverridding1 extends ConstructorOverridding{
	
	public ConstructorOverridding1(){
		System.out.println("2222222222222");
	}
	
}


class ConstructorOverridding2 extends ConstructorOverridding1{
	
//	public ConstructorOverridding2(){
//		
//		System.out.println("3333333333333");
//	}
//	
	public ConstructorOverridding2(int i){
		
		System.out.println("3333333333333");
	}
	
}

class MainConstructorOverridding{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConstructorOverridding2 child2=new ConstructorOverridding2();
	}
}