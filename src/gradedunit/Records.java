package gradedunit;

import com.bethecoder.ascii_table.ASCIITable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class Records
{
    
    public static void addGame(ArrayList<Game> Game, String Coach, String Squad)
      {
        //Create scanner to accept user input
        Scanner Match = new Scanner(System.in);
        //Local Variables used for field names
        String OppositionName;
        String MatchDate;
        String Location;
        String KickoffTime;
        String Result;
        String Score;

        //temp variables
        Boolean check;
        String temp;
        String input;

        //First Half Varibles
        String SimplyRugby_scores_fh;
        int SimplyRugby_points_fh;
        String Opposition_scores_fh;
        int Opposition_points_fh;

        //Second Half Varibles
        String SimplyRugby_scores_sh;
        int SimplyRugby_points_sh;
        String Opposition_scores_sh;
        int Opposition_points_sh;

        //General Game Information START
        System.out.println("New Game Record Form");
        System.out.println("******************************************************");
        System.out.println("");
        System.out.print("Opposition Name: ");
        OppositionName = Match.nextLine();
        System.out.print("Date of Match (DD/MM/YYYY): ");
        MatchDate = Match.nextLine();
        System.out.print("Location: (Home/Away): ");
        Location = Match.nextLine();
        System.out.print("K/0 Time: ");
        KickoffTime = Match.nextLine();
        System.out.println("Result (Won/Lost/Drew): ");
        Result = Match.nextLine();
        System.out.print("Score: ");
        Score = Match.nextLine();
        //General Game Information END

        //First Half Reports
        System.out.println("");
        System.out.println("*********************");
        System.out.println("First Half Reports");
        System.out.println("");
        System.out.println("Simply Rugby:");
        System.out.println("");
        System.out.print("Scores and Comments: ");
        SimplyRugby_scores_fh = Match.nextLine();
        
        do
          {
            System.out.print("Points for: ");
            temp = (Match.nextLine());
            check = InputValidation.isIntValid(temp);
          } while (check.equals(false));
        SimplyRugby_points_fh = Integer.parseInt(temp);
        
        System.out.println("");
        System.out.println(OppositionName + ": ");
        System.out.println("");
        System.out.print("Scores and Comments: ");
        Opposition_scores_fh = Match.nextLine();
        
        do
          {
            System.out.print("Points against: ");
            temp = (Match.nextLine());
            check = InputValidation.isIntValid(temp);
          } while (check.equals(false));
        Opposition_points_fh = Integer.parseInt(temp);
        
        System.out.println("***********************");

        //Second Half Reports
        System.out.println("");
        System.out.println("***********************");
        System.out.println("Second Half Reports");
        System.out.println("");
        System.out.println("Simply Rugby:");
        System.out.println("");
        System.out.print("Scores and Comments: ");
        SimplyRugby_scores_sh = Match.nextLine();
        
        do
          {
            System.out.print("Points for: ");
            temp = (Match.nextLine());
            check = InputValidation.isIntValid(temp);
          } while (check.equals(false));
        SimplyRugby_points_sh = Integer.parseInt(temp);
        
        System.out.println("");
        System.out.println(OppositionName + ": ");
        System.out.println("");
        System.out.print("Scores and Comments: ");
        Opposition_scores_sh = Match.nextLine();
        System.out.print("Points against: ");
        do
          {
            System.out.print("Points against: ");
            temp = (Match.nextLine());
            check = InputValidation.isIntValid(temp);
          } while (check.equals(false));
        Opposition_points_sh = Integer.parseInt(temp);
        
        Game.add(new Game(OppositionName, MatchDate, Location, KickoffTime, Result, Coach, Score, Squad, SimplyRugby_scores_fh, SimplyRugby_points_fh, Opposition_scores_fh, Opposition_points_fh, SimplyRugby_scores_sh, SimplyRugby_points_sh, Opposition_scores_sh, Opposition_points_sh));
        
      }
    
    public static void editGame(ArrayList<Game> Game, int gameID)
      {
        //Create scanner to accept user input
        Scanner Match = new Scanner(System.in);
        
        //temp variables
        Boolean check;
        String temp;
        String input;

        //General Game Information START
        System.out.println("Edit Game Record Form, ID: " + gameID);
        System.out.println("******************************************************");
        System.out.println("");
        System.out.println("Opposition Name: Current(" + Game.get(gameID).getOppositionName() + ")");
        System.out.print("New Value: ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setOppositionName(input);
          }
        //OppositionName = Match.nextLine();
        System.out.print("Date of Match (DD/MM/YYYY): ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setMatchDate(input);
          }
        
        System.out.print("Location: (Home/Away): ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setLocation(input);
          }
        
        System.out.print("K/0 Time: ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setKickoffTime(input);
          }
        
      
        System.out.println("Result (Won/Lost/Drew): ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setResult(input);
          }
        
        System.out.print("Score: ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setScore(input);
          }
        //General Game Information END

        //First Half Reports
        System.out.println("");
        System.out.println("*********************");
        System.out.println("First Half Reports");
        System.out.println("");
        System.out.println("Simply Rugby:");
        System.out.println("");
        System.out.print("Scores and Comments: ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setSimplyRugby_scores_fh(input);
          }
        
        do
          {
            System.out.print("Points for: ");
            temp = (Match.nextLine());
            if (temp.equals(""))
              {
                check = true;
              } else
              {
                check = InputValidation.isIntValid(temp);
              }
          } while (check.equals(false));
        if (!temp.equals(""))
          {
            Game.get(gameID).setSimplyRugby_points_fh(Integer.parseInt(temp));
          }
        
        System.out.println("");
        System.out.println(Game.get(gameID).getOppositionName() + ": ");
        System.out.println("");
        System.out.print("Scores and Comments: ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setOpposition_scores_fh(input);
          }
        
        do
          {
            System.out.print("Points against: ");
            temp = (Match.nextLine());
            if (temp.equals(""))
              {
                check = true;
              } else
              {
                check = InputValidation.isIntValid(temp);
              }
          } while (check.equals(false));
        if (!temp.equals(""))
          {
            Game.get(gameID).setOpposition_points_fh(Integer.parseInt(temp));
          }
        
        System.out.println("***********************");

        //Second Half Reports
        System.out.println("");
        System.out.println("***********************");
        System.out.println("Second Half Reports");
        System.out.println("");
        System.out.println("Simply Rugby: ");
        System.out.println("");
        System.out.print("Scores and Comments: ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setSimplyRugby_scores_sh(input);
          }
        
        do
          {
            System.out.print("Points for: ");
            temp = (Match.nextLine());
            if (temp.equals(""))
              {
                check = true;
              } else
              {
                check = InputValidation.isIntValid(temp);
              }
          } while (check.equals(false));
        if (!temp.equals(""))
          {
            Game.get(gameID).setSimplyRugby_points_sh(Integer.parseInt(temp));
          }
        
        System.out.println("");
        System.out.println(Game.get(gameID).getOppositionName() + ": ");
        System.out.println("");
        System.out.print("Scores and Comments: ");
        if (Match.hasNextLine() && !(input = Match.nextLine()).isEmpty())
          {
            Game.get(gameID).setOpposition_scores_sh(input);
          }
        System.out.print("Points against: ");
        do
          {
            System.out.print("Points against: ");
            temp = (Match.nextLine());
            if (temp.equals(""))
              {
                check = true;
              } else
              {
                check = InputValidation.isIntValid(temp);
              }
          } while (check.equals(false));
        if (!temp.equals(""))
          {
            Game.get(gameID).setOpposition_points_sh(Integer.parseInt(temp));
          }
        
          System.out.println("Game ID: " + gameID + "Sucessfully Updated");
      }
    
    public static void addTraining(ArrayList<Training> Session, String Coach, String Squad, ArrayList<?> PlayersPresent)
      {
        //Local Variables 

        String Date;
        String Location;
        String Time;
        String SkillsActivites;
        String Incidents;
        ArrayList<String> Names = new ArrayList();
        
        Scanner Train = new Scanner(System.in);
        
        System.out.println("New Training Record/Session Form:");
        System.out.println("******************************************************");
        System.out.println("");
        System.out.println("Coach Organising: " + Coach);
        System.out.print("Date: ");
        Date = Train.nextLine();
        System.out.print("Location: ");
        Location = Train.nextLine();
        System.out.print("Time: ");
        Time = Train.nextLine();
        System.out.println("Skills and activites undertaken: ");
        System.out.print(">");
        SkillsActivites = Train.nextLine();
        System.out.println("Accidents/injuries: ");
        System.out.print(">");
        
        Incidents = Train.nextLine();

        //Get Player names from ArrayList()
        switch (Squad)
          {
            case "Senior":
                ArrayList<Player> Seniors = new ArrayList();
                Seniors = (ArrayList<Player>) PlayersPresent;
                
                for (Player s : Seniors)
                  {
                    Names.add(s.getName());
                    System.out.println(s.getName());
                  }
                
                break;
            
            case "Junior":
                ArrayList<Junior> Juniors = new ArrayList();
                Juniors = (ArrayList<Junior>) PlayersPresent;
                
                for (Junior j : Juniors)
                  {
                    Names.add(j.getName());
                    System.out.println(j.getName());
                  }
                
                break;
            
          }
        
        Session.add(new Training(Coach, Date, Location, Time, SkillsActivites, Incidents, Names));
        System.out.println("Training Session Added");
        System.out.println("******************************************************");
      }
    
    public static void addProfile(ArrayList<ProfileTemplate> Profiles, ArrayList<Category> Category, ArrayList<SkillSet> Skill, ArrayList<?> Member, int id, String MemberClass)
      {
        if (!Member.isEmpty())
          {
            switch (MemberClass)
              {
                case "Player":
                  {
                    ArrayList<Player> Seniors = new ArrayList();
                    Seniors = (ArrayList<Player>) Member;
                    
                    String Name = Seniors.get(id).getName();
                    Profiles.add(new ProfileTemplate(Name, MemberClass, Category, Skill));
                    int ProfileID = 0;
                    for (int i = 0; i > Profiles.size(); i++)
                      {
                        if (Profiles.get(id).getPlayerName().equals(Name) && Profiles.get(id).getMemberClass().equals(MemberClass))
                          {
                            System.out.println(i);
                            ProfileID = i;
                          }
                      }
                    Profiles.get(ProfileID).setALL();
                  }
                break;
                
                case "Junior":
                  {
                    ArrayList<Junior> Junior = new ArrayList();
                    Junior = (ArrayList<Junior>) Member;
                    
                    String Name = Junior.get(id).getName();
                    Profiles.add(new ProfileTemplate(Name, MemberClass, Category, Skill));
                    int ProfileID = 0;
                    for (int i = 0; i > Profiles.size(); i++)
                      {
                        if (Profiles.get(id).getPlayerName().equals(Name) && Profiles.get(id).getMemberClass().equals(MemberClass))
                          {
                            System.out.println(i);
                            ProfileID = i;
                          }
                      }
                    Profiles.get(ProfileID).setALL();
                  }
                break;
                
              }
          } else if (Member.isEmpty())
          {
            return;
          }
        
      }
    
    public static boolean viewProfile(ArrayList<ProfileTemplate> Profiles, String MemberClass)
      {
        if (!Profiles.isEmpty())
          {
            
            System.out.println(Profiles.size());
            String[] headers =
              {
                "ID",
                "Player Name",
                "Member Class",
              };
            int count = 0;
            String[][] Summary = new String[Profiles.size()][headers.length];
           
            for (int i = 0; i < Profiles.size(); i++)
              {
              
                if (Profiles.get(i).getMemberClass().equals(MemberClass))
                  {
                   
                    Summary[i][0] = Integer.toString(Profiles.get(i).getId());
                    Summary[i][1] = Profiles.get(i).getPlayerName();
                    Summary[i][2] = Profiles.get(i).getMemberClass();
                    ++count;
                  }
              }
            if (count > 0)
              {
                ASCIITable.getInstance().printTable(headers, Summary);
                return true;
              } else if (count <= 0)
              {
                System.out.println("No profiles found, try adding one.");
                return false;
                
              }
            
          } else if (Profiles.isEmpty())
          {
            System.out.println("Profile List is empty");
            return false;
          }
        return false;
      }
    
    public static void getSummary(ArrayList<?> Member, String MemberClass)
      {
        
        switch (MemberClass)
          {
            case "Player":
              {
                String[] headers =
                  {
                    "ID",
                    "Name",
                    "Address",
                    "PostCode",
                    "Date Of Birth",
                    "SRU Number",
                    "Tel Number",
                    "Mobile Number",
                    "Email",
                    "Next Of Kin",
                    "Next Of Kin Tel",
                    "Doctor Name",
                    "Doctor Tel",
                    "Health Info",
                    "Player position",
                  };
                
                ArrayList<Player> Players = new ArrayList();
                Players = (ArrayList<Player>) Member;
                
                String[][] Summary = new String[Players.size()][headers.length];
                for (int i = 0; i < Players.size(); i++)
                  {
                    
                    Summary[i][0] = Integer.toString(Players.get(i).getId());
                    Summary[i][1] = Players.get(i).getName();
                    Summary[i][2] = Players.get(i).getAddress();
                    Summary[i][3] = Players.get(i).getPostCode();
                    Summary[i][4] = Players.get(i).getDateOfBirth();
                    Summary[i][5] = Integer.toString(Players.get(i).getSRU_Number());
                    Summary[i][6] = Integer.toString(Players.get(i).getTelNum());
                    Summary[i][7] = Integer.toString(Players.get(i).getMobNum());
                    Summary[i][8] = Players.get(i).getEmail();
                    Summary[i][9] = Players.get(i).getNextOfKin();
                    Summary[i][10] = Integer.toString(Players.get(i).getNextOfKin_Tel());
                    Summary[i][11] = Players.get(i).getDoctor_Name();
                    Summary[i][12] = Integer.toString(Players.get(i).getDoctor_Tel());
                    Summary[i][13] = Players.get(i).getHealthInfo();
                    Summary[i][14] = Players.get(i).getPlayer_position();
                    
                  }
                System.out.println("******************************************************");
                System.out.println("Player Squad Summary:");
                ASCIITable.getInstance().printTable(headers, Summary);
                //System.out.println("******************************************************");
              }
            break;
            
            case "Junior":
                System.out.println("Not yet implemented");
                break;
            
            case "Games":
                
                String[] headers =
                  {
                    "ID",
                    "Opposition",
                    "Date Of Match",
                    "Location",
                    "Results",
                    "Score",
                  };
                
                ArrayList<Game> Games = new ArrayList();
                Games = (ArrayList<Game>) Member;
                String[][] Summary = new String[Games.size()][headers.length];
                
                for (int i = 0; i < Games.size(); i++)
                  {
                    Summary[i][0] = Integer.toString(Games.get(i).getId());
                    Summary[i][1] = Games.get(i).getOppositionName();
                    Summary[i][2] = Games.get(i).getMatchDate();
                    Summary[i][3] = Games.get(i).isLocation();
                    Summary[i][4] = Games.get(i).getResult();
                    Summary[i][5] = Games.get(i).getScore();
                  }
                ASCIITable.getInstance().printTable(headers, Summary);
                break;
            
            default:
                System.out.println("Invalid Member class type - Only Player or Junior, Game");
                return;
          }
        
      }
    
}
