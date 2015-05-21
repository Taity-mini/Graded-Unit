package gradedunit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class GradedUnit
{

    public static void main(String[] args) throws IOException
      {
        //Variables used throughtout the program
        String dir = Consts.FILE_DIRECTORY;

        //ArrayLists
        ArrayList<Player> Player = new ArrayList();
        ArrayList<Junior> Junior = new ArrayList();
        ArrayList<Non_Player> Non_Player = new ArrayList();
        ArrayList<ProfileTemplate> Profiles = new ArrayList();
        ArrayList<Game> Games = new ArrayList();
        ArrayList<Training> Training = new ArrayList();

        ArrayList<Category> Category = new ArrayList();
        Category.add(new Category("Passing"));
        Category.add(new Category("Tackling"));
        Category.add(new Category("Kicking"));

        ArrayList<SkillSet> Skills = new ArrayList();
        Skills.add(new SkillSet("Standard", "Passing"));
        Skills.add(new SkillSet("Spin", "Passing"));
        Skills.add(new SkillSet("Pop", "Passing"));
        Skills.add(new SkillSet("Front", "Tackling"));
        Skills.add(new SkillSet("Rear", "Tackling"));
        Skills.add(new SkillSet("Side", "Tackling"));
        Skills.add(new SkillSet("Scrabble", "Tackling"));
        Skills.add(new SkillSet("Drop", "Kicking"));
        Skills.add(new SkillSet("Punt", "Kicking"));
        Skills.add(new SkillSet("Grubber", "Kicking"));
        Skills.add(new SkillSet("Goal", "Kicking"));
        Player = (ArrayList<Player>) FileOperations.ReadObjects(Player, "Player", dir);
        Profiles = (ArrayList<ProfileTemplate>)FileOperations.ReadObjects(Profiles, "Profiles", dir);
        Games = (ArrayList<Game>) FileOperations.ReadObjects(Games, "Games", dir);
        Records.editGame(Games, 0);
        Games.get(0).getAllDetails();
        //Records.addProfile(Profiles, Category, Skills, Player, 0, "Player");
        //Registration.editPlayer(Player, 0);
        //Profiles.get(0).getALL();
        Records.viewProfile(Profiles, "Player");
        //System.exit(1);
        Scanner menu = new Scanner(System.in);

        int choice = 0;
        Boolean check;
        String temp;

        try
          {
            do
              {
                do
                  {
                    System.out.println("Simply Rugby Main Menu");
                    System.out.println("OPTION 1 - Player & Member Management");
                    System.out.println("OPTION 2 - Game Records");
                    System.out.println("OPTION 3 - Training Sessions");
                    System.out.println("OPTION 4 - Settings");
                    System.out.println("OPTION 5 - Exit");
                    temp = (menu.nextLine());
                    check = InputValidation.menuValid(temp, 1, 5);

                  } while (check.equals(false));
                choice = Integer.parseInt(temp);

                switch (choice)
                  {
                    case 1:
                        Menu.MemberManagement(Player, Junior, Non_Player, Profiles, Category, Skills);
                        break;

                    case 2:
                        Menu.GameMenu(Games, "Games");
                        break;

                    case 3:
                        System.out.println("OPTION 3 SELECTED");
                        break;

                    case 4:
                        System.out.println("OPTION 4 SELECTED");
                        break;
                    case 5:
                        System.out.println("System exited succesfully");
                        //call to write arraylists here 
                        FileOperations.WriteObjects(Player, "Player", dir);
                        FileOperations.WriteObjects(Profiles, "Profiles", dir);
                        FileOperations.WriteObjects(Games, "Games", dir);
                        break;
                    default:
                        System.out.println("Invalid option selected");
                        
                        break;

                  }

              } while (choice != 5);

          } catch (Exception ex)
          {
            System.out.println("ERROR: This is not a valid value, please try again!");
          }

      }

}
