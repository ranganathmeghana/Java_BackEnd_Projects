import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class a
{
	
}
public class CollectionsAndGenerics 
{

	public static void main(String[] args)
	{
		List<Integer> lInt=new ArrayList<Integer>();
		lInt.add(32);
		lInt.add(78);
		Integer a=34;
		Object o=(Object)new a();
		//List<Integer> lIntNum=new ArrayList<Number>();
		//List<T> lew=new ArrayList<Integer>();
		List<? extends Object> lNumInt=new ArrayList();
		//lNumInt.add(a);
		List<? super Integer> listSuperInteger_ListNumber  = new ArrayList<Number>();
		listSuperInteger_ListNumber.add(56);
		//List<Integer> bb=new ArrayList<Number>();
			
		}
	}







