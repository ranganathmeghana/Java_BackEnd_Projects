import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class CollectionsClass
{
	public static void main(String[] args) {
	    
		List l=new ArrayList();
		l.add("Meghana");
		l.add("Lalit");
		l.add("Ajay");
		l.add(199);
		l.add(1009.87);
		
		Comparing comparing=new Comparing();
	l.sort(comparing);
	System.out.println(l);
    
	
	}

}

class Comparing implements Comparator<Object>
{

	@Override
    public int compare(Object o1, Object o2) {
		
		if(o1.hashCode()>o2.hashCode())  
		{
			return 1;
		}
		
		else if(o1.hashCode()>o2.hashCode()){
			return -1;
		}
		
		else
		{
			return 0;
		}
		
//	    // TODO Auto-generated method stub
//	    return 0;
    }
	
}


