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

//Imports the Random and Scanner utility
import java.util.Random;
import java.util.Scanner;

//Declares the progression class
public class Progression
{
    //Creates global objects for objects used throughout the primeSurreal game method
    Hero ourHero;
    Enemies giantMonster;
    Enemies bob;
    Questions q;
    SpellsAndPotions health;
    Weapons choice;

    //Creates a new Scanner and Random object
    Scanner in = new Scanner(System.in);
    Random rd = new Random();

    //Start or Quit game method.
    public void startGame()
    {
        //boolean while loop until user chooses start or quit
        boolean success = false;
        while (!success)
        {
            System.out.println("Type start to play or quit to exit!");
            System.out.println();
            System.out.print("start/quit: ");

            //Stores users choice in startGame variable
            String startGame = in.nextLine().toLowerCase();

            //Switch that decides between quit or start
            switch (startGame)
            {
                //Exits the game
                case "quit":
                    System.out.println("Goodbye!");
                    System.exit(0);
                    success = true;
                    break;

                //Starts the game
                case "start":
                    System.out.println();
                    System.out.println("Let's Begin!");
                    success = true;
                    break;
            }
        }
    }

    //Method containing the progress of the game from start to end
    public void primeSurreal()
    {
        //Title/Intro Text Design
        System.out.println();
        System.out.println("********  ********  ********  ***    ***  ********");
        System.out.println("**    **  **    **     **     ****  ****  **     ");
        System.out.println("********  ********     **     **  **  **  **     ");
        System.out.println("**        ****         **     **  **  **  ********");
        System.out.println("**        ** **        **     **  **  **  **     ");
        System.out.println("**        **  **       **     **  **  **  **     ");
        System.out.println("**        **   **   ********  **  **  **  ********");
        System.out.println();
        System.out.println("********  **    **  ********  ********  ********    ****    **");
        System.out.println("**        **    **  **    **  **    **  **         **  **   **");
        System.out.println("**        **    **  ********  ********  **        **    **  **");
        System.out.println("********  **    **  ****      ****      ********  ********  **");
        System.out.println("      **  **    **  ** **     ** **     **        **    **  **");
        System.out.println("      **  **    **  **  **    **  **    **        **    **  **");
        System.out.println("********  ********  **    **  **    **  ********  **    **  ********");
        System.out.println();
        System.out.println("PRIME SURREAL: THE GAME");
        System.out.println();

        //Calls the startGame() method which starts or quits the game
        startGame();

        //NPC dialogue
        in.nextLine();
        System.out.println("Stranger: Hey! Wake up!");
        in.nextLine();
        System.out.println("Stranger: Why are you sleeping outside of my hut?");
        in.nextLine();
        System.out.println("Stranger: You don't know how you got here do you?");
        in.nextLine();
        System.out.println("Stranger: Ugh. This happens every week. Well don't just lay there. Get up! " +
                "Come inside and we can talk.");
        in.nextLine();
        System.out.println("Stranger: Let me introduce myself. My name is Guy, but you can call me whatever you like. "
                + "That Guy, Some Guy, This Guy, whatever floats your boat!");
        in.nextLine();
        System.out.println("Guy: Tell me a little about yourself. What's your name?");
        System.out.println();


        //Instantiates a new hero object in reference to the "ourHero" global object
        ourHero = new Hero("Anon", 100, true, 0);

        //Instantiates a new questions object in reference to the "q" global object
        q = new Questions();

        //Calls the nameJoke() method. Prompts user to enter their name to set up for a joke
        q.nameJoke();

        //Calling decideName() method so the user can actually decide their Hero's name.
        ourHero.decideName();

        //Line spacing
        System.out.println();

        //Calls confirmName() method which confirms Hero's name
        ourHero.confirmName();

        //NPC dialogue
        System.out.println();
        System.out.println("Guy: Well lovely to meet you " + ourHero.getHeroName() + ". Now can you tell me " +
                "something else? Do you know where you are?");

        //Calls locationQuestion() method which asks if user knows where they are. Answer doesn't matter.
        q.locationQuestion();

        //Line spacing
        in.nextLine();

        //NPC dialogue
        System.out.println("Guy: Let me enlighten you. You've woken up in the last place " +
                "anyone wants to wake up.");
        in.nextLine();
        System.out.println("Guy: CANADA!!!");
        in.nextLine();
        System.out.println("Guy: I know, I know. you're probably thinking Canada isn't so bad." +
                " But let me tell you something. You've woken up in the year 2957 and this year " +
                "makes 2020 look like Cotton Candy.");
        in.nextLine();
        System.out.println("Guy: It's dangerous out here. So first things first.");
        in.nextLine();

        /*Calls pickHealthNumber() method. Prompts player to pick their starting health. But they just
            think they're picking a random number*/
        ourHero.pickHealthNumber();

        //Instantiates a health potion object in reference to the "health" global object
         health = new SpellsAndPotions("Health Potion", 100);

        //NPC dialogue
        in.nextLine();
        System.out.println("Guy: But while we're talking about health let me give you this.");
        in.nextLine();
        System.out.println("YOU RECEIVED A " + health.getSpellName());
        in.nextLine();
        System.out.println("Guy: Just type 4 during a fight and it will fill your health back up to 100! " +
                "But be careful. I don't have a million of these okay?");
        in.nextLine();

        //Calls the addHealthPotion() method. Adds 1 health potion to the hero's inventory
        ourHero.addHealthPotion();

        //NPC dialogue
        System.out.println("Guy: Next up is my favorite! We're going to let you pick a weapon to help " +
                "fight off all the baddies! ");
        in.nextLine();
        System.out.println("Guy: Take your pick between this Axe, this Sword, this WaterGun, " +
                "and this Mystery Weapon!");

        //Instantiate new weapon object in reference to the "choice" global object
        choice = new Weapons();

        //Calls the chooseWeapon() method. Has user choose a weapon
        choice.chooseWeapon();

        //Announce the first enemies appearance
        System.out.println("--THE ROOF OF GUYS HUT IS RIPPED OFF AND A MONSTER APPEARS!--");
        in.nextLine();

        //Instantiate a new enemy object in reference to the "giant" global object
        giantMonster = new Enemies("Giant Monster", 120);

        //NPC dialogue
        System.out.println("Guy: " + ourHero.getHeroName().toUpperCase() + "! IT'S THE GIANT " +
                "THAT LIKES TO EAT WEARY TRAVELLERS!!!!");
        in.nextLine();
        System.out.println("Guy: Honestly. I don't know why I'm yelling. He's pretty harmless. " +
                "This will be a great opportunity for me to teach you how to fight!");
        in.nextLine();
        System.out.println("Guy: Every time a battle begins, the monsters HP will be displayed like this: ");
        in.nextLine();

        // Display Enemies health
        System.out.println(giantMonster.getEnemyName() + " HP: " + giantMonster.getEnemyHealth());
        in.nextLine();

        //NPC dialogue / Battle Instructions
        System.out.println("Guy: And your health will be displayed like this: ");
        in.nextLine();
        System.out.println(ourHero.getHeroName() + " HP: " + ourHero.getHeroHealth());
        in.nextLine();
        System.out.println("Guy: You'll both take turns attacking each other until one of you dies. " +
                "Sounds fun huh?");
        in.nextLine();
        System.out.println("Giant Monster: ME HUNGRY!!!");
        in.nextLine();
        System.out.println("Guy: Yes yes Giant Monster. Just wait a minute. I'm still trying to teach "
        + ourHero.getHeroName() + " how to fight okay?");
        in.nextLine();
        System.out.println("Giant Monster: ...");
        in.nextLine();
        System.out.println("Guy: Before I forget. Just remember that after the fight begins, you can " +
                "use your health potion by typing 4 if you're not happy with what health you started with.");
        System.out.println("I think this monster only hits for 2 damage, but if you've only got 2 health " +
                "that's going to be a problem!");
        in.nextLine();
        System.out.println("Guy: So next is our attacks. You can type '1' for a Fast Attack. This attack will " +
                "do the least damage but it is guaranteed to hit your target. You can type '2' for your ");
        System.out.println("Strong Attack. Your strong attack can hit the enemy for double damage, but you only have a "
                + "1 in 2 chance of hitting them. Finally, if you're feeling adventurous. You can type ");
        System.out.println("'3' for a Super Special Attack. This attack only has a 1 in 10 chance of hitting your " +
                "enemy. But it will kill them instantly! How fun.");
        in.nextLine();
        System.out.println("Guy: So let's give this a shot. I'll let you attack first.");
        in.nextLine();
        System.out.println("Giant Monster: But I wanted to fight first!");
        in.nextLine();
        System.out.println("Guy: That's enough Giant Monster. Be kind to our guest.");
        in.nextLine();
        System.out.println("Guy: Below is how your fight menu will be displayed. Go ahead give it a shot!");
        in.nextLine();

        //Calls fightWindowGiant() method. Launches fight window with Giant
        fightWindowGiant();

        //NPC Dialogue
        System.out.println("Guy: YAY, YOU DID IT!");
        in.nextLine();
        System.out.println("Guy: That guy just wouldn't leave me alone. He was always coming around," +
                " trying to steal my cheese.");
        in.nextLine();
        System.out.println("Guy: It looks like i've trained you well " + ourHero.getHeroName() + ".");
        in.nextLine();
        System.out.println("Guy: Want to celebrate with a beer?");
        in.nextLine();

        //Calls the beerBreak() method. Asks user if they'd like a beer break
        beerBreak();

        //NPC Dialogue
        System.out.println("Guy: Anyways. We should get out there, There's so many battles to be had!");
        in.nextLine();
        System.out.println("Guy: First I should ask. Are you happy with your weapon? If you are we can " +
                "continue, but if not I can let you pick something else!");
        System.out.println("I've also added a few to the collection. Some good, some bad. So are you content?");

        //Calls chooseWeapon(String newWeapon) method. Asks user if they'd like to choose a new weapon.
        choice.chooseWeapon("Choose Again?");

        //NPC Dialogue
        System.out.println("Guy: Now that you're ready. Let's go kill some monsters!");
        in.nextLine();
        System.out.println("Guy: Siri! Play epic battle music!");
        in.nextLine();
        System.out.println("Guy: .....");
        in.nextLine();
        System.out.println("Guy: Siri?");
        in.nextLine();
        System.out.println("Guy: Ugh, you must be new to coding huh?");
        in.nextLine();
        System.out.println("Guy: You can't even code music into your own game.");
        in.nextLine();
        System.out.println("Guy: Next you'll tell me that you haven't even had graphics this entire time " +
                "and you've been playing a text based game. Imagine!?");
        in.nextLine();
        System.out.println("Guy: Wait you are? Oh My God! Get with it. I'm a lot prettier in person. But" +
                " I guess you'll have to wait until you can actually code graphics to see!");
        in.nextLine();
        System.out.println("Guy: Hey, can you see that?");
        in.nextLine();
        System.out.println("Guy: It's getting closer very fast!");
        in.nextLine();
        System.out.println("Guy: Oh yeah, you can't see any graphics. It looks like a Werewolf!");
        in.nextLine();
        System.out.println("Guy: Act cool and perhaps he won't bug us.");
        in.nextLine();

        //Instantiate a new enemy object in reference to the "bob" global object
        bob = new Enemies("Bob", 400);

        //NPC Dialogue
        System.out.println("Werewolf: Travellers! Let me stop you right there. My name is Bullet but my" +
                " friends call me Bob. What brings you to my lands?");
        in.nextLine();
        System.out.println("Guy: Oh hey Bob. We're just looking for monsters for my new friend here to fight. " +
                "He actually just beat the Giant in a fight!");
        in.nextLine();
        System.out.println("Bob: The Giant! But he is weak. Of course this friend of yours could beat " +
                "The Giant. It is me he should look out for! SNARL!");
        in.nextLine();
        System.out.println("Guy: Oh Bob we don't mean no harm. But I do believe you are no match for my new friend. " +
                "He is the almighty " + ourHero.getHeroName() + "!");
        in.nextLine();
        System.out.println("Bob: Alright " + ourHero.getHeroName() + ". Let's see what you're made of!");
        in.nextLine();

        //Calls the fightWindowBob() method. Starts a fight with Bob
        fightWindowBob();

        //NPC Dialogue
        System.out.println("Guy: Poor Bob. He seemed like a nice guy. But I guess he was asking for it!");
        in.nextLine();
        System.out.println("Guy: I'm tired though. I think i'm going to go home and head to bed!");
        in.nextLine();
        System.out.println("Guy: What do you do? Well you've got lot's of other assignments to work on. " +
                "You can't just fight monsters all day! We've had enough fun. Go work on Arduino, or " +
                "LinkedIn Learning.");
        in.nextLine();
        System.out.println("Guy: Yes this truly is the end. Maybe we will meet again next semester!");
        in.nextLine();
        System.out.println("THE END!");
        in.nextLine();
        System.out.println("....FOR NOW!");
        in.nextLine();

        //Outro Text Design
        System.out.println();
        System.out.println("********  ********  ********  ***    ***  ********");
        System.out.println("**    **  **    **     **     ****  ****  **     ");
        System.out.println("********  ********     **     **  **  **  **     ");
        System.out.println("**        ****         **     **  **  **  ********");
        System.out.println("**        ** **        **     **  **  **  **     ");
        System.out.println("**        **  **       **     **  **  **  **     ");
        System.out.println("**        **   **   ********  **  **  **  ********");
        System.out.println();
        System.out.println("********  **    **  ********  ********  ********    ****    **");
        System.out.println("**        **    **  **    **  **    **  **         **  **   **");
        System.out.println("**        **    **  ********  ********  **        **    **  **");
        System.out.println("********  **    **  ****      ****      ********  ********  **");
        System.out.println("      **  **    **  ** **     ** **     **        **    **  **");
        System.out.println("      **  **    **  **  **    **  **    **        **    **  **");
        System.out.println("********  ********  **    **  **    **  ********  **    **  ********");
        System.out.println();
        System.out.println("All credits - Daniel Humphreys");
        System.out.println();

        //End of Prime Surreal...For now
    }

