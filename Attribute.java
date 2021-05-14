import java.io.*;
public abstract class Attribute implements Serializable {
	int level = 0;

	public int getLevel() {
		return this.level;
	} // end get level
	
	public void setLevel(int level) {
		this.level = level;
	} // end setLevel
	
	public void addLevel(int addedLevel) {
		this.level += addedLevel;
	} // end addLevel

	public void minusLevel(int minusLevel) {
		this.level -= minusLevel;
	}// end minus
	

}
