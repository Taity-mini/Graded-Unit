package gradedunit;

import java.util.ArrayList;


/**
 *
 * @author Andrew Tait (EC1302292)
 */
public class Player extends Member
{
    //Local Variables for additional  fields
        private String nextOfKin;
        private int nextOfKin_Tel;
        private String doctor_Name;
        private int doctor_Tel;
        private String healthInfo;
        private String player_position;

    public Player(String Name, String Address, String PostCode, int SRU_Number, String DateOfBirth, int TelNum, int MobNum, String Email, String nextOfKin, int nextOfKin_Tel, String doctor_Name, int doctor_Tel, String healthInfo, String player_position)
      {
        super(Name, Address, PostCode, SRU_Number, DateOfBirth, TelNum, MobNum, Email);
        this.nextOfKin = nextOfKin;
        this.nextOfKin_Tel = nextOfKin_Tel;
        this.doctor_Name = doctor_Name;
        this.doctor_Tel = doctor_Tel;
        this.healthInfo = healthInfo;
        this.player_position = player_position;
        this.setId(++count);
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

    public int getTelNum()
      {
        return TelNum;
      }

    public int getMobNum()
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
    

    public int getNextOfKin_Tel()
      {
        return nextOfKin_Tel;
      }
    
    public String getDoctor_Name()
      {
        return doctor_Name;
      }
    
    public int getDoctor_Tel()
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

    @Override
    public void getDetails()
      {
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
          System.out.println("Health Info: "        + this.getDoctor_Tel());
          System.out.println("Player position: "    + this.getPlayer_position());   
          
          
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
        
  	public void setTelNum(int TelNum)
      {
        this.TelNum = TelNum;
      }
      
	public void setMobNum(int MobNum)
      {
        this.MobNum = MobNum;
      }        
     
      	public void setEmail(String Email)
      {
        this.Email = Email;
      }  
        
        
        
      //=======END Setters=======\\

    
}
