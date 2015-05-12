package gradedunit;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew Tait (EC1302292)s
 */
public class ProfileTemplate 
{
    private String PlayerName;
    private Catagory Catagory;
    private Squads PlayerSquad;
    private String PlayerSquard;
    private String Skill;
    private int SkillLevel;
    private String Comments;
    
    
    

    public ProfileTemplate(String PlayerName, Catagory Catagory, Squads PlayerSquad, String PlayerSquard, String Skill, int SkillLevel, String Comments)
      {
        this.PlayerName = PlayerName;
        this.Catagory = Catagory;
        this.PlayerSquad = PlayerSquad;
        this.PlayerSquard = PlayerSquard;
        this.Skill = Skill;
        this.SkillLevel = SkillLevel;
        this.Comments = Comments;
      }

    public String getPlayerName()
      {
        return PlayerName;
      }

    public Catagory getCatagory()
      {
        return Catagory;
      }

    public Squads getPlayerSquad()
      {
        return PlayerSquad;
      }

    public String getPlayerSquard()
      {
        return PlayerSquard;
      }

    public String getSkill()
      {
        return Skill;
      }

    public int getSkillLevel()
      {
        return SkillLevel;
      }

    public String getComments()
      {
        return Comments;
      }

    public void setPlayerName(String PlayerName)
      {
        this.PlayerName = PlayerName;
      }

    public void setCatagory(Catagory Catagory)
      {
        this.Catagory = Catagory;
      }

    public void setPlayerSquad(Squads PlayerSquad)
      {
        this.PlayerSquad = PlayerSquad;
      }
    
   

    public void setSkillLevel(int SkillLevel)
      {
        this.SkillLevel = SkillLevel;
      }

    public void setComments(String Comments)
      {
        this.Comments = Comments;
      }
   

    public static void setALL(ArrayList <Catagory> Catagory, ArrayList <SkillSet> Skills)
      {
        Scanner set = new Scanner(System.in);
        for (Catagory c : Catagory)
          {
            System.out.println("Catagory:" + c.getCatagory());
            
            for (SkillSet s: Skills)
              {
                if(c.getCatagory().equals(s.getCatagories()))
                  {
                     System.out.println(s.getSkill());
                     System.out.println("Enter Skill Level: (1-5) :");
                     s.setSkill_Level(Integer.parseInt(set.nextLine())); 
                  }
              }
              System.out.println("Any Comments?");
              c.setComments(set.nextLine());
              
             }
          }

}
