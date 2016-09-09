import java.util.Scanner;

public class FirstChapter {

	public static void main(String[] args) {

		// Set choice
		String name;

		String choice = "Y";

		// Welcome Messgae
		System.out.println("Welcome to Anansi!");

		// Space
		System.out.println();

		// Create scanner
		Scanner s = new Scanner(System.in);

		// User prompt for name
		System.out.println("What do they call you?");
		name = s.nextLine();
		System.out.println("Your name is " + name + " ");
		

		System.out.println("Would you like to play a game?Y/N");

		String game = s.nextLine();
		// Start the game
		switch (game) {
		case "Y":
			System.out.println(
					"It's the most magical place on earth, and you've had it all there—the drugs, the drama, the unabashed violence, and the harm it's done to you and everyone you've ever loved. This mysterious, exotic city lured you in a long time ago and numbed you with a fix for your every desire. Against this landscape, you've carved out a prosperous career.What have you been doing with your life? Enter assasin, hacker or cult leader");
			String adv = s.nextLine();
			
			// Start Adventure choice
			switch (adv) {
			case "asassin":
				System.out.println("In return, the city has jaded you, stripped you of your humanity, and warped you into an unrecognizable shell of noir-esque dysphoria, washed up on the filthy banks of the city's famous canals. It has brought you to this very moment, waking in the early evening from a haunting dream to find a crinkled brown paper bag clutched in your soiled hand.");
				break;
			case "hacker":
				System.out.println("You are crazy sucessful and made the right choice " + name);
				break;
			case "cult leader":
				System.out.println("You've made a name for yourself in religious circles. You started with just three devoted followers , now the head of your church. Your religion is known as The golden flower and now rival the pope. Today, your church must face a threat greater than any before. Tax season");
				break;
			}
			//End the game
		case "N":
			System.out.println("Are you sure?");
			break;
		default:
			System.out.println("Bad answer");
			break;

		}
	}
}
