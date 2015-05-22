package gradedunit;

import com.bethecoder.ascii_table.ASCIITable; //comment on futher
import java.io.Serializable;
import java.util.ArrayList;

/**
 * 
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since  21/5/2015               
 * Name: Game Records Class
 * Description:
 * ""
 * 
 * 
 **/  
public class Game implements Serializable
{

    private int id;
    private static int count = -1;

    private String OppositionName;
    private String MatchDate;
    private String Location;
    private String KickoffTime;
    private String Result;
    private String Coach;
    private String Score;
    private String Squad;

    //First Half Varibles
    private String SimplyRugby_scores_fh;
    private int SimplyRugby_points_fh;
    private String Opposition_scores_fh;
    private int Opposition_points_fh;

    //Second Half Varibles
    private String SimplyRugby_scores_sh;
    private int SimplyRugby_points_sh;
    private String Opposition_scores_sh;
    private int Opposition_points_sh;

    /**
     *
     * @param OppositionName
     * @param MatchDate
     * @param Location
     * @param KickoffTime
     * @param Result
     * @param Coach
     * @param Score
     * @param Squad
     * @param SimplyRugby_scores_fh
     * @param SimplyRugby_points_fh
     * @param Opposition_scores_fh
     * @param Opposition_points_fh
     * @param SimplyRugby_scores_sh
     * @param SimplyRugby_points_sh
     * @param Opposition_scores_sh
     * @param Opposition_points_sh
     */
    public Game(String OppositionName, String MatchDate, String Location, String KickoffTime, String Result, String Coach, String Score, String Squad, String SimplyRugby_scores_fh, int SimplyRugby_points_fh, String Opposition_scores_fh, int Opposition_points_fh, String SimplyRugby_scores_sh, int SimplyRugby_points_sh, String Opposition_scores_sh, int Opposition_points_sh)
      {
        this.OppositionName = OppositionName;
        this.MatchDate = MatchDate;
        this.Location = Location;
        this.KickoffTime = KickoffTime;
        this.Result = Result;
        this.Coach = Coach;
        this.Score = Score;
        this.Squad = Squad;
        this.SimplyRugby_scores_fh = SimplyRugby_scores_fh;
        this.SimplyRugby_points_fh = SimplyRugby_points_fh;
        this.Opposition_scores_fh = Opposition_scores_fh;
        this.Opposition_points_fh = Opposition_points_fh;
        this.SimplyRugby_scores_sh = SimplyRugby_scores_sh;
        this.SimplyRugby_points_sh = SimplyRugby_points_sh;
        this.Opposition_scores_sh = Opposition_scores_sh;
        this.Opposition_points_sh = Opposition_points_sh;
        this.setId(++count);
      }

    //Getters

    /**
     *
     * @return
     */
        public int getId()
      {
        return id;
      }

    /**
     *
     * @return
     */
    public String getOppositionName()
      {
        return OppositionName;
      }

    /**
     *
     * @return
     */
    public String getMatchDate()
      {
        return MatchDate;
      }

    /**
     *
     * @return
     */
    public String isLocation()
      {
        return Location;
      }

    /**
     *
     * @return
     */
    public String getKickoffTime()
      {
        return KickoffTime;
      }

    /**
     *
     * @return
     */
    public String getResult()
      {
        return Result;
      }

    /**
     *
     * @return
     */
    public String getCoach()
      {
        return Coach;
      }

    /**
     *
     * @return
     */
    public String getScore()
      {
        return Score;
      }

    /**
     *
     * @return
     */
    public String getSquad()
      {
        return Squad;
      }

    /**
     *
     * @return
     */
    public String getSimplyRugby_scores_fh()
      {
        return SimplyRugby_scores_fh;
      }

    /**
     *
     * @return
     */
    public int getSimplyRugby_points_fh()
      {
        return SimplyRugby_points_fh;
      }

    /**
     *
     * @return
     */
    public String getOpposition_scores_fh()
      {
        return Opposition_scores_fh;
      }

    public int getOpposition_points_fh()
      {
        return Opposition_points_fh;
      }

    public String getSimplyRugby_scores_sh()
      {
        return SimplyRugby_scores_sh;
      }

    public int getSimplyRugby_points_sh()
      {
        return SimplyRugby_points_sh;
      }

    public String getOpposition_scores_sh()
      {
        return Opposition_scores_sh;
      }

