package gradedunit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import gradedunit.Category.*;
import gradedunit.SkillSet.*;
import java.io.Serializable;
import java.util.Iterator;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class ProfileTemplate implements Serializable
{

    private String PlayerName;
    private String MemberClass;
    
   
    ArrayList<Category> Category = new ArrayList();
    ArrayList<SkillSet> Skills = new ArrayList();
    
    public ProfileTemplate(String PlayerName, String Squad,ArrayList<Category> Category, ArrayList<SkillSet> Skills)
      {
        this.PlayerName = PlayerName;
        this.Category = Category;
        this.Skills = Skills;
        this.MemberClass = Squad;
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


    public ArrayList<Category> getCategory()
      {
        return Category;
      }

    public ArrayList<SkillSet> getSkills()
      {
        return Skills;
      }
    
    //Setters

   
  

    public void setALL()
      {
        Scanner set = new Scanner(System.in);
        for (Category c : Category)
          {
            System.out.println("Category:" + c.getCategory());

            for (SkillSet s : Skills)
              {
                if (c.getCategory().equals(s.getCatagories()))
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
    
     public void getALL()
      {
        for (Category c : Category)
          {
            System.out.print("Category:" + c.getCategory());
            for (Iterator<SkillSet> it = Skills.iterator(); it.hasNext();)
              {
                SkillSet s = it.next();
                if (c.getCategory().equals(s.getCatagories()))
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
