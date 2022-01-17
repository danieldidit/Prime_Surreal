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


//Declares a SpellsAndPotions class
public class SpellsAndPotions
{
    //Instance variables
    private String spellName;
    private int spellAmount;

    //Default constructor
    public SpellsAndPotions()
    {

    }

    //Constructor holding two arguments
    public SpellsAndPotions(String spellName, int spellAmount)
    {
        this.spellName = spellName;
        this.spellAmount = spellAmount;
    }

    //Getters and Setters
    public String getSpellName()
    {
        return spellName;
    }

    public void setSpellName(String spellName)
    {
        this.spellName = spellName;
    }

    public int getSpellAmount()
    {
        return spellAmount;
    }

    public void setSpellAmount(int spellAmount)
    {
        this.spellAmount = spellAmount;
    }
}
