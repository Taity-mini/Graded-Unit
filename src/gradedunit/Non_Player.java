/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gradedunit;

/**
 *
 * @author Andrew
 */
public class Non_Player extends Member
{   
    //======= START Getters=======\\
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

      }

     //=======END Getters=======\\
    
     //=======START Setters=======\\
    
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
