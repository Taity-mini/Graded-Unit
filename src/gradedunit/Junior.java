package gradedunit;

import static java.lang.Boolean.FALSE;
import java.util.ArrayList;

/**
 *
 * @author Andrew Tait (EC1302292)
 * @version 1.0
 * @since 21/5/2015 
 * Name: Junior Member 
 * Class Description: "Class used as a blueprint for the junior player records"
 *
 *
 */
public class Junior extends Member
{

    //Instance Variables START 
    private String Guardian_Name;
    private String Guardian_Relationship;
    private String Guardian_Address;
    private String Guardian_Tel;
    private String Doc_Name;
    private String Doc_Address;
    private String Doc_Tel_Num;
    private String healthInfo;
    private String Player_position;
    //Instance Variables END
    
  

    /**
     *
     * @param Name
     * @param Address
     * @param PostCode
     * @param SRU_Number
     * @param DateOfBirth
     * @param TelNum
     * @param MobNum
     * @param Email
     * @param Guardian_Name
     * @param Guardian_Relationship
     * @param Guardian_Address
     * @param Guardian_Tel
     * @param Doc_Name
     * @param Doc_Address
     * @param Doc_Tel_Num
     * @param healthInfo
     * @param Player_position
     *   //Constructor for Junior Player Class
     */
        public Junior(String Name, String Address, String PostCode, int SRU_Number, String DateOfBirth, String TelNum, String MobNum, String Email, String Guardian_Name, String Guardian_Relationship, String Guardian_Address, String Guardian_Tel, String Doc_Name, String Doc_Address, String Doc_Tel_Num, String healthInfo, String Player_position)
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
        this.Player_position = Player_position;
        this.setId(++count);
      }

    /*GETTERS - START */
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

    public String getGuardian_Tel()
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

    public String getDoc_Tel_Num()
      {
        return Doc_Tel_Num;
      }

    public String getHealthInfo()
      {
        return healthInfo;
      }

    public String getPlayer_position()
      {
        return Player_position;
      }

    /*GETTERS - END */
    /*SETTERS - START*/
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

    public void setGuardian_Tel(String Guardian_Tel)
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

    public void setDoc_Tel_Num(String Doc_Tel_Num)
      {
        this.Doc_Tel_Num = Doc_Tel_Num;
      }

    public void setHealthInfo(String healthInfo)
      {
        this.healthInfo = healthInfo;
      }

    public void setPlayer_position(String Player_position)
      {
        this.Player_position = Player_position;
      }

    /*SETTERS - END */
    @Override
    public void getDetails()
      {
        System.out.println("Name:     " + this.getName());
        System.out.println("Address:  " + this.getAddress());
        System.out.println("PostCode: " + this.getPostCode());
        System.out.println("Date Of Birth: " + this.getDateOfBirth());
        System.out.println("SRU Number: " + this.getSRU_Number());
        System.out.println("Tel Number: " + this.getTelNum());
        System.out.println("Mobile Number: " + this.getMobNum());
        System.out.println("Email: " + this.getEmail());

        System.out.println("Guardian 1 - Name: " + this.getGuardian_Name());
        System.out.println("Guardian 1 - Relationship: " + this.getGuardian_Relationship());
        System.out.println("Guardian 1 - Address: " + this.getGuardian_Address());
        System.out.println("Guardian 1 - Telephone Number: " + this.getGuardian_Tel());

        System.out.println("Doctor Name: " + this.getDoc_Name());
        System.out.println("Doctor Telephone: " + this.getDoc_Tel_Num());
        System.out.println("Doctor - Address: " + this.getDoc_Address());
        System.out.println("Known Health Issues: " + this.getHealthInfo());
        System.out.println("Player position: " + this.getPlayer_position());
      }

  

    /**
     *
     * @param signiture
     * @param Guardian_Name
     * @return
     * //Check if parent/guardian sig is valid - not yet implemented in program
     */
        public boolean CheckValidSigniture(String signiture, String Guardian_Name)
      {
        boolean isValid = FALSE;

        return isValid;

      }

    /**
     *
     * @param Juniors
     * @param ID
     * @return
     * Method used to find game id, this matches ID with the arraylist index value
     */
    public int findID(ArrayList<Junior> Juniors, int ID)
      {
        Boolean found = false;

        for (int i = 0; i < Juniors.size(); i++)
          {
            if (ID == Juniors.get(i).getId())
              {
                found = true;
                ID = i;
              }

          }
        if (found != true)
          {
            System.out.println("ID not found/Invalid");
            ID = -1;
          }

        return ID;
      }

}
