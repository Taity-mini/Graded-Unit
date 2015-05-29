package gradedunit;

import java.io.Serializable;

/**
 * 
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since  21/5/2015               
 * Name: SkillSet Class
 * Description:
 * ""
 * 
 **/  
public class SkillSet implements Serializable
{
    private String Skill;
    private int Skill_Level;
    private String Category;

    /**
     *
     * @param Skill
     * @param Category
     * Constructor for SkillSet Class
     */
    public SkillSet(String Skill, String Category)
      {
        this.Skill = Skill;
        this.Category = Category;
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
        return Category;
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
        this.Category = Catagories;
      }
    
}
