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
        
        
   

        //Load files into arraylist, if they exist
        if (FileOperations.fileExists("Player", dir))
          {
            Player = (ArrayList<Player>) FileOperations.ReadObjects(Player, "Player", dir);
          }

        if (FileOperations.fileExists("Junior", dir))
          {
            Junior = (ArrayList<Junior>) FileOperations.ReadObjects(Junior, "Junior", dir);
          }

        if (FileOperations.fileExists("Non_Player", dir))
          {
            Non_Player = (ArrayList<Non_Player>) FileOperations.ReadObjects(Non_Player, "Non_Player", dir);
          }

        if (FileOperations.fileExists("Profiles", dir))
          {
            Profiles = (ArrayList<ProfileTemplate>) FileOperations.ReadObjects(Profiles, "Profiles", dir);
          }

        if (FileOperations.fileExists("Games", dir))
          {
            Games = (ArrayList<Game>) FileOperations.ReadObjects(Games, "Games", dir);
          }

        if (FileOperations.fileExists("Training", dir))
          {
            Training = (ArrayList<Training>) FileOperations.ReadObjects(Training, "Training", dir);
          }
        
             Records.viewTraining(Training, "Player");

        Scanner menu = new Scanner(System.in);

        int choice = 0;
        Boolean check;
        String temp;

        try
          {
            System.out.println("");
            System.out.println("____  _                 _       ____              _            ____ _       _     \n"
                    + "/ ___|(_)_ __ ___  _ __ | |_   _|  _ \\ _   _  __ _| |__  _   _ / ___| |_   _| |__  \n"
                    + "\\___ \\| | '_ ` _ \\| '_ \\| | | | | |_) | | | |/ _` | '_ \\| | | | |   | | | | | '_ \\ \n"
                    + " ___) | | | | | | | |_) | | |_| |  _ <| |_| | (_| | |_) | |_| | |___| | |_| | |_) |\n"
                    + "|____/|_|_| |_| |_| .__/|_|\\__, |_| \\_\\\\__,_|\\__, |_.__/ \\__,  \\____|_|\\__,_|_.__/ \n"
                    + "                  |_|      |___/             |___/       |___/                     ");
            System.out.println("");
            do
              {
                do
                  {

                    System.out.println("Simply Rugby Main Menu");
                    System.out.println("OPTION 1 - Player & Member Management");
                    System.out.println("OPTION 2 - Game Records");
                    System.out.println("OPTION 3 - Training Sessions");
                    System.out.println("OPTION 4 - Exit");
                    temp = (menu.nextLine());
                    check = InputValidation.menuValid(temp, 1, 4);

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
                        Menu.TrainingMenu(Training, "Player",  Player);
                        break;

                    case 4:
                        System.out.println("System exited succesfully");
                        //call to write arraylists here 
                        FileOperations.WriteObjects(Player, "Player", dir);
                        FileOperations.WriteObjects(Profiles, "Profiles", dir);
                        FileOperations.WriteObjects(Games, "Games", dir);
                        FileOperations.WriteObjects(Training, "Training", dir);
                        break;
                    default:
                        System.out.println("Invalid option selected");

                        break;

                  }

              } while (choice != 4);

          } catch (NumberFormatException ex)
          {
            System.out.println("ERROR: This is not a valid value, please try again!");
          }

      }

}
