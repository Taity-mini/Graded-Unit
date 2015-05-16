package gradedunit;

import java.io.Serializable;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
abstract public class Member implements Serializable
{
  //Member Form variables
    
    protected int id;
    protected static int count = 0;
    
    protected String Name;
    protected String Address;
    protected String PostCode;
    protected int SRU_Number;
    protected String DateOfBirth;
    protected int TelNum;
    protected int MobNum;
    protected String Email;
        
    abstract public void getDetails();

    
    //Member Constuctor
    public Member(String Name, String Address, String PostCode, int SRU_Number, String DateOfBirth, int TelNum, int MobNum, String Email)
      {
        this.Name = Name;
        this.Address = Address;
        this.PostCode = PostCode;
        this.SRU_Number = SRU_Number;
        this.DateOfBirth = DateOfBirth;
        this.TelNum = TelNum;
        this.MobNum = MobNum;
        this.Email = Email;
      }
    
    
    
    
    
   
    
}