    //This method holds all the hero's attacks and damage against the giant
    public void heroAttacksGiant()
    {
        //Shows our Attack or heal options
        System.out.println("Fast Attack: 1      Strong Attack: 2        Super Special Attack: 3" +
                "       Health Potion(" + ourHero.getCountHealthPotion() + "): 4");

        //Prompts user to enter attack choice
        System.out.println();
        System.out.print("Enter your attack: ");

        //Stores the user's weapon damage in variables to be used in the fight
        int strongAttackValue = choice.strongAttack();
        int specialAttackValue = choice.specialAttack();

        //Takes the user's input to choose which attack to use
        int heroAttackChoice = in.nextInt();

            switch (heroAttackChoice) {

                //Case 1  is the fast attack
                case 1:

                    //Takes the user's weapon damage away from the monsters health
                    giantMonster.setEnemyHealth(giantMonster.getEnemyHealth() - choice.getWeaponDamage());

                    //Attack Dialogue
                    System.out.println();
                    System.out.println("Whack! - " + giantMonster.getEnemyName() + " took "
                            + choice.getWeaponDamage() + " damage!");
                    System.out.println();
                    in.nextLine();
                    in.nextLine();
                    break;

                //Case 2 is the Strong Attack
                case 2:

                    //If the weapon damage returned is 0, print that the user missed
                    if (strongAttackValue == 0)
                    {
                        System.out.println();
                        System.out.println("YOU MISSED!");
                        System.out.println();
                        in.nextLine();
                        in.nextLine();
                    }

                    //If the weapon damage returned is more than 0, remove damage from the monsters health
                    else if (strongAttackValue > 0)
                    {
                        giantMonster.setEnemyHealth(giantMonster.getEnemyHealth() - strongAttackValue);
                        System.out.println();

                        //Attack Dialogue
                        System.out.println("SMASH! - " + giantMonster.getEnemyName() + " took "
                                + choice.getWeaponDamage() * 2 + " damage!");
                        System.out.println();
                        in.nextLine();
                        in.nextLine();
                    }
                    break;

                //Case 3 is the Special Attack
                case 3:

                    //If the weapon damage returned is 0, print that the user missed
                    if (specialAttackValue == 0)
                    {
                        System.out.println();
                        System.out.println("YOU MISSED!");
                        System.out.println();
                        in.nextLine();
                        in.nextLine();
                    }

                    //If the weapon damage returned is more than 0, instant kill the monster
                    else if (specialAttackValue > 0)
                    {
                        giantMonster.setEnemyHealth(giantMonster.getEnemyHealth() - specialAttackValue);

                        //Attack dialogue
                        System.out.println();
                        System.out.println("KNOCKOUT BLOW!");
                        System.out.println();
                        in.nextLine();
                        in.nextLine();
                    }
                    break;

                //Case 4 is to use the health potion
                case 4:

                    //If the user has a health potion fill health to 100 and print health dialogue
                    if (ourHero.getCountHealthPotion() == 1)
                    {
                        System.out.println();
                        System.out.println("YOU USED YOUR HEALTH POTION!");
                        System.out.println();
                        ourHero.setHeroHealth(+health.getSpellAmount());
                        ourHero.removeHealthPotion();
                        in.nextLine();
                        in.nextLine();
                    }

                    //If the user has no health potions print that the user is out of potions
                    else if (ourHero.getCountHealthPotion() == 0)
                    {
                        System.out.println();
                        System.out.println("YOU ARE OUT OF POTIONS!");
                        in.nextLine();
                        in.nextLine();
                    }
                    break;
            }
    }

