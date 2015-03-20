package gradedunit;

import java.io.Serializable;

/**
 *
 * @author Andrew Tait (EC1302292)
 */
abstract public class Member implements Serializable
{
  //Member Form variables  
    protected String Name;
    protected String Address;
    protected String PostCode;
    protected int SRU_Number;
    protected String DateOfBirth;
    protected int TelNum;
    protected int MobNum;
    protected String Email;
        
    abstract public void getDetails();
   
    
}
