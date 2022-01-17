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

//Imports the Random utility
import java.util.Random;

//Declares an Enemies class
public class Enemies
{
    //Instance variables
    private String enemyName;
    private int enemyHealth;

    //Default constructor
    public Enemies()
    {

    }

    //Constructor holding two arguments
    public Enemies(String enemyName, int enemyHealth)
    {
        this.enemyName = enemyName;
        this.enemyHealth = enemyHealth;
    }

    //Getters and Setters
    public String getEnemyName()
    {
        return enemyName;
    }

    public void setEnemyName(String enemyName)
    {
        this.enemyName = enemyName;
    }

    public int getEnemyHealth()
    {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth)
    {
        this.enemyHealth = enemyHealth;
    }

    //Instantiates a new Random object
    Random rd = new Random();

    //This method contains The Giant's fight dialogue options
    public String giantFightDialogue()
    {
        //An array that holds 6 Strings
        String [] dialogue = new String[6];

        //6 choices of dialogue for The Giant
        dialogue[0] = "YOU THINK THAT CAN KILL ME?!";
        dialogue[1] = "I AM MUCH BIGGER THAN YOU TINY HUMAN. TRY AGAIN!";
        dialogue[2] = "I CAN'T WAIT TO EAT YOUR BONES!!!";
        dialogue[3] = "YOU ARE WEAK AND I AM STRONG!!!!";
        dialogue[4] = "THERE'S NO USE. GIVE UP NOW YOU WEAKLING!";
        dialogue[5] = "I CAN'T WAIT TO TELL MY FRIENDS HOW YOU TASTE!";

        //Returns a random dialogue option from the array
        return dialogue[rd.nextInt(dialogue.length)];
    }

    //This method contains Bob's fight dialogue options
    public String bobFightDialogue()
    {
        //An array that holds 6 Strings
        String [] dialogue = new String[6];

        //6 choices of dialogue for Bob
        dialogue[0] = "Let's hurry this up shall we?!";
        dialogue[1] = "Poor human. They think their actually faster than me!";
        dialogue[2] = "I'm twice your size and twice as fast! Just die already!";
        dialogue[3] = "YOUR LUCKY IT'S NOT A FULL MOON!";
        dialogue[4] = "Please don't attack with any silver. That wouldn't be fair";
        dialogue[5] = "Come closer! I don't bite....HARD!";

        //Returns a random dialogue option from the array
        return dialogue[rd.nextInt(dialogue.length)];
    }
}