    //Method storing the Giants attacks
    public void giantAttacks()
    {
        //Giant chooses from three attacks at random
        int giantAttackChoice = rd.nextInt(3);

        //Switch storing three different attacks that are stored at random
        switch (giantAttackChoice)
        {
            //Case 0 removes 1 health from the user
            case 0:
                ourHero.setHeroHealth(ourHero.getHeroHealth() - 1);
                System.out.println();

                //Attack Dialogue
                System.out.println("Tap! You took 1 damage!");
                System.out.println();
                in.nextLine();
                break;

            //Case 1 removes 2 health from the user
            case 1:
                ourHero.setHeroHealth(ourHero.getHeroHealth() - 2);
                System.out.println();

                //Attack Dialogue
                System.out.println("Whonk! You took 2 damage");
                System.out.println();
                in.nextLine();
                break;

            //Case 2 removes 3 health from the user
            case 2:
                ourHero.setHeroHealth(ourHero.getHeroHealth() - 3);
                System.out.println();

                //Attack Dialogue
                System.out.println("SLAP! You took 3 damage");
                System.out.println();
                in.nextLine();
                break;
        }
    }

    //Method where the hero fights the giant
    public void fightWindowGiant()
    {
        //boolean while loop until either the hero or the monster dies
        boolean success = false;
        while (!success)
        {
            //Displays Enemy and Hero health
            System.out.print(giantMonster.getEnemyName() + " HP: " + giantMonster.getEnemyHealth() + "      ");
            System.out.println(ourHero.getHeroName() + " HP: " + ourHero.getHeroHealth());

            //Separates the health and the attacks
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            //Calls in the method that holds the hero's attacks
            heroAttacksGiant();

            //Check if giant is dead and ends fight if so
            if (giantMonster.getEnemyHealth() <= 0)
            {
                System.out.println("OWWWW THAT HURTS!!! I'M GOING TO GO AND TELL MY MOM!!!");
                in.nextLine();
                System.out.println("--The giant runs away crying. You really hurt his feelings you know?--");
                in.nextLine();
                success = true;
            }

            //If monster is still alive it will provide random dialogue and attack the user
            if (giantMonster.getEnemyHealth() > 0)
            {
                System.out.println(giantMonster.giantFightDialogue());
                in.nextLine();

                //Calls in the method that holds the giants attacks
                giantAttacks();

                //Adds spacing before the fight window displays again
                System.out.println();
                System.out.println();
                System.out.println("*****************************************************");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }

            //Restart fight if hero is dead
            /*I have a bug here that I can't seem to solve. If you die and come back at this checkpoint, and then
            you kill the monster, the monster will provide its death dialogue, but then it will have a negative
            number of health until you attack once more. Then it will say it's death dialogue again and only then
            will the game progress. This doesn't happen if you kill the monster without using the checkpoint.
            */
            if (ourHero.getHeroHealth() <= 0)
            {
                checkPoint1();
            }

        }
    }
    public void heroAttacksBob()
    {
        //Shows our Attack or heal options
        System.out.println("Fast Attack: 1      Strong Attack: 2        Super Special Attack: 3" +
                "       Health Potion(" + ourHero.getCountHealthPotion() + "): 4");

        //Prompts user to enter attack choice
        System.out.println();
        System.out.print("Enter your attack: ");

        //Stores the user's weapon damage in variables to be used in the fight
        int strongAttackValue = choice.strongAttack();
        int specialAttackValue = choice.specialAttack();

        //Takes the user's input to choose which attack to use
        int heroAttackChoice = in.nextInt();

        switch (heroAttackChoice) {

            //Case 1  is the fast attack
            case 1:

                //Takes the user's weapon damage away from the monsters health
                bob.setEnemyHealth(bob.getEnemyHealth() - choice.getWeaponDamage());

                //Attack Dialogue
                System.out.println();
                System.out.println("Whack! - " + bob.getEnemyName() + " took "
                        + choice.getWeaponDamage() + " damage!");
                System.out.println();
                in.nextLine();
                in.nextLine();
                break;

            //Case 2 is the Strong Attack
            case 2:

                //If the weapon damage returned is 0, print that the user missed
                if (strongAttackValue == 0)
                {
                    System.out.println();
                    System.out.println("YOU MISSED!");
                    System.out.println();
                    in.nextLine();
                    in.nextLine();
                }

                //If the weapon damage returned is more than 0, remove damage from the monsters health
                else if (strongAttackValue > 0)
                {
                    bob.setEnemyHealth(bob.getEnemyHealth() - strongAttackValue);
                    System.out.println();

                    //Attack Dialogue
                    System.out.println("SMASH! - " + bob.getEnemyName() + " took "
                            + choice.getWeaponDamage() * 2 + " damage!");
                    System.out.println();
                    in.nextLine();
                    in.nextLine();
                }
                break;

            //Case 3 is the Special Attack
            case 3:

                //If the weapon damage returned is 0, print that the user missed
                if (specialAttackValue == 0)
                {
                    System.out.println();
                    System.out.println("YOU MISSED!");
                    System.out.println();
                    in.nextLine();
                    in.nextLine();
                }

                //If the weapon damage returned is more than 0, instant kill the monster
                else if (specialAttackValue > 0)
                {
                    bob.setEnemyHealth(bob.getEnemyHealth() - specialAttackValue);

                    //Attack dialogue
                    System.out.println();
                    System.out.println("KNOCKOUT BLOW!");
                    System.out.println();
                    in.nextLine();
                    in.nextLine();
                }
                break;

            //Case 4 is to use the health potion
            case 4:

                //If the user has a health potion fill health to 100 and print health dialogue
                if (ourHero.getCountHealthPotion() == 1)
                {
                    System.out.println();
                    System.out.println("YOU USED YOUR HEALTH POTION!");
                    System.out.println();
                    ourHero.setHeroHealth(+health.getSpellAmount());
                    ourHero.removeHealthPotion();
                    in.nextLine();
                    in.nextLine();
                }

                //If the user has no health potions print that the user is out of potions
                else if (ourHero.getCountHealthPotion() == 0)
                {
                    System.out.println();
                    System.out.println("YOU ARE OUT OF POTIONS!");
                    in.nextLine();
                    in.nextLine();
                }
                break;
        }
    }
    public void bobAttacks()
    {
        //Giant chooses from three attacks at random
        int giantAttackChoice = rd.nextInt(3);

        //Switch storing three different attacks that are stored at random
        switch (giantAttackChoice)
        {
            //Case 0 removes 3 health from the user
            case 0:
                ourHero.setHeroHealth(ourHero.getHeroHealth() - 3);
                System.out.println();

                //Attack Dialogue
                System.out.println("POUNCE! You took 3 damage!");
                System.out.println();
                in.nextLine();
                break;

            //Case 1 removes 5 health from the user
            case 1:
                ourHero.setHeroHealth(ourHero.getHeroHealth() - 5);
                System.out.println();

                //Attack Dialogue
                System.out.println("BITE! You took 5 damage");
                System.out.println();
                in.nextLine();
                break;

            //Case 2 removes 7 health from the user
            case 2:
                ourHero.setHeroHealth(ourHero.getHeroHealth() - 7);
                System.out.println();

                //Attack Dialogue
                System.out.println("THRASH! You took 7 damage");
                System.out.println();
                in.nextLine();
                break;
        }
    }

