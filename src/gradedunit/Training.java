package gradedunit;

import java.io.Serializable;
import java.util.ArrayList;
import com.bethecoder.ascii_table.ASCIITable;
import java.lang.reflect.Array;

/**
 *
 * @author Andrew Tait EC1302292
 */
public class Training  implements Serializable
{
    //Local Variables
     private int id;
    private static int count = 0;

    
    
    // General Information
    private String Coach;
    private String Date;
    private String Location;
    private String Time;
    
    private String SkillsActivites;
    //Grabs list of players present at training. 
    private ArrayList<?> PlayersPresent = new ArrayList();
    private String Incidents;

    public Training(String Coach, String Date, String Location, String Time, String SkillsActivites, String Incidents, ArrayList <?> Players)
      {
        this.Coach = Coach;
        this.Date = Date;
        this.Location = Location;
        this.Time = Time;
        this.SkillsActivites = SkillsActivites;
        this.Incidents = Incidents;
        this.PlayersPresent = Players;
        this.setId(++count);
      }
    
    //Getters
    public int getId()
      {
        return id;
      }
    
    
    public String getCoach()
      {
        return Coach;
      }

    public String getDate()
      {
        return Date;
      }

    public String getLocation()
      {
        return Location;
      }

    public String getTime()
      {
        return Time;
      }

    public String getSkillsActivites()
      {
        return SkillsActivites;
      }

    public ArrayList<?> getPlayersPresent()
      {
        return PlayersPresent;
      }

    public String getIncidents()
      {
        return Incidents;
      }
    
    //Setters
    private void setId(int id)
      {
        this.id = id;
      }
    
    
    
    public void setCoach(String Coach)
      {
        this.Coach = Coach;
      }

    public void setDate(String Date)
      {
        this.Date = Date;
      }

    public void setLocation(String Location)
      {
        this.Location = Location;
      }

    public void setTime(String Time)
      {
        this.Time = Time;
      }

    public void setSkillsActivites(String SkillsActivites)
      {
        this.SkillsActivites = SkillsActivites;
      }

    public void setPlayersPresent(ArrayList<?> PlayersPresent)
      {
        this.PlayersPresent = PlayersPresent;
      }

    public void setIncidents(String Incidents)
      {
        this.Incidents = Incidents;
      }
    
    private String[][] ListToArray()
      {
        String[][] Names = new String[this.getPlayersPresent().size()][];
        Names = getPlayersPresent().toArray(Names);
        return Names;
      }
    
    
    public void getAllDetails()
      {
        
          System.out.println("Coach organsing: " + this.getCoach() + "\t" + "Date: " + this.getDate());
          System.out.println("Location: " + this.getLocation() + "\t" + "Time: " + this.getTime());
          
          String[] header =
          {
            //"Field",
            "Skills and SkillsActivites undertaken"
            
          };
          String[][] secondHalf =
          {
              
              {
                "Scores and Comments:" , "Scores and Comments:"
              },
              {
                "" , ""
              },
          };
          
           ASCIITable.getInstance().printTable(header, secondHalf);
      
      }
   
    
}
