
class Thirst extends Attribute {
	private String[] thirst = {"Dehydrated", "Parched", "Thisrty", "Quenched"};



	public String getThirst() {
		int tLevel = super.getLevel();
		int temp = 0;

		// if the hunger level is in a certain range
		// print out the appropriate response 
		if(tLevel <= 25) {
			temp = 0;
		} else if (tLevel > 25 && tLevel <= 50) {
			temp = 1;
		} else if (tLevel > 50 && tLevel <=75) {
			temp = 2;
		} else if (tLevel > 75 && tLevel <=100) {
			temp = 3;
		} else if (tLevel > 100) {
			temp = 3;
		} // end if
		return this.thirst[temp];
	}// end getThirst
	
	public void addThirst(int level) {
		super.addLevel(level);
	}// end addThirst
	
	public void minusThirst(int level) {
		super.minusLevel(level);
	}// end minusThirst
	
	public void setThirst(int level) {
		super.setLevel(level);
	}// end setThirst


}// end class def