    //Method where the hero fights Bob
    public void fightWindowBob()
    {
        //boolean while loop while user and Bob are still alive
        boolean success = false;
        while (!success)
        {
            //Displays Enemy and Hero health
            System.out.print(bob.getEnemyName() + " HP: " + bob.getEnemyHealth() + "      ");
            System.out.println(ourHero.getHeroName() + " HP: " + ourHero.getHeroHealth());

            //Separates the health and the attacks
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            //Calls in the method that holds the hero's attacks against Bob
            heroAttacksBob();

            //Check if Bob is dead and ends fight if so
            if (bob.getEnemyHealth() <= 0)
            {
                System.out.println("I CAN'T BELIEVE YOU BEAT ME! NOW I'M NOT MAKING YOU ANY TEA!");
                in.nextLine();
                System.out.println("--What a classy werewolf. Too bad you couldn't be friends--");
                in.nextLine();
                success = true;
            }

            //If Bob is alive he will say random dialogue and then attack the user
            if (bob.getEnemyHealth() > 0)
            {
                System.out.println(bob.bobFightDialogue());
                in.nextLine();

                //Calls in the method that holds the giants attacks
                bobAttacks();

                //Adds spacing before the fight window displays again
                System.out.println();
                System.out.println();
                System.out.println("*****************************************************");
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }

            //Restart fight if hero is dead
            /*I have a bug here that I can't seem to solve. If you die and come back at this checkpoint, and then
            you kill the monster, the monster will provide its death dialogue, but then it will have a negative
            number of health until you attack once more. Then it will say it's death dialogue again and only then
            will the game progress. This doesn't happen if you kill the monster without using the checkpoint.
            */
            if (ourHero.getHeroHealth() <= 0)
            {
                checkPoint2();
            }
        }
    }

