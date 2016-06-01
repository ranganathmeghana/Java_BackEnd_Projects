
public class DemoClass {
	
	String name;
	int rollnum;
	Object address;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollnum() {
		return rollnum;
	}

	public void setRollnum(int rollnum) {
		this.rollnum = rollnum;
	}

	public Object getAddress() {
		return address;
	}

	public void setAddress(Object address) {
		this.address = address;
	}

	@Override
	public String toString() {
	    // TODO Auto-generated method stub
		
//		System.out.println(this);
	//    return super.toString();
		
		return (""+this.getName()+""+this.getRollnum());
	}
	
	public static void main(String[] args) {
	    
			DemoClass d=new DemoClass();
			d.setName("meghana");
			d.setRollnum(1992);
		System.out.print(d);
    }

}


