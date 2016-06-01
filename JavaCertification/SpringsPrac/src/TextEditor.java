import com.infy.SpellChecker2;


public class TextEditor {

	private SpellChecker spellChecker;
	private SpellChecker2 spellChecker2;
	   public SpellChecker2 getSpellChecker2() {
		return spellChecker2;
	}
	public void setSpellChecker2(SpellChecker2 spellChecker2) {
		this.spellChecker2 = spellChecker2;
	}

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

	   public void spellCheck() {
	      spellChecker.checkSpelling();
	   }
	   public void spellCheck2() {
		      spellChecker2.checkSpelling2();
		   }
		
}
