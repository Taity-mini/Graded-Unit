package gradedunit;

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
    private int id;
    private static int count = -1; 

    ArrayList<Category> Category = new ArrayList();
    ArrayList<SkillSet> Skills = new ArrayList();

    public ProfileTemplate(String PlayerName, String Squad, ArrayList<Category> Category, ArrayList<SkillSet> Skills)
      {
        this.PlayerName = PlayerName;
        this.Category = Category;
        this.Skills = Skills;
        this.MemberClass = Squad;
        this.setId(++count);
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

    public int getId()
      {
        return id;
      }
    

    //Setters
    public void setALL()
      {
        Boolean check;
        String temp;

        Scanner set = new Scanner(System.in);
        for (Category c : Category)
          {
            System.out.println("Category:" + c.getCategory());

            for (SkillSet s : Skills)
              {
                if (c.getCategory().equals(s.getCatagories()))
                  {
                    do
                      {
                        System.out.println(s.getSkill());
                        System.out.println("Enter Skill Level: (1-5) :");
                        temp = (set.nextLine());
                        check = InputValidation.menuValid(temp, 1, 5);

                      } while (check.equals(false));

                    s.setSkill_Level(Integer.parseInt(temp));
                  }
              }
            System.out.println("Any Comments?");
            c.setComments(set.nextLine());

          }
      }

    private void setId(int id)
      {
        this.id = id;
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
