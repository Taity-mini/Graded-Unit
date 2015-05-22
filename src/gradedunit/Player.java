package gradedunit;

import java.util.ArrayList;
/**
 * 
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since  21/5/2015               
 * Name: Player Member Class
 * Description:
 * ""
 * 
 **/  
public class Player extends Member
{
    //Local Variables for additional  fields
        private String nextOfKin;
        private String nextOfKin_Tel;
        private String doctor_Name;
        private String doctor_Tel;
        private String healthInfo;
        private String player_position;
        
    //Constructor
    public Player(String Name, String Address, String PostCode, int SRU_Number, String DateOfBirth, String TelNum, String MobNum, String Email,String nextOfKin, String nextOfKin_Tel, String doctor_Name, String doctor_Tel, String healthInfo, String player_position)
      {
        super(Name, Address, PostCode, SRU_Number, DateOfBirth, TelNum, MobNum, Email);
        this.nextOfKin = nextOfKin;
        this.nextOfKin_Tel = nextOfKin_Tel;
        this.doctor_Name = doctor_Name;
        this.doctor_Tel = doctor_Tel;
        this.healthInfo = healthInfo;
        this.player_position = player_position;
        this.setId(++count);//increase id with every new player
      }

    
        
        
    //======= START Getters=======\\
   
    
    public int getId()
      {
        return id;
      }
    
    public String getName()
      {
        return Name;
      }

    public String getAddress()
      {
        return Address;
      }

    public String getPostCode()
      {
        return PostCode;
      }

    public int getSRU_Number()
      {
        return SRU_Number;
      }

    public String getDateOfBirth()
      {
        return DateOfBirth;
      }

    public String getTelNum()
      {
        return TelNum;
      }

    public String getMobNum()
      {
        return MobNum;
      }

    public String getEmail()
      {
        return Email;
      }
    
    
        //Additonal fields 
    public String getNextOfKin()
      {
        return nextOfKin;
      }
    

    public String getNextOfKin_Tel()
      {
        return nextOfKin_Tel;
      }
    
    public String getDoctor_Name()
      {
        return doctor_Name;
      }
    
    public String getDoctor_Tel()
      {
        return doctor_Tel;
      }
    
    public String getHealthInfo()
      {
        return healthInfo;
      }
    

    public String getPlayer_position()
      {
        return player_position;
      }

    /**
     *Display all details for one player
     */
    @Override
    public void getDetails()
      {
          System.out.println("");
          System.out.println("Player ID:" + this.getId());
          System.out.println("******************************************************");
          System.out.println("Name:     "           + this.getName());
          System.out.println("Address:  "           + this.getAddress());
          System.out.println("PostCode: "           + this.getPostCode());
          System.out.println("Date Of Birth: "      + this.getDateOfBirth());
          System.out.println("SRU Number: "         + this.getSRU_Number());
          System.out.println("Tel Number: "         + this.getTelNum());
          System.out.println("Mobile Number: "      + this.getMobNum());
          System.out.println("Email: "              + this.getEmail());
          System.out.println("Next Of Kin: "        + this.getNextOfKin());
          System.out.println("Next Of Kin Tel: "    + this.getNextOfKin_Tel());
          System.out.println("Doctor Name: "        + this.getDoctor_Name());
          System.out.println("Doctor Tel: "         + this.getDoctor_Tel());
          System.out.println("Health Info: "        + this.getDoctor_Tel());
          System.out.println("Player position: "    + this.getPlayer_position());
          System.out.println("******************************************************");
       
      }
    
    
  

    //=======END Getters=======\\
    //=======START Setters=======\\
    private void setId(int id)
      {
        this.id = id;
      }
    
     public void setName(String Name)
      {
        this.Name = Name;
      }
     
     public void setAddress(String Address)
      {
        this.Address = Address;
      }
     
     	public void setPostCode(String PostCode)
      {
        this.PostCode = PostCode;
      }
        
      	public void setSRU_Number(int SRU_Number)
      {
        this.SRU_Number = SRU_Number;
      } 
        
        public void setDateOfBirth(String DateOfBirth)
      {
        this.DateOfBirth = DateOfBirth;
      }
        
  	public void setTelNum(String TelNum)
      {
        this.TelNum = TelNum;
      }
      
	public void setMobNum(String MobNum)
      {
        this.MobNum = MobNum;
      }        
     
      	public void setEmail(String Email)
      {
        this.Email = Email;
      }

    public void setNextOfKin(String nextOfKin)
      {
        this.nextOfKin = nextOfKin;
      }

    public void setNextOfKin_Tel(String nextOfKin_Tel)
      {
        this.nextOfKin_Tel = nextOfKin_Tel;
      }

    public void setDoctor_Name(String doctor_Name)
      {
        this.doctor_Name = doctor_Name;
      }

    public void setDoctor_Tel(String doctor_Tel)
      {
        this.doctor_Tel = doctor_Tel;
      }

    public void setHealthInfo(String healthInfo)
      {
        this.healthInfo = healthInfo;
      }

    public void setPlayer_position(String player_position)
      {
        this.player_position = player_position;
      }
        
        
        
        
        
        
      //=======END Setters=======\\

    /**
     * 
     * 
     * @param Players
     * @param ID
     * @return
     * Find id based on int, parameter
     * */
    
        public int findID(ArrayList<Player> Players, int ID)
          {
            Boolean found = false;
            
            for(int i = 0; i < Players.size();i++)
              {
                if(ID == Players.get(i).getId())
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