    //Method storing checkpoint 1
    public void checkPoint1()
    {
        //Resets the monsters and the hero's health to maximum value
        giantMonster.setEnemyHealth(120);
        ourHero.setHeroHealth(100);
        System.out.println("YOU DIED!");
        System.out.println("TRY AGAIN?");
        System.out.println();

        //boolean while loop that loops until user decides yes or no
        boolean success = false;
        while (!success)
        {
            System.out.print("yes/no: ");

            //Stores yes or no answer in "answer" variable
            String answer = in.nextLine().toLowerCase();

            //Switch containing yes or no options
            switch (answer)
            {
                //If user chooses yes, they will fight The Giant again
                case "yes":
                    success = true;

                    fightWindowGiant();
                    break;

                //If the user chooses no, the game will exit
                case "no":

                    success = true;
                    System.exit(0);
                    break;
            }
        }
    }

    //Method storing checkpoint 2
    public void checkPoint2()
    {
        //Resets the monsters and the hero's health to maximum value
        bob.setEnemyHealth(400);
        ourHero.setHeroHealth(100);
        System.out.println("YOU DIED!");
        System.out.println("TRY AGAIN?");
        System.out.println();

        //boolean while loop that loops until user decides yes or no
        boolean success = false;
        while (!success)
        {
            System.out.print("yes/no: ");

            //Stores yes or no answer in "answer" variable
            String answer = in.nextLine().toLowerCase();

            //Switch containing yes or no options
            switch (answer)
            {
                //If user chooses yes, they will fight Bob again
                case "yes":
                    success = true;

                    fightWindowBob();
                    break;

                //If the user chooses no, the game will exit
                case "no":

                    success = true;
                    System.exit(0);
                    break;
            }
        }
    }

