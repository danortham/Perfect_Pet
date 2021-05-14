
class Happiness extends Attribute {
	private String[] happiness = {"Disgruntled", "It's fine, I'm fine everything is fine!", "Happy", "Joyful"};



	public String getHappiness() {
		int haLevel = super.getLevel();
		int temp = 0;

		// if the hunger level is in a certain range
		// print out the appropriate response 
		if(haLevel <= 25) {
			temp = 0;
		} else if (haLevel > 25 && haLevel <= 50) {
			temp = 1;
		} else if (haLevel > 50 && haLevel <=75) {
			temp = 2;
		} else if (haLevel > 75 && haLevel <=100) {
			temp = 3;
		} else if (haLevel > 100) {
			temp = 3;
		} // end if
		return this.happiness[temp];
	}// end getHappiness
	
	public void addHappiness(int level) {
		super.addLevel(level);
	}// end add Happiness
	
	public void minusHappiness(int level) {
		super.minusLevel(level);
	}// end minus Happiness
	
	public void setHappiness(int level) {
		super.setLevel(level);
	}// end set Happiness

}// end class def
