
class Hunger extends Attribute {
	private String[] hunger = {"Starving", "Hungry", "Could go for a snack", "Full"};
	/*
	public static void main(String[] args) {
	Hunger h = new Hunger();
	h.setHunger(46);
	System.out.println(h.getHunger());
	h.addHunger(5);
	System.out.println(h.getHunger());

	h.minusHunger(60);
	System.out.println(h.getHunger());
	} // end main
	*/

	public String getHunger() {
		int hLevel = super.getLevel();
		int temp = 0;

		// if the hunger level is in a certain range
		// print out the appropriate response 
		if(hLevel <= 25) {
			temp = 0;
		} else if (hLevel > 25 && hLevel <= 50) {
			temp = 1;
		} else if (hLevel > 50 && hLevel <=75) {
			temp = 2;
		} else if (hLevel > 75 && hLevel <=100) {
			temp = 3;
		} else if(hLevel > 100) {
			temp = 3;
		} // end if
		return this.hunger[temp];
	}// end getHunger
	
	public void addHunger(int level) {
		super.addLevel(level);
	}// end addHunger
	
	public void minusHunger(int level) {
		super.minusLevel(level);
	}// end minusHunger
	
	public void setHunger(int level) {
		super.setLevel(level);
	}// end setHunger
}// end class def
