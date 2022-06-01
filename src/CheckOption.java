
public class CheckOption {
	
			int No_Play=1;
			int Ladder=2;
			int Snake=3;
			
			
		public static void main(String[] args) {
			
			int DieCheck = (int) Math.floor(Math.random()*100)%5+1;
			System.out.println("number on die after roll.."  +DieCheck);
			
			System.out.println("Checking For Option");
			
			int PlayCheck = (int) Math.floor(Math.random()*100)%3;
			//System.out.println(+PlayCheck);
			
			switch (PlayCheck) {
			
			case 1: System.out.println("Ladder");
			System.out.println("Go_ahead_by"+DieCheck);
			
			break;
			
			case 2:System.out.println("Snake");
			System.out.println("Go_behind_by"+"=>" +DieCheck);
			
			break;
			
			default :System.out.println("No_Play");
			
			}
			
		}
		}
		





