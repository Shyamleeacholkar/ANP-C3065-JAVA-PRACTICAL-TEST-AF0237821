package question2;

public class GameMenu {
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
		
		GameMenu obj1=new GameMenu();
		int menuChoice=3;
		
		switch(menuChoice) {
		case 1:
			obj1.startGame();
			break;
		case 2:
			obj1.displayGameInstruction();
			break;
		case 3:
			obj1.exitGame();
			break;
			default :
			System.out.println("Unknown input!!!");
				}	
	}
	}