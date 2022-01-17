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

//Imports the Random, and Scanner utility
import java.util.Random;
import java.util.Scanner;

//Declares a Weapons class
public class Weapons
{
    //Instance variables
    private String weaponName;
    private int weaponDamage;

    //Default constructor
    public Weapons()
    {

    }

    //Constructor holding two arguments
    public Weapons(String weaponName, int weaponDamage)
    {
        this.weaponName = weaponName;
        this.weaponDamage = weaponDamage;
    }

    //Getters and Setters
    public String getWeaponName()
    {
        return weaponName;
    }

    public void setWeaponName(String weaponName)
    {
        this.weaponName = weaponName;
    }

    public int getWeaponDamage()
    {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage)
    {
        this.weaponDamage = weaponDamage;
    }

    //Instantiates a Scanner and a Random object
    Scanner in = new Scanner(System.in);
    Random rd = new Random();

    //This method allows user to choose their starting weapon. Example of method overloading
    public void chooseWeapon()
    {
        System.out.println();

        //boolean while loop until user chooses an appropriate weapon
        boolean success = false;
        while (!success)
        {
            //display weapon selection
            System.out.print("watergun/sword/axe/mystery: ");

            //Takes weapon selection and removes spaces and changes to lower case
            String answer = in.nextLine().toLowerCase().replaceAll("\\s", "");;

            //Switch that displays different dialogue based on weapon choice, and sets the weapon name and damage
            switch (answer)
            {
                case "axe":
                    setWeaponName("Axe");
                    setWeaponDamage(20);
                    System.out.println();
                    System.out.println("Guy: You've chosen the Axe! The weakest weapon in the game. " +
                            "But that's okay. It's not the weapon. It's how you use it. " +
                            "It's damage is " + getWeaponDamage() + ".");
                    in.nextLine();
                    success = true;
                    break;
                case "sword":
                    setWeaponName("Sword");
                    setWeaponDamage(30);
                    System.out.println();
                    System.out.println("Guy: The Sword! This sword was forged by Kimotari Kotoyo. " +
                            "It is the finest sword in all the land. Not a bad choice. " +
                            "It's damage is " + getWeaponDamage() + ".");
                    in.nextLine();
                    success = true;
                    break;
                case "watergun":
                    setWeaponName("WaterGun");
                    setWeaponDamage(40);
                    System.out.println();
                    System.out.println("Guy: The WaterGun is an excellent choice! I actually filled it with " +
                            "Holy Water so this is almost the strongest weapon in the game! " +
                            "It's damage is " + getWeaponDamage() + ".");
                    in.nextLine();
                    success = true;
                    break;
                case "mystery":
                    setWeaponName("LightSaber");
                    setWeaponDamage(50);
                    System.out.println();
                    System.out.println("Guy: The Mystery Weapon is my favorite. A LIGHTSABER! " +
                            "That's right. You're going to be cutting up monsters like it's nothing. " +
                            "It's damage is " + getWeaponDamage() + ".");
                    in.nextLine();
                    success = true;
                    break;
            }
        }
    }

    //This method allows user to change their weapon further into the game. Example of method overloading
    public void chooseWeapon(String newWeapon)
    {
        System.out.println();

        //boolean while loop until user chooses an appropriate weapon, or if they even want to change
        boolean success = false;
        while (!success)
        {
            //Asks user if they are content with their weapons
            String yesOrNo;
            System.out.print("yes/no: ");
            yesOrNo = in.nextLine();

            //yes or no switch
            switch (yesOrNo)
            {
                //If no, the user will be displayed a choice of weapons and choice will be stored in "answer"
                case "no":
                    System.out.println();
                    System.out.println("Guy: Alright. Let's see. What have I got laying around....");
                    in.nextLine();
                    System.out.print("fluff/watergun/sword/axe/mystery/supermystery: ");

                    //Stores answer and makes it lowercase without spaces.
                    String answer = in.nextLine().toLowerCase().replaceAll("\\s", "");;

                    //Switch with different dialogue depending on users choice. Also sets weapon name and damage
                    switch (answer)
                    {
                        case "fluff":
                            setWeaponName("Fluff");
                            setWeaponDamage(5);
                            System.out.println();
                            System.out.println("Guy: Hey that's not a weapon. That's just some fluff. I wasn't " +
                                    "expecting guests so I didn't clean up. Oh well you're stuck with it now. " +
                                    "It's damage is " + getWeaponDamage() + ".");
                            in.nextLine();
                            success = true;
                            break;

                        case "axe":
                            setWeaponName("Axe");
                            setWeaponDamage(20);
                            System.out.println();
                            System.out.println("Guy: You've chosen the Axe! The weakest weapon in the game. " +
                                    "But that's okay. It's not the weapon. It's how you use it. " +
                                    "It's damage is " + getWeaponDamage() + ".");
                            in.nextLine();
                            success = true;
                            break;

                        case "sword":
                            setWeaponName("Sword");
                            setWeaponDamage(30);
                            System.out.println();
                            System.out.println("Guy: The Sword! This sword was forged by Kimotari Kotoyo. " +
                                    "It is the finest sword in all the land. Not a bad choice. " +
                                    "It's damage is " + getWeaponDamage() + ".");
                            in.nextLine();
                            success = true;
                            break;

                        case "watergun":
                            setWeaponName("WaterGun");
                            setWeaponDamage(40);
                            System.out.println();
                            System.out.println("Guy: The WaterGun is an excellent choice! I actually filled it with " +
                                    "Holy Water so this is almost the strongest weapon in the game! " +
                                    "It's damage is " + getWeaponDamage() + ".");
                            in.nextLine();
                            success = true;
                            break;

                        case "mystery":
                            setWeaponName("LightSaber");
                            setWeaponDamage(50);
                            System.out.println();
                            System.out.println("Guy: The Mystery Weapon is my favorite. A LIGHTSABER! " +
                                    "That's right. You're going to be cutting up monsters like it's nothing. " +
                                    "It's damage is " + getWeaponDamage() + ".");
                            in.nextLine();
                            success = true;
                            break;

                        case "supermystery":
                            setWeaponName("The Sword of 1000 Truths");
                            setWeaponDamage(500);
                            System.out.println();
                            System.out.println("Guy: Now this is a weapon. The Sword of 1000 Truths! " +
                                    "Likely to kill with one attack. No fun at all, but very efficient!" +
                                    " It's damage is " + getWeaponDamage() + ".");
                            in.nextLine();
                            success = true;
                            break;

                    }
                    break;

                //If user chooses they are content the game will carry on
                case "yes":
                    System.out.println();
                    System.out.println("Guy: Whatever floats your boat!");
                    in.nextLine();
                    success = true;
                    break;
            }
        }
    }

    //This method returns the damage for a Hero Strong Attack
    public int strongAttack()
    {
        //An array where [0] does 0 damage, and [1] will do double the set weapon damage
        int [] strongAttackArray = new int[2];
        strongAttackArray[0] = 0;
        strongAttackArray[1] = getWeaponDamage() * 2;

        //Returns a random number from the array
        return strongAttackArray[rd.nextInt(strongAttackArray.length)];
    }

    //This method returns the damage for a Hero Special Attack
    public int specialAttack()
    {
        //An array that holds 10 variables. 9 of them do 0 damage and 1 of them does 10,000 damage
        int[] specialAttackArray = new int[10];
        for(int i = 0; i < 9; i++)
        {
            specialAttackArray[i] = 0;
        }
        specialAttackArray[9] = 10000;

        //Returns a random number from the array.
        return specialAttackArray[rd.nextInt(specialAttackArray.length)];

    }
}
