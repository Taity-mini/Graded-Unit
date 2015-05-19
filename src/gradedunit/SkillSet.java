package gradedunit;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class SkillSet
{
    private String Skill;
    private int Skill_Level;
    private String Category;

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
