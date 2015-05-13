/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradedunit;

/**
 *
 * @author Andrew
 */
public class SkillSet
{
    private String Skill;
    private int Skill_Level;
    private String Catagory;

    public SkillSet(String Skill, String Catagory)
      {
        this.Skill = Skill;
        this.Catagory = Catagory;
      }

    public String getSkill()
      {
        return Skill;
      }

    public int getSkill_Level()
      {
        return Skill_Level;
      }

    public String getCatagories()
      {
        return Catagory;
      }

    public void setSkill(String Skill)
      {
        this.Skill = Skill;
      }

    public void setSkill_Level(int Skill_Level)
      {
        this.Skill_Level = Skill_Level;
      }

    public void setCatagories(String Catagories)
      {
        this.Catagory = Catagories;
      }
    
}
