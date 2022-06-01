
public class ReachAtWin {
	
			int No_Play=1;
			int Ladder=2;
			int Snake=3;
			
			
		public static void main(String[] args) {
			int Position_Of_PLayer=0;
			int DieCheck = (int) Math.floor(Math.random()*100)%5+1;
			System.out.println("number on die after roll.."  +DieCheck);
			
		while(Position_Of_PLayer>=0 && Position_Of_PLayer<100 ) {
			
			Position_Of_PLayer++;
			int val1 = 0;
			int val2 = 0;
			int PlayCheck = (int) Math.floor(Math.random()*100)%3;
			//System.out.println(+PlayCheck);
			
			switch (PlayCheck) {
			
			case 1: System.out.println("Ladder");
			System.out.println("Go_ahead_by"+DieCheck);
			
			val1=DieCheck;
			break;
			
			case 2:System.out.println("Snake");
			System.out.println("Go_behind_by"+"=>" +DieCheck);
			val1= -DieCheck;
			break;
			
			default :System.out.println("No_Play");
			
			}
			Position_Of_PLayer=Position_Of_PLayer + (val1 -val2 - 1) ;
			
			if (Position_Of_PLayer<0) 
				Position_Of_PLayer= Position_Of_PLayer*0;
			
			System.out.println("Position Of Player..=>"+Position_Of_PLayer);
		}
		}
		}

