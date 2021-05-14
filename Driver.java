import java.util.*;
import java.io.*;

class Driver {
	Griffin g = new Griffin("Griffen", 0, 0, 0, 0);


	public static void main(String[] args) {
	Driver d = new Driver();
	//d.loadPet();
	d.menu();
	//d.loadPet();
	} // end main

	public void savePet(Griffin var){
		//Griffin g = new Griffin("Griffen", 0);
		Griffin g = this.g;
		try{
			FileOutputStream fo = new FileOutputStream("SerialPet.txt");
			ObjectOutputStream obOut = new ObjectOutputStream(fo);
			obOut.writeObject(this.g);

		} catch (Exception e){
			System.out.println(e.getMessage());
		} // end try

	} // end savePet

	public void loadPet(){
		Griffin g;
		try {
			FileInputStream fIn = new FileInputStream("SerialPet.txt");
			ObjectInputStream obIn = new ObjectInputStream(fIn);
			this.g = (Griffin)obIn.readObject();
			System.out.println(this.g.name);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}// end try

	} // end loadPet
	
	public  void menu() {
		boolean keepGoing = true;
		loadPet();	
		while(keepGoing) {
			int selection = selection();
			if(selection == 1) {
				this.g.eat();
				System.out.println("You fed your pet a chunk of meat!");
			} else if(selection == 2) {
				this.g.drink();
				System.out.println("Your pet drank a gallon of water in one swig!");
			} else if(selection == 3) { 
				this.g.play();
				System.out.println("You played hide and seek with your pet");
			} else if(selection == 4) {
				this.g.fly();
				System.out.println("Your pet flew you around the land!");
			} else if(selection == 5) {
				this.g.addFlock();
				System.out.println("A new member has been added to the flock");
			} else if(selection == 6) {
				this.g.status();
			} else if(selection == 7) {
				System.out.println("Your pet will miss you!");
				savePet(this.g);	
				keepGoing = false;	
			} else {
				System.out.println("Error, please enter a correct option");
			} // end if
		} // end while

	}// end menu

	public int selection() {
		int selection = 0;
		Scanner input = new Scanner(System.in);
		// put up the options for the user
		System.out.println("\nWhat would you like to do? \n" + "1) Feed pet\n" 
				 + "2) Give pet water\n" + "3) Play with pet\n"
				 + "4) Fly with pet\n" + "5) Add pet to flock \n"
				 + "6) Get pet status \n" + "7) Exit \n");
		selection = input.nextInt();
		return selection;
	}// end selection	

}
