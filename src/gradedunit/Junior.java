/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradedunit;

import static java.lang.Boolean.FALSE;

/**
 *
 * @author Andrew
 */
public class Junior extends Member
{

    //local variables
    private String Guardian_Name;
    private String Guardian_Relationship;
    private String Guardian_Address;
    private int Guardian_Tel;
    private String Doc_Name;
    private String Doc_Address;
    private int Doc_Tel_Num;
    private String healthInfo;
    private String Player_postion;

    //Constructor
    public Junior(String Name, String Address, String PostCode, int SRU_Number, String DateOfBirth, int TelNum, int MobNum, String Email, String Guardian_Name, String Guardian_Relationship, String Guardian_Address, int Guardian_Tel, String Doc_Name, String Doc_Address, int Doc_Tel_Num, String healthInfo, String Player_postion)
      {
        super(Name, Address, PostCode, SRU_Number, DateOfBirth, TelNum, MobNum, Email);
        this.Guardian_Name = Guardian_Name;
        this.Guardian_Relationship = Guardian_Relationship;
        this.Guardian_Address = Guardian_Address;
        this.Guardian_Tel = Guardian_Tel;
        this.Doc_Name = Doc_Name;
        this.Doc_Address = Doc_Address;
        this.Doc_Tel_Num = Doc_Tel_Num;
        this.healthInfo = healthInfo;
        this.Player_postion = Player_postion;
      }
    

  
    /*GETTERS - START */
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

    public String getGuardian_Name()
      {
        return Guardian_Name;
      }

    public String getGuardian_Relationship()
      {
        return Guardian_Relationship;
      }

    public String getGuardian_Address()
      {
        return Guardian_Address;
      }

    public int getGuardian_Tel()
      {
        return Guardian_Tel;
      }

    public String getDoc_Name()
      {
        return Doc_Name;
      }

    public String getDoc_Address()
      {
        return Doc_Address;
      }

    public int getDoc_Tel_Num()
      {
        return Doc_Tel_Num;
      }

    public String getHealthInfo()
      {
        return healthInfo;
      }

    public String getPlayer_postion()
      {
        return Player_postion;
      }

    /*GETTERS - END */
    /*SETTERS - START*/
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

    public void setGuardian_Name(String Guardian_Name)
      {
        this.Guardian_Name = Guardian_Name;
      }

    public void setGuardian_Relationship(String Guardian_Relationship)
      {
        this.Guardian_Relationship = Guardian_Relationship;
      }

    public void setGuardian_Address(String Guardian_Address)
      {
        this.Guardian_Address = Guardian_Address;
      }

    public void setGuardian_Tel(int Guardian_Tel)
      {
        this.Guardian_Tel = Guardian_Tel;
      }

    public void setDoc_Name(String Doc_Name)
      {
        this.Doc_Name = Doc_Name;
      }

    public void setDoc_Address(String Doc_Address)
      {
        this.Doc_Address = Doc_Address;
      }

    public void setDoc_Tel_Num(int Doc_Tel_Num)
      {
        this.Doc_Tel_Num = Doc_Tel_Num;
      }

    public void setHealthInfo(String healthInfo)
      {
        this.healthInfo = healthInfo;
      }

    public void setPlayer_postion(String Player_postion)
      {
        this.Player_postion = Player_postion;
      }

    /*SETTERS - END */
    @Override
    public void getDetails()
      {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      }

    public boolean CheckValidSigniture(String signiture, String Guardian_Name)
      {
        boolean isValid = FALSE;

        return isValid;

      }

}