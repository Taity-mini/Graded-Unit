package gradedunit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import gradedunit.Catagory.*;
import gradedunit.SkillSet.*;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class ProfileTemplate
{

    private String PlayerName;

    private Squads PlayerSquad;
    private String PlayerSquard;
    private String Skill;
    private int SkillLevel;
    private String Comments;

    ArrayList<Catagory> Catagory = new ArrayList();
    ArrayList<SkillSet> Skills = new ArrayList();

    public ProfileTemplate(ArrayList<Catagory> Catagory, ArrayList<SkillSet> Skills)
      {
        this.Catagory = Catagory;
        this.Skills = Skills;
      }

    public String getPlayerName()
      {
        return PlayerName;
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

    public ArrayList<Catagory> getCatagory()
      {
        return Catagory;
      }

    public ArrayList<SkillSet> getSkills()
      {
        return Skills;
      }
    
    

    public void setPlayerName(String PlayerName)
      {
        this.PlayerName = PlayerName;
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

    public void setALL(ArrayList<Catagory> Catagory, ArrayList<SkillSet> Skills)
      {
        Scanner set = new Scanner(System.in);
        for (Catagory c : Catagory)
          {
            System.out.println("Catagory:" + c.getCatagory());

            for (SkillSet s : Skills)
              {
                if (c.getCatagory().equals(s.getCatagories()))
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
    
     public void getALL(ArrayList<Catagory> Catagory, ArrayList<SkillSet> Skills)
      {
        //Scanner set = new Scanner(System.in);
        for (Catagory c : Catagory)
          {
            System.out.print("Catagory:" + c.getCatagory());

            for (SkillSet s : Skills)
              {
                if (c.getCatagory().equals(s.getCatagories()))
                  {
                    System.out.print(s.getSkill());
                    System.out.println("Skill Level: (1-5) :");
                    System.out.println(s.getSkill_Level());
                  }
              }
            System.out.println("Comments?");
            c.getComments();

          }
      }
    

}
