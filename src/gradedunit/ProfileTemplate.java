package gradedunit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import gradedunit.Catagory.*;
import gradedunit.SkillSet.*;
import java.io.Serializable;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class ProfileTemplate implements Serializable
{

    private String PlayerName;
    private String MemberClass;
    private String PlayerSquad;
    
   
    ArrayList<Catagory> Catagory = new ArrayList();
    ArrayList<SkillSet> Skills = new ArrayList();

    public ProfileTemplate(String PlayerName, String Squad,ArrayList<Catagory> Catagory, ArrayList<SkillSet> Skills)
      {
        this.PlayerName = PlayerName;
        this.PlayerSquad = Squad;
        this.Catagory = Catagory;
        this.Skills = Skills;
      }

    //Getters
    public String getPlayerName()
      {
        return PlayerName;
      }

    public String getMemberClass()
      {
        return MemberClass;
      }

    public String getPlayerSquad()
      {
        return PlayerSquad;
      }

    public ArrayList<Catagory> getCatagory()
      {
        return Catagory;
      }

    public ArrayList<SkillSet> getSkills()
      {
        return Skills;
      }
    
    //Setters

   
  

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
            System.out.println("Comments:");
            System.out.println(c.getComments());

          }
      }
    

}
