package gradedunit;

/**
 *
 * @author Andrew Tait (EC1302292)
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
