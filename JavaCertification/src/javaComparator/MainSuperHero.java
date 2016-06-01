package javaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSuperHero {
	
   public static void main(String[] args) { 
	
	SuperHero s1=new SuperHero("Batman", 20, 2, 10001);
	SuperHero s2=new SuperHero("Superman", 100, 20, 10000);
	SuperHero s3=new SuperHero("Wonderman", 80, 10, 9000);
	SuperHero s4=new SuperHero("GreenLatern", 70, 5, 8000);
	SuperHero s5=new SuperHero("Flash", 40, 1, 6000);
	
	List<SuperHero> l=new ArrayList<SuperHero>();
	l.add(s1);
	l.add(s2);
	l.add(s3);
	l.add(s4);
	l.add(s5);
	
	Collections.sort(l, new StrengthComparator());
    for(SuperHero s: l){
    	System.out.println(s);
    }
    
    System.out.println("............................");
    
    Collections.sort(l, new PowerCountSuperhero());
    for(SuperHero s: l){
    	System.out.println(s);
    }
    
    System.out.println("............................");
//    
//    Collections.sort(l, new Wowfactor());
//    for(SuperHero s: l){
//    	System.out.println(s);
//    }
    
    
    Collections.sort(l, new Comparator<SuperHero>() 
    		{

    	public int compare(SuperHero o1, SuperHero o2) {
    		// TODO Auto-generated method stub
    		if(o1.getWowFactor()>o1.getWowFactor())
    		{	return 1;}
    		else if(o1.getWowFactor()<o2.getWowFactor())
    		{	return -1;}
    		else


    		{return 0;
    		}                }
    });
    
    System.out.println(l);
    
    System.out.println(".............................");
   
    Collections.sort(l);
    System.out.println(l);

    System.out.println("............................");
    
    Collections.sort(l);
    for(SuperHero s: l){
    	System.out.println(s);
    }
    
	}
}
