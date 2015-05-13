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
          Scanner Match = new Scanner(System.in);
          String OppositionName;
          String MatchDate;
          boolean Location;
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
          Location = Match.nextBoolean();
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

}
