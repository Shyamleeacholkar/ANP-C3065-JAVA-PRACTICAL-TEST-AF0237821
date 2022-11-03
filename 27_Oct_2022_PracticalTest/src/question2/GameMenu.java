package question2;
import java.util.Scanner ;
public class GameMenu {
	//declare the methods as per q.
	void startGame() {
		System.out.println("	Start the Game	");
	}
	void displayGameInstruction() {
		System.out.println("	Display game instruction	");
	}
	void exitGame() {
		System.out.println("	Exit the Game	");
	}
	public static void main(String[] args) {
	
		System.out.println("1.Start the Game");
		System.out.println("2.Dispay game instruction");
		System.out.println("3.Exit the Game");
		while(true) {
		Scanner sc = new Scanner(System.in);
		GameMenu obj1=new GameMenu();			//	create object to call
		int menuChoice=sc.nextInt();
		
		switch(menuChoice) {
		case 1:
			obj1.startGame(); 						// call method through the object 
			break;
		case 2:
			obj1.displayGameInstruction();			// call method through the object 
			break;
		case 3:
			obj1.exitGame();						// call method through the object 
			break;
			default :
			System.out.println("Unknown input!!!");
		}
			}	
	}
	}