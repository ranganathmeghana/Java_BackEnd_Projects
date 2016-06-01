package com.infy;

public class TextEditor {

	private SpellChecker spellChecker;
	private  SpellChecker2 spellChecker23;
	   private String name;

	   public void setSpellChecker( SpellChecker spellChecker ){
	      this.spellChecker = spellChecker;
	   }
	   public SpellChecker getSpellChecker() {
	      return spellChecker;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }

	   public SpellChecker2 getSpellChecker23() {
		return spellChecker23;
	}
	public void setSpellChecker23(SpellChecker2 spellChecker23) {
		this.spellChecker23 = spellChecker23;
	}
	public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	public void spellCheck23() {
	      spellChecker23.checkSpelling2();
	   }
	
	
}
