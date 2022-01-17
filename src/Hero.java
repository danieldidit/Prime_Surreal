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

//Import Scanner and Input MismatchException
import java.util.InputMismatchException;
import java.util.Scanner;

//Declares the Hero class
public class Hero
{
    //Instance Variables
    private String heroName;
    private int heroHealth;
    private boolean heroAlive;
    private int countHealthPotion;

    //Default Constructor
    public Hero()
    {

    }
    //Constructor housing all four arguments
    public Hero(String heroName, int heroHealth, boolean heroAlive, int countHealthPotion)
    {
        this.heroName = heroName;
        this.heroHealth = heroHealth;
        this.heroAlive = heroAlive;
        this.countHealthPotion = countHealthPotion;
    }

    //Getters and Setters
    public String getHeroName()
    {
        return heroName;
    }

    public void setHeroName(String heroName)
    {
        this.heroName = heroName;
    }

    public int getHeroHealth()
    {
        return heroHealth;
    }

    public void setHeroHealth(int heroHealth)
    {
        this.heroHealth = heroHealth;
    }

    public boolean getHeroAlive()
    {
        return heroAlive;
    }

    public void setHeroAlive(boolean heroAlive)
    {
        this.heroAlive = heroAlive;
    }

    public int getCountHealthPotion()
    {
        return countHealthPotion;
    }

    public void setCountHealthPotion(int countHealthPotion)
    {
        this.countHealthPotion = countHealthPotion;
    }

    //Instantiates a new scanner object
    Scanner in = new Scanner(System.in);

    //This method will ask the user to decide on their name
    public void decideName()
    {
        //boolean while loop that only ends when user has chosen yes or no
        boolean success = false;
        while (!success)
        {

            System.out.print("yes/no: ");

            String answer = in.nextLine().toLowerCase();

            //Switch giving yes or no option
            switch (answer)
            {
                //Sets name to dumb name
                case "yes":
                    setHeroName("Flappy Clapsock");
                    success = true;
                    break;

                //Sets name to what they actually chose
                case "no":
                    System.out.println();
                    System.out.println("Guy: Oh i'm so sorry! I'm terrible of hearing. " +
                            "Please tell me your name again?");
                    System.out.println();
                    System.out.print("Enter your name: ");
                    setHeroName(in.nextLine());
                    success = true;
                    break;
            }
        }
    }

    //This method will confirm the user has chosen the correct name
    public void confirmName()
    {
        //boolean while loop that only ends when user has chosen yes or no
        boolean success = false;
        while (!success) {

            //Confirms chosen name
            System.out.println("Guy: So your name is " + getHeroName());
            System.out.println();
            System.out.print("yes/no: ");

            String answer = in.nextLine().toLowerCase();

            //Switch giving yes or no option
            switch (answer)
            {
                //Ultimately confirms name
                case "yes":
                    success = true;
                    break;

                //Asks the user for the correct name
                case "no":
                    System.out.println();
                    System.out.println("Well what is it then?");
                    System.out.println();
                    System.out.print("Enter your name: ");
                    setHeroName(in.nextLine());
                    System.out.println();
                    break;
            }
        }
    }

    //This method will allow the user to unknowingly choose their starting health
    public void pickHealthNumber()
    {
        //boolean while loop that only ends when user has chosen an appropriate number
        boolean success = false;
        while (!success)
        {
            //Try because we need to catch if the user picks an out-of-bounds number
            try
            {
                //Asks user to pick number between 1 and 100
                System.out.print("Guy: Pick a number between 1-100: ");
                setHeroHealth(in.nextInt());
                System.out.println();

                //Different dialogue choices depending on what the user chooses for their health
                if (getHeroHealth() < 25 && getHeroHealth() > 0) {
                    System.out.println("Guy: Oh wow! You're probably going to die. The number you just picked is" +
                            " how much health you'll start with");
                    in.nextLine();
                    success = true;
                } else if (getHeroHealth() >= 25 && getHeroHealth() < 50) {
                    System.out.println("Guy: I've seen worse. But I should've told you that the number" +
                            " you pick is what health you start with.");
                    in.nextLine();
                    success = true;
                } else if (getHeroHealth() >= 50 && getHeroHealth() < 75) {
                    System.out.println("Guy: Hey, that's not so bad! The number you just picked " +
                            "is what health you'll start with. I've seen much worse!");
                    in.nextLine();
                    success = true;
                } else if (getHeroHealth() >= 75 && getHeroHealth() < 100) {
                    System.out.println("Guy: Good for you! The number I had you pick is " +
                            "what health you'll start out with. Looks like you'll be fine!");
                    in.nextLine();
                    success = true;
                } else if (getHeroHealth() == 100) {
                    System.out.println("Guy: Have you played this game before!? " +
                            "How did you know that the number you picked would be the number " +
                            "of health you start with? I smell a cheater!");
                    in.nextLine();
                    success = true;
                }
                //Dialogue if the user picked an out of range number
                else if (getHeroHealth() < 1 || getHeroHealth() > 100) {
                    System.out.println("Guy: I said between 1 and 100 Dumbo");
                    in.nextLine();
                    in.nextLine();
                }
            }
            //Catch exception if user picked an out-of-bounds number
            catch (InputMismatchException e)
            {
                System.out.println();
                System.out.println("Guy: I said between 1 and 100 dumbo");
                in.nextLine();
                in.nextLine();
            }
        }
    }

        //Sets the user's' health potion count to one
        public void addHealthPotion()
        {
            setCountHealthPotion(1);
        }

        //Sets the user's health potion count to zero
        public void removeHealthPotion()
        {
            setCountHealthPotion(0);
        }


}
