/** Application Purpose: Prime Surreal is a text based Action-Adventure-RPG that is built using everything that
 *      Daniel Humphreys has learned in his first Semester of Computer Programming at Georgian College. The
 *      purpose is to meet the crazy characters, build your own characters, and fight a few monsters along the way!
 *
 *      Author: Daniel Humphreys
 *
 *      Date: 12/5/2021
 *
 *      Time: 2:43pm
 */

//Imports the Scanner utility
import java.util.Scanner;

//Declares a Questions class
public class Questions
{
    //Instantiates a Scanner object
    Scanner in = new Scanner(System.in);

    //This method is just a joke set up by the main NPC when choosing a name. You can choose to use the name he gives
    public void nameJoke()
    {
        //boolean while loop until user picks yes or no
        boolean success = false;
        while (!success)
        {
            //Prompts user to enter their name to set up for a joke
            System.out.print("Enter your name: ");
            String answer = in.nextLine();

            //If user types nothing it will ask again
            if (answer == "")
            {
                success = false;
            }
            else success = true;
        }

            //NPC dialogue asking user if their name is a silly name
            System.out.println();
            System.out.println("Guy: Your name is Flappy Clapsock?");
            System.out.println();
    }

    //This method asks the user if they know where they are
    public void locationQuestion()
    {
        System.out.println();

        //boolean while loop until user picks yes or no
        boolean success = false;
        while (!success)
        {
            System.out.print("yes/no: ");

            //Stores users answer in "answer" in lower case
            String answer = in.nextLine().toLowerCase();

            //Switch with yes or no option. Yes or no just has different dialogue. The game continues afterwards.
            switch (answer)
            {
                case "yes":
                    System.out.println();
                    System.out.println("Guy: No you don't. Don't be silly. Look at you. You can hardly " +
                            "tell your up from down.");

                    success = true;
                    break;

                case "no":
                    System.out.println();
                    System.out.println("Guy: I didn't think so.");
                    success = true;
                    break;
            }
        }
    }
}
