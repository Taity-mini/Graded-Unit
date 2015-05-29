package gradedunit;

import java.io.Serializable;
import java.util.ArrayList;
import com.bethecoder.ascii_table.ASCIITable;

/**
 * 
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since  21/5/2015               
 * Name: Training Class
 * Description: "Class used as a blueprint for the game records"
 * 
 **/  
public class Training  implements Serializable
{
    //Local Variables
    private int id;
    private static int count = -1;

    
    
    // General Information
    private String Coach;
    private String Date;
    private String Location;
    private String Time;
    private String MemberClass;
    private String SkillsActivites;
    //Grabs list of players present at training. 
    private ArrayList<String> PlayersPresent = new ArrayList();
   
    private String Incidents;
    

    /**
     *
     * @param Coach
     * @param MemberClass
     * @param Date
     * @param Location
     * @param Time
     * @param SkillsActivites
     * @param Incidents
     * @param Players
     * Constructor for Training Class
     */
        public Training(String Coach,String MemberClass, String Date, String Location, String Time, String SkillsActivites, String Incidents, ArrayList <String> Players)
      {
        this.Coach = Coach;
        this.MemberClass = MemberClass;
        this.Date = Date;
        this.Location = Location;
        this.Time = Time;
        this.SkillsActivites = SkillsActivites;
        this.Incidents = Incidents;
        this.PlayersPresent = Players;
        this.setId(++count);
      }
    
  //Getters START
    public int getId()
      {
        return id;
      }
    
    
    public String getCoach()
      {
        return Coach;
      }

    public String getMemberClass()
      {
        return MemberClass;
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
      //Getters END
    
     //Setters START
    private void setId(int id)
      {
        this.id = id;
      }
    
    
    
    public void setCoach(String Coach)
      {
        this.Coach = Coach;
      }

    public void setMemberClass(String MemberClass)
      {
        this.MemberClass = MemberClass;
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

    public void setPlayersPresent(ArrayList<String> PlayersPresent)
      {
        this.PlayersPresent = PlayersPresent;
      }

    public void setIncidents(String Incidents)
      {
        this.Incidents = Incidents;
      }
     //Setters END
    private String[][] ListToArray()
      {
        //Convert ArrayList of Names to 2d String Array
        
        String[][] Names = new String[1][this.getPlayersPresent().size()];
        
        for(int i = 0;  i < this.getPlayersPresent().size();i++)
          {
            Names[0][i] = this.getPlayersPresent().get(i).toString();
          }
        return Names;
      }

    /**
     *
     */
    public void getAllDetails()
      {
          System.out.println("");
          System.out.println("******************************************************");
          System.out.println("Training Session ID: " + this.getId());
          System.out.println("Coach organising: " + this.getCoach() + "\t\t" + "Date: " + this.getDate());
          System.out.println("Location: " + this.getLocation() + "\t\t" + "Time: " + this.getTime());
          System.out.println("******************************************************");
         
          String[] header1 =
          {
            "Skills and Activities undertaken"
          };
          
           String[] header2 =
          {
            "Players Present                "
          };
         
           String[] header3 =
          {
            "Accidents/Injuries             "
          };
           
             String[][] Skills =
          { 
              {
                this.getSkillsActivites()
              },
          }; 
            String[][] Accidents =
          { 
              {
                this.getIncidents()
              },
          };    
           
          ASCIITable.getInstance().printTable(header1, Skills);
          ASCIITable.getInstance().printTable(header2, this.ListToArray());
          ASCIITable.getInstance().printTable(header3, Accidents);
          System.out.println("******************************************************");
      }
    
    
    public int findID(ArrayList<Training> Training, int ID)
          {
            Boolean found = false;
            
            for(int i = 0; i < Training.size();i++)
              {
                if(ID == Training.get(i).getId())
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
