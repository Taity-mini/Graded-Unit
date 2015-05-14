package gradedunit;


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
          System.out.print("Points for: ");
          SimplyRugby_points_fh = Integer.parseInt(Match.nextLine());
          System.out.println("");
          System.out.println(OppositionName + ": ");
          System.out.println("");
          System.out.print("Scores and Comments: ");
          Opposition_scores_fh = Match.nextLine();
          System.out.print("Points against: ");
          Opposition_points_fh = Integer.parseInt(Match.nextLine());
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
          System.out.print("Points for: ");
          SimplyRugby_points_sh = Integer.parseInt(Match.nextLine());
          System.out.println("");
          System.out.println(OppositionName + ": ");
          System.out.println("");
          System.out.print("Scores and Comments: ");
          Opposition_scores_sh = Match.nextLine();
          System.out.print("Points against: ");
          Opposition_points_sh = Integer.parseInt(Match.nextLine());
          
          Game.add(new Game(OppositionName, MatchDate, Location,  KickoffTime,  Result,  Coach, Score, Squad, SimplyRugby_scores_fh, SimplyRugby_points_fh, Opposition_scores_fh, Opposition_points_fh, SimplyRugby_scores_sh, SimplyRugby_points_sh, Opposition_scores_sh, Opposition_points_sh));
  
      }
      
    public static void addTraining(ArrayList <Training> Session, String Coach, String Squad, ArrayList<?> PlayersPresent )
      {
        //Local Variables 
        //String Coach;
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
          System.out.println("Coach Orangising: " + Coach);
          System.out.print("Date: ");
          Date = Train.nextLine();
          System.out.print("Location: ");
          Location = Train.nextLine();
          System.out.print("Time: ");
          Time = Train.nextLine();
          System.out.println("Skills and activites undertaken: ");
          System.out.println(">");
          SkillsActivites = Train.nextLine();
          System.out.println("Accidents/injuries: ");
          System.out.println(">");
          
          Incidents = Train.nextLine();
          
          
          //Get Player names from ArrayList()
          switch (Squad)
                  {
                    case "Senior":
                      
                        ArrayList<Player> Seniors = new ArrayList();
                        Seniors = (ArrayList<Player>) PlayersPresent;
                        
                        for(Player s: Seniors )
                          {
                            Names.add(s.getName());
                          }
               
                    break;
                    
                    case "Junior":
                         ArrayList<Junior > Juniors = new ArrayList();
                         Juniors = (ArrayList<Junior>) PlayersPresent;
                         
                         for(Junior j: Juniors)
                           {
                             Names.add(j.getName());
                           }
                         
                         
                    break;
                   
                  }     
          
        Session.add(new Training(Coach, Date, Location, Time, SkillsActivites, Incidents, Names));
      }
        
    

}
