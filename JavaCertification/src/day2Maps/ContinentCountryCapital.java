package day2Maps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javafx.scene.shape.Path;

import javax.imageio.stream.FileImageInputStream;

import org.apache.commons.collections.map.MultiValueMap;

public class ContinentCountryCapital 
{
	public static void main(String[] args) throws IOException {

		byte[] desti=new byte[1024];
		char c;
		
		

		

		//		File file=new File("/Users/meghana_ranganath/Downloads/countries.txt");
		//		FileInputStream fin=new FileInputStream(file);
		//		FileChannel ch=fin.getChannel();
		//		long fileSize= ch.size();
		//		ByteBuffer buffer=ByteBuffer.allocate(1024);
		//		int r= ch.read(buffer);
		//		while(r!=-1){
		//			while(buffer.hasRemaining()){
		//			c=	(char)buffer.get();
		//					System.out.println(c);
		//					System.out.println("u suck");
		//			}
		//		}
		//		ch.close();
		//		fin.close();

		Scanner scanner=new Scanner(new InputStreamReader(System.in));
		String input= scanner.nextLine();
		
		
		
		StringBuilder bul=new StringBuilder();
		String[] conti= new String[1024];
		
		
		File file1=new File("/Users/meghana_ranganath/Downloads/countries.txt");
		FileInputStream fin1=new FileInputStream(file1);
	
		BufferedReader buff=new BufferedReader(new InputStreamReader(fin1));
		
		String r1=buff.readLine();
		bul.append(r1);
		
		while(r1!=null){
			
			
			bul.append(",");
			r1=buff.readLine();
			bul.append(r1);

			
		}
		
		conti=bul.toString().split(",");
		 for(int i=0;i<conti.length;i++)
	    {
		    if(conti[i].equalsIgnoreCase(input))
		    {
	    	System.out.println(conti[i]);
		    System.out.println(conti[i+1]);
		    System.out.println(conti[i+2]);
		   
		    }
	  
		    
		    
		    
	    }
	
		
//		if(r1!=-1){
//			for(byte b: desti){
//				bul.append((char)b);
//
//			}
//
//			System.out.println(bul);
//			
//			
//			conti= bul.toString().
//			
//			for(String s: conti)
//			{
//			//	System.out.println(s);
//			}
//		}
       
//     List list=Arrays.asList(conti);
//     int index=list.indexOf(input);
//    System.out.println(input);
//    System.out.println(conti[index+1]);
//    System.out.println(conti[index+2]);
//    
    
//    for(int i=0;i<conti.length;i++)
//    {
//    if(conti[i].equalsIgnoreCase("Asia"))
//    	System.out.println(conti[i]);
//    System.out.println(conti[i+1]);
//    System.out.println(conti[i+2]);
//    break;
//    }
    
	}
}



//private Map<String, String> country=new HashMap<String, String>();
//
//
//
//public void generateMap(String input){
//
//	
//	
//country.put("US", "Washington");
//country.put("Canada", "Ottawa");
//country.put("Argentina","Buenos Aires");
//country.put("Brazil","Rio De Janiero");
//country.put("France","Paris");
//country.put("Germany","Brazil");
//country.put("South Africa","Port Blair");
//country.put("Kenya","Nairobi");
//country.put("India","New Delhi");
//country.put("China","Beijing");
//
//
////Map<String, Object> continent=new HashMap<String, Object>();
////continent.put("Asia",country.get("India"));
////continent.put("Asia",country.get("China"));
////continent.put("North America",country.get("US"));
////continent.put("North America",country.get("Canada"));
////continent.put("South America",country.get("Argentina"));
////continent.put("South America",country.get("Brazil"));
////continent.put("Europe",country.get("France"));
////continent.put("Europe",country.get("Germany"));
////continent.put("Africa",country.get("Kenya"));
////continent.put("Africa",country.get("South Africa"));
//
//
//List<String> l1=new ArrayList<String>();
//
//
//
//Map<String, List<String>> obj=new HashMap<String, List<String>>();
//
//
//MultiValueMap continent=new MultiValueMap();
//continent.put("Asia",country.get("India"));
//continent.put("Asia",country.get("China"));
//continent.put("North America",country.get("US"));
//continent.put("North America",country.get("Canada"));
//continent.put("South America",country.get("Argentina"));
//continent.put("South America",country.get("Brazil"));
//continent.put("Europe",country.get("France"));
//continent.put("Europe",country.get("Germany"));
//continent.put("Africa",country.get("Kenya"));
//continent.put("Africa",country.get("South Africa"));
//
////Iterator entries = continent.entrySet().iterator();
////if(entries.hasNext()){
////	
////}
//
//
//for (Object entry : continent.entrySet()){
//	if(entry.getKey())
//}
//
//}
//
//
//
//public static void main(String[] args) {
//    
//Scanner scanner=new Scanner(new InputStreamReader(System.in));
//String input= scanner.nextLine();
//ContinentCountryCapital obj=new ContinentCountryCapital();
//obj.generateMap(input);
//
//	
//}


//buffer.get(desti);
//System.out.println(desti);
//	
//Map<String, List<String>> obj=new HashMap<String, List<String>>();
//	


//}

//public void generateCountryList(String input) throws IOException
//{