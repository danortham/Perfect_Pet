import java.io.*;

class Griffin extends Pet implements Serializable {
	private int flock = 1;
	/*	
	public static void main(String[] args){
		Griffin g = new Griffin();
		
		g.addFlock();
		System.out.println(g.getFlock());
		g.eat();
		g.status();
		g.fly();
	}
	*/
	public Griffin() {
		name = "Griffen";
	}// end constructor
	public Griffin(String name, int flock, int hunger, int thirst, int happiness){
		this.name = name;
		this.flock = flock;
		this.h.addHunger(hunger);
		this.t.addThirst(thirst);
		this.ha.addHappiness(happiness);
	}// end constructor
	public int getFlock() {
		return this.flock;
	}// end getFlock

	public void addFlock() {
		this.flock = this.flock + 1;
	}// end addFlock
	
	public void fly() {
		super.play();
		ha.addHappiness(26);
	}// end fly
	@Override
	//override status() to include flock	
	public void status(){
		super.status();
		System.out.println("there is " + getFlock() + " Griffin(s) in " + name + "'s flock.");
	}// end override status
}// end class def
