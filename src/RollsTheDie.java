
public class RollsTheDie {
	public static void main(String[] args) {
		int DieCheck = (int) Math.floor(Math.random()*10)%5+1;
		System.out.println("Number on die after roll\n"  +DieCheck);
	}

}