    public int getOpposition_points_sh()
      {
        return Opposition_points_sh;
      }

    //Setters
    public void setOppositionName(String OppositionName)
      {
        this.OppositionName = OppositionName;
      }

    public void setMatchDate(String MatchDate)
      {
        this.MatchDate = MatchDate;
      }

    public void setLocation(String Location)
      {
        this.Location = Location;
      }

    public void setKickoffTime(String KickoffTime)
      {
        this.KickoffTime = KickoffTime;
      }

    public void setResult(String Result)
      {
        this.Result = Result;
      }

    public void setCoach(String Coach)
      {
        this.Coach = Coach;
      }

    public void setScore(String Score)
      {
        this.Score = Score;
      }

    public void setSimplyRugby_scores_fh(String SimplyRugby_scores_fh)
      {
        this.SimplyRugby_scores_fh = SimplyRugby_scores_fh;
      }

    public void setSimplyRugby_points_fh(int SimplyRugby_points_fh)
      {
        this.SimplyRugby_points_fh = SimplyRugby_points_fh;
      }

    public void setOpposition_scores_fh(String Opposition_scores_fh)
      {
        this.Opposition_scores_fh = Opposition_scores_fh;
      }

    public void setOpposition_points_fh(int Opposition_points_fh)
      {
        this.Opposition_points_fh = Opposition_points_fh;
      }

    public void setSimplyRugby_scores_sh(String SimplyRugby_scores_sh)
      {
        this.SimplyRugby_scores_sh = SimplyRugby_scores_sh;
      }

    public void setSimplyRugby_points_sh(int SimplyRugby_points_sh)
      {
        this.SimplyRugby_points_sh = SimplyRugby_points_sh;
      }

    public void setOpposition_scores_sh(String Opposition_scores_sh)
      {
        this.Opposition_scores_sh = Opposition_scores_sh;
      }

    public void setOpposition_points_sh(int Opposition_points_sh)
      {
        this.Opposition_points_sh = Opposition_points_sh;
      }

    private void setId(int id)
      {
        this.id = id;
      }

    /**
     *
     */
    public void getAllDetails()
      {

        //Local Variables
        String SimplyRugby_points_fh = Integer.toString(this.getSimplyRugby_points_fh());
        String SimplyRugby_points_sh = Integer.toString(this.getSimplyRugby_points_sh());

        String Opposition_points_fh = Integer.toString(this.getOpposition_points_fh());
        String Opposition_points_sh = Integer.toString(this.getOpposition_points_sh());
     
        System.out.println("Opposition:" + this.getOppositionName() + "\t " + "Date of Match:" + this.getMatchDate());
        System.out.println("Location: " + this.isLocation() + "\t \t" + "K/O Time: " + this.getKickoffTime());
        System.out.println("Results: " + this.getResult() + "\t \t" + "Score:  " + this.getScore());

      
        String[] header =
          {
            //"Field",
            "Simply Rugby",
            "Opposition"
          };

        String[][] firstHalf =
          {
              
              {
                "Scores and Comments:" , "Scores and Comments:"
              },
               {
                "" , ""
              },
            {
                 this.getSimplyRugby_scores_fh(), this.getOpposition_scores_fh()
              },
             {
                "Points for: " + SimplyRugby_points_fh , "Points Against:" + Opposition_points_fh
              },
             

          };
        
        
        
          String[][] secondHalf =
          {
              
              {
                "Scores and Comments:" , "Scores and Comments:"
              },
              {
                "" , ""
              },
            {
                 this.getSimplyRugby_scores_sh(), this.getOpposition_scores_sh()
              },
             {
                "Points for: " + SimplyRugby_points_sh , "Points Against:" + Opposition_points_sh
              },
             

          };
        System.out.println("First Half");  
        ASCIITable.getInstance().printTable(header, firstHalf);
        System.out.println("Second Half");
        ASCIITable.getInstance().printTable(header, secondHalf);

      }

    /**
     *
     * @param Games
     * @param ID
     * @return
     */
    public int findID(ArrayList<Game> Games, int ID)
          {
            Boolean found = false;
            
            for(int i = 0; i < Games.size();i++)
              {
                if(ID == Games.get(i).getId())
                  {
                    found = true;
                    ID = i;
                  }
                
              }
            if(found != true)
              {
                  System.out.println("ID not found/Invalid");
                  ID = -1;
              }
            
            return ID;
          }

}
