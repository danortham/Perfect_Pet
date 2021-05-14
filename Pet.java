import java.io.*;

public abstract class Pet{
	Hunger h = new Hunger();
	Thirst t = new Thirst();
	Happiness ha = new Happiness();
	String name;


	public String getName() {
		return this.name;
	}// end getName
	
	public void setName(String name) {
		this.name = name;
	}// end setName
	
	public void eat() {
		// increase hunger value after eating
		h.addHunger(26);
		// decrease thirst value after eating
		t.minusThirst(15);
	} // end eat

	public void drink() {
		// increase thirst value after drinking
		t.addThirst(26);
	}// end drink

	public void play() {
		// increase happiness but decrease hunger and thirst
		ha.addHappiness(26);
		h.minusHunger(30);
		t.minusThirst(30);
	}// end play
	
	public void status() {
		// prints out the status on all of the pet's attributes
		System.out.println("Your pet is \n");
		System.out.println(h.getHunger());
		System.out.println(t.getThirst());
		System.out.println(ha.getHappiness());
	}// end status

}// end class def
