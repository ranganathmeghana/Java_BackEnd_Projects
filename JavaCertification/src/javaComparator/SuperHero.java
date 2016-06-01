package javaComparator;

import java.util.Comparator;

public class SuperHero implements Comparable<SuperHero>
{
	
	String name;
	int strength;
	int powerCount;
	long wowFactor;
	
	public SuperHero(String name, int strength, int powerCount, long wowFactor) {
	    super();
	    this.name = name;
	    this.strength = strength;
	    this.powerCount = powerCount;
	    this.wowFactor = wowFactor;
    }

	public String getName() {
		return name;
	}

	

	public long getStrength() {
		return strength;
	}

	

	public int getPowerCount() {
		return powerCount;
	}

	
	public long getWowFactor() {
		return wowFactor;
	}

	
	public int compareTo(SuperHero o) {
	    // TODO Auto-generated method stub
	int compare= this.getName().compareTo(o.getName());
    return compare;
}
	
       public String toString() {
	    // TODO Auto-generated method stub
	    return String.format(name + "," + strength  + "," + powerCount + "," + wowFactor);
	}
	
}



 class StrengthComparator implements Comparator<SuperHero>{

	public int compare(SuperHero o2, SuperHero o1) {
	    // TODO Auto-generated method stub
		if(o1.getStrength() > o2.getStrength()){
			return 1;}
		else if(o1.getStrength() < o2.getStrength())
		{	return -1;
			}
		else{
	return 0;
	}
    }
	 
 }
 
 
 class PowerCountSuperhero implements Comparator<SuperHero>{

	public int compare(SuperHero o2, SuperHero o1) {
	    // TODO Auto-generated method stub
		
		if(o1.getPowerCount()>o2.getPowerCount())
		{		return 1; }
		else if(o1.getPowerCount()<o2.getPowerCount())
		{	return -1; }
		
		else
		{ return 0;}
    }
 }
class Wowfactor implements Comparator<SuperHero>{

	public int compare(SuperHero o2, SuperHero o1) {
	    // TODO Auto-generated method stub
	    if(o1.getWowFactor()>o1.getWowFactor())
	    {	return 1;}
	    else if(o1.getWowFactor()<o2.getWowFactor())
	    {	return -1;}
	    else
		{return 0;}
    }
	

}
	 
 