    //This method will asl the user if they want to have a beer break
    public void beerBreak()
    {
        //boolean while loop until user decides yes or no
        boolean success = false;
        while (!success)
        {
            //The yes or no answer is stored in the "answer" variable
            String answer;
            System.out.print("Yes/no: ");
            answer = in.nextLine();

            //Switch that holds yes or no options. Each option just contains different dialogue
            switch (answer)
            {
                //If user chooses yes they get drunk and pass out
                case "yes":
                    System.out.println();
                    System.out.println("Guy: Okay! Bottoms up!");
                    in.nextLine();
                    System.out.println("Guy: So,LbjdBHwudbLb");
                    in.nextLine();
                    System.out.println("Guy: LbjdBHwudbLb");
                    in.nextLine();
                    System.out.println("Guy: ghyu byhbgkwuyg buygbo");
                    in.nextLine();
                    System.out.println("Guy: ?aEWJBYGY JIHOI!");
                    in.nextLine();
                    System.out.println("......");
                    in.nextLine();
                    System.out.println("Guy: " + ourHero.getHeroName() + "!");
                    in.nextLine();
                    System.out.println("Guy: You passed out! I didn't know you were such a light weight.");
                    in.nextLine();
                    System.out.println("Guy: Next time you're only allowed water, okay?");
                    in.nextLine();
                    success = true;
                    break;

                //If user chooses no the game carries on
                case "no":
                    System.out.println();
                    System.out.println("Guy: You're no fun!");
                    in.nextLine();
                    success = true;
                    break;
            }
        }
    }
}