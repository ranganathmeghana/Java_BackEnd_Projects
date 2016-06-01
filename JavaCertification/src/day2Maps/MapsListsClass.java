package day2Maps;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapsListsClass 
{
	
	public static void main(String[] args) throws IOException {
	  
    String[] arr=new String[1024];
    
    Map<String, List<CountryCapital>> map=new HashMap<String, List<CountryCapital>>();
		
	FileInputStream fis=new FileInputStream("/Users/meghana_ranganath/Downloads/countries.txt");
	BufferedReader reader=new BufferedReader(new InputStreamReader(fis));
	String line= reader.readLine();
	
	while(null!=line)
	{
		
	
	}
	
	
	
	}
	
	
	class CountryCapital
	
	{
		String country;
		String capital;
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		
		
		
	}
}